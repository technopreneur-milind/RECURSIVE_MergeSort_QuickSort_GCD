package com.example.demo;

public class GCD {

	public int execute(int[] input) {
		sort(input);
		int result =-1;
		for (int i = 0; i < input.length; i++) {
			int currentValue = input[i];
			boolean notDivisible = false;
			for (int j = i + 1; j < input.length; j++) {
				if ((input[j] % currentValue) != 0) {
					notDivisible = true;
					break;
				}
			}
			if (notDivisible) {
				break;
			}
			result = currentValue;
		}
		return result;

	}

	private void sort(int[] input) {
		 //mergeSort(0,input.length,input);
		 quickSort(0,input.length-1,input);
	}

	private void quickSort(int lowerIndex, int higherIndex, int[] array) {
		if(lowerIndex < higherIndex && array != null && array.length > 1)
		{
			int i = lowerIndex;
	        int j = higherIndex;
	        // calculate pivot number, I am taking pivot as middle index number
	        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
	        // Divide into two arrays
	        while (i <= j) {
	            while (array[i] < pivot) {
	                i++;
	            }
	            while (array[j] > pivot) {
	                j--;
	            }
	            if (i <= j) {
	                exchangeNumbers(i, j,array);
	                //move index to next position on both sides
	                i++;
	                j--;
	            }
	        }
	        // call quickSort() method recursively
	        if (lowerIndex < j)
	            quickSort(lowerIndex, j,array);
	        if (i < higherIndex)
	            quickSort(i, higherIndex, array);
		}
		
	}

	

	private void exchangeNumbers(int i, int j,int[] array) {
		if(i != j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		}
		
	}

	private void mergeSort(int low, int high,int[] input) {
		if(low < high && input != null && input.length > 1)
		{
			int mid = (low + high )/2;
			mergeSort(low,mid,input);
			mergeSort(mid+1,input.length,input);
			merge(low,mid,input.length, input);
		}
	}

	private void merge(int low, int mid, int length, int[] input) {
		//int sizeOfSecond = length - mid;
		int i =0, j = mid, index = 0;
		int[] copiedData = input.clone();
		while(i< mid && j< length)
		{
			if(input[i] < input[j])
				input[index++] = copiedData[i++];
			else
				input[index++] = copiedData[j++];
		}
		while( i< mid)
			input[index++] = copiedData[i++];
		while(j<length)
			input[index++] = copiedData[j++];
		
	}

}
