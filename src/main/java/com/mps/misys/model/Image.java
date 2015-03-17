package com.mps.misys.model;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the images database table.
 * 
 */
@Entity
@Table(name="images")
@NamedQuery(name="Image.findAll", query="SELECT i FROM Image i")
public class Image implements Serializable {
	private static final long serialVersionUID = 1L;

	 @Id
	  @Column(name="ID")
	  @GeneratedValue
	  private Integer id;
	  
	  @Column(name="NAME")
	  private String name;
	  
	  @Column(name="CONTENTTYPE")
	  private String contentType;
	  
	  @Column(name="LENGTH")
	  private Integer length;
	  
	  @Column(name="CONTENT")
	  @Lob
	  private byte[] content;

	public Image() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getContent() {
		return this.content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}