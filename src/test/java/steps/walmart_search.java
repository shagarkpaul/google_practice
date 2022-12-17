package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.walmart_Home_page;

public class walmart_search extends TestBase {
	
	
	@Given("i am on the amazon homepage")
	public void i_am_on_the_amazon_homepage() {
		
		launchbrowser();
		
		
	    }

	@When("i click on the all button")
	public void i_click_on_the_all_button() {
		
		WebElement allbutton = driver.findElement(By.id("nav-hamburger-menu"));
		
		allbutton.click();
		
	}

	@When("i click on the best seeler button")
	public void i_click_on_the_best_seeler_button() {
	   
		WebElement bestSeller = driver.findElement(By.xpath("(//a[@class='hmenu-item' and  contains (text(), 'Best Sellers')])[1]"));
		bestSeller.click();
		
	}

	@Then("i can see the list of best selling products successfully")
	public void i_can_see_the_list_of_best_selling_products_successfully() {
	    
		
	}
	
	
	


}
