package com.greatlearning.dsalab.balancingbrackets;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		if(bracketBalance(input)) {
			System.out.println("The entered String has Balanced Brackets");
		}else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

	}
	
	static boolean bracketBalance(String input) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i =0; i<input.length(); i++) {
			
			char inputCharacter = input.charAt(i);
			char poppedCharacter;
			
			if(inputCharacter =='(' || inputCharacter =='{' || inputCharacter == '[') {
				stack.push(inputCharacter);
				continue;
			}
				if (stack.isEmpty())
	                return false;
				
				poppedCharacter = stack.pop();
				
				switch(poppedCharacter) {
				
				case '(':
				if(inputCharacter == '(' && poppedCharacter != ')') 
					return false;
				break;
				
				case '{':
				if(inputCharacter == '{' && poppedCharacter != '}') 
					return false;
				break;
				
				case ']':
				if(inputCharacter == '[' && poppedCharacter != ']') 
					return false;
				break;
				
				}
			
		}
		
		
		return stack.empty();
	}

}
