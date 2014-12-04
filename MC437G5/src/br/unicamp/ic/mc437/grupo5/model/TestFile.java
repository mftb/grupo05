package br.unicamp.ic.mc437.grupo5.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class TestFile implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5199068548028385591L;
	
	private String name;
	private String owner;
	private Timestamp addTs;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "File [name=" + name + ", owner=" + owner + ", addTs=" + addTs
				+ "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addTs == null) ? 0 : addTs.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		return result;
	}

	/* (non-Javadoc)
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
		TestFile other = (TestFile) obj;
		if (addTs == null) {
			if (other.addTs != null)
				return false;
		} else if (!addTs.equals(other.addTs))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the addTs
	 */
	public Timestamp getAddTs() {
		return addTs;
	}

	/**
	 * @param addTs the addTs to set
	 */
	public void setAddTs(Timestamp addTs) {
		this.addTs = addTs;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
			
}
