package runner;

public class ContactManager {

    private String nameContact;
    private String phone;

    public ContactManager (String nameContact,String phone){
        this.nameContact=nameContact;
        this.phone=phone;
    }

    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
