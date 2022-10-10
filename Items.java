package com.highpeak.coding;

import java.util.Arrays;
import java.util.Scanner;

public class Items {
  static int minimum(int array[],int N,int M) {
	int res=Integer.MAX_VALUE;
	Arrays.sort(array);
	for(int i=0;i<=N-M;i++) {
		res=Math.min(res, array[i+M-1]-array[i]);
		
	}
	  return res;
	  
  }
  //For finding the elements
  static int searchElements(int result,int array[],int N,int M) {
	  int res=Integer.MAX_VALUE;
	  for(int i=0;i<=N;i++) {
		  res=Math.min(res, array[i+M-1]-array[i]);
		  if(res==result) {
			  return i;
		  }
	  }
	  return 0;
  }
 public static void main(String[] args) {
	int array[]= {7980,22349,999,2799,229900,11101,9999,2195,9800,4999};
	String item[]= {"Fitbit Plus: 7980","IPods: 22349",
			"MI Band: 999","Cult Pass: 2799","Macbook Pro: 229900","Digital Camera: 11101",
			"Alexa: 9999","Sandwich Toaster: 2195","Microwave Oven: 9800",
			"Scale: 4999"};
	int N=array.length;
	System.out.println("Enter the Number of Employee : ");
	Scanner sc=new Scanner(System.in);
	int M=sc.nextInt();
	int res=minimum(array,N,M);
	System.out.println("No of employees:"+M);
	int index=searchElements(res,array,N,M);
	System.out.println("Here are the Goodies that are selected for distribution.");
	{
	for(int i=0;i<index+M;i++) {
		System.out.println(item[i]);
	
		
	}
	System.out.println("And the difference between the chosen goodie with highest price and the lowest price is :"+res);
		
	}	
		
		
		
}
}
