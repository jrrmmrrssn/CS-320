package test;
import java.util.*;
import java.util.Date;
import java.util.Calendar;
import junit.framework.*;
import module5.Appointment;
import module5.AppointmentService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AppointmentServiceTest {

	@Test	
	void testAddAppointment() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.OCTOBER, 1);
		AppointmentService appointmentService = new AppointmentService();
		Appointment appointment = new Appointment("12345678", date, "Description");
		
		appointmentService.addApps(appointment);
		assertTrue(appointmentService.numberOfApps() == 1);
		
	}
	
	@Test	
	void testDeleteAppointmentPerId() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.OCTOBER, 1);
		AppointmentService appointmentService = new AppointmentService();
		Appointment appointment = new Appointment("12345678", date, "Description");
		
		appointmentService.addApps(appointment);
		
		assertTrue(appointmentService.numberOfApps() == 1);
		
		appointmentService.deleteApps("12345678");
		
		assertTrue(appointmentService.numberOfApps() == 0);
			
	}
}