package javaPractice;
import java.io.*;
public class DatareadWrite {
public static void main(String[] args) throws IOException {
	
	try{	
		 FileOutputStream output=new FileOutputStream("D:\\mihir.dat");
		for(int x=0; x<10; x++) {
			output.write(x);
			}
		}   
	catch(IOException e){
		System.out.println(e);
	}
	try {
		FileInputStream input=new FileInputStream("D:\\mihir.dat");
		int value;
			while((value= input.read())!=-1) {
				System.out.println(value+" ");
			}
		}
	catch (IOException ex) {
		System.out.println(ex);
	}
	
	
}
}
