package tuc.ece.cs102.lib;

import java.time.LocalDate;

public class Pharmacy {
	
static final int MAXIMUM_NUMBER_OF_PATIENTS = 50;
static final int MAXIMUM_NUMBER_OF_DOCTORS = 50;
static final int MAXIMUM_NUMBER_OF_MEDICINES = 50;
static final int MAXIMUM_NUMBER_OF_PRESCRIPTIONS = 50;
static final int MAX_NUM_MEDS_PER_PRESC = 6;


	private String name;
	private String address;
	private int num;
	private String telephone;
	private Patient[] patients;
	private int numOfPatients;
	private Doctor[] doctors;
	private int numOfDoctors;
	private Medicine[] medicines;
	private int numOfMedicines;
	//private LocalDate date ;
	private Prescription[] prescriptions;
	private int numOfPrescriptions;

	public Pharmacy(String name, String address, int num, String telephone) {
		
		this.name = name;
		this.address = address;
		this.num = num;
		this.telephone = telephone;
		this.patients = new Patient[MAXIMUM_NUMBER_OF_PATIENTS];
		this.numOfPatients = 0;
		this.doctors = new Doctor[MAXIMUM_NUMBER_OF_DOCTORS];
		this.numOfDoctors = 0;
		this.medicines = new Medicine[MAXIMUM_NUMBER_OF_MEDICINES];
		this.numOfMedicines = 0;
		this.prescriptions = new Prescription[MAXIMUM_NUMBER_OF_PRESCRIPTIONS];
		this.numOfPrescriptions = 0;
	}
	
	//print full address
	public String printAdress() {
		return getAddress() + " " + getNum();
	}

	//print pharmacy details

	public void  getFullDetails() {
	System.out.println("|================================================================================|");
	System.out.println("|------------------------------- Pharmacy Info ----------------------------------|");
	System.out.print("|Name -> " +  this.name); 
	System.out.print(", Address -> " + this.printAdress());
	System.out.println(" , Telephone -> " + this.telephone +"|");
	System.out.println("|================================================================================|");
		}
	
	//insert prescription
	
	public void insertPrescription(Prescription p) {
		if (this.numOfPrescriptions >= MAXIMUM_NUMBER_OF_PRESCRIPTIONS) {
			System.err.println("You cannot add more perscriptions!" );			
		}
		else {
			this.prescriptions[numOfPrescriptions] = p; 
			numOfPrescriptions++;		
			
		}
	}
	
	//	add patient
	public void addPatient(Patient p) {
		if (numOfPatients < Pharmacy.MAXIMUM_NUMBER_OF_PATIENTS) {
			if (this.checkForAMKA(p)) {
			this.patients[this.numOfPatients] = p;
			this.numOfPatients++;
			System.out.println("Your registration has been completed succesfully !");
			return ;
		}
			else {
			System.err.println("There is already a patient with this amka! ");
			return ;
			}
	}
			System.err.println("Cannot add more patients!You reached the maximum capacity");
		}


	//add doctor
	public void addDoctor(Doctor d) {
		if (numOfDoctors < Pharmacy.MAXIMUM_NUMBER_OF_DOCTORS) {
			if (this.checkForAM(d)) {
			this.doctors[this.numOfDoctors] = d;
			this.numOfDoctors++;
			System.out.println("Your registration has been completed succesfully !");
			return ;
		}
			else {
			System.err.println("There is already a doctor with this am! ");
			System.out.println("\n");
			return ;
			}
	}	
			System.err.println("Cannot add more doctors!You reached the maximum capacity");
		}

	//add medicine
	public void addMedicine(Medicine m) {
		if (numOfMedicines < Pharmacy.MAXIMUM_NUMBER_OF_MEDICINES) {
			if (this.checkForCode(m)) {
			this.medicines[this.numOfMedicines] = m;
			this.numOfMedicines++;
			System.out.println("Your registration has been completed succesfully !");
			return ;
		}
			else {
			System.err.println("There is already a medicine with this code! ");
			return ;		
			}
	}
			System.err.println("Cannot add more medicines!You reached the maximum capacity");
		}

	
	//check if the medicine's code is unique
	public boolean checkForCode (Medicine m) {
		for(int i = 0 ; i < numOfMedicines ; i++) {
			if(m.getCode().equals(medicines[i].getCode()))
				return false;
		}
		return true;
	}
	
	
	//check if doctor's AM is unique
	public boolean checkForAM (Doctor d) {
		for(int i = 0 ; i < numOfDoctors ; i++) {
			if(d.getAM().equals(doctors[i].getAM()))
				return false;
		}
		return true;
	}
	
	//check for patient's AMKA uniqueness
	public boolean checkForAMKA(Patient p) {
		for(int i = 0; i < numOfPatients; i++) {
			if(p.getAMKA().equals(patients[i].getAMKA())) 
				return false;
			}
		return true;
		}
	
	/* print all doctors*/
	public void printDoctors() {
		System.out.println("Currently added Doctors:");
		for (int i = 0; i <= numOfDoctors; i++) {
		Doctor currentDoctor = doctors[i];
			if (currentDoctor != null) {
			currentDoctor.getFullDetails();
			}
		}
	}	 
	
	//print all prescriptions with medicines
	public void printPrescriptions() {
		System.out.println("Currently added Prescriptions:");
		for (int i = 0; i < numOfPrescriptions; i++) {
		Prescription currentPre = prescriptions[i];
			currentPre.getFullDetails();
			System.out.println("\n");
		}
	}
	
	//print all prescriptions without medicines
		public void printPrescriptions1() {
			System.out.println("Currently added Prescriptions:");
			for (int i = 0; i < numOfPrescriptions; i++) {
			Prescription currentPre = prescriptions[i];
				currentPre.getDetails();
				System.out.println("\n");
			}
		}
	 
	//print all patients
	public void printPatients() {
		System.out.println("Currently added Patients:");
		for (int i = 0; i <= numOfPatients; i++) {
		Patient currentPatient = patients[i];
			if (currentPatient != null) {
			currentPatient.getFullDetails();
			}
		}
	}
	
	//print all medicines
	public void printMedicines() {
		System.out.println("Currently added Medicines:");
		for (int i = 0; i <= numOfMedicines; i++) {
		Medicine currentMedicine = medicines[i];
			if (currentMedicine != null) {
				currentMedicine.getFullDetails();
			}
		}
	}
		
	
	//add prescription
	public void addPrescription1 (LocalDate ldate, String code, Doctor doctor , Patient patient , Medicine[] medicines) {
		
		this.insertPrescription(new Prescription(ldate,code, this.findDoctorByAm(doctor.getAM()), this.findPatientByAmka(patient.getAMKA()) , medicines));
		doctor.writePrescription(new Prescription(ldate,code, this.findDoctorByAm(doctor.getAM()), this.findPatientByAmka(patient.getAMKA()) , medicines));
		patient.insertPrescription(new Prescription(ldate,code, this.findDoctorByAm(doctor.getAM()), this.findPatientByAmka(patient.getAMKA()) , medicines));
 		System.out.println("You added the prescription successfully!");
	}

	
	public boolean checkForCode (String code) {
		for(int i = 0 ; i < numOfPrescriptions; i++) {
			if(prescriptions[i].getCode().equals(code))
				return false;
		}
		return true;
	}
	
	//find the prescription you want to delete
	
	public int numberOfPrescriptionIDelete (Prescription p ) {
		
		for (int i =  0 ; i < this.numOfPrescriptions ; i++) {
			if (p.getCode()!= null) {
			if(this.prescriptions[i].getCode().equals(p.getCode())) {
				return i ;
			}
			}else {
				System.out.println("Invalid");
			}

		}		
		return -1 ;
	}
	
	//delete prescription by code 
	public void deletePrescription (Prescription p) {
		int index = this.numberOfPrescriptionIDelete(p);
		Prescription[] newArray = new Prescription[this.numOfPrescriptions -1];
		
		for(int j = 0; j < index ; j++) {
			newArray[j] = this.prescriptions[j];
		}
		
		for (int i = (this.numOfPrescriptions - 2) ; i >= index ; i--) {
			newArray[i] = this.prescriptions[i+1] ;
		}
		
		this.prescriptions = null;
		this.prescriptions = newArray;
		this.numOfPrescriptions-- ;
		System.out.println("You have successfully deleted this prescription!");			
		return ;
	}
	
	//find doctor by am
	public Doctor findDoctorByAm(String am) {
		for (Doctor d : this.doctors) {
			if ( d != null && d.getAM().equals(am)) {
				return d ;
			}
		}
		return null ;
	}
	
	//find patient by AMKA
	public Patient findPatientByAmka(String amka) {
		for (Patient p : this.patients) {
			if ( p != null && p.getAMKA().equals(amka)) {
				return p ;
			}
		}
		return null ;
	}
	
	//find medicine by code
	public Medicine findMedicineByCode(String code) {
		for (Medicine m : this.medicines) {
			if ( m != null && m.getCode().equals(code)) {
				return m ;
			}
		}
		return null ;
	}
	
	//find prescription by code
	public Prescription findPrescriptionByCode(String pcode) {
		for (Prescription pr : this.prescriptions) {
			if ( pr != null && pr.getCode().equals(pcode)) {
				return pr ;
			}
		}
		return null ;
	}
	
	//give doctor's am and get his prescriptions
	
	public void printDoctorPrescriptions(String dAM) {
		Doctor d = this.findDoctorByAm(dAM);
		if (d != null) {
			System.out.println("Prescriptions of this [ " + dAM + " ] Doctor: ");
			if (d.getNumOfPrescriptions() > 0) {
				for (Prescription p: d.getPrescriptions()) {
					if (p != null)
						p.getDetails();
				}
			} else {
				System.err.println("There are no prescriptions for this Doctor");
				return;
			}
		}
		else {
			System.err.println("Invalid am!");
		}
	}
	
	// give patients AMKA and get his prescriptions
	
	public void printPatientPrescriptions(String pAMKA) {
		Patient p = this.findPatientByAmka(pAMKA);
		if (p != null) {
			System.out.println("Prescriptions of this [ " + pAMKA + " ] Patient: ");
			if (p.getNumOfPrescriptions() > 0) {
				for (Prescription pr: p.getPrescriptions()) {
					if (pr != null)
						pr.getFullDetails();
				}
			} else {
				System.err.println("There are no prescriptions for this Patient");
			}
		}
			else {
				System.err.println("Invalid amka!");
				return;
			}
		}
	
	
	// print prescription by code
	public void printPrescriptionByCode(String pcode) {
		
			if(this.findPrescriptionByCode(pcode) !=null) {	
				this.findPrescriptionByCode(pcode).getFullDetails();
			}
			else {
				System.err.println("Invalid code!!");
				return;
			}
	}
	
	//give a certain period and print the prescriptions
	public void findPrescriptionsMadeInPeriod(LocalDate sDate, LocalDate eDate) {
		 if (this.numOfPrescriptions > 0) {
		 int counter = 0;
		 for (Prescription p : this.prescriptions) {
		 if (p != null && p.getLDate().isBefore(eDate)&& p.getLDate().isAfter(sDate)) {
		 counter++;
		 System.out.print(counter + " Perscription:");
		 p.getFullDetails();
		 System.out.println("\n");
			}
		}
		 if (counter==0) {
			 System.err.println("There were no prescriptions this period");
			 System.out.println("\n");
			 return;
		 	}
		 }else {
	 System.out.println("There are no prescriptions at all!");
	 return;
		}
	 }
	
	//calculate price by am
	
	public void calculatePriceByAm(String Am) {
		Doctor d = this.findDoctorByAm(Am);
		int cost = 0;
		if (d != null) {
			System.out.println("Cost of Prescriptions for this [ " + Am+ " ] Doctor: ");
			if (d.getNumOfPrescriptions() > 0) {
				for (Prescription pr: d.getPrescriptions()) {
					if (pr != null) {
						for(int i = 0; i < pr.getMedicines().length; i++) {
							int price = pr.getMedicines()[i].getPrice();
							int quantity = pr.getMedicines()[i].getQuantity();
							cost += price * quantity;
						}
					}
				}
				System.out.println("Total cost:" + cost + "$");
			}
			else {
				System.err.println("No prescriptions for this doctor!");	
				}
		}
			else {
					System.err.print("Invalid Am");
					return;
				}
		}
	//calculate price by amka
	
	public void calculatePriceByAmka(String Amka) {
		Patient p = this.findPatientByAmka(Amka);
		int cost = 0;
		if (p != null) {
			System.out.println("Cost of Prescriptions for this [ " + Amka+ " ] Patient: ");
			if (p.getNumOfPrescriptions() > 0) {
				for (Prescription pr: p.getPrescriptions()) {
					if (pr != null) {
						for(int i = 0; i < pr.getMedicines().length; i++) {
							int price = pr.getMedicines()[i].getPrice();
							int quantity = pr.getMedicines()[i].getQuantity();
							cost += price * quantity;
						}
					}
				}
				System.out.println("Total cost:" + cost + "$");
			}
			else {
				System.err.println("No prescriptions for this patient!");	
				}
		}
			else {
					System.err.print("Invalid amka!");
					return;
				}
		}
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Patient[] getPatients() {
		return patients;
	}

	public void setPatients(Patient[] patients) {
		this.patients = patients;
	}

	public int getNumOfPatients() {
		return numOfPatients;
	}

	public void setNumOfPatients(int numOfPatients) {
		this.numOfPatients = numOfPatients;
	}

	public Doctor[] getDoctors() {
		return doctors;
	}

	public void setDoctors(Doctor[] doctors) {
		this.doctors = doctors;
	}

	public int getNumOfDoctors() {
		return numOfDoctors;
	}

	public void setNumOfDoctors(int numOfDoctors) {
		this.numOfDoctors = numOfDoctors;
	}

	public Medicine[] getMedicines() {
		return medicines;
	}

	public void setMedicines(Medicine[] medicines) {
		this.medicines = medicines;
	}

	public int getNumOfMedicines() {
		return numOfMedicines;
	}

	public void setNumOfMedicines(int numOfMedicines) {
		this.numOfMedicines = numOfMedicines;
	}

	public Prescription[] getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(Prescription[] prescriptions) {
		this.prescriptions = prescriptions;
	}

	public int getNumOfPrescriptions() {
		return numOfPrescriptions;
	}

	public void setNumOfPrescriptions(int numOfPrescriptions) {
		this.numOfPrescriptions = numOfPrescriptions;
	}
	
	
	
}
		
