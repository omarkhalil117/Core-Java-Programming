package packt.addressbook.util;

import java.util.ArrayList;
import java.util.List;

import packt.addressbook.model.*;

public class ContactUtil {

    private ArrayList<Contact> contacts;

    public ContactUtil() {
        contacts = new ArrayList<>();
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact c) {
        contacts.add(c);
    }
}
