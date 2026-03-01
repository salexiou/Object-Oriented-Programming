# 💊 Pharmacy Management System

A robust, console-based Object-Oriented Java application designed to manage the daily operations of a pharmacy. This system handles medications, patient records, doctors, and the processing of medical prescriptions. 

Developed as an academic project, it demonstrates core OOP principles such as encapsulation, class associations, and in-memory data management.

## 🚀 Features

The application runs via an interactive Command Line Interface (CLI) with menus and sub-menus, offering the following functionalities:

- **Entity Management**: 
  - Insert new **Medications**, **Doctors**, and **Patients**.
  - Auto-generated unique IDs for medications, doctors (AM), and patients (AMKA).
- **Prescription Handling**:
  - Create new prescriptions by selecting a doctor, a patient, and up to 6 medications with their respective quantities.
  - Delete prescriptions using their unique ID.
- **Advanced Search & Filtering**:
  - Search and print prescriptions by: Prescription ID, Doctor's ID (AM), Patient's ID (AMKA), or Date Range.
- **Financial Calculations**:
  - Calculate total prescription costs associated with a specific Doctor or a specific Patient.
- **Reporting**:
  - Print complete lists and details of all registered doctors, patients, medications, or prescriptions.

## 🏗️ Domain Model

The system architecture is built upon the following real-world entities:

* **Pharmacy**: The central entity holding the system's data (Name, Address, Phone).
* **Medication**: Represents a drug available in the pharmacy. Features an auto-generated ID, name, and price.
* **Patient**: Represents a customer receiving prescriptions. Features a name, surname, an auto-generated AMKA (Social Security Number), and a history of prescriptions.
* **Doctor**: Represents a medical professional writing prescriptions. Features a name, surname, an auto-generated AM (Registration Number), and a list of authored prescriptions.
* **Prescription**: Links a Doctor, a Patient, and a list of Medications (max 6). Includes an auto-generated ID, issue date, and calculated total cost.

> **Note:** For the scope of this project, all data is stored in main memory (e.g., using `ArrayList` or `HashMap`) and is not persisted to a database.

## 💻 Tech Stack

- **Language:** Java (JDK 8+)
- **Paradigm:** Object-Oriented Programming (OOP)
- **IDE used:** Eclipse / IntelliJ IDEA
