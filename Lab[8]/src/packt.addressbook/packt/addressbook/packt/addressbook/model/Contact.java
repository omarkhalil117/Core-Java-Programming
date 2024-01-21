package packt.addressbook.model;


public class Contact {
    
    // Attributes

    public String id ;
    public String firstName ;
    public String lastName ;
    public String homePhone ;
    public String workPhone ;
    public String email ;


    public Contact(String _id , String _firstName , String _lastName , 
    String _homePhone , String _workPhone , String _email)
    {
        id= _id;
        firstName= _firstName;
        lastName= _lastName;
        homePhone= _homePhone;
        workPhone= _workPhone;
        email= _email;
    }



}
