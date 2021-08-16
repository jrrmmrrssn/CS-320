package module3;


public class Contact {

	private final String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
      	if(contactId == null || contactId.length() > 10 ) { // if contactid is null or more than 10 characters, throw exception
				  throw new IllegalArgumentException("Cannot be null or contain more than 10 characters.");
		}
      	if(firstName == null || firstName.length() > 10 ) { // if firstname is null or more than 10 characters, throw exception
      		throw new IllegalArgumentException("Cannot be null or contain more than 10 characters.");
      	}
      	if(lastName == null || lastName.length() > 10 ) { //if lastname is null or more than 10 characters, throw exception
      		throw new IllegalArgumentException("Cannot be null or contain more than 10 characters.");
      	}
      	if(phoneNumber == null || phoneNumber.length() > 10 ) { //if phonenumber is null or more than 10 characters, throw exception
      		throw new IllegalArgumentException("Cannot be null or contain more than 10 characters.");
      	}
      	if(address == null || address.length() > 30 ) { //if address is null or more than 30 characters, throw exception
      		throw new IllegalArgumentException("Cannot be null or contain more than 30 characters.");
      	}
      		this.contactId = contactId;
      		this.firstName = firstName;
      		this.lastName = lastName;
      		this.phoneNumber = phoneNumber;
      		this.address = address;
      	
	}

	public String getContactId() {
		return contactId;
	}

	/*public void setContactId(String contactId) {
		this.contactId = contactId;
	}
	*/
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	}