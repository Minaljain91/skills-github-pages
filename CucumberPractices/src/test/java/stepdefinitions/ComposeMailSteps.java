package stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComposeMailSteps {
	
	@Given("I have the Inbox screen after login")
	public void i_have_the_inbox_screen_after_login() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("I have the Inbox screen after login");
	}

	@When("I click on Compose button")
	public void i_click_on_compose_button() {
	   System.out.println("I click on Compose button");
	}

	@Then("I see the New message pop up")
	public void i_see_the_new_message_pop_up() {
		System.out.println("I see the New message pop up");
	}

	@Then("I enter Subject as {string}")
	public void i_enter_subject_as(String subjectname) {
		System.out.println("I enter Subject as" + subjectname);
		assertEquals("Incubyte", subjectname);
	}

	@Then("I enter Body text as {string}")
	public void i_enter_body_text_as(String bodytext) {
		System.out.println("I enter Subject as" + bodytext);
		assertEquals("QA test for Incubyte", bodytext);
	}

	@Then("I enter email address in To field {string}")
	public void i_enter_email_address_in_to_field(String email) {
		System.out.println("I enter email address in To field " + email);
	}

	@Then("I click on Send button")
	public void i_click_on_send_button() {
	   System.out.println ("I click on Send button");
	}
	
	

@Then("I enter invalid email id {string}")
public void i_keep_email_address_empty(String invalidemail) {
   
	System.out.println("I enter invalid email id" + invalidemail );
	assertEquals("test@gmail.com", invalidemail);
}

@Then("Error message should be dispalyed.")
public void error_message_should_be_dispalyed() {
	System.out.println("Error message should be dispalyed");
}

}
