package amok;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RobotDogTest {
	VirtualPet underTest = new RobotDog("Jax", "Is a Robot Dog", 40, 50, 30);

	@Test
	public void shouldReturnRobotDogName() {
		String check = underTest.getName();
		assertEquals(check, "Jax");
	}

	@Test
	public void shouldReturnRobotDogDescription() {
		String check = underTest.getDescription();
		assertEquals(check, "Is a Robot Dog");
	}

	@Test
	public void shouldReturnRobotDogOil() {
		int check = underTest.getOil();
		assertEquals(check, 40);
	}

	@Test
	public void shouldReturnRobotDogBatteryLevel() {
		int check = underTest.getBatteryLevel();
		assertEquals(check, 50);
	}

	@Test
	public void shouldReturnRobotDogHappiness() {
		int check = underTest.getHappiness();
		assertEquals(check, 30);
	}

}

