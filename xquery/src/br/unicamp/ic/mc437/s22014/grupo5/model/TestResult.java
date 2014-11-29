package br.unicamp.ic.mc437.s22014.grupo5.model;

import java.io.Serializable;


public class TestResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5722331429710462853L;
	
	private String testSet;
	private String testCase;
	private int dataTestCount;
	private String mutationOperator;
	private String mutant;
	private int alive;
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TestResults [testSet=" + testSet + ", testCase=" + testCase
				+ ", dataTestCount=" + dataTestCount + ", mutationOperator="
				+ mutationOperator + ", mutant=" + mutant + ", alive=" + alive
				+ "]";
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + alive;
		result = prime * result + dataTestCount;
		result = prime * result + ((mutant == null) ? 0 : mutant.hashCode());
		result = prime
				* result
				+ ((mutationOperator == null) ? 0 : mutationOperator.hashCode());
		result = prime * result
				+ ((testCase == null) ? 0 : testCase.hashCode());
		result = prime * result + ((testSet == null) ? 0 : testSet.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestResult other = (TestResult) obj;
		if (alive != other.alive)
			return false;
		if (dataTestCount != other.dataTestCount)
			return false;
		if (mutant == null) {
			if (other.mutant != null)
				return false;
		} else if (!mutant.equals(other.mutant))
			return false;
		if (mutationOperator == null) {
			if (other.mutationOperator != null)
				return false;
		} else if (!mutationOperator.equals(other.mutationOperator))
			return false;
		if (testCase == null) {
			if (other.testCase != null)
				return false;
		} else if (!testCase.equals(other.testCase))
			return false;
		if (testSet == null) {
			if (other.testSet != null)
				return false;
		} else if (!testSet.equals(other.testSet))
			return false;
		return true;
	}

	/**
	 * @return the testSet
	 */
	public String getTestSet() {
		return testSet;
	}

	/**
	 * @param testSet the testSet to set
	 */
	public void setTestSet(String testSet) {
		this.testSet = testSet;
	}

	/**
	 * @return the testCase
	 */
	public String getTestCase() {
		return testCase;
	}

	/**
	 * @param testCase the testCase to set
	 */
	public void setTestCase(String testCase) {
		this.testCase = testCase;
	}

	/**
	 * @return the dataTestCount
	 */
	public int getDataTestCount() {
		return dataTestCount;
	}

	/**
	 * @param dataTestCount the dataTestCount to set
	 */
	public void setDataTestCount(int dataTestCount) {
		this.dataTestCount = dataTestCount;
	}

	/**
	 * @return the mutationOperator
	 */
	public String getMutationOperator() {
		return mutationOperator;
	}

	/**
	 * @param mutationOperator the mutationOperator to set
	 */
	public void setMutationOperator(String mutationOperator) {
		this.mutationOperator = mutationOperator;
	}

	/**
	 * @return the mutant
	 */
	public String getMutant() {
		return mutant;
	}

	/**
	 * @param mutant the mutant to set
	 */
	public void setMutant(String mutant) {
		this.mutant = mutant;
	}

	/**
	 * @return the alive
	 */
	public int getAlive() {
		return alive;
	}

	/**
	 * @param alive the alive to set
	 */
	public void setAlive(int alive) {
		this.alive = alive;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
