package com.versus.oxxxy.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "word")
public class Word {
	
	@Id
	@GeneratedValue
	private Long wordId;

	@Column
	private String word;

	@Column
	private String type;

	@ManyToOne
	@JoinColumn(name = "keyword")
	private Language lang;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "word")
	private List<Translation> translations;

	@Column
	private String category;

	@Column
	private String desctiption;
	
	
	public Word() {
	}
	
	public Word(String word) {
		this.word = word;
	}
	
	public Word(String word, Language lang, String type) {
		this.word = word;
		this.lang = lang;
		this.type = type;
	}

	public final Long getWordId() {
		return wordId;
	}

	public final void setWordId(Long wordId) {
		this.wordId = wordId;
	}

	public final String getWord() {
		return word;
	}

	public final void setWord(String word) {
		this.word = word;
	}

	public final String getType() {
		return type;
	}

	public final void setType(String type) {
		this.type = type;
	}

	public final Language getLang() {
		return lang;
	}

	public final void setLang(Language lang) {
		this.lang = lang;
	}

	public final List<Translation> getTranslations() {
		return translations;
	}

	public final void setTranslations(List<Translation> translations) {
		this.translations = translations;
	}

	public final String getCategory() {
		return category;
	}

	public final void setCategory(String category) {
		this.category = category;
	}

	public final String getDesctiption() {
		return desctiption;
	}

	public final void setDesctiption(String desctiption) {
		this.desctiption = desctiption;
	}
}
