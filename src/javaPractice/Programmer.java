package javaPractice;

public class Programmer extends Empoloyee {
	private int bonus;
	
	public void setBonus(int bonus) {
		this.bonus=bonus;
	}
	public int getBonus() {
		return bonus=3000;
	}
	
	public static void main(String[] args) {
		Programmer proinfo=new Programmer();
		
		System.out.println(proinfo.getId());
		System.out.println(proinfo.getName());
		System.out.println(proinfo.getSalary());
		System.out.println(proinfo.getBonus());
	}	
	
	
}
