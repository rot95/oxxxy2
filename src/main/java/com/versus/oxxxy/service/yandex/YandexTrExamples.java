package com.versus.oxxxy.service.yandex;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * 
 * @author Fang
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "text", "num", "pos", "gen", "tr" })
public class YandexTrExamples {

	@JsonProperty("text")
	private String text;
	@JsonProperty("num")
	private String num;
	@JsonProperty("pos")
	private String pos;
	@JsonProperty("gen")
	private String gen;
	public final String getNum() {
		return num;
	}

	public final void setNum(String num) {
		this.num = num;
	}

	public final String getPos() {
		return pos;
	}

	public final void setPos(String pos) {
		this.pos = pos;
	}

	public final String getGen() {
		return gen;
	}

	public final void setGen(String gen) {
		this.gen = gen;
	}

	@JsonProperty("tr")
	private List<YandexTranslation> tr = new ArrayList<YandexTranslation>();

	@JsonProperty("text")
	public String getText() {
		return text;
	}

	@JsonProperty("text")
	public void setText(String text) {
		this.text = text;
	}

	@JsonProperty("tr")
	public List<YandexTranslation> getTr() {
		return tr;
	}

	@JsonProperty("tr")
	public void setTr(List<YandexTranslation> tr) {
		this.tr = tr;
	}

}