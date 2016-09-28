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
}
