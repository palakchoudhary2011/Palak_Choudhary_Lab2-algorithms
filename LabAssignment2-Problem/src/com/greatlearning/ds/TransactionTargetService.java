package com.greatlearning.ds;

public class TransactionTargetService {
	
	int sum = 0;
	boolean notFound = false;
	public int checkTargetAvability(int array[],int sizeOfTarget, int targetValue){
		
		
		if( sizeOfTarget > 0) {
						
			sum = array[0];
			
			for(int i =0; i < array.length ; i++) {
				
				
				if( sum >= targetValue) {
					int j = i+1;
					System.out.println("Target achieved after "+ j +" transactions");
					notFound = true;
					break;
				}
				else {
					if( i + 1 < array.length) {
						sum = array[i] + array[i +1];
					}
				}
			}
			if( notFound == false) {
				System.out.println("Given target is not achieved.");
			}
			
		}
		return 1;
	}
}
