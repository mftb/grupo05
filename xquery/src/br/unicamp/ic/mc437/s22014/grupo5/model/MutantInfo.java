package br.unicamp.ic.mc437.s22014.grupo5.model;

public class MutantInfo {
	private String isDead;
	private String hasFailed;
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MutantInfo [isDead=" + isDead + ", hasFailed=" + hasFailed
				+ "]";
	}
	/**
	 * @return the isDead
	 */
	public String getIsDead() {
		return isDead;
	}
	/**
	 * @param isDead the isDead to set
	 */
	public void setIsDead(String isDead) {
		this.isDead = isDead;
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
	
	
}
