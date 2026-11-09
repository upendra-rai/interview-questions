package com.upendra.rai.stream.flatmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question5 {
	public static void main(String[] args) {
		Map<String, List<String>> userEmails = new HashMap<>();
		userEmails.put("John", Arrays.asList("john@gmail.com", "john@yahoo.com"));
		userEmails.put("David", Arrays.asList("david@gmail.com"));
		userEmails.put("Alex", Arrays.asList("alex@gmail.com", "alex@yahoo.com"));
		
		List<String>emails=userEmails.values().stream().flatMap(List::stream).toList();
		System.out.println(emails);
		
		
	}

}
