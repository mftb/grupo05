package br.unicamp.ic.mc437.grupo05.modelo;


public class MutantInfo {

	/**
	 * Foreign key to id from the XMLFILE table/XmlFile pojo
	 */
	private Long fileId;
	
	/**
	 * ID
	 */
	private String testId;
	/**
	 * Cod
	 */
	private String testCode;
	/**
	 * Nome do caso de teste
	 */
	private String testCaseName;
	/**
	 * #OPERADOR DE MUTACAO - ainda precisamos tratar essa string apos reaver esse campo
	 */
	private String mutationOperators;
	/**
	 * Vivo?
	 */
	private String isAlive;
	/**
	 * Falha
	 */
	private String hasFailed;
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Whiskas [testId=" + testId + ", testCode=" + testCode
				+ ", testCaseName=" + testCaseName + ", mutationOperators="
				+ mutationOperators + ", isAlive=" + isAlive + ", hasFailed="
				+ hasFailed + "]";
	}
	
	
	/**
	 * @return the testId
	 */
	public String getTestId() {
		return testId;
	}
	/**
	 * @param testId the testId to set
	 */
	public void setTestId(String testId) {
		this.testId = testId;
	}
	/**
	 * @return the testCode
	 */
	public String getTestCode() {
		return testCode;
	}
	/**
	 * @param testCode the testCode to set
	 */
	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}
	/**
	 * @return the testCaseName
	 */
	public String getTestCaseName() {
		return testCaseName;
	}
	/**
	 * @param testCaseName the testCaseName to set
	 */
	public void setTestCaseName(String testCaseName) {
		this.testCaseName = testCaseName;
	}
	/**
	 * @return the mutationOperators
	 */
	public String getMutationOperators() {
		return mutationOperators;
	}
	/**
	 * @param mutationOperators the mutationOperators to set
	 */
	public void setMutationOperators(String mutationOperators) {
		this.mutationOperators = mutationOperators;
	}
	/**
	 * @return the isAlive
	 */
	public String getIsAlive() {
		return isAlive;
	}
	/**
	 * @param isAlive the isAlive to set
	 */
	public void setIsAlive(String isAlive) {
		this.isAlive = isAlive;
	}
	/**
	 * @return the hasFailed
	 */
	public String getHasFailed() {
		return hasFailed;
	}
	/**
	 * @param hasFailed the hasFailed to set
	 */
	public void setHasFailed(String hasFailed) {
		this.hasFailed = hasFailed;
	}


	public Long getFileId() {
		return fileId;
	}


	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}
	
}
