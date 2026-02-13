package model;

public record ContactData(String firstName, String middleName, String lastName, String nickName, String title,
                          String company, String address, String homePhone, String mobilePhone, String workPhone,
                          String email1, String email2, String email3, String homepage, String bDay, String bMonth,
                          String bYear, String aDay, String aMonth, String aYear, String group) {
    public ContactData() {
        this("", "", "", "", "", "", "", "", "", "", "", "", "", "",
                "", "", "", "", "", "", "");
    }

    public ContactData withFirstName(String firstName) {
        return new ContactData(firstName, this.middleName, this.lastName, this.nickName, this.title, this.company, this.address, this.homePhone, this.mobilePhone, this.workPhone, this.email1, this.email2, this.email3, this.homepage, this.bDay, this.bMonth, this.bYear, this.aDay, this.aMonth, this.aYear, this.group);
    }

    public ContactData withLastName(String lastName) {
        return new ContactData(this.firstName, this.middleName, lastName, this.nickName, this.title, this.company, this.address, this.homePhone, this.mobilePhone, this.workPhone, this.email1, this.email2, this.email3, this.homepage, this.bDay, this.bMonth, this.bYear, this.aDay, this.aMonth, this.aYear, this.group);
    }

    public ContactData withEmail1(String email1) {
        return new ContactData(this.firstName, this.middleName, this.lastName, this.nickName, this.title, this.company, this.address, this.homePhone, this.mobilePhone, this.workPhone, email1, this.email2, this.email3, this.homepage, this.bDay, this.bMonth, this.bYear, this.aDay, this.aMonth, this.aYear, this.group);
    }

    public ContactData withMiddleName(String middleName) {
        return new ContactData(this.firstName, middleName, this.lastName, this.nickName, this.title, this.company, this.address, this.homePhone, this.mobilePhone, this.workPhone, this.email1, this.email2, this.email3, this.homepage, this.bDay, this.bMonth, this.bYear, this.aDay, this.aMonth, this.aYear, this.group);
    }

    public ContactData withNickName(String nickName) {
        return new ContactData(this.firstName, this.middleName, this.lastName, nickName, this.title, this.company, this.address, this.homePhone, this.mobilePhone, this.workPhone, this.email1, this.email2, this.email3, this.homepage, this.bDay, this.bMonth, this.bYear, this.aDay, this.aMonth, this.aYear, this.group);
    }

    public ContactData withTitle(String title) {
        return new ContactData(this.firstName, this.middleName, this.lastName, this.nickName, title, this.company, this.address, this.homePhone, this.mobilePhone, this.workPhone, this.email1, this.email2, this.email3, this.homepage, this.bDay, this.bMonth, this.bYear, this.aDay, this.aMonth, this.aYear, this.group);
    }

    public ContactData withCompany(String company) {
        return new ContactData(this.firstName, this.middleName, this.lastName, this.nickName, this.title, company, this.address, this.homePhone, this.mobilePhone, this.workPhone, this.email1, this.email2, this.email3, this.homepage, this.bDay, this.bMonth, this.bYear, this.aDay, this.aMonth, this.aYear, this.group);
    }

    public ContactData withAddress(String address) {
        return new ContactData(this.firstName, this.middleName, this.lastName, this.nickName, this.title, this.company, address, this.homePhone, this.mobilePhone, this.workPhone, this.email1, this.email2, this.email3, this.homepage, this.bDay, this.bMonth, this.bYear, this.aDay, this.aMonth, this.aYear, this.group);
    }

    public ContactData withHomePhone(String homePhone) {
        return new ContactData(this.firstName, this.middleName, this.lastName, this.nickName, this.title, this.company, this.address, homePhone, this.mobilePhone, this.workPhone, this.email1, this.email2, this.email3, this.homepage, this.bDay, this.bMonth, this.bYear, this.aDay, this.aMonth, this.aYear, this.group);
    }

    public ContactData withMobilePhone(String mobilePhone) {
        return new ContactData(this.firstName, this.middleName, this.lastName, this.nickName, this.title, this.company, this.address, this.homePhone, mobilePhone, this.workPhone, this.email1, this.email2, this.email3, this.homepage, this.bDay, this.bMonth, this.bYear, this.aDay, this.aMonth, this.aYear, this.group);
    }

    public ContactData withWorkPhone(String workPhone) {
        return new ContactData(this.firstName, this.middleName, this.lastName, this.nickName, this.title, this.company, this.address, this.homePhone, this.mobilePhone, workPhone, this.email1, this.email2, this.email3, this.homepage, this.bDay, this.bMonth, this.bYear, this.aDay, this.aMonth, this.aYear, this.group);
    }
    public ContactData withEmail2(String email2) {
        return new ContactData(this.firstName, this.middleName, this.lastName, this.nickName, this.title, this.company, this.address, this.homePhone, this.mobilePhone, this.workPhone, this.email1, email2, this.email3, this.homepage, this.bDay, this.bMonth, this.bYear, this.aDay, this.aMonth, this.aYear, this.group);
    }

    public ContactData withEmail3(String email3) {
        return new ContactData(this.firstName, this.middleName, this.lastName, this.nickName, this.title, this.company, this.address, this.homePhone, this.mobilePhone, this.workPhone, this.email1, this.email2, email3, this.homepage, this.bDay, this.bMonth, this.bYear, this.aDay, this.aMonth, this.aYear, this.group);
    }

    public ContactData withHomepage(String homepage) {
        return new ContactData(this.firstName, this.middleName, this.lastName, this.nickName, this.title, this.company, this.address, this.homePhone, this.mobilePhone, this.workPhone, this.email1, this.email2, this.email3, homepage, this.bDay, this.bMonth, this.bYear, this.aDay, this.aMonth, this.aYear, this.group);
    }

    public ContactData withBDay(String bDay) {
        return new ContactData(this.firstName, this.middleName, this.lastName, this.nickName, this.title, this.company, this.address, this.homePhone, this.mobilePhone, this.workPhone, this.email1, this.email2, this.email3, this.homepage, bDay, this.bMonth, this.bYear, this.aDay, this.aMonth, this.aYear, this.group);
    }

    public ContactData withBMonth(String bMonth) {
        return new ContactData(this.firstName, this.middleName, this.lastName, this.nickName, this.title, this.company, this.address, this.homePhone, this.mobilePhone, this.workPhone, this.email1, this.email2, this.email3, this.homepage, this.bDay, bMonth, this.bYear, this.aDay, this.aMonth, this.aYear, this.group);
    }

    public ContactData withBYear(String bYear) {
        return new ContactData(this.firstName, this.middleName, this.lastName, this.nickName, this.title, this.company, this.address, this.homePhone, this.mobilePhone, this.workPhone, this.email1, this.email2, this.email3, this.homepage, this.bDay, this.bMonth, bYear, this.aDay, this.aMonth, this.aYear, this.group);
    }

    public ContactData withADay(String aDay) {
        return new ContactData(this.firstName, this.middleName, this.lastName, this.nickName, this.title, this.company, this.address, this.homePhone, this.mobilePhone, this.workPhone, this.email1, this.email2, this.email3, this.homepage, this.bDay, this.bMonth, this.bYear, aDay, this.aMonth, this.aYear, this.group);
    }

    public ContactData withAMonth(String aMonth) {
        return new ContactData(this.firstName, this.middleName, this.lastName, this.nickName, this.title, this.company, this.address, this.homePhone, this.mobilePhone, this.workPhone, this.email1, this.email2, this.email3, this.homepage, this.bDay, this.bMonth, this.bYear, this.aDay, aMonth, this.aYear, this.group);
    }

    public ContactData withAYear(String aYear) {
        return new ContactData(this.firstName, this.middleName, this.lastName, this.nickName, this.title, this.company, this.address, this.homePhone, this.mobilePhone, this.workPhone, this.email1, this.email2, this.email3, this.homepage, this.bDay, this.bMonth, this.bYear, this.aDay, this.aMonth, aYear, this.group);
    }

    public ContactData withGroup(String group) {
        return new ContactData(this.firstName, this.middleName, this.lastName, this.nickName, this.title, this.company, this.address, this.homePhone, this.mobilePhone, this.workPhone, this.email1, this.email2, this.email3, this.homepage, this.bDay, this.bMonth, this.bYear, this.aDay, this.aMonth, this.aYear, group);
    }


}
