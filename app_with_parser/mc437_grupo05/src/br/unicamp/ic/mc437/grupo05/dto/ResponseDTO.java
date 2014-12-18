package br.unicamp.ic.mc437.grupo05.dto;

public class ResponseDTO {

	private String success;
	private String message;

	public ResponseDTO(String success, String message) {
		super();
		this.success = success;
		this.message = message;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
