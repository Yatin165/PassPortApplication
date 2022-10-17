import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PassPortApplication {

	static List<String> ls = new ArrayList<>();

	static {
		ls.add("Bob");
		ls.add("Jack");
	}

	Log logger = LogFactory.getLog(PassPortApplication.class);
	private int age;
	private String name;
	private String nationality;

	public PassPortApplication(int age, String name, String nationality) {
		super();
		this.age = age;
		this.name = name;
		this.nationality = nationality;
		logger.error("Application applied by " + this.name);

	}

	public int checkEligibility() {
		logger.error("Checking Eligibility");
		if (this.name == ls.get(0) || this.name == ls.get(1)) {
			System.out.println("Your application is Rejected");
			logger.error("Application Rejected due to criminal records");
			return 0;
		} else {
			if (this.age > 18 && this.nationality == "Indian") {
				System.out.println("Your Applicaiton is Accepted");
				logger.error("Applicaiton Accepted");
				return 1;
			} else {
				System.out.println("Your Application is Rejected");
				logger.error("Applicaiton Rejected due to Age or Nationality issue");
				return 0;
			}
		}
	}

}
