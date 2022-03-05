package javaPractice;

public class Maxarray {
	public static void main(String[] args) {
		System.out.println(maxarrry());
	}
	
	public static int maxarrry() {
		int[] numbers= {12,34,56,78,3,100};
			int max=numbers[0];
			for(int i=1; i<numbers.length;i++) {
				if(max<numbers[i])  
				   max=numbers[i];
			}
			return max;
	}
}
