package br.unicamp.ic.mc437.grupo05.dto;

import br.unicamp.ic.mc437.grupo05.modelo.XmlFile;

public class FileDTO extends ResponseDTO {

	private String id;
	private String fileName;
	private String timestamp;
	private String content;

	public FileDTO(String id, String fileName, String timestamp, String content) {
		super(Boolean.TRUE.toString(), "");
		this.setId(id);
		this.fileName = fileName;
		this.timestamp = timestamp;
		this.content = content;
	}

	public FileDTO(XmlFile xmlFile, String message) {
		super(Boolean.TRUE.toString(), message);
		this.id = xmlFile.getId().toString();
		this.fileName = xmlFile.getName();
		this.timestamp = xmlFile.getTimestamp();
		this.content = xmlFile.getContent();
	}

	public FileDTO(String sucess, String message) {
		super(sucess, message);
		this.fileName = "";
		this.timestamp = "";
		this.content = "";
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
