package test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Date;
import java.util.Calendar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import module5.AppointmentService;
import module5.Appointment;

class AppointmentTest {
	
	@Test
	void testAppointment() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.OCTOBER, 1);
		Appointment appointment = new Appointment("12345678", date, "Description");
		assertTrue(appointment.getAppointmentId().equals("12345678"));
		assertTrue(appointment.getAppointmentDate().equals(date));
		assertTrue(appointment.getAppointmentDescription().equals("Description"));
	}
	
	//@Test	
	//void testAppointmentIdNotUpdatable() {
	//	Date date = new Date(2022, Calendar.OCTOBER, 1);
	//	Assertions.assertThrows(IllegalArgumentException.class,  () -> {
	//		new Appointment("12345678", date, "Description");
	//	});		}
	@Test
	void testAppointmentIdIsNull() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.OCTOBER, 1);
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Appointment(null, date, "Description");
		});		}
	
	@Test
	void testAppointmentIdToLong() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.OCTOBER, 1);
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Appointment("123456789123456789", date, "Description");
		});		}
	
	@Test
	void testAppointmentDateIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Appointment("12345678", null, "Description");
		});		}
	
	@Test
	void testAppointmentDateInPast() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.OCTOBER, 1);
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Appointment("12345678", date, "Description");
		});		}
	
	@Test
	void testAppointmentDescriptionToLong() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.OCTOBER, 1);
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Appointment("12345678", date, "Description123456789123456789123456789123456789123456789");
		});		}
	
	@Test
	void testAppointmentDescriptionIsNull() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.OCTOBER, 1);
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Appointment("12345678", date, null);
		});		}

}