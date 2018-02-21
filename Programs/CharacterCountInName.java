package com.ts.collection;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountInName {

	public static void main(String[] args) {
		
		Map<Character, Integer> countCharacters=new HashMap<>();
		char[] wordsInString=args[0].toCharArray();
		for(char x:wordsInString)
		{
			Integer frequency=countCharacters.get(x);
			countCharacters.put(x,(frequency==null) ? 1 : frequency+1);
		}
		System.out.println(countCharacters.size() + " distinct words:");
        System.out.println(countCharacters);
	}

}
