package br.unicamp.ic.mc437.grupo05.controller;

import java.io.IOException;
import java.io.StringWriter;

import org.apache.commons.io.IOUtils;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;
import br.unicamp.ic.mc437.grupo05.infra.XmlFileDao;
import br.unicamp.ic.mc437.grupo05.modelo.XmlFile;

@Resource
@Path("/file")
public class FileController {

	private XmlFileDao xmlFileDao;

	public FileController(XmlFileDao xmlFileDao, Result result,
			Validator validator) {
		super();
		this.xmlFileDao = xmlFileDao;
	}

	@Path("/faq")
	public void faq() {
	}
	
	@Path("/list")
	public void list() {
	}

	@Path("/upload")
	public void upload() {
	}
	
	@Path("/faq.png")
	public void faqpng() {
	}

	@Post
	@Path("/uploadFile")
	public void uploadFile(UploadedFile file) {

		try {

			if (file == null || !file.getContentType().equals("text/xml")) {
				return;
			}

			StringWriter writer = new StringWriter();
			IOUtils.copy(file.getFile(), writer);

			XmlFile xmlFile = new XmlFile();
			xmlFile.setName(file.getFileName());
			xmlFile.setContent(writer.toString());

			xmlFileDao.salva(xmlFile);
			System.out.println("Salvo!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Path("/view")
	public void view() {
		// String user = "TestUser";
		// FileProcess fileProcess = new FileProcess();
		// List<TestFile> sharedFilesList =
		// fileProcess.getFilesSharedWith(user);
		// List<TestFile> ownedFilesList = fileProcess.getFilesOwnedBy(user);

		// model.addAttribute("username", user);
		// model.addAttribute("sharedFilesList", sharedFilesList);
		// model.addAttribute("ownedFilesList", ownedFilesList);
	}

}
