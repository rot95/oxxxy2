package com.versus.oxxxy.service;

public interface TranslationService {
	public TranslationResult translate(String word, String from, String to) throws Exception;
}
