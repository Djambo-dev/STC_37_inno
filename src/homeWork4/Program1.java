package homeWork4;

class Program1 {
	public static void main(String[] args) {
		
		for(double i=0; i < 1030; i++){
            System.out.println(i + " " + recursion(i));
        }
	}

	public static boolean recursion(double n){
      boolean isTwoPow;
      if(n < 2){
          return false;
      }
      if(2.0 / n == 1.0){
           return true;
      } else {
          isTwoPow = recursion(n / 2.0);
           return isTwoPow;
        }
  }

}