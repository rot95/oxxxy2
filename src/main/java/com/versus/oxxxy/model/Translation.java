package com.versus.oxxxy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "translation")
public class Translation {
	
	@Id
	@GeneratedValue
	@Column(name="translation_id")
	private Long translationId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "wordId")
	private Word word;

	@Column
	private String translateDescription;
	
	public Translation() {
	}
	
	public Translation(Word word) {
		this.word = word;
	}
	
	public Translation(Word word, String description) {
		this.word = word;
		this.translateDescription = description;
	}

	public final Long getTranslationId() {
		return translationId;
	}

	public final void setTranslationId(Long translationId) {
		this.translationId = translationId;
	}

	public final Word getWord() {
		return word;
	}

	public final void setWord(Word word) {
		this.word = word;
	}

	public final String getTranslateDescription() {
		return translateDescription;
	}

	public final void setTranslateDescription(String translateDescription) {
		this.translateDescription = translateDescription;
	}
}
