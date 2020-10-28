
public class Main {

	public static void main(String[] args) {
		/*
		Exams joseph, shafeeq;
		joseph = new Exams();
		shafeeq = new Exams();
		joseph.studentName = "Joseph";
		joseph.phy = 100; // can access a public variable, doesn't work if phy is private
		joseph.che = 80;
		shafeeq.studentName = "Shafeeq";
		shafeeq.phy = 90;
		shafeeq.che = 65;
		joseph.showResults();
		shafeeq.showResults();
		
		Maths M = new Maths();
		M.addition(2, 3);
		*/
		
		Exams student1;
		student1 = new Exams();
		student1.studentName = "Charmaine";
		student1.physics(80);
		student1.chemistry(70);
		student1.showResults();
		
		Exams college;
		college = new Exams(150);
		college.physics(130);
		college.chemistry(160);
		college.showResults();
		
		// use "getters and setters" 
		// rather than making the variables public and changing them in main code, better to make them private
		// and then use getters and setters which are public, can then filter results or check for invalid results etc
		
		int i = 1;
		for (; i <= 10; i++) System.out.print(i + " ");
		
	}

}
