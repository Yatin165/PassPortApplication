import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PassPortApplicationTest {

	@Test
	void PassPortApplicationTest1() {
		PassPortApplication p1 = new PassPortApplication(21, "Bob", "Indian");
		int actual = p1.checkEligibility();
		assertEquals(0, actual);
	}

	@Test
	void PassPortApplicationTest2() {
		PassPortApplication p1 = new PassPortApplication(21, "Jack", "Indian");
		int actual = p1.checkEligibility();
		assertEquals(0, actual);
	}

	@Test
	void PassPortApplicationTest3() {
		PassPortApplication p1 = new PassPortApplication(17, "Raman", "Indian");
		int actual = p1.checkEligibility();
		assertEquals(0, actual);
	}

	@Test
	void PassPortApplicationTest4() {
		PassPortApplication p1 = new PassPortApplication(30, "Akshay", "Canada");
		int actual = p1.checkEligibility();
		assertEquals(0, actual);
	}

	@Test
	void PassPortApplicationTest5() {
		PassPortApplication p1 = new PassPortApplication(25, "Nitesh", "Indian");
		int actual = p1.checkEligibility();
		assertEquals(1, actual);
	}
}
