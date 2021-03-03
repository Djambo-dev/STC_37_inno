package homeWork2;

import java.util.Scanner;
import java.util.Arrays;

class Program2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int[] array = new int[arraySize];
		for (int i = 0; i < array.length;i++ ) {
			array[i] = sc.nextInt();
		}
		array = reverse(array);
		System.out.println(Arrays.toString(array));
	}
	public static int[] reverse(int[] array){
        int[] array1 = new int[array.length];
        for(int i = 0; i < array.length; i++){
            array1[i] = array[array.length - 1 - i];
        }
        return array1;
    }
}