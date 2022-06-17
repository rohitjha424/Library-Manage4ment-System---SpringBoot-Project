package com.LibraryManagement.bookservice.VO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Library {
	@Id
	private Long libId;
	private String libName;
	private String libLocation;
	
	public Long getLibId() {
		return libId;
	}
	public void setLibId(Long libId) {
		this.libId = libId;
	}
	public String getLibName() {
		return libName;
	}
	public void setLibName(String libName) {
		this.libName = libName;
	}
	public String getLibLocation() {
		return libLocation;
	}
	public void setLibLocation(String libLocation) {
		this.libLocation = libLocation;
	}

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Library(Long libId, String libName, String libLocation) {
		super();
		this.libId = libId;
		this.libName = libName;
		this.libLocation = libLocation;
	}
	@Override
	public String toString() {
		return "Library [libId=" + libId + ", libName=" + libName + ", libLocation=" + libLocation + "]";
	}


}
