package task2;
import java.util.Scanner;
public class task2pro1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
    System.out.println("Enter string to check:");
			        String input = scanner.nextLine();
			        String reversed = "";
			        String str = "";
			        
			        for(int i = 0; i < input.length() ; i++)
			        {
			        	
			        	if ((input.charAt(i)>64 && input.charAt(i)<91)||(input.charAt(i)>96 && input.charAt(i)<123) )
			            str += input.charAt(i);
			        }
			        str = str.toLowerCase();
			        
			        for(int j = str.length() - 1; j >= 0; j--)
			        {
			        	
			        		reversed += str.charAt(j);
			          
			        }
			        System.out.println("reversed=  "+ reversed);

			        
			        if (reversed == (str) ) {
			        System.out.println("True");}
			        else { System.out.println("false");}

			      
			    }
}
