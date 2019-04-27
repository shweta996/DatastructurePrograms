package com.DataStructue;
import java.util.*;

public class StackAnagramUtility {

		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Number :");
			int number=scanner.nextInt();
			PrimeUtilityAnagram p1=new PrimeUtilityAnagram();
			PrimeStackAnagram ps=new PrimeStackAnagram();
			int array[]=new int[168];
			array=p1.Prime(number);
			array=p1.Anagram(array);
			for(int i=0;i<array.length;i++)
			{
				if(array[i]!=0)
				{
				ps.Insert(array[i]);
				}
			}
			ps.display();
		}

	}


