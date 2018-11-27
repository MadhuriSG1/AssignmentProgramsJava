package cliniqueManagement;

import java.io.File;

import com.bridgeit.utility.Utility1;


import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ClinicManager {

	private List<Patient> patientList;
	private List<Doctor> doctorList;
	private List<Appointment> apList;

	public Patient addPatient() {
		File file = new File("Patient.json");//Creates instance of file
		patientList = new ArrayList<Patient>();//creates arraylist for patient object
		patientList = ClinicUtil.readFile(file, Patient[].class);//pass json file and return list stored in ArrayList

		Patient patient = new Patient();//creates object of Patient Class
		patient.setId(patientList.size() + 1);//patientList size 0 so add 1 n id start from 1

		System.out.println("Enter Patient's Name:");
		patient.setPname(Utility1.ipstring());//set Patient name
		System.out.println("Enter Patient's Mobile Number:");
		patient.setMobileNumber(Utility1.iplongnumber());//set Patient Mobile Number
		System.out.println("Enter Patient's Age:");
		patient.setAge(Utility1.ipnumber());//set Patient Age 

		patientList.add(patient);//add all patient in list

		ClinicUtil.writeFile(file, patientList);//write patientlist in json file

		return patient;
	}

	public void addChoices() {

		boolean status = true;
		do {
			System.out.println("1.Add Appointment\t2.Add Doctor\t3.Back");
			switch (Utility1.ipnumber()) {
			case 1:
				addAppointment();
				break;
			case 2:
				addDoctor();
				break;
			case 3:
				status = false;
				break;
			}
		} while (status);

	}

	public void addAppointment() {
		File apfile = new File("Appointment.json");
		File docfile = new File("Doctor.json");

		doctorList = new ArrayList<Doctor>();
		apList = new ArrayList<Appointment>();

		doctorList = ClinicUtil.readFile(docfile, Doctor[].class);
		apList = ClinicUtil.readFile(apfile, Appointment[].class);

		System.out.println("Enter Doctors ID to appoint:");
		int docId = Utility1.ipnumber();

		System.out.println("Enter Time(AM/PM) to Book Appointment:");
		String appointtime = Utility1.ipstring();

		Iterator<Doctor> iterator = doctorList.iterator();//here we iterate doctorlist

		while (iterator.hasNext())
		{
			Doctor doctor = iterator.next();
			Appointment appointment = new Appointment();
			if (docId == doctor.getDoctorId()//here input docId compare with stored DoctorId
					&& appointtime.equals(doctor.getAvailability())) //here input appointtime compare with stored Availability
			{

				if (doctor.getPatientCount() >= 0
						&& doctor.getPatientCount() <= 5) {//here only 5 patients are allow

					doctor.setPatientCount(doctor.getPatientCount() + 1);//here patient count become 1

					System.out.println("Enter Patients details");
					appointment.setPatient(addPatient());

					appointment.setDoctorID(doctor.getDoctorId());
					appointment.setAppointtime(appointtime);

					apList.add(appointment);//append element last of list
					System.out.println("Appointment Fixed");

					ClinicUtil.writeFile(docfile, doctorList);//here file object and doctorList passed
					ClinicUtil.writeFile(apfile, apList);//here file object and appoinment List 
					break;
				} else {
					System.out.println("Please come next time! ");
				}
			}
		}

	}

	public void addDoctor() {
		File file = new File("Doctor.json");
		Doctor doctor = new Doctor();
		doctorList = ClinicUtil.readFile(file, Doctor[].class);//here we passing file and doctor class and return list stored in doctorList
		System.out.println("Enter Doctor's Name:");
		doctor.setDname(Utility1.ipstring());
		doctor.setDoctorId(doctorList.size() + 1);//here set Doctor's id start from 1
		System.out.println("Enter Doctor's Availability:(AM/PM/Both)");
		doctor.setAvailability(Utility1.ipstring());
		System.out.println("Enter Doctor's Specialization:");
		doctor.setSpecialist(Utility1.ipstring());
		doctorList.add(doctor);//doctor object pass to the doctorList
		ClinicUtil.writeFile(file, doctorList);
	}

	public void searchChoices() {

		boolean status = true;
		do {
			System.out.println("Choose whom you want to search:");
			System.out.println("1.Search Doctor");
			System.out.println("2.Search Patient");
			System.out.println("3.Back");
			switch (Utility1.ipnumber()) {
			case 1:
				searchDoctor();
				break;

			case 2:
				searchPatient();
				break;

			default:
				status = false;
				break;
			}
		} while (status);
	}

	public void searchPatient() {

		boolean status = true;
		System.out.println("Choose the field you want to search by:");
		File patfile = new File("Patient.json");

		List<Patient> list = new ArrayList<Patient>();
		Iterator<Patient> iterator;
		list = ClinicUtil.readFile(patfile, Patient[].class);
		do {
			System.out.println("1.ID");
			System.out.println("2.Name");
			System.out.println("3.Mobile Number");
			System.out.println("4.Back");
			switch (Utility1.ipnumber()) {
			case 1:
				System.out.println("Enter the Patient id:");
				int pid = Utility1.ipnumber();
				iterator = list.iterator();//iterate patient list
				while (iterator.hasNext()) {
					Patient patient = iterator.next();
					if (pid == patient.getId()) {//if enter id is available in patient file id then display
						System.out.println("Patient ID: " + patient.getId()
								+ " || Patient Name: " + patient.getPname()
								+ " || Patient Mobile Number: "
								+ patient.getMobileNumber()
								+ " || Patient Age: " + patient.getAge());
						break;
					}
				}
				break;

			case 2:
				System.out.println("Enter the Patient Name:");
				String pname = Utility1.ipstring();
				iterator = list.iterator();
				while (iterator.hasNext()) {
					Patient patient = iterator.next();
					if (pname.equals(patient.getPname())) {
						System.out.println("Patient ID: " + patient.getId()
								+ " || Patient Name:" + patient.getPname()
								+ " || Patient Mobile Number:"
								+ patient.getMobileNumber()
								+ " || Patient Age: " + patient.getAge());
						break;

					}
				}
				break;

			case 3:
				System.out.println("Enter the Patient Mobile Number:");
				long pnum = Utility1.iplongnumber();
				iterator = list.iterator();
				while (iterator.hasNext()) {
					Patient patient = iterator.next();
					if (pnum == patient.getMobileNumber()) {
						System.out.println("Patient ID: " + patient.getId()
								+ " || Patient Name:" + patient.getPname()
								+ " || Patient Mobile Number:"+ patient.getMobileNumber()
								+ " || Patient Age: " + patient.getAge());
						break;
					}
				}
				break;
			default:
				status = false;
				break;
			}
		} while (status);
		
	}

	public void searchDoctor() {
		boolean status = true;
		System.out.println("Choose the field you want to search by:");
		File docfile = new File("Doctor.json");

		List<Doctor> list = new ArrayList<Doctor>();
		Iterator<Doctor> iterator;
		list = ClinicUtil.readFile(docfile, Doctor[].class);
		do {
			System.out.println("1.ID");
			System.out.println("2.Name");
			System.out.println("3.Specialization");
			System.out.println("4.Availability");
			System.out.println("5.Back");
			switch (Utility1.ipnumber()) {
			case 1:
				// Name, Id, Specialization and Availability (AM, PM or both)
				System.out.println("Enter the Doctor Id:");
				int did = Utility1.ipnumber();
				iterator = list.iterator();
				while (iterator.hasNext()) {
					
					Doctor doctor = iterator.next();
					if (did == doctor.getDoctorId()) {
						System.out.println("Doctor ID: " + doctor.getDoctorId()
								+ " || Doctor Name: " + doctor.getDname()
								+ " || Doctor Specialization: "
								+ doctor.getSpecialist()
								+ " || Doctor Availability: "
								+ doctor.getAvailability());
						break;
					} else {
						System.out.println("Doctor Not Found !");
						break;
					}
				}
				break;

			case 2:
				// Name, Id, Specialization and Availability (AM, PM or both)
				System.out.println("Enter the Doctor Name:");
				String dname = Utility1.ipstring();
				iterator = list.iterator();
				while (iterator.hasNext()) {
					Doctor doctor = iterator.next();
					if (dname.equals(doctor.getDname())) {
						System.out.println("Doctor ID: " + doctor.getDoctorId()
								+ " || Doctor Name: " + doctor.getDname()
								+ " || Doctor Specialization: "
								+ doctor.getSpecialist()
								+ " || Doctor Availability: "
								+ doctor.getAvailability());
						break;
					}
				}
				break;

			case 3:
				// Name, Id, Specialization and Availability (AM, PM or both)
				System.out.println("Enter the Doctor Specialization:");
				String special = Utility1.ipstring();
				iterator = list.iterator();
				while (iterator.hasNext()) {
					Doctor doctor = iterator.next();
					if (special.equals(doctor.getSpecialist())) {
						System.out.println("Doctor ID: " + doctor.getDname()
								+ " || Doctor Name:" + doctor.getDname()
								+ " || Doctor Specialization: "
								+ doctor.getSpecialist()
								+ " || Doctor Availability: "
								+ doctor.getAvailability());
						break;
					}
				}
				break;
			case 4:
				// Name, Id, Specialization and Availability (AM, PM or both)
				System.out.println("Enter the Doctor Availability:");
				String available = Utility1.ipstring();
				iterator = list.iterator();
				while (iterator.hasNext()) {
					Doctor doctor = iterator.next();
					if (available.equals(doctor.getAvailability())) {
						System.out.println("Doctor ID: " + doctor.getDname()
								+ " || Doctor Name:" + doctor.getDname()
								+ " || Doctor Specialization: "
								+ doctor.getSpecialist()
								+ " || Doctor Availability: "
								+ doctor.getAvailability());
						break;
					}
				}
				break;

			default:
				status = false;
				break;
			}
		} while (status);
	}

	public void displayChoices() {

		boolean status = true;
		do {
			System.out.println("Choose whom you want to search:");
			System.out.println("1.Display Doctor");
			System.out.println("2.Display Patient");
			System.out.println("3.Display Popular Doctor");
			System.out.println("4. Back");
			switch (Utility1.ipnumber()) {
			case 1:
				displayDoctor();
				break;

			case 2:
				displayPatient();
				break;

			case 3:
				displayPopularDoctor();
				break;

			default:
				status = false;
				break;
			}
		} while (status);

	}

	public void displayPatient() {
		List<Patient> list = new ArrayList<Patient>();
		File file = new File("Patient.json");
		list = ClinicUtil.readFile(file, Patient[].class);
		Iterator<Patient> iterator = list.iterator();
		System.out.println("ID\tName\tMobile Number\tAge");
		while (iterator.hasNext()) {
			Patient patient = iterator.next();
			System.out.println(patient.getId() + " \t" + patient.getPname()
					+ " \t" + patient.getMobileNumber() + " \t"
					+ patient.getAge());
		}
	}

	public void displayDoctor() {
		List<Doctor> list = new ArrayList<Doctor>();
		File file = new File("Doctor.json");
		list = ClinicUtil.readFile(file, Doctor[].class);
		Iterator<Doctor> iterator = list.iterator();
		System.out.println("ID\tName\tSpecialization\tAvailability");
		while (iterator.hasNext()) {
			Doctor doctor = iterator.next();
			System.out.println(doctor.getDoctorId() + " \t" + doctor.getDname()
					+ " \t" + doctor.getSpecialist() + " \t"
					+ doctor.getAvailability());
		}

	}
//to check popular doctor
	public void displayPopularDoctor() {
		List<Doctor> list = new ArrayList<Doctor>();
		File file = new File("Doctor.json");
		list = ClinicUtil.readFile(file, Doctor[].class);
		Iterator<Doctor> iterator = list.iterator();
		while (iterator.hasNext()) {
			Doctor doctor = iterator.next();
			if (doctor.getPatientCount()>4) {//doctor is populor only if patient count=5
				System.out.println("Popular Doctors Details");
				System.out.println("Doctor ID: " + doctor.getDoctorId()
								+ " || Doctor Name: " + doctor.getDname()
								+ " || Doctor Specialization: "
								+ doctor.getSpecialist()
								+ " || Doctor Availability: "
								+ doctor.getAvailability());
			}
		}
	}

}	