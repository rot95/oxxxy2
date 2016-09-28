package com.versus.oxxxy.service.yandex;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "text", "num", "pos", "gen", "syn", "mean", "ex" })
public class YandexTranslation {

	@JsonProperty("text")
	private String text;
	@JsonProperty("num")
	private String num;
	@JsonProperty("pos")
	private String pos;
	@JsonProperty("gen")
	private String gen;
	@JsonProperty("syn")
	private List<YandexTrSynonyms> syn = new ArrayList<YandexTrSynonyms>();
	@JsonProperty("mean")
	private List<YandexTrMean> mean = new ArrayList<YandexTrMean>();
	@JsonProperty("ex")
	private List<YandexTrExamples> ex = new ArrayList<YandexTrExamples>();


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

	public final String getNum() {
		return num;
	}

	public final void setNum(String num) {
		this.num = num;
	}

	public final String getGen() {
		return gen;
	}

	public final void setGen(String gen) {
		this.gen = gen;
	}

	@JsonProperty("pos")
	public void setPos(String pos) {
		this.pos = pos;
	}

	@JsonProperty("syn")
	public List<YandexTrSynonyms> getSyn() {
		return syn;
	}

	@JsonProperty("syn")
	public void setSyn(List<YandexTrSynonyms> syn) {
		this.syn = syn;
	}

	@JsonProperty("mean")
	public List<YandexTrMean> getMean() {
		return mean;
	}

	@JsonProperty("mean")
	public void setMean(List<YandexTrMean> mean) {
		this.mean = mean;
	}

	@JsonProperty("ex")
	public List<YandexTrExamples> getEx() {
		return ex;
	}

	@JsonProperty("ex")
	public void setEx(List<YandexTrExamples> ex) {
		this.ex = ex;
	}

}