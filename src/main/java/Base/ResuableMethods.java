package Base;

import org.openqa.selenium.By;

public class ResuableMethods extends BaseClass{
	public static void login() {
		driver.get(URL);
		driver.findElement(By.id("edit-name")).sendKeys(User);
		driver.findElement(By.id("edit-pass")).sendKeys(Pass);
		driver.findElement(By.id("edit-submit")).click();
	}

}
