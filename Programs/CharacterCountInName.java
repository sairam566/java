package com.ts.collection;


import java.util.Map;
import java.util.TreeMap;

public class CharacterCountInName {

	public static void main(String[] args) {
		
		Map<Character, Integer> countCharacters=new TreeMap<>();
		char[] wordsInString=args[0].toCharArray();
		for(char x:wordsInString)
		{
			Integer frequency=countCharacters.get(x);
			countCharacters.put(x,(frequency==null) ? 1 : frequency+1);
		}
		System.out.println(countCharacters.size() + " distinct words:");
        System.out.println(countCharacters);
        System.out.println(countCharacters.keySet());
        System.out.println("-----------Entry Set--------------------");
        System.out.println(countCharacters.entrySet());
        System.out.println("------------------------------");
        for(Character character:countCharacters.keySet())
        {
        	System.out.println(character+"   "+countCharacters.get(character));
        }
        System.out.println("------------------For Loop-----------------");
        for(Map.Entry<Character, Integer> entry:countCharacters.entrySet())
        {
        	System.out.println("Key: "+entry.getKey()+"--------->"+entry.getValue());
        }
	}

}
