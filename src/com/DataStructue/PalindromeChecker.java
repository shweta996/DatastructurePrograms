package com.DataStructue;
import java.util.Random;
import java.util.Scanner;

public class PalindromeChecker {


		char array[]=new char[10];
		int rear=0;
		int front=0;
		public void add_rear(char no)
		{
			if(IsFull())
			{
				System.out.println("Overflow");
			}
			else
			{
				array[rear]=no;
				rear++;
			}
		}
		public void add_front(char no)
		{
			if(IsFull())
			{
				System.out.println("Overflow");
			}
			else
			{
				for(int i=rear;i>front;i--)
				{
					array[i]=array[i-1];
				}
				array[front]=no;
				rear++;
				
			}
			
		}
		public char delete_rear()
		{
			if(IsEmpty())
			{
				System.out.println("Underflow");
				return ' ';
			}
			else
			{
				rear--;
				char ch=array[rear];
				
				return ch;
			}
		}
		public char delete_front()
		{
			if(IsEmpty())
			{
				System.out.println("Underflow");
				return ' ';
			}
			else
			{
				 char ch=array[front];
				front++;
				
				return ch;
			}
		}
		public void display()
		{
			for(int i=front;i<rear;i++)
			{
				System.out.println(array[i]);
			}
		}
		public int Size()
		{
			int count=0;
			for(int i=front;i<rear;i++)
			{
				count++;
			}
			return count;
		}
		public boolean IsEmpty()
		{
			if(front==rear)
			{
			 return true;
			 
			}
			else
			{
				return false;
			}
		}
		public boolean IsFull()
		{
			if(rear==array.length)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public static void main(String[] args) {
			
			PalindromeChecker p1 =new PalindromeChecker();
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter String :");
			String string=scanner.next();
			char ch[]=string.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				p1.add_front(ch[i]);
			}
		
			char ch1[]=new char[ch.length];
			char ch2[]=new char[ch.length];
			int len=string.length()-1;
			int count=0;
			
			String string1=new String(ch1);
			for(char var:ch1)
			{
				System.out.println(var);
			}
	
			
			  if(string1.equals(string)) 
			  { System.out.println("Panlindrome"); 
			  } 
			  else 
			  {
			  System.out.println("Not Panlindrome"); 
			  }
			 
		}

	}


