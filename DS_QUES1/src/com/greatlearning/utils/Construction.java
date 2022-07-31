package com.greatlearning.utils;

import java.util.Stack;

public class Construction {
	
	public void GetOrderofConstruction(int arr[]) {
		Stack<Integer> floorSize=new Stack<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(floorSize.isEmpty()) {
				floorSize.push(arr[i]);
			}
			else {
				if(floorSize.peek()<arr[i]) {
					System.out.println("Day: "+i);
					System.out.println();
					floorSize.push(arr[i]);
				}
				else {
					System.out.println("Day: "+(i));
					while((!floorSize.isEmpty()) && (floorSize.peek()>arr[i])) {
						System.out.print(floorSize.pop()+" ");
					}
					System.out.println();
					floorSize.push(arr[i]);
				}
			}
		}
		
		System.out.println("Day: "+arr.length);
		while(!floorSize.isEmpty()) {
			System.out.print(floorSize.pop()+" ");
		}
	}
	
}
