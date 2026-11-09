package com.upendra.rai.easy.level;

import java.util.ArrayList;
import java.util.List;

public class Question1 {

	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();
		String s1 = "Upendra";
		for (char c : s1.toCharArray()) {
			list.add(c);
		}
		System.out.println(list);
	}

}
