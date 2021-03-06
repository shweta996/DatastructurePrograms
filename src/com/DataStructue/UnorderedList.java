package com.DataStructue;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.lang.reflect.Array;
	import java.util.Arrays;
	import java.util.Scanner;

	public class UnorderedList<T> {

		class Node<T>
		{
			Object data;
			Node next;
			
		}
		Node head=null;
		public Node insert(T data)
		{
			Node node=new Node();
			node.data=data;
			node.next=head;
			head=node;
			return node;
			
		}
		public void delete()
		{
			Node temp=head;
			head=head.next;
			//delete(temp);
		}
		public void append(T data)
		{										 
			Node node = null,current;
			
			if(head==null)
			{
				node=head;
				node.data=data;
			   current=node;
			   
			 }
			 else
			 {
			   Node temp = head;
			   
			     while(temp.next!=null)
			     {
			     temp = temp.next;
			     }
			     temp.data=data;
			     temp.next=node;
			     System.out.println("Element added successfully at end");
			 }
		
		}
		
			
		
		public void display()
		{
			Node temp=head;
			while(temp!=null)
			{
				if(temp.data!=null)
				System.out.println(temp.data);
				temp=temp.next;
			}
			
		}
		public boolean  Search(Node head,T key)
		{
			Node node=head;
			while(node!=null)
			{
				if(node.data.equals(key))
				{
					return true;
				}
				node=node.next;
			}
			return false;
		}
		
		public int size() {
			int count = 0;
			Node current = head;
			while(current!= null) 
			{
				current = current.next;
				count++;
			}
			return count;
			
		}
		public void isEmpty()
		{
			Node node=head;
			if(node==null)
			{
				System.out.println("linkedlist is empty :");
			}
		}
		public void index(Node head,int index)
		{
			int count=1;
			Node node=head;
			while(node!=null)
			{
				if(count==index)
				{
					System.out.println("data present at "+index+" "+node.data);
				}
				node=node.next;
				count++;
			}
		}
		
		
		
		public static void main(String[] args) throws FileNotFoundException 
		{
			
			UnorderedList<String> list=new UnorderedList<String>();
			File file=new File("/home/user/eclipse-workspace/DataStructure/src/com/DataStructue/unorderd.txt");
			Scanner scanner=new Scanner(file);
			Scanner scanner1=new Scanner(System.in);
			int len=(int) file.length();
			String str=null;
			int i=0;
			String strig=null;
			while(scanner.hasNext())
			{
				str=scanner.next();
				list.insert(str);
				
			}
			
			list.display();
			
			  System.out.println("Enter String to search :");
			  
			  String key = scanner1.next();
			  boolean no=list.Search(list.head,key);
			  if(no==true) 
			  { 
				  System.out.println("element found"); 
			  } 
			  else 
			  {
			  System.out.println("element not found"); 
			  }
			  int count=list.size();
			  list.isEmpty();
			//  list.insert(str);
			
			  list.display();
			  list.index(list.head,3);
			  list.append(str);
			  list.size();
			
			
	 	}
	}

