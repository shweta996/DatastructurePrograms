package com.DataStructue;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import com.DataStructue.UnorderedList;

public class Hashing {
	static UnorderedList  slot[]=new UnorderedList[11];
	static UnorderedList list=new UnorderedList();
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new FileReader("/home/user/eclipse-workspace/DataStructure/src/com/DataStructue/Hashing.txt"));
		
		for(int i=0;i<slot.length;i++)
		{
			slot[i]=new UnorderedList();
		}
		int array[]=new int[10];
		int number = 0;
		int j=0;
		String str=br.readLine();
		System.out.println(str);
		String strArray[]=str.split(" ");
		for(int i=0;i<strArray.length;i++)
		{
			int num=Hash(strArray[i]);
			slot[num].insert(strArray[i]);
			
		}
		
		System.out.println();
		for(int i=0;i<11;i++)
		{
			System.out.print(i+"==>");
			slot[i].display();
		}
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Key :");
		int number1=scanner.nextInt();
		String string=String.valueOf(number1);	
		int num=Hash(string);
		for(int i=0;i<array.length;i++)
		{
		
			while(list.head!=null)
			{
				if(slot[num].Search(list.head, number1))
						{
					System.out.println("Element found "+slot[num]);
					break;
						}
			}
		}
		System.out.println("Hello");
	}
	public static  int Hash(String str)
	{
		return Integer.parseInt(str)%slot.length;
	}
	
		
}