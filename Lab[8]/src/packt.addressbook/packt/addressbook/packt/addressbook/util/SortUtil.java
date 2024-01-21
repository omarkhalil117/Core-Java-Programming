package packt.addressbook.util;

import java.util.Collections;
import java.util.List;

import packt.addressbook.model.Contact;

public class SortUtil {

    
    public void sortList(List<Contact> unsorted)
    {
       Collections.sort(unsorted, (c1,c2) -> c1.firstName.length() - c2.firstName.length());
    }


}
