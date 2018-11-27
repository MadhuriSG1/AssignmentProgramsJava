package cliniqueManagement;

import com.bridgeit.utility.Utility1;

public class ClinicManagementApplication {
		public static void main(String[] args) {

			ClinicManager manager = new ClinicManager();
			do {
				System.out.println("Choose Your Options:");
				System.out.println("1. To Add Appointment/Add Doctor ");
				System.out.println("2. To Search Patient/Search Doctor");
				System.out.println("3. To display Patients/display Doctor");
				int value=Utility1.ipnumber();
				switch (value) {
				case 1:
					
					manager.addChoices();//Calling ClinicManager methods
					break;
				case 2:

					manager.searchChoices();
					break;
				case 3:

					manager.displayChoices();
					break;
				case 4:
					System.exit(0);

				}
			} while (true);
		}
	}