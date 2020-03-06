package task2pro2;
import java.util.Scanner;
public class task2pro2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("please insert your integer");
		int x = scanner.nextInt();
		String str = " " ;
		String result ="";
		while(x>0) {
			str = str + (x%10) ;
			x=x/10 ;
		}

        for(int i = str. length() - 1; i >= 0; i--) {
            result = result + str. charAt(i); }

		System.out.print("your result is"+ result);
	
		
	}

}
