
public class Exams {
	private int phy, che, total;
	private int max_phy, max_che;
	float per;
	String studentName;
	
	public Exams() { // default constructor
		max_phy = 100;
		max_che = 100;
	}
	
	public Exams(int marks) { // overloading - same method but with different arguments
		max_phy = marks;
		max_che = marks;
	}
	
	public void physics(int a) {
		if (a>= 0 && a <= max_phy) phy = a;
		else System.out.println("Invalid Physics mark");
	}
	public void chemistry(int a) {
		if (a >= 0 && a <= max_che) che = a;
		else System.out.println("Invalid Chemistry mark");
	}
	
	public void showResults() {
		total = phy + che;
		per = (float) total * 100/(max_phy + max_che);
		System.out.println("Results of "  + studentName);
		System.out.println("Total: " + total);
		System.out.println("Percentage: " + per);
		}
}
