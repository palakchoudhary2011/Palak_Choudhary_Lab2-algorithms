package com.greatelearning.ds;

public class DenominationsServices {
	public int remainingAmount;
	
	public void giveNotes(int currencyValue[], int payable){
		
		sort(currencyValue, 0, currencyValue.length-1);
		calculateNotes(currencyValue, payable);
		
	}
	
	void merge(int arr[], int left, int mid, int right)
    {
        int n1 = mid - left + 1;
        int n2 = right - mid;
 
        int LeftArray[] = new int [n1];
        int RightArray[] = new int [n2];
 
        for (int i=0; i<n1; ++i)
        {
        	LeftArray[i] = arr[left + i];
        }
        for (int j=0; j<n2; ++j)
        {
        	RightArray[j] = arr[mid + 1+ j];
        }
        
        int i = 0, j = 0;
 
        int k = left;
        while (i < n1 && j < n2)
        {
            if (LeftArray[i] >= RightArray[j])
            {
                arr[k] = LeftArray[i];
                i++;
            }
            else
            {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
 
        while (i < n1)
        {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }
 
        while (j < n2)
        {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }
 
    void sort(int arr[], int left, int right)
    {
        if (left < right)
        {
            int m = (left+right)/2;
            sort(arr, left, m);
            sort(arr , m+1, right);
            merge(arr, left, m, right);
        }
    }
 
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
	public void calculateNotes(int currencyValue[], int payable) {
		if( payable > 0) {
			int[] counter = new int[currencyValue.length];
			
			try {
				for( int i = 0; i< currencyValue.length;i++) {
					 if( payable >= currencyValue[i]) {
						 counter[i] = payable / currencyValue[i];
						 payable = payable - counter[i] * currencyValue[i];
					 }
				}
				
				if( payable > 0) {
					System.out.println("Exact amount can't be given with highest denomination");
				}else {
					System.out.println("Your payment approach in order to give min no of notes will be : ");
					for (int i = 0; i < currencyValue.length; i++) {
						if(counter[i] != 0) {
							System.out.println(currencyValue[i] + " : "+ counter[i]);
						}
					}
				}
			}
			catch( ArithmeticException E ) {
				System.out.println("Error occured");
			}
		}
	}
	
	
	
}


