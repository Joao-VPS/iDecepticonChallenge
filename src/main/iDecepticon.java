package main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class iDecepticon {
	boolean affirmation, question;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Quebrou totalmente a lógica :p
		String pseudoInput = "Hello! My name is John!";
	}

	// Função de semântica
	public void semantic() {
		
	}
	
	// Funções verificadoras de palavras
	public String gender(String input) {
		String[] male = {
			"he", "him", "his"
		};
		
		String[] female = {
			"she", "her", "hers"
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

	public boolean person(String input) {
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
	
	public boolean auxiliaries(String input) {
		String[] verbs = {
			"do", "does", "did", "be"
		};
		
		for (String i: verbs) {
			if (input.equalsIgnoreCase(i)) return true;
		}
		
		return false;
	}
	
	public boolean possessive(String input) {
		String[] possessive = {
			"my", "your", "yours", "our", "ours", "mine"};
		
		for (String i: possessive) {
			if (input.equalsIgnoreCase(i)) return true;
		}
		
		return false;
	}
	
	public boolean questionWords(String input) {
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
