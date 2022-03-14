package javaPractice;

public class LoopAD {


    static boolean foo(char c) {
        System.out.print(c);
        return true;
    }
    public static void main(String[] args) {
    	LoopAD x = new LoopAD();
        int i = 0;
        for (x.foo('A'); x.foo('B') && (i < 2); x.foo('C')) {
            i++;
            x.foo('D');
        }
    }

	
	
	
}
