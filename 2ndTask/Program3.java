import java.util.Scanner;

class Program3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		int arraySizeNum = scanner.nextInt();
		int array[] = new int[arraySizeNum];
		int arraySum = 0;
		double averageSum = 0;
		for(int i = 0; i < array.length; i++){
			array[i] = scanner.nextInt();
			arraySum = arraySum + array[i];
		}
		averageSum = (double) arraySum / arraySizeNum;
		System.out.println(averageSum);
	}
}