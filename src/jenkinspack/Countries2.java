package jenkinspack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Countries2 {
	@Test
	public void Brazil() {

		String name = "Brazil";

		Assert.assertEquals(name, "Brazil");

		System.out.println("The Given country name is correcr" + name);
	}

	@Test
	public void Japan() {
		String name = "Japan";

		Assert.assertEquals(name, "Japan");
		System.out.println("The given country name is correct" + name);
	}

	@Test
	public void Russia() {
		String name = "Russia";

		Assert.assertEquals(name, "Bali");

		System.out.println("The given country name is correct" + name);
	}

	@Test
	public void SouthKorea() {
		String name = "SouthKorea";

		Assert.assertEquals(name, "South Korea");

		System.out.println("The given country name is correct" + name);
	}

	@Test
	public void Sidney() {

		String name = "Sidney";

		Assert.assertEquals(name, "Sidney");
		System.out.println("The Given country name is correct" + name);
	}

	@Test
	public void Antarcitica() {
		String name = "Antarcitica";

		Assert.assertEquals(name, "Arcitica");
		System.out.println("The given country name is correct" + name);
	}
}
