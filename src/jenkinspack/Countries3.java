package jenkinspack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Countries3 {
	@Test
	public void Tokyo() {

		String name = "Tokyo";

		Assert.assertEquals(name, "Tokyo");

		System.out.println("The Given country name is correcr" + name);
	}

	@Test
	public void Turkey() {
		String name = "Turkey";

		Assert.assertEquals(name, "Turkey");
		System.out.println("The given country name is correct" + name);
	}

	@Test
	public void Azmir() {
		String name = "Russia";

		Assert.assertEquals(name, "Russia");

		System.out.println("The given country name is correct" + name);
	}

	@Test
	public void Bali() {
		String name = "Bali";

		Assert.assertEquals(name, "Russia");

		System.out.println("The given country name is correct" + name);
	}

	@Test
	public void bangla() {

		String name = "bangla";

		Assert.assertEquals(name, "bangla");
		System.out.println("The Given country name is correct" + name);
	}

	@Test
	public void Africa() {
		String name = "Africa";

		Assert.assertEquals(name, "Africa");
		System.out.println("The given country name is correct" + name);
	}
}
