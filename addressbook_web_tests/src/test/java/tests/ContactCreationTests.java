package tests;

import model.ContactData;
import org.junit.jupiter.api.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void canCreateContact() {
        app.contacts().createContact(new ContactData("FirstName", "MiddleName", "LastName", "Nickname", "Title", "Company", "Address", "Home", "Mobile", "Work", "email1@test.com", "email2@test.com", "email3@test.com", "homepage.com", "20", "May", "1999", "28", "November", "2000", "GroupName1"));
    }

    @Test
    public void CanCreateContactWithEmptyName() {
        app.contacts().createContact(new ContactData());
    }

    @Test
    public void CanCreateContactWithFirstNameOnly() {
        app.contacts().createContact(new ContactData().withFirstName("Only name"));
    }
}
