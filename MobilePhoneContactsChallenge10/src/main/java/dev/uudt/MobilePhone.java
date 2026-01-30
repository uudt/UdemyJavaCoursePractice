import dev.uudt.Contact;

import java.util.ArrayList;

public class MobilePhone {
    // write code here
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        // if (!this.myContacts.contains(contact)) {
        if (findContact(contact.getName()) == -1) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact old, Contact newC) {
        // if (this.myContacts.contains(old)) {
        if (findContact(old) != -1) {
            this.myContacts.set(this.myContacts.indexOf(old), newC);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        // if (this.myContacts.contains(contact)) {
        if (findContact(contact) != -1) {
            this.myContacts.remove(contact);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        if (this.myContacts.contains(contact)) {
            return this.myContacts.indexOf(contact);
        }
        return -1;
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            if (this.myContacts.get(i).getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            if (this.myContacts.get(i).getName().equals(contactName)) {
                return this.myContacts.get(i);
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }

}