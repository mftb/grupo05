package br.unicamp.ic.mc437.grupo05.controller;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.commons.io.FileUtils;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;
import br.unicamp.ic.mc437.grupo05.infra.XmlFileDao;
import br.unicamp.ic.mc437.grupo05.modelo.TestFile;
import br.unicamp.ic.mc437.grupo05.modelo.XmlFile;
import br.unicamp.ic.mc437.grupo05.process.FileProcess;

import com.google.common.io.Files;

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

	@Path("/list")
	public void list() {
	}

	@Path("/upload")
	public void upload() {
	}

	@Post
	@Path("/uploadFile")
	public void uploadFile(UploadedFile file) {

		try {

			if (file == null || !file.getContentType().equals("text/xml")) {
				return;
			}

			File textFile = new File(System.getProperty("user.dir"),
					file.getFileName());
			FileUtils.copyInputStreamToFile(file.getFile(), textFile);

			List<String> lines = Files.readLines(textFile,
					Charset.defaultCharset());
			StringBuffer buffer = new StringBuffer();
			for (String line : lines) {
				buffer.append(line);
			}

			XmlFile xmlFile = new XmlFile();
			xmlFile.setName(file.getFileName());

			xmlFile.setContent(buffer.toString());

			xmlFileDao.salva(xmlFile);
			System.out.println("Salvo!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Path("/view")
	public void view() {
		String user = "TestUser";
		FileProcess fileProcess = new FileProcess();
		List<TestFile> sharedFilesList = fileProcess.getFilesSharedWith(user);
		List<TestFile> ownedFilesList = fileProcess.getFilesOwnedBy(user);

		// model.addAttribute("username", user);
		// model.addAttribute("sharedFilesList", sharedFilesList);
		// model.addAttribute("ownedFilesList", ownedFilesList);
	}

}
