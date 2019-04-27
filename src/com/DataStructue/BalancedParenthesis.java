package com.DataStructue;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("String is: (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)");
		String str = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		Stack<Character> stack=new Stack<Character>(); 
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='(')
			{
				stack.push(ch[i]);
				
			}
			else if(ch[i]==')')
			{
				stack.pop();
				
			}

		}
		if(stack.isEmpty())
		{
			System.out.println("Balanced parentheses ");
		}
		else
		{
			System.out.println("Unbalanced parentheses");
		}
	

	}
}
