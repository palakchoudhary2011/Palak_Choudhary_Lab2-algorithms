package com.greatlearning.ds;

import java.util.Iterator;
import java.util.Scanner;

public class TransactionTargetDriver {

	static Scanner sc = new Scanner(System.in);
	static int array[];
	static int array_size;
	static int total_no_of_achieves;
	static int achieves[];
	public static void main(String args[]) {
		
		TransactionTargetService service = new TransactionTargetService();
		
		System.out.println("Enter the size of transaction array :");
		array_size = sc.nextInt();
		array = new int[array_size];
		
		System.out.println("Enter the values of array : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved : ");
		total_no_of_achieves = sc.nextInt();
		achieves = new int[total_no_of_achieves - 1];
		
		for(int i = 0; i < total_no_of_achieves; i++) {
			System.out.println("Enter the value of Target :");
			service.checkTargetAvability(array,total_no_of_achieves, sc.nextInt());
		}
	}
}
