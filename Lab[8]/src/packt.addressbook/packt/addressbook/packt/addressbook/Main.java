package packt.addressbook;

import java.util.List;

import packt.addressbook.model.Contact;
import packt.addressbook.util.ContactUtil;
import packt.addressbook.util.SortUtil;

public class Main {

    public static void main(String[] args) {

        Contact c1 = new Contact("4", "Ali", "Mohamed",
                "123", "123", "AliMohamed@gmail.com");

        Contact c2 = new Contact("3", "Aya", "Mohamed",
                "456", "456", "AyaMohamed@gmail.com");

        Contact c3 = new Contact("2", "Ahmed", "Khaled",
                "789", "789", "AhKhaled@gmail.com");

        Contact c4 = new Contact("1", "Mahmoud", "Ahmed",
                "157", "157", "MahAhmed@gmail.com");

        ContactUtil cUtil = new ContactUtil();

        cUtil.addContact(c1);
        cUtil.addContact(c2);
        cUtil.addContact(c4);
        cUtil.addContact(c3);

        // store Contacts
        List<Contact> unsorted = cUtil.getContacts();

        unsorted.forEach(e -> System.out.println(e.firstName + " " + e.lastName));

        // create obj of sortUtil
        SortUtil sUtil = new SortUtil();

        // Sort list
        sUtil.sortList(unsorted);

        System.out.println("--------------");
        System.out.println("After Sorting");
        System.out.println("--------------");

        // print sorted list
        unsorted.forEach(e -> System.out.println(e.firstName + " " + e.lastName));
    }
}
