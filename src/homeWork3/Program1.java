package homeWork3;

import java.util.Scanner;

class Program1 {
	public static void main(String[] args) {
		
		
		sumArray();
		reverseArray();
		averageArithmetic();
		maxMinSwap();
		bubbleSort();
		fromArrayToInt();
	}
	public static void sumArray(){
		int[] array = {5, 3, 7, 9, 4};
		int sumArray = 0;
		for(int i = 0; i < array.length; i++){
			sumArray = sumArray + array[i];
		}
		System.out.println(sumArray);
	}
	public static void reverseArray(){
		Scanner scanner = new Scanner(System.in);
		int arrayLength = scanner.nextInt();
		int[] array = new int[arrayLength];
		for(int i = 0; i < array.length; i++){
			array[i] = scanner.nextInt();
		}
        int temp = 0;
        for(int i = 0; i < array.length / 2; i++){
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        for(int i : array)
        	System.out.println(i);
    }
    public static void averageArithmetic(){
		Scanner scanner = new Scanner(System.in);
		int arrayLength = scanner.nextInt();
		int[] array = new int[arrayLength];
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			array[i] = scanner.nextInt();
			sum = sum + array[i];
		}
		double averageArithmetic = (double) sum / arrayLength;
        System.out.println(averageArithmetic);
    }

public static void maxMinSwap(){
		int array[] = {4, 2, 3, 5, 7};
		int max = array[0];
		int maxIndex = 0;
		int min = array[0];
		int minIndex = 0;
		for (int i = 0; i < array.length;i++) {
			if(max < array[i]){
				max = array[i];
				maxIndex = i;
			}
			if(min > array[i]){
				min = array[i];
				minIndex = i;
			}
		}
		array[maxIndex] = min;
		array[minIndex] = max;
		for(int i : array)
			System.out.println(i);
    }

	public static void bubbleSort(){
		int[] array = {9,8,7,6,5,4,3,2,1};
        int temp = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length - i; j++){
                if(array[j] < array[j - 1]){
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        for(int i : array)
            System.out.println(i);
	}

    public static void fromArrayToInt(){
    	int array[] = {4, 2, 3, 5, 7};
		int number = 0;
		String sNumber = "";
		for(int i = 0; i< array.length; i++){
			sNumber = sNumber + array[i];
		}
		number = Integer.parseInt(sNumber);
		System.out.println(number);
    }
}
