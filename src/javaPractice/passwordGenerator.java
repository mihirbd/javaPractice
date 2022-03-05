package javaPractice;

public class passwordGenerator {
	public static char getRandom(char ch1, char ch2){
        return (char)(ch1 + Math.random()* (ch2 - ch1 + 1));
    }
    public static char getLowerCase(){
        return getRandom('a', 'z');
    }
    public static char getUpperCase(){
        return getRandom('A', 'Z');
    }
    public static char getDigitNumber(){
        return getRandom('0', '9');
    }
    public static char getRandom(){
        return getRandom('\u0000', '\uFFFF');
    }
    public static void main(String[] args) {
        final int number_of_char=2;
        final int number_per_line=2;
        for (int i = 0; i < number_of_char; i++) {
            char ch=getLowerCase();
            char ch2=getUpperCase();
            char ch3=getDigitNumber();
          if((i+1)%number_per_line==0) {
              System.out.println(ch+""+ch3+""+ch2+""+ch+""+ch3+ch2);
          }else 
              System.out.print(ch+""+ch3+""+ch2+""+ch+""+ch3+ch2);
            
        }
    }
}
