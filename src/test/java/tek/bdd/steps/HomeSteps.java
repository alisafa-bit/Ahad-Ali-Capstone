package tek.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.log4testng.Logger;
import tek.bdd.pages.POMFactory;
import tek.bdd.utility.SeleniumUtility;
import java.util.List;

public class HomeSteps extends SeleniumUtility {
    POMFactory factory = new POMFactory();

    @Given("User is on retail website")
    public void userIsOnRetailWebsite() {
        String actualTitle = getTitle();
        String expectedTitle = "React App";
        Assert.assertEquals(actualTitle, expectedTitle);
        Assert.assertTrue(isElementDisplayed(factory.homePage().homePageTitle));
    }

    @When("User click on All section")
    public void user_click_on_all_section() {
        click(factory.homePage().All);
    }
    @Then("below options are present in Shop by Department sidebar")
    public void below_options_are_present_in_shop_by_department_sidebar(DataTable dataTable) {
        List<List<String>> actualItems = dataTable.asLists(String.class);
        List<WebElement> expectedItems = factory.homePage().allDepts;
        for(int i = 0; i <actualItems.get(0).size(); i++){
            Assert.assertEquals(actualItems.get(0),expectedItems.get(i).getText());
        }
//        Assert.assertEquals(actualItems.get(0).get(0),factory.homePage().electronics.getText());
//        Assert.assertEquals(actualItems.get(0).get(1),factory.homePage().computers.getText());
//        Assert.assertEquals(actualItems.get(0).get(2),factory.homePage().smartHome.getText());
//        Assert.assertEquals(actualItems.get(0).get(3),factory.homePage().sports.getText());
//        Assert.assertEquals(actualItems.get(0).get(4),factory.homePage().automative.getText());

    }

    @When("User on {string}")
    public void user_on(String department) {
        List<WebElement> sideBar = factory.homePage().allDepts;
        for (WebElement option : sideBar){
            if (option.getText().equals("department")){
                click(option);
                try {
                }catch (StaleElementReferenceException e){
                }
                break;
            }
        }
    }
    @Then("below options are present in department")
    public void below_options_are_present_in_department(DataTable dataTable) {
        List<List<String>> expectedDepts = dataTable.asLists(String.class);
        List<WebElement> actualDepts = factory.homePage().allDepts;
        for (int i = 0; i<expectedDepts.get(0).size(); i++){
            for (WebElement dept:actualDepts){
                if (dept.getText().equals(expectedDepts.get(0).get(i))){
                    Assert.assertTrue(isElementDisplayed(dept));
                }
            }
        }
    }

    @Then("User change the category to {string}")
    public void user_change_the_category_to(String smartHome) {
        click(factory.homePage().allDepartments);
        selectByVisibleText(factory.homePage().allDepartments,smartHome);
    }
    @Then("User search for an item {string}")
    public void user_search_for_an_item(String input) {
        click(factory.homePage().homePageSearchInput);
        sendText(factory.homePage().homePageSearchInput,input);
    }
    @Then("User click on Search icon")
    public void user_click_on_search_icon() {
        click(factory.homePage().homePageSearchBtn);
    }
    @Then("User click on item")
    public void user_click_on_item() {
        click(factory.homePage().kasaOutDoorSmartPlug);
    }
    @Then("User select quantity {string}")
    public void user_select_quantity(String number) {
        click(factory.homePage().qtyDropDown);
        selectByVisibleText(factory.homePage().qtyDropDown,"2");
    }
    @Then("User click add to Cart button")
    public void user_click_add_to_cart_button() {
        click(factory.homePage().addToCartBtn);
    }
    @Then("the cart icon quantity should change to {string}")
    public void the_cart_icon_quantity_should_change_to(String int1) {
        Assert.assertEquals(int1,factory.homePage().cartQty.getText());
    }
    @Then("User click on Cart option")
    public void user_click_on_cart_option() {
        click(factory.homePage().homePageCartBtn);
    }
    @Then("User click on Proceed to Checkout button")
    public void user_click_on_proceed_to_checkout_button() {
        click(factory.homePage().proceedBtn);
    }
    @Then("User click Add a new address link for shipping address")
    public void user_click_add_a_new_address_link_for_shipping_address() {
        click(factory.homePage().homePageAddNewAddress);
    }
    @Then("User click Add a credit card or Debit Card for Payment method")
    public void user_click_add_a_credit_card_or_debit_card_for_payment_method() {
        click(factory.homePage().homePageAddNewPayment);
    }
    @Then("User click on Place Your Order")
    public void user_click_on_place_your_order() throws InterruptedException {
        click(factory.homePage().placeYourOrderBtn);
        Thread.sleep(2000);
    }
    @Then("a message should be displayed ‘Order Placed, Thanks’")
    public void a_message_should_be_displayed_order_placed_thanks() {
        click(factory.homePage().placeYourOrderBtn);
    }

    @Then("User change the category to Electronics")
    public void user_change_the_category_to_electronics() {
        click(factory.homePage().allDepartments);
        selectByVisibleText(factory.homePage().allDepartments,"Electronics");
    }
    @Then("User search for an items {string}")
    public void user_search_for_an_items(String string) {
       click(factory.homePage().homePageSearchInput);
       sendText(factory.homePage().homePageSearchInput,string);
    }
    @Then("User click on Apex Legends")
    public void user_click_on_apex_legends() {
        click(factory.homePage().apexLegendItem);
    }

    @Then("User select quantities {string}")
    public void user_select_quantities(String int2) {
        click(factory.homePage().qtyDropDown);
        selectByVisibleText(factory.homePage().qtyDropDown,int2);
    }
    @Then("the cart icon quantities should change to {string}")
    public void the_cart_icon_quantities_should_change_to(String int1) {
        Assert.assertEquals(int1,factory.homePage().cartQty.getText());
    }

}
