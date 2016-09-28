package com.versus.oxxxy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "language")
public class Language {
	@Id
	private String keyword;

	@Column(name = "language")
	private String language;

	public final String getKeyword() {
		return keyword;
	}

	public final void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public final String getLanguage() {
		return language;
	}

	public final void setLanguage(String language) {
		this.language = language;
	}
}
