package module5;
import java.util.Date;
public class Appointment {

	private final String appointmentId;
	private Date appointmentDate;
	private String appointmentDescription;
	
	public Appointment(String appointmentId, Date appointmentDate, String appointmentDescription) {
		if(appointmentId == null || appointmentId.length() > 10) {
			throw new IllegalArgumentException("Id must not be null or greater than 10 characters.");
		}
		if(appointmentDate == null || appointmentDate.before(new Date())) {
			throw new IllegalArgumentException("Date must not be null or in the past");
		}
		if(appointmentDescription == null || appointmentDescription.length() > 50) {
			throw new IllegalArgumentException("Description must not be null or greater than 50 characters.");
		}
		
		this.appointmentId = appointmentId;
		this.appointmentDate = appointmentDate;
		this.appointmentDescription = appointmentDescription;
	}

	public String getAppointmentId() {
		return appointmentId;
	}

	//public void setAppointmentId(String appointmentId) {
	//	this.appointmentId = appointmentId;
	//}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	//public void setAppointmentDate(Date appointmentDate) {
	//	this.appointmentDate = appointmentDate;
	//}

	public String getAppointmentDescription() {
		return appointmentDescription;
	}

	//public void setAppointmentDescription(String appointmentDescription) {
	//	this.appointmentDescription = appointmentDescription;
	//}
	
	
}
