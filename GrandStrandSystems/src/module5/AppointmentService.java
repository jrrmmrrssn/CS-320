package module5;

import java.util.ArrayList;
import module5.Appointment;

public class AppointmentService {
	
	private ArrayList<Appointment> apps;
	
	public AppointmentService() {
		
		this.apps = new ArrayList<Appointment>();
	}
	
	public boolean addApps(Appointment app) {
        for (int i = 0; i < apps.size(); i++) {
             if (apps.get(i).getAppointmentId().equals(app.getAppointmentId())) {
                 return false;
             }
        }
        apps.add(app);
        return true;
    }
	public boolean deleteApps(String id) {
		for (int i = 0; i < apps.size(); i++) {
			if (apps.get(i).getAppointmentId().equals(id)) {
				apps.remove(i);
				return true;
			}
		}
		return false;
	}
	//public boolean updateContact(Appointment appointment) {
	//      for(int i = 0; i < apps.size(); i++) {
	//        if (apps.get(i).getAppointmentId().equals(appointment.getAppointmentId())) {
	//          apps.set(i, appointment);
	//          return true;
	//        }
	//      }
	//      return false;
	//    }
	public int numberOfApps() {
		return apps.size();
	}
}
