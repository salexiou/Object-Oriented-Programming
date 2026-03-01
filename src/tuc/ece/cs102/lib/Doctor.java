package tuc.ece.cs102.lib;

public class Doctor {
	
	static final int MAXIMUM_NUMBER_OF_PRESCRIPTIONS = 50;

	private String firstName;
	private String lastName;
	private String AM;
	private Prescription[] prescriptions;
	private int numOfPrescriptions ;
	
	public Doctor(String firstName, String lastName, String AM) {
		
	this.firstName = firstName;
	this.lastName = lastName;
	this.AM = AM;
	this.prescriptions = new Prescription[MAXIMUM_NUMBER_OF_PRESCRIPTIONS];	
	this.numOfPrescriptions = 0 ;
	}
	
	
	public void writePrescription(Prescription pre) {  
		if(this.numOfPrescriptions>=MAXIMUM_NUMBER_OF_PRESCRIPTIONS) {
			System.out.println("You have reached the maximum quantity of perscriptions per doctor !");
		} else {
		this.prescriptions[numOfPrescriptions] = pre;
		numOfPrescriptions++;
	}
		}
	
	public void  getFullDetails() {
		System.out.println("-------Doctor Info ------" );
		System.out.print("First name -> " +  this.firstName); 
		System.out.print(" , Last name -> " + this.lastName);
		System.out.println(" , AM -> " + this.AM);
		}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String fistName) {
		this.firstName = fistName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAM() {
		return AM;
	}


	public void setAM(String aM) {
		AM = aM;
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
