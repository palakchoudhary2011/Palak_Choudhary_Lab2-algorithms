package com.greatelearning.ds;

import java.util.Scanner;

public class DenominationsDriver {

	static Scanner sc = new Scanner(System.in);
	static int currencySize;
	static int currencyValue[];
	static int payableAmount;
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size of currency denominations : ");
		currencySize = sc.nextInt();
		currencyValue = new int [currencySize];
		
		System.out.println("Enter the currency denominations value : ");
		for(int i = 0; i < currencyValue.length; i++) {
			currencyValue[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay : ");
		payableAmount = sc.nextInt();
		
		DenominationsServices service = new DenominationsServices();
		
		service.giveNotes(currencyValue, payableAmount);
	}
}
