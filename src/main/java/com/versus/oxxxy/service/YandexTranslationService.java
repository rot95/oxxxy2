package com.versus.oxxxy.service;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.versus.oxxxy.service.yandex.YandexTranslationResult;

@Service
public class YandexTranslationService implements TranslationService {
	
	@Override
	public TranslationResult translate(String wordToTranslate, String from, String to) throws IOException {
		String lang = from + "-" + to;
		String urlStr = "https://dictionary.yandex.net/api/v1/dicservice.json/lookup?key=dict.1.1.20160928T130441Z.63ec9b4df8d764f4.2224b0eae173e0ceabb33fd9e599a0277d693ece";
		URL urlObj = new URL(urlStr);
		HttpsURLConnection connection = (HttpsURLConnection)urlObj.openConnection();
		connection.setRequestMethod("POST");
		connection.setDoOutput(true);
		DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());
		dataOutputStream.writeBytes("&lang=" + lang + "&text=" + URLEncoder.encode(wordToTranslate, "UTF-8"));
		String json = null;
		InputStream response = connection.getInputStream();
		try (Scanner scanner = new Scanner(response)) {
			json = scanner.nextLine();
			
		}
		ObjectMapper objectMapper = new ObjectMapper();
		YandexTranslationResult result = objectMapper.readValue(json, YandexTranslationResult.class);
		return result;
	}
}
