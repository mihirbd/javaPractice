package javaPractice;
public class method {
	public static void main(String[] args) {
		System.out.println(sum(3,4));
		System.out.println(sum2(3,78));
		sum3(10,16);
		Maxmin(1,23,45);
		
	}
	public static int sum(int num1,int num2) {
		int result= num1+num2;
		return result;
	}
	
	public static int sum2(int x,int y) {
		int result=0;
		for (int i=x; i<=y; i++) 
			result+=i;
			return result;
	}
	
	public static void sum3(int x,int y) {
		int result=0;
		for (int i=x; i<=y; i++) 
			result+=i;
			System.out.println("The result is: "+ result);
	}
	
	public static void Maxmin(int num1, int num2, int num3) {
		int result1, result2;
		result1=Math.max(Math.max(num1, num2), Math.max(num3,0));
		result2=Math.min(Math.min(num1, num2), Math.min(num3,Math.min(num1, num2)));
		int[] x= {result1,result2};
		System.out.println("The max Number is:"+x[0]);
		System.out.println("The min Number is:"+x[1]);
	}
	
	
	
}
