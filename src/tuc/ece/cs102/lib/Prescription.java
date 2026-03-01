package tuc.ece.cs102.lib;
import java.time.LocalDate;

public class Prescription {

	static final int MAXIMUM_NUMBER_OF_MEDICINES = 6;
	
	private String code;
	private Doctor doctor;
	private Patient patient;
	private Medicine[] medicines;
	private int numOfMedicines;
	private LocalDate lDate;
 

	
	public Prescription(LocalDate lDate,String code,Doctor doctor, Patient patient , Medicine[] medicines) {
		this.code = code;
		this.doctor = doctor;
		this.patient = patient;
		this.medicines = new Medicine[MAXIMUM_NUMBER_OF_MEDICINES];
		this.medicines = medicines;
		this.numOfMedicines = 0;
		this.lDate = lDate;
	}

	//print full details with medicines
	public void  getFullDetails() {
		System.out.println("-------Prescription Info ------" );
		System.out.print("Date -> " + this.getLDate());
		System.out.print(" , Code -> " +  this.getCode()); 
		System.out.print(" , Doctor's AM who wrote the prescription -> " + this.doctor.getAM());
		System.out.println(" , The patient's AMKA who was given the prescription -> " + this.patient.getAMKA() +"\n");
		for (Medicine m : this.medicines) {
			if (m != null) {
				m.getDetailsForPrescriptions();
			}
		}
	}
	
	public void  getDetails() {
		System.out.println("-------Prescription Info ------" );
		System.out.print("Date -> " + this.getLDate());
		System.out.print(" , Code -> " +  this.getCode()); 
		System.out.print(" , Doctor's AM who wrote the prescription -> " + this.doctor.getAM());
		System.out.println(" , The patient's AMKA who was given the prescription -> " + this.patient.getAMKA());
	}
	//getters and setters
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
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

	
	public LocalDate getLDate() {
		return lDate;
	}

	public static int getMaximumNumberOfMedicines() {
		return MAXIMUM_NUMBER_OF_MEDICINES;
	}
	
			
	}
	
