package test;
import java.util.*;
import junit.framework.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import module3.ContactService;
import module3.Contact;

class ContactServiceTest {

	@Test	//Test if addContact() will add contact with unique ID
	void testUniqueIdAddContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("12345678", "Jeremy", "Morrison", "7019290601", "15495 21st ST SE, Arthur ND");
		
		assertTrue(contactService.addContact(contact));
		assertTrue(contactService.numberOfContacts() == 1);
		
	}
	
	 @Test	// Test if addContact() will NOT add contact with identical ID
		void testIdenticalIdAddContact() {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("12345678", "Jeremy", "Morrison", "7019290601", "15495 21st ST SE, Arthur ND");
		Contact contact2 = new Contact("12345678", "Steph", "Morrison", "7013183869", "5200 44th ave s fargo nd");
				
		assertTrue(contactService.addContact(contact1));
		//assertTrue(contactService.addContact(contact2));
		
		if(contactService.addContact(contact2))
       {
         fail("Added Id already in database.");
       }
  }
	 
	 @Test	//Test if deleteContact removes contact per id
		void testDeleteContactPerId() {
			ContactService contactService = new ContactService();
			Contact contact = new Contact("12345678", "Jeremy", "Morrison", "7019290601", "15495 21st ST SE, Arthur ND");
			
			assertTrue(contactService.addContact(contact));
			
			assertTrue(contactService.numberOfContacts() == 1);
			
			assertTrue(contactService.deleteContact("12345678"));
			
			assertTrue(contactService.numberOfContacts() == 0);
				
		}
	 
	 @Test	
		void testUpdateContactAllFieldsPerId() {
		 	ContactService contactService = new ContactService();
		 	Contact contact1 = new Contact("12345678", "Jeremy", "Morrison", "7019290601", "15495 21st ST SE, Arthur ND");
		 	Contact contact2 = new Contact("12345678", "Steph", "Christian", "7013183869", "5200 44th Ave S., Fargo ND");
		 	assertTrue(contactService.addContact(contact1));//  add a contact 
		 	assertTrue(contactService.updateContact(contact2));// update it
     
      
     }

	 
	 

}
