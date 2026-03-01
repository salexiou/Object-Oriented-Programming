package tuc.ece.cs102.lib.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import tuc.ece.cs102.lib.Patient;
import tuc.ece.cs102.lib.Pharmacy;
import tuc.ece.cs102.lib.Doctor;
import tuc.ece.cs102.lib.Medicine;


public class Main {
	
	static final int quantity1 = 1;
	static final int quantity2 = 2;
	static final int quantity3 = 3;
	static final int quantity4 = 4;
	static final int quantity5 = 5;
	
	public static void main(String[] args) {
		
		//date formatter
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//add the pharmacy
		
		Pharmacy pharmacy = new Pharmacy("Pharmacy", "Eleytheriou Venizelou", 578, "2821011111");
	
		//add the patients
		
		pharmacy.addPatient(new Patient("patient1_nm", "patient1_sm", "11111111"));
		pharmacy.addPatient(new Patient("patient2_nm", "patient2_sm", "22222222"));
		pharmacy.addPatient(new Patient("patient3_nm", "patient3_sm", "33333333"));
		pharmacy.addPatient(new Patient("patient4_nm", "patient4_sm", "44444444"));
		pharmacy.addPatient(new Patient("patient5_nm", "patient5_sm", "55555555"));

		//add the doctors
		
		pharmacy.addDoctor(new Doctor("doctor1_nm", "doctor1_sm", "doc11111"));
		pharmacy.addDoctor(new Doctor("doctor2_nm", "doctor2_sm", "doc22222"));
		pharmacy.addDoctor(new Doctor("doctor3_nm", "doctor3_sm", "doc33333"));
		pharmacy.addDoctor(new Doctor("doctor4_nm", "doctor4_sm", "doc44444"));
		pharmacy.addDoctor(new Doctor("doctor5_nm", "doctor5_sm", "doc55555"));

		
		//add the medicines 
		
		pharmacy.addMedicine(new Medicine("med1_md", 10, "med11111"));
		pharmacy.addMedicine(new Medicine("med2_md", 20, "med22222"));
		pharmacy.addMedicine(new Medicine("med3_md", 30, "med33333"));
		pharmacy.addMedicine(new Medicine("med4_md", 40, "med44444"));
		pharmacy.addMedicine(new Medicine("med5_md", 50, "med55555"));

		//add the prescriptions
		
		/*prescription 1*/
		Medicine[] myArr1 = {new Medicine("med11111", 2  , 10) , new Medicine("med22222", 4 , 20) , new Medicine("med33333" , 1 , 30) };
		pharmacy.addPrescription1(LocalDate.parse("23/03/2022" , dtf) , "prescr11111" , pharmacy.findDoctorByAm("doc11111") , pharmacy.findPatientByAmka("11111111") , myArr1 );
		
		/*prescription 2*/
		
		Medicine[] myArr2 = {new Medicine("med11111", 1 , 10)};
		pharmacy.addPrescription1(LocalDate.parse("24/03/2022" , dtf) , "prescr22222" , pharmacy.findDoctorByAm("doc11111") , pharmacy.findPatientByAmka("22222222") , myArr2);
		
		/*prescription 3*/

		Medicine[] myArr3 = {new Medicine("med11111", 3 , 10), new Medicine("med33333", 2 , 30) };
		pharmacy.addPrescription1(LocalDate.parse("25/03/2022" , dtf) , "prescr33333" , pharmacy.findDoctorByAm("doc22222") , pharmacy.findPatientByAmka("22222222") , myArr3);
		
		/*prescription 4*/
		
		Medicine[] myArr4 = {new Medicine("med44444", 1 , 40) , new Medicine("med33333", 2 , 30) , new Medicine("med11111" , 1 , 10) };
		pharmacy.addPrescription1(LocalDate.parse("26/03/2022" , dtf) , "prescr44444" , pharmacy.findDoctorByAm("doc22222") , pharmacy.findPatientByAmka("33333333") , myArr4);
		
		/*prescription 5*/
		
		Medicine[] myArr5 = {new Medicine("med11111", 1 , 10) , new Medicine("med55555", 1 , 50) , new Medicine("med22222" , 1 , 20) };
		pharmacy.addPrescription1(LocalDate.parse("01/04/2022" , dtf) , "prescr55555" , pharmacy.findDoctorByAm("doc33333") , pharmacy.findPatientByAmka("33333333") , myArr5);

		/*prescription 6*/
		Medicine[] myArr6 = {new Medicine("med44444", 2 , 40) , new Medicine("med55555", 2 , 50)};
		pharmacy.addPrescription1(LocalDate.parse("04/04/2022" , dtf) , "prescr66666" , pharmacy.findDoctorByAm("doc33333") , pharmacy.findPatientByAmka("11111111") , myArr6);
		
		/*prescription 7*/
		Medicine[] myArr7 = {new Medicine("med44444", 1 , 40) , new Medicine("med11111", 2 , 10)};
		pharmacy.addPrescription1(LocalDate.parse("06/04/2022" , dtf) , "prescr77777" , pharmacy.findDoctorByAm("doc44444") , pharmacy.findPatientByAmka("44444444") , myArr7);
		
		/*prescription 8*/
		Medicine[] myArr8 = {new Medicine("med22222", 5 , 20)};
		pharmacy.addPrescription1(LocalDate.parse("16/04/2022" , dtf) , "prescr88888" , pharmacy.findDoctorByAm("doc44444") , pharmacy.findPatientByAmka("55555555") , myArr8);
		
		/*prescription 9*/
		Medicine[] myArr9 = {new Medicine("med55555", 5 , 50)};
		pharmacy.addPrescription1(LocalDate.parse("20/04/2022" , dtf) , "prescr99999" , pharmacy.findDoctorByAm("doc55555") , pharmacy.findPatientByAmka("55555555") , myArr9);
		  
		Scanner ms = new Scanner(System.in);
		
		int checkForExit = 0 ;
		
		int option = 0;
		System.out.println("\n");
		pharmacy.getFullDetails();
		System.out.println("\n");
		printMenu();
		
		
		do {	
			
			System.out.print("\nGive the number of your choice :");
			option = ms.nextInt() ;
						
			String mname , mcode; //case1
			int mprice; //case1
			
			String dfName , dlName , dAM; //case2
			
			String pfName , plName , pAMKA; //case3
			
			String prDoctor , prPatient , ldate , prcode , medCode; //case4
			int quantityOfMeds , quantity;
			
			String delcode;//case5
			
			int prefMethod1; //case 6
			String daM , pamka , code6 , periodStr ;//case 6
			
			int prefMethod3;//case7
			String am7 , amka7 ;//case 7
			
			int prefMethod,prefMethod2 ; // case 8
			
			int check = 0;
			
			

			
		switch(option) {
		
		case 0:
			continue;
			
		case 1:
			System.out.println("Give the name of the medicine: ");
			mname = ms.next();
			System.out.println("Give the price of the medicine:");
			mprice = ms.nextInt();
			System.out.println("Give the code of the medicine: ");
			mcode = ms.next();						
			pharmacy.addMedicine(new Medicine(mname,mprice,mcode));		
			break;
			
		case 2:
			System.out.println("Give the first name of the doctor: ");
			dfName = ms.next();
			System.out.println("Give the last name of the doctor: ");
			dlName = ms.next();
			System.out.println("Give the AM of the doctor: ");
			dAM = ms.next();
			pharmacy.addDoctor(new Doctor(dfName,dlName,dAM));
			break;
			
		case 3:
			System.out.println("Give the first name of the patient: ");
			pfName = ms.next();
			System.out.println("Give the last name of the patient: ");
			plName = ms.next();
			System.out.println("Give the AMKA of the patient: ");
			pAMKA = ms.next();
			pharmacy.addPatient(new Patient(pfName,plName,pAMKA));
			break;
			
		case 4:
			System.out.println("Give the date when the prescription was written in the form of(dd/MM/yyyy): ");
			ldate = ms.next();
			
			System.out.println("Give the code of the prescription: ");
			prcode = ms.next();
			if (pharmacy.checkForCode(prcode)) {
				pharmacy.printDoctors();
			System.out.println("Give the doctor's AM who wrote the prescription: ");
			prDoctor = ms.next(); 	
			if(pharmacy.findDoctorByAm(prDoctor)!= null &&   !pharmacy.checkForAM(pharmacy.findDoctorByAm(prDoctor))) {
				pharmacy.printPatients();
			System.out.println("Give the patient's AMKA to get the prescription: ");
			prPatient = ms.next();
			if (pharmacy.findPatientByAmka(prPatient)!= null &&   !pharmacy.checkForAMKA(pharmacy.findPatientByAmka(prPatient))) {
				pharmacy.printMedicines();
				System.out.println("How many medicines do you want to add to the prescription: ");
				quantityOfMeds = ms.nextInt();
		 		
		 		if (quantityOfMeds < 7 && quantityOfMeds >= 0) {		 			
					Medicine [] medicines = new Medicine [quantityOfMeds] ;
					
		 		for (int i = 0 ; i < quantityOfMeds ; i ++) {
		 			System.out.println("Enter the code of medicine[" + (i+1) + "] :");
		 			medCode = ms.next() ;
		 			
		 			if (pharmacy.findMedicineByCode(medCode) !=  null && !pharmacy.checkForCode(pharmacy.findMedicineByCode(medCode)) ) {
		 				
		 				System.out.println("Enter the quantity of this medicine[" +(i+1) + "] : ");
		 				quantity = ms.nextInt() ;
		 				
		 				medicines[i] = pharmacy.findMedicineByCode(medCode) ;
		 				medicines[i].setQuantity(quantity);
		 				
			}
		 		else {
		 			System.err.println("Cannot find this medicine. Try again!!");
		 			System.out.println("\n");
		 			check = -1 ;
		 				break ;
		 			}
		 		
		 		}
		 		if (check == 0) {
		 	pharmacy.addPrescription1(LocalDate.parse(ldate,dtf),prcode, pharmacy.findDoctorByAm(prDoctor), pharmacy.findPatientByAmka(prPatient) , medicines);
		 		}

		 	}
			else {
				System.err.println("Error during the insert of quantity(0<quantity<6)!");
				break ;
			}
			}else {
				System.err.println("The amka of this patient does not exist!");
				break ;
			}
			}
			else {
				System.err.println("The AM of this doctor does not exist!!!");
				break;
			}
			}
		 		else {
					System.err.println("Code already exists !!!");
		 			break;
		 		}
			break;
			
			
		case 5:
			pharmacy.printPrescriptions1();
			System.out.println("Give the code of the precription you want to delete: ");
			delcode = ms.next();
			if (pharmacy.findPrescriptionByCode(delcode)!=null) {
			pharmacy.deletePrescription(pharmacy.findPrescriptionByCode(delcode));
			}
			else {
			System.err.println("The code you gave does not belong to a prescription!");
			}
			break;
		
			
		case 6:
			System.out.println("Choose which method you prefer : ");
			System.out.println("1. Print Prescription by inserting the code.");
			System.out.println("2. Print Prescriptions by inserting the Doctor's AM.");
			System.out.println("3. Print Prescriptions by inserting the Patient's AMKA.");
			System.out.println("4. Print prescriptions in a specific time legth.");
			System.out.print("\nChoose one of the above(1-4) : ");
			prefMethod1 = ms.nextInt() ;
			
			if(prefMethod1 == 1) {
				System.out.println("Give the code of the prescription you want to see: ");
				code6 = ms.next();
				pharmacy.printPrescriptionByCode(code6);
			}
			else if(prefMethod1 == 2) {
				System.out.println("Give the Doctor's AM to see his prescriptions: ");
				daM = ms.next();
				pharmacy.printDoctorPrescriptions(daM);
			}
			else if (prefMethod1 == 3) {
				System.out.println("Give the Patient's AMKA to see his prescriptions: ");
				pamka = ms.next();
				pharmacy.printPatientPrescriptions(pamka);
			}
			
			else if(prefMethod1 == 4) {
				System.out.println("Give Period (dd/mm/yyyy-dd/mm/yyyy): ");
				periodStr = ms.next();
            	String[] dateStrs = periodStr.split("-");	                    
                pharmacy.findPrescriptionsMadeInPeriod(LocalDate.parse(dateStrs[0].trim(), dtf),LocalDate.parse(dateStrs[1].trim(), dtf));
                break;
			}
			else {
				System.err.println("Invalid choice! Please try again !");
			}
			break ;
			
			
		case 7:
			System.out.println("Chose which way you want to print the cost of the prescriptions");
			System.out.println("1. By giving the AM of the doctor");
			System.out.println("2. By giving the AMKA of the patient");
			System.out.print("\nChoose one of the above(1-2) : ");
			prefMethod3 = ms.nextInt();
			
			if(prefMethod3 == 1) {
				System.out.println("Give the AM of the doctor: ");
				am7 = ms.next();
				pharmacy.calculatePriceByAm(am7);
			}
			else if(prefMethod3 == 2) {
				System.out.println("Give the AMKA of the patient: ");
				amka7 = ms.next();
				pharmacy.calculatePriceByAmka(amka7);
			}
			else {
				System.err.println("Invalid choice! Please try again!");
			}
			break;
			

		case 8:
			System.out.println("Choose what you want to print : ");
			System.out.println("1. Print all doctors information. ");
			System.out.println("2. Print all patient information. ");
			System.out.println("3. Print all medicines information. ");
			System.out.println("4. Print all prescriptions information. ");
			System.out.print("\nChoose one of the above(1-4) : ");
			prefMethod = ms.nextInt() ;
			
			if(prefMethod == 1) {
				pharmacy.printDoctors();
			}
			else if(prefMethod == 2) {
				pharmacy.printPatients();
			}
			else if (prefMethod == 3) {
				pharmacy.printMedicines();
			}
			
			else if(prefMethod == 4) {
				System.out.println("Do you want to see the prescriptions with their medicines or without");
				System.out.println("\n");
				System.out.println("Press 1 to see the prescriptions with their medicines or 0 to see them without: " );
				prefMethod2 = ms.nextInt();
				if(prefMethod2 == 1) {
					pharmacy.printPrescriptions();
				}
				else if(prefMethod2 == 0) {
					pharmacy.printPrescriptions1();				
				}
				else {
					System.err.println("Invalid option! Please try again !");
				}
			}
			else {
				System.err.println("Invalid option! Please try again !");
			}
			break ;
			
		
		case 9:
			printMenu();
			break;
		
			
		case 10:
			System.out.println("Thanks for using the Pharmacy System!");
			checkForExit = -1;
			ms.close();
			break;
		}
		
	}while(checkForExit!=-1);

}



public static void printMenu() {
    System.out.println("-------------------------Main Menu------------------------------");
    System.out.println("================================================================");
    System.out.println("1.  Insert a new medicine.......................................");
    System.out.println("2.  Insert a new doctor.........................................");
    System.out.println("3.  Insert a new patient........................................");
    System.out.println("4.  Insert a new prescription...................................");   
    System.out.println("5.  Delete a prescription.......................................");  
    System.out.println("6.  Find a prescription........................................."); 
    System.out.println("7.  Calculate the price of a prescription......................."); 
    System.out.println("8.  Print Patients,Medicines,Doctors,Prescriptions..............");
    System.out.println("9.  Print Menu again............................................"); 
    System.out.println("10. Terminate the program.......................................");
    System.out.println("================================================================");
    
	}
}
