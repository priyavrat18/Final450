package com.Priyavrat.Final450;

public class ReverseTheArray {
	//in this program u need to reverse the given array
	public static void main(String[] args) {
		int[] arr= {1,2,4,5,6,7,8};
		System.out.println("original array:");
		for(int a : arr) {
			System.out.print(a+ " ");
		}
		int[] result=reverseArray(arr);
		System.out.println();
		System.out.println("Reversed array:");
		for(int brr: result) {
			System.out.print(brr+" ");
		}
		
	}
	
	
	
	public static int[] reverseArray(int[] a) {
		int[] b= new int[a.length];
		int count =0;
		for(int i=a.length-1;i>=0;i--) {
			
			b[count]=a[i];
			count++;
		}
		return b;
	}

}
