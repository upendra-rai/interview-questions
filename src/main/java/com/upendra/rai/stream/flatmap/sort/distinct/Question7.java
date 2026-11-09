package com.upendra.rai.stream.flatmap.sort.distinct;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question7 {

	public static void main(String[] args) {
		List<List<Integer>> marks = Arrays.asList(Arrays.asList(75, 85, 90, 75), Arrays.asList(60, 90, 95, 85),
				Arrays.asList(70, 95, 100));	
		
		List<Integer>data=marks.stream().flatMap(mark->mark.stream()).sorted(Comparator.reverseOrder()).distinct().toList();
		System.out.println(data);
	}

}
