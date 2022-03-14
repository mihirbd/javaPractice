package javaPractice;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TextFormateDataWrite {
	public static void main(String[] args) throws FileNotFoundException {
		java.io.File file = new java.io.File("D:\\info4.txt");
		  if (file.exists()){
		  System.out.println("File already exists");
		  System.exit(1);
		 }
		 java.io.PrintWriter output =new java.io.PrintWriter(file);
		  // Write formatted output to the file
		 Scanner Input=new Scanner(System.in);
		 System.out.println("please your ID");
		 int val=Input.nextInt();
		 System.out.println("please your Name");
		 String val1=Input.next();
		 System.out.println("please your Cource");
		 String val2=Input.next();;
		 
		 output.print(val+" ");
		 output.print(val1+" ");
		 output.print(val2);
		  
		  // Close the file
		  output.close();
	}
	
	
}
