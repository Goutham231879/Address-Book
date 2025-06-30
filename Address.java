import java.util.*;

class ContactAddress {
    private String Name;
    private String Phone;
    private String Email;
    private String Address;

    public ContactAddress(String n, String p, String e, String a) {
        this.Name = n;
        this.Phone = p;
        this.Email = e;
        this.Address = a;
    }

    public String getName() {
        return this.Name;
    }

    public String getPhone() {
        return this.Phone;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getAddress() {
        return this.Address;
    }

    public String toString() {
        return "Name : " + Name + "\n" +
               "Address : " + Address + "\n" +
               "Phone : " + Phone + "\n" +
               "Email : " + Email;
    }
}

public class Address {
    Scanner sc = new Scanner(System.in);
    
   
    ArrayList<ContactAddress> contact = new ArrayList<>();

    public void addContact() {
        System.out.print("Enter Your Name: ");
        String name = sc.next();
        
        System.out.print("Enter Your Phone: ");
        String phone = sc.next();
        System.out.print("Enter Your Email: ");
        String email = sc.next();
        System.out.print("Enter Your Address: ");
        String address = sc.next();

        ContactAddress ct = new ContactAddress(name, phone, email, address);
        contact.add(ct);
    }

    public void viewContact() {
        if (contact.size() == 0) {
            System.out.println("No Contacts......");
            return;
        }
        for (int i = 0; i < contact.size(); i++) {
            System.out.println("Contact: " + (i + 1));
            System.out.println(contact.get(i));
            System.out.println();
        }
    }

    public void searchContact() {
        System.out.print("Enter the Name: ");
        String name = sc.next();
        boolean found = false;

        for (ContactAddress c : contact) {
           
            if (c.getName().equalsIgnoreCase(name)) {
                System.out.println(c);
                found = true;
                System.out.println("Successfully Found.");
                break;
            }
        }

        if (!found) {
            System.out.println("No Contact Found...");
        }
    }

    public void deleteContact() {
        System.out.print("Enter the Name: ");
        String name = sc.next();
        boolean found = false;

        Iterator<ContactAddress> iterator = contact.iterator();
        while (iterator.hasNext()) {
            ContactAddress c = iterator.next();
            if (c.getName().equalsIgnoreCase(name)) {
                iterator.remove(); 
                found = true;
                System.out.println("Successfully Deleted.");
                break;
            }
        }

        if (!found) {
            System.out.println("No Contact Found...");
        }
    }

}
