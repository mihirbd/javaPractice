package javaPractice;

public class Arraysortaftab {
	public static void main(String[] args) {
	       int [][] m={{7,8,2,4}, {3,9,1,0},{2,12,5,0},{18,32,11,1}};
	        for (int i = 0; i < m.length; i++) {
	            for (int j = 0; j < m[i].length; j++) {
	                for (int k = 0; k < m[i].length-1; k++) {
	                    if(m[i][k]>m[i][k+1]){
	                        int temp=m[i][k];
	                        m[i][k]=m[i][k+1];
	                        m[i][k+1]=temp;
	                    }
	                }
	            }
	        }for (int i = 0; i < m.length; i++) {
	            for (int j = 0; j < m[i].length; j++) 
	                System.out.print(m[i][j]+" ");
	                System.out.println();
	        
	        }
	    }
}
