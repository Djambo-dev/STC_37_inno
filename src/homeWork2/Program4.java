package homeWork2;

import java.util.Scanner;

class Program4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrayNum = scanner.nextInt();
		int array[] = new int[arrayNum];
		for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
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
}