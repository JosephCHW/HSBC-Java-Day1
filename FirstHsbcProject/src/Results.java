
public class Results {

	public static void main(String[] args) {
		int physics, chemistry, maths, total;
		float percentage;
		physics = 90;
		chemistry = 52;
		maths = 91;
		total = physics + chemistry + maths;
		percentage = total * (float) 100/300;
		System.out.println("Total Marks : " + total);
		System.out.println("Percentage : " + percentage);
		
		if (percentage >= 90) System.out.println("You got an A.");
		else if (percentage >= 80) System.out.println("You got a B.");
		else if (percentage >= 70) System.out.println("You got a C.");
		else if (percentage >= 60) System.out.println("You got a D.");
		else System.out.println("You have failed the exam lol.");
		
		int a;
		a = 1;
		while (a <= 5) {
			System.out.println(2+"X"+a+"="+(a*2));
			a += 1;
		}
		
		First ref; //create object in ram
		ref = new First();
		ref.A = 89; //go to address ref and find A
		ref.B = 100;
		ref.C = ref.A + ref.B;
		System.out.println("The result is " + ref.C);
		
		
	}

}

