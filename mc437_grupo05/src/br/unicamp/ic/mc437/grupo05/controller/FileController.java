package br.unicamp.ic.mc437.grupo05.controller;

import java.io.StringWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.IOUtils;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;
import br.unicamp.ic.mc437.grupo05.dto.FileDTO;
import br.unicamp.ic.mc437.grupo05.dto.ResponseDTO;
import br.unicamp.ic.mc437.grupo05.infra.XmlFileDao;
import br.unicamp.ic.mc437.grupo05.modelo.XmlFile;

@Resource
@Path("/file")
public class FileController {

	private XmlFileDao xmlFileDao;
	private Result result;
	private Validator validator;

	public FileController(XmlFileDao xmlFileDao, Result result,
			Validator validator) {
		super();
		this.xmlFileDao = xmlFileDao;
		this.result = result;
		this.validator = validator;
	}

	@Path("/faq")
	public void faq() {
	}

	@Path("/list")
	public void list() {
		String links = "";
		int i = 0;
		List<Long> allIdList = xmlFileDao.getAllIds();
		for (Long id : allIdList) {
			links = links + "<a href=\"getFile/" + id + "\">Teste " + i++
					+ "</a><br>";
		}
		result.include("result", links);
	}

	@Path("/upload")
	public void upload(String message) {

		if (message == null) {
			message = "";
		}

		result.include("result", new FileDTO(Boolean.FALSE.toString(), message));
	}

	@Post
	@Path("/uploadFile")
	public void uploadFile(UploadedFile file) {

		validator.onErrorRedirectTo(this.getClass()).upload(
				"Selecione arquivo válido!");

		try {

			if (file == null || !file.getContentType().equals("text/xml")) {
				result.include("result", new FileDTO(Boolean.FALSE.toString(),
						"Formato de arquivo inválido!"));
				return;
			}

			StringWriter writer = new StringWriter();
			IOUtils.copy(file.getFile(), writer);

			XmlFile xmlFile = new XmlFile();
			xmlFile.setName(file.getFileName());
			xmlFile.setContent(writer.toString());
			Date now = Calendar.getInstance().getTime();
			xmlFile.setTimestamp(now.toString());

			Long id = xmlFileDao.saveOrUpdate(xmlFile);

			result.include("result", new FileDTO(xmlFile,
					"Upload concluído com sucesso! <br><br>"
							+ "<a href=\"getFile/" + id
							+ "\">Clique aqui para ver" + "</a><br>"));
		} catch (Exception e) {
			e.printStackTrace();
			result.include("result", new FileDTO(Boolean.FALSE.toString(),
					"Erro inesperado!"));
		}

	}

	@Get
	@Path("/getFile/{fileId}")
	public void getFile(String fileId) {
		try {
			if (fileId == null || fileId.isEmpty() || !fileId.matches("\\d+")) {
				result.include(new ResponseDTO(Boolean.FALSE.toString(),
						"Id inválido!"));
			}

			Long id = Long.valueOf(fileId);
			XmlFile file = xmlFileDao.getById(id);
			if (file != null) {
				result.include("result", new FileDTO(file, ""));
			} else {
				result.include("result",
						new ResponseDTO(Boolean.FALSE.toString(),
								"Arquivo não encontrado!"));
			}

		} catch (Exception e) {
			e.printStackTrace();
			result.include("result", new ResponseDTO(Boolean.FALSE.toString(),
					"Erro inesperado!"));
		}
	}

	@Path("/view")
	public void view() {
		String links = "";
		int i = 0;
		List<Long> allIdList = xmlFileDao.getAllIds();
		for (Long id : allIdList) {
			links = links + "<a href=\"getFile/" + id + "\">Teste " + i++
					+ "</a><br>";
		}
		result.include("result", links);
	}

}
