package Threads;

import java.util.ArrayList;

public class Prob10
{
	public static void main(String[] args)//this is the maimn method of the class
	{
		//here i take 5 diff.words of string type variable
		String s1="batch";
		String s2="catch";
		String s3="mate";
		String s4="hatch";
		String s5="pair";
		ArrayList<String>List=new ArrayList<String>();//here i m using the arrraylist of the string
		//below i add all list values
		List.add(s1);
		List.add(s2);
		List.add(s3);
		List.add(s4);
		List.add(s5);
	//to print the stmt and that words endswith "tch" or not
		System.out.println(s1.endsWith("tch"));
		System.out.println(s2.endsWith("tch"));
		System.out.println(s3.endsWith("tch"));
		System.out.println(s4.endsWith("tch"));
		System.out.println(s5.endsWith("tch"));
	}

}