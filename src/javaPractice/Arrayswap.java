package javaPractice;
public class Arrayswap {
/*	public static void main(String[] args) {
		Arrayswap obj=new Arrayswap();
		int []x= {5,8};
		obj.swap(x[0], x[1]);
	}
	
	public void swap(int x, int y) {
		int temp=x;
		x=y;
		y=temp;
		System.out.println(x+" "+y);
	}
*/
	public static void main(String[] args) {
		Arrayswap obj=new Arrayswap();
		int []x= {5,8};
		obj.swap(x);
	}
	
	public void swap(int y[]) {
		int temp=y[0];
		y[0]=y[1];
		y[1]=temp;
		System.out.println(y[0]+y[1]);
	}
}
