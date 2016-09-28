package com.versus.oxxxy.service.yandex;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "text", "num", "pos", "gen" })
public class YandexTrMean {

	@JsonProperty("text")
	private String text;
	
	@JsonProperty("num")
	private String num;
	
	@JsonProperty("pos")
	private String pos;
	
	@JsonProperty("gen")
	private String gen;

	public final String getText() {
		return text;
	}

	public final void setText(String text) {
		this.text = text;
	}

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
}