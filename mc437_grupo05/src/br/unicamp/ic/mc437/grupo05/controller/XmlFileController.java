package br.unicamp.ic.mc437.grupo05.controller;

import java.io.File;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.commons.io.FileUtils;

import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;
import br.unicamp.ic.mc437.grupo05.infra.XmlFileDao;
import br.unicamp.ic.mc437.grupo05.modelo.XmlFile;

import com.google.common.io.Files;

@Resource
public class XmlFileController {

	private XmlFileDao xmlFileDao;
	private Result result;
	private Validator validator;

	public XmlFileController(XmlFileDao xmlFileDao, Result result,
			Validator validator) {
		super();
		this.xmlFileDao = xmlFileDao;
		this.result = result;
		this.validator = validator;
	}

	@Post("/uploadXmlFile")
	public void uploadXmlFile(UploadedFile file) {

		try {
			if (file == null || !file.getContentType().equals("text/plain")) {
				return;
			}

			File textFile = new File(System.getProperty("user.dir"),
					file.getFileName());
			FileUtils.copyInputStreamToFile(file.getFile(), textFile);

			List<String> lines = Files.readLines(textFile,
					Charset.defaultCharset());

			XmlFile xmlFile = new XmlFile();
			xmlFile.setName(file.getFileName());
			xmlFile.setContent(lines.get(0));

			xmlFileDao.salva(xmlFile);
			System.out.println("Salvo!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
