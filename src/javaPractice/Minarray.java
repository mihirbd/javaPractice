package javaPractice;

public class Minarray {
	public static int minarrry() {
		int[] numbers= {12,34,56,78,3,100};
			int min=numbers[0];
			for(int i=1; i<numbers.length;i++) {
				if(min>numbers[i])  
					min=numbers[i];
			}
			return min;
	}
	public static void main(String[] args) {
		System.out.println(minarrry());
	}
}
