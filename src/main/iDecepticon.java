package main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class iDecepticon {
	boolean affirmation, question, hasGreeting;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Quebrou totalmente a lógica :p
		String pseudoInput = "Hello! My name is John!";
		String[] phraseWords = pseudoInput.split(" ");
		String[] phraseLength = new String[phraseWords.length];
		
		for (int i = 0; i < phraseLength.length; i++) {
			if (greetings(phraseWords[i])) phraseLength[i] = "greeting";
		}
		
		if (greetings(phraseWords[0])) {
			hasGreeting = true;
		}
	}

	// Função de semântica
	public String semantic() {
		
	}
	
	public String semanticAffirmation() {
		
	}
	
	// Funções verificadoras de palavras
	public static boolean greetings(String input) {
		String[] greetings = {
			"hi", "hello", "hey",
			"hey man", "hey bro", "fellas",
			"what's up", "good morning",
			"good afternoon", "good evening"
		};
		
		for (String word : greetings) {
			if (input.equalsIgnoreCase(word)) return true;
		}
		
		return false;
	}
	
	public static String gender(String input) {
		String[] male = {
			"he", "him", "his", "gabriel", "douglas", "joão", "john", "bruno", "leandro"
		};
		
		String[] female = {
			"she", "her", "hers", "larissa", "camilla"
		};
		
		String[] neutral = {
			"it", "we", "they", "them", "theirs"
		};
		
		for (String i: male) {
			if (input.equalsIgnoreCase(i)) return "male";
		}
		
		for (String i: female) {
			if (input.equalsIgnoreCase(i)) return "female";
		}
		
		for (String i: neutral) {
			if (input.equalsIgnoreCase(i)) return "neutral";
		}
		
		return "unknown";
	}

	public static boolean person(String input) {
		String[] pronouns = {
				"i", "you", "we",
				"it", "they", "he",
				"she"
		};
		
		for (String i: pronouns) {
			if (input.equalsIgnoreCase(i)) return true;
		}
		
		return false;
	}
	
	public static boolean auxiliaries(String input) {
		String[] verbs = {
			"do", "does", "did", "be"
		};
		
		for (String i: verbs) {
			if (input.equalsIgnoreCase(i)) return true;
		}
		
		return false;
	}
	
	public static boolean possessive(String input) {
		String[] possessive = {
			"my", "your", "yours", "our", "ours", "mine"};
		
		for (String i: possessive) {
			if (input.equalsIgnoreCase(i)) return true;
		}
		
		return false;
	}
	
	public static boolean questionWords(String input) {
		String[] questionWords = {
				"who", "whom", "whose",
				"when", "why", "which",
				"how", "have", "what",
				"has", "had", "will",
				"would", "can", "could",
				"should", "might", "where"};
		
		for (String i: questionWords) {
			if (input.equalsIgnoreCase(i)) return true;
		}
		
		return false;
	}
}
