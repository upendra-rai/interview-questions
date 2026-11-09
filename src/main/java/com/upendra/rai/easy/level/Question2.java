package com.upendra.rai.easy.level;

import java.util.List;

public class Question2 {
	public static void main(String[] args) {
		String str = "lucky";
		List<Character> data = str.chars().mapToObj(s -> (char) s).toList();
		System.out.println(data);
	}

}
