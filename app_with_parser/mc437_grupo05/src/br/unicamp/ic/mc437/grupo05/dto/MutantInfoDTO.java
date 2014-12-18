package br.unicamp.ic.mc437.grupo05.dto;

import java.util.List;

import br.unicamp.ic.mc437.grupo05.modelo.MutantInfo;

public class MutantInfoDTO extends ResponseDTO {

	private String fileTitle;
	private List<MutantInfo> mutantList;
	

	public MutantInfoDTO(String fileTitle, List<MutantInfo> mutantList) {
		super(Boolean.TRUE.toString(), "");
		this.fileTitle = fileTitle;
		this.mutantList = mutantList;
	}


	public String getFileTitle() {
		return fileTitle;
	}


	public void setFileTitle(String fileTitle) {
		this.fileTitle = fileTitle;
	}


	public List<MutantInfo> getMutantList() {
		return mutantList;
	}


	public void setMutantList(List<MutantInfo> mutantList) {
		this.mutantList = mutantList;
	}

	
}
