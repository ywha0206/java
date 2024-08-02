package test06;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	private String name;
	private String id;
	private String special;
	private List<Patient> patients = new ArrayList<>();
	
	public Doctor(String name, String id, String special) {
		this.name = name;
		this.id = id;
		this.special = special;
	}
	
	public void addPatient(Patient patient) {
		patients.add(patient);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("의사: ").append(name).append("(ID: ").append(id).append(", 전문분야: ").append(special).append(")\n");
		builder.append("담당환자목록:\n");
		for(Patient patient: patients) {
			builder.append(patient.toString()).append("\n");
		}
		return builder.toString();
		//return "의사 : " + name + "(ID: " + id + ", 전문분야: " + special + "\n담당환자목록:\n" + patients;
	}
	
	
}
