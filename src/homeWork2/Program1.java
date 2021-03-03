package homeWork2;

import java.util.Scanner;

class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayNum = sc.nextInt();
		int array[] = new int[arrayNum];
		int arraySum = 0;
		for(int i = 0; i < array.length; i++){
			array[i] = sc.nextInt();
			arraySum = arraySum + array[i];
		}
		
		System.out.println(arraySum);
	}
}