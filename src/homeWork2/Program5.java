package homeWork2;

class Program5 {
	public static void main(String[] args) {
		int array[] = {99, 32, 55, 1, 22, 4};
		boolean flag = false;
		int temp = 0;
		while(!flag){
			flag = true;
			for(int i = 1; i < array.length; i++){
				if (array[i] < array[i - 1]) {
					temp = array[i]; 
					array[i] = array[i - 1];
					array[i - 1] = temp;
					flag = false;
				}
			}
		}
		for(int i : array)
			System.out.println(i);
	}
	}
