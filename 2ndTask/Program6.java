class Program6 {
	public static void main(String[] args) {
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