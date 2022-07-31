package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.utils.Construction;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the total no of floors in the building");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("enter the floor size given on day : "+(i+1));
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The order of construction is as follows");
		Construction construction=new Construction();
		construction.GetOrderofConstruction(arr);
		
		sc.close();

	}

}
