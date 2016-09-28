package com.versus.oxxxy.service.yandex;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "text", "num", "pos", "gen", "tr" })
public class YandexDirectoryEntires {

	public final String getGen() {
		return gen;
	}

	public final void setGen(String gen) {
		this.gen = gen;
	}

	@JsonProperty("text")
	private String text;
	@JsonProperty("num")
	private String num;
	@JsonProperty("pos")
	private String pos;
	@JsonProperty("gen")
	private String gen;
	@JsonProperty("tr")
	private List<YandexTranslation> tr = new ArrayList<YandexTranslation>();
	@JsonProperty("ts")
	private String ts;

	@JsonProperty("text")
	public String getText() {
		return text;
	}

	@JsonProperty("text")
	public void setText(String text) {
		this.text = text;
	}

	@JsonProperty("pos")
	public String getPos() {
		return pos;
	}

	@JsonProperty("pos")
	public void setPos(String pos) {
		this.pos = pos;
	}

	@JsonProperty("tr")
	public List<YandexTranslation> getTr() {
		return tr;
	}

	@JsonProperty("tr")
	public void setTr(List<YandexTranslation> tr) {
		this.tr = tr;
	}

	public final String getNum() {
		return num;
	}

	public final void setNum(String num) {
		this.num = num;
	}

	public final String getTs() {
		return ts;
	}

	public final void setTs(String ts) {
		this.ts = ts;
	}

}