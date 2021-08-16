package test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import module3.Contact;

class ContactTest {
	
	@Test
	void testContact() {
		Contact contact = new Contact("12345678", "Jeremy", "Morrison", "7019290601", "15495 21st ST SE, Arthur ND");
		assertTrue(contact.getContactId().equals("12345678"));
		assertTrue(contact.getFirstName().equals("Jeremy"));
		assertTrue(contact.getLastName().equals("Morrison"));
		assertTrue(contact.getPhoneNumber().equals("7019290601"));
		assertTrue(contact.getAddress().equals("15495 21st ST SE, Arthur ND"));
	}

	@Test
	void testContactClassIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact(null, "Jeremy", "Morrison", "7019290601", "15495 21st ST SE, Arthur ND");
		});		}
	
	@Test
	void testContactClassIdToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("1234567891011", "Jeremy", "Morrison", "7019290601", "15495 21st ST SE, Arthur ND");
		});		}
	
	@Test
	void testContactClassFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678", null, "Morrison", "7019290601", "15495 21st ST SE, Arthur ND");
		});		}
	
	@Test
	void testContactClassFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678", "Jeremy78910", "Morrison", "7019290601", "15495 21st ST SE, Arthur ND");
		});		}
	
	@Test
	void testContactClassLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678", "Jeremy", null, "7019290601", "15495 21st ST SE, Arthur ND");
		});		}
	
	@Test
	void testContactClassLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678", "Jeremy", "Morrison91011", "7019290601", "15495 21st ST SE, Arthur ND");
		});		}
	
	@Test
	void testContactClassPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678", "Jeremy", "Morrison", null, "15495 21st ST SE, Arthur ND");
		});		}
	
	@Test
	void testContactClassPhoneNumberToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678", "Jeremy", "Morrison", "701929060111", "15495 21st ST SE, Arthur ND");
		});		}
	
	@Test
	void testContactClassAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678", "Jeremy", "Morrison", "7019290601", null);
		});		}
	
	@Test
	void testContactClassAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678", "Jeremy", "Morrison", "7019290601", "15495 21st ST SE, Arthur ND28293031");
		});		}

}
