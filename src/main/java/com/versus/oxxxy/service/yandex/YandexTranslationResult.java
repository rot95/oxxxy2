package com.versus.oxxxy.service.yandex;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.versus.oxxxy.service.TranslationResult;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "head", "def" })
public class YandexTranslationResult implements TranslationResult {

	@JsonProperty("head")
	private Object head;
	@JsonProperty("def")
	private List<YandexDirectoryEntires> def = new ArrayList<YandexDirectoryEntires>();
	@JsonProperty("head")
	
	public Object getHead() {
		return head;
	}
	
	@JsonProperty("head")
	public void setHead(Object head) {
		this.head = head;
	}
	
	@JsonProperty("def")
	public List<YandexDirectoryEntires> getDef() {
		return def;
	}

	@JsonProperty("def")
	public void setDef(List<YandexDirectoryEntires> def) {
		this.def = def;
	}

}