package homeWork3;

import java.util.Scanner;
import java.io.IOException;


class Program2 {
	public static void main(String[] args) throws IOException {

        System.out.println(Integral(52,1, 5));

    }

	 public static double f(double x){
        return Math.pow(x*Math.log(x), 2);
    }


public static double Integral(int n, double a, double b){
        double sum=0, sum2=0;
        double[] x= new double[n];
        double h=(b-a)/n;
        for(int i=0;i<n;i++){
            x[i]=a+i*h;
        }
        for(int i=1;i<n;i++){
            sum+=f(x[i]);
            sum2+=f((x[i-1]+x[i])/2);
        }
        return h/6*(f(a)+f(b)+2*sum+4*(sum2+b));
    }
}
