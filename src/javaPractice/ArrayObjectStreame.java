package javaPractice;
import java.io.*;
public class ArrayObjectStreame {
	public static void main(String[] args) throws ClassNotFoundException, Exception {
		int[] numbers= {1,2,4,5,7};
		String[] Name= {"Rohim", "tareq", "Jack", "Vini"};
		try {
			ObjectOutputStream output=new ObjectOutputStream(new FileOutputStream("D:\\mihir1.dat",false));
			output.writeObject(numbers);
			output.writeObject(Name);
		} 
		catch(Exception ex) {
			System.out.println(ex);
		}
		try {
			ObjectInputStream input=new ObjectInputStream(new FileInputStream("D:\\mihir1.dat"));
			int[] newnumber=(int[]) (input.readObject());
			String[] newName=(String[])(input.readObject());
			for(int i=0; i<newnumber.length;i++) {
				System.out.println(newnumber[i]+" ");
			}
			System.out.println();
			for(int i=0; i<newName.length;i++) {
				System.out.println(newName[i]+" ");
			}
			
			}
		catch(Exception e) {
			System.out.println(e);
		}
		
			
		
	}
}
