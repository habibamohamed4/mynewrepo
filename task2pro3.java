package task2;
import java.util.Scanner;
public class task2pro3 {
	public static void main(String[] args) {
	 Scanner scanner=new Scanner (System.in);
	 char exit ='n' ;
	 while (exit == 'n' ) {
		System.out.print("please insert the integer number ");
		int x = scanner.nextInt();
		
		for(int i=1 ; i <= x ; i++) {
			for(int j=1 ; j<= i ; j++) {
			int mult = (x-(x-j))*i;
			System.out.print(+ mult);
			System.out.print(" ");
		}
	 
			System.out.println();
	}
		System.out.print("if you want to exit press N for no if not press Y for yes");
		 exit = scanner.next().charAt(0) ;
 }
	 while(exit !='Y' && exit != 'N') {
		 System.out.print("if you want to exit press N if not press Y"); 
		 exit = scanner.next().charAt(0) ;
	 }
	}
	}