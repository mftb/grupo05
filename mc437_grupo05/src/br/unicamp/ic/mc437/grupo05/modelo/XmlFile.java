package br.unicamp.ic.mc437.grupo05.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.NotNull;

@Entity
public class XmlFile {

	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull(message = "O campo <b>nome</b> precisa ser preenchido!")
	private String name;
	
	private String content;
	private String path;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
