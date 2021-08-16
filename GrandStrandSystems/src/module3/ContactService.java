package module3;
import java.util.ArrayList;

public class ContactService {

	private ArrayList<Contact> contacts;
	
	public ContactService() {
		this.contacts = new ArrayList<Contact>();
	}
	
	
	public boolean addContact(Contact contact) {
        for (int i = 0; i < contacts.size(); i++) {
             if (contacts.get(i).getContactId().equals(contact.getContactId())) {
                 return false;
             }
        }
        contacts.add(contact);
        return true;
    }

	public boolean deleteContact(String id) {
      for(int i = 0; i < contacts.size(); i++) {
        if (contacts.get(i).getContactId().equals(id)) {
          contacts.remove(i);
          return true;
        }
      }
      return false;
    }

	public boolean updateContact(Contact contact) {
      for(int i = 0; i < contacts.size(); i++) {
        if (contacts.get(i).getContactId().equals(contact.getContactId())) {
          contacts.set(i, contact);
          return true;
        }
      }
      return false;
    }
	public int numberOfContacts() {
		return contacts.size();
	}
}
