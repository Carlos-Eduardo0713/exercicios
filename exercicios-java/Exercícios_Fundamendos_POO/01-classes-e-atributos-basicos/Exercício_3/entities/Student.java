
public class Student {

	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public void showResult() {
		if (n1 + n2 + n3 >= 60) {
			System.out.printf("FINAL GRADE: %.2f\n", n1+n2+n3);
			System.out.println("PASS");
		}
		else {
			System.out.printf("FINAL GRADE: %.2f\n", n1+n2+n3);
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60 - (n1+n2+n3));
		}
		
	}
	
	
}
