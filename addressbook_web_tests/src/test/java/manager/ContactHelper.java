package manager;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ContactHelper extends HelperBase {

    public ContactHelper(ApplicationManager manager) {
        super(manager);
    }

    public void openHomePage() {
        if (!manager.isElementPresent(By.xpath("//*[contains(text(),'Number of results:')]"))) {
            click(By.linkText("home"));
        }
    }

    public void openContactCreationForm() {
        click(By.linkText("add new"));
    }

    public void createContact(ContactData contact) {
        openContactCreationForm();
        fillContactForm(contact);
        submitContactCreation();
        returnToHomePage();

    }

    private void fillContactForm(ContactData contact) {
        type(By.name("firstname"), contact.firstName());
        type(By.name("middlename"), contact.middleName());
        type(By.name("lastname"), contact.lastName());
        type(By.name("nickname"), contact.nickName());
        type(By.name("title"), contact.title());
        type(By.name("company"), contact.company());
        type(By.name("address"), contact.address());
        type(By.name("home"), contact.homePhone());
        type(By.name("mobile"), contact.mobilePhone());
        type(By.name("work"), contact.workPhone());
        type(By.name("email"), contact.email1());
        type(By.name("email2"), contact.email2());
        type(By.name("email3"), contact.email3());
        type(By.name("homepage"), contact.homepage());
        type(By.name("byear"), contact.bYear());
        type(By.name("ayear"), contact.aYear());
        choose(contact.bDay(), manager, "bday");
        choose(contact.bMonth(), manager, "bmonth");
        choose(contact.aDay(), manager, "aday");
        choose(contact.aMonth(), manager, "amonth");
        choose(contact.group(), manager, "new_group");
    }

    private void choose(String value, ApplicationManager manager, String name) {
        if (!value.isEmpty()) {
            new Select(manager.driver.findElement(By.name(name)))
                    .selectByVisibleText(value);
        }
    }


    private void submitContactCreation() {
        click(By.name("submit"));
    }

    private void returnToHomePage() {
        click(By.linkText("home page"));
    }

    public boolean isContactPresent() {
        openHomePage();
        return manager.isElementPresent(By.name("selected[]"));
    }

    private void selectContact() {
        click(By.name("selected[]"));
    }

    private void removeSelectedContact() {
        click(By.name("delete"));
    }

    public void removeContact() {
        openHomePage();
        selectContact();
        removeSelectedContact();
        returnToHomePage();
    }

}