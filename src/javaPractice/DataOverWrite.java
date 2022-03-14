package javaPractice;
import java.io.*;
public class DataOverWrite {
public static void main(String[] args) throws IOException{
	try {
		 DataOutputStream output=new DataOutputStream(new FileOutputStream("D:\\mihir.dat"));
		 output.writeUTF("Tarequl islam");
		 output.writeUTF("Mihir");
		 output.writeUTF("java");
		 output.writeDouble(870.67);
		 
	}catch(IOException ex) {
		System.out.println(ex);
	}
	try {
		DataInputStream input=new DataInputStream(new FileInputStream("D:\\mihir.dat"));
		System.out.println("Name: "+input.readUTF()+" "+input.readUTF());
		System.out.println("Cource: "+input.readUTF());
		System.out.println("Course Time: "+input.readDouble()+" Houre");
	}catch(IOException e) {
		System.out.println(e);
		
	}
	
}
}
