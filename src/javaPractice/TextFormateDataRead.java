package javaPractice;
import java.util.Scanner;
import java.io.*;
public class TextFormateDataRead {
	public static void main(String[] args) throws Exception {
        // Create a File instance
        java.io.File file = new java.io.File("D:\\info2.txt");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);
        // Read data from a file
        while (input.hasNext()) {
            int val = Integer.parseInt(input.next());
            String val1 = input.next();
            String val2 = input.next();
            
            System.out.println(
            		val + " " + val1 + " " + val2 );
        }

        // Close the file
        input.close();
    }
}
