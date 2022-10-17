
public class Main {

	public static void main(String[] args) {

		PassPortApplication p1 = new PassPortApplication(21, "Bob", "Indian");
		p1.checkEligibility();

		PassPortApplication p2 = new PassPortApplication(21, "Jack", "Indian");
		p2.checkEligibility();

		PassPortApplication p3 = new PassPortApplication(17, "Raman", "Indian");
		p3.checkEligibility();

		PassPortApplication p4 = new PassPortApplication(30, "Akshay", "Canada");
		p4.checkEligibility();

		PassPortApplication p5 = new PassPortApplication(25, "Nitesh", "Indian");
		p5.checkEligibility();

	}

}
