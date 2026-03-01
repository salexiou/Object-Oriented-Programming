package tuc.ece.cs102.lib;

public class Patient {
	private String firstName;
	private String lastName;
	private String AMKA ;
	private Prescription[] prescriptions;
	private int numOfPrescriptions;
	
	public Patient(String firstName, String lastName, String AMKA) {
		this.AMKA = AMKA;
		this.firstName = firstName;
		this.lastName = lastName;
		this.prescriptions = new Prescription[20];
		this.numOfPrescriptions = 0;
	}
	
	public void insertPrescription(Prescription p) {
		if (this.numOfPrescriptions >= 19) {
			System.out.println("You have reached the maximum quantity of perscriptions per patient !" );			
		}
		else {
			this.prescriptions[numOfPrescriptions] = p; 
			numOfPrescriptions++;
		}
	}
	
	public void  getFullDetails() {
			System.out.println("-------Patient Info ------" );
			System.out.print("First name -> " +  this.firstName); 
			System.out.print(" , Last name -> " + this.lastName);
			System.out.println(" , AMKA -> " + this.AMKA);
			}
		
		
	
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

	public String getAMKA() {
		return AMKA;
	}

	public void setAMKA(String aMKA) {
		AMKA = aMKA;
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
