package homework.medicalCenter;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.storage.PersonStorage;
import homework.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo extends DateUtil implements Commands, Commands1 {
    static Scanner scanner = new Scanner(System.in);
    static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRan = true;
        while (isRan) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRan = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorDataById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printPatientsByDoctor();
                    break;
                case PRINT_TODAYS_PATIENTS:
                    personStorage.printTodaysPatient();
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }
    }


    private static void printPatientsByDoctor() {
        System.out.println("Please input doctor's id");
        String id = scanner.nextLine();
        if (personStorage.getDoctorById(id) != null) {
            personStorage.searchPatientsByDoctorId(id);
        } else {
            System.out.println("Doctor with id " + id + " does not exist");
        }
    }


    private static void addPatient() throws ParseException {
        personStorage.printAllPatients();
        System.out.println("Please input id, name, surname, phone, doctor's id, register date and time(dd/mm/yyyy hh:mm)");
        String[] patientData = scanner.nextLine().split(",");
        String patientId = patientData[0];
        Patient patientById = personStorage.getPatientById(patientId);
        if (patientById == null) {
            String doctorId = patientData[4];
            Doctor doctorById = personStorage.getDoctorById(doctorId);
            if (doctorById != null) {
                Date date = stringToDate(patientData[5]);
                if (personStorage.checkRegisterTime(date)) {
                    Patient patient = new Patient(patientId, patientData[1], patientData[2], patientData[3], doctorById, date);
                    personStorage.addPerson(patient);
                    System.out.println("Patient was added successfully");
                } else {
                    System.out.println("This time is busy!");
                }
            } else {
                System.out.println("Doctor with id " + doctorId + " does not exist");
            }
        } else {
            System.out.println("Person with id " + patientId + " is already exists!");
        }
    }


    private static void addDoctor() {
        personStorage.printAllDoctors();
        System.out.println("Please input id,name,surname,phone,email,profession");
        String[] doctorData = scanner.nextLine().split(",");
        String doctorId = doctorData[0];
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById == null) {
            Doctor doctor = new Doctor(doctorData[0], doctorData[1], doctorData[2], doctorData[3], doctorData[4], doctorData[5]);
            personStorage.addPerson(doctor);
            System.out.println("Doctor was added successfully");
        } else {
            System.out.println("Person with id " + doctorId + " is already exists");
        }
    }

    private static void deleteDoctorById() {
        personStorage.printAllDoctors();
        System.out.println("Please input id");
        String id = scanner.nextLine();
        if (personStorage.getDoctorById(id) != null) {
            personStorage.deleteDoctorById(id);
        } else {
            System.out.println("Doctor with id " + id + " does not exists!");
        }
    }

    private static void searchDoctorByProfession() {
        personStorage.printAllDoctors();
        System.out.println("Please input profession");
        String profession = scanner.nextLine();
        personStorage.searchDoctorByProfession(profession);
    }

    private static void changeDoctorDataById() {
        personStorage.printAllDoctors();
        System.out.println("Please input id");
        String id = scanner.nextLine();
        Doctor doctor = personStorage.getDoctorById(id);
        if (doctor != null) {
            boolean isRan = true;
            while (isRan) {
                Commands1.printCommands1();
                String command1 = scanner.nextLine();
                switch (command1) {
                    case EXIT1:
                        isRan = false;
                        break;
                    case NAME:
                        System.out.println("Please input name");
                        String data = scanner.nextLine();
                        doctor.setName(data);
                        break;
                    case SURNAME:
                        System.out.println("Please input surname");
                        String surname = scanner.nextLine();
                        doctor.setSurname(surname);
                        break;
                    case PHONE_NUMER:
                        System.out.println("Please input phone number");
                        String phone = scanner.nextLine();
                        doctor.setPhoneNumber(phone);
                        break;
                    case EMAIL:
                        System.out.println("Please input email");
                        String email = scanner.nextLine();
                        doctor.setEmail(email);
                        break;
                    case PROFESSION:
                        System.out.println("Please input profession");
                        String profession = scanner.nextLine();
                        doctor.setProfession(profession);
                        break;
                    default:
                        System.out.println("Wrong command");
                }
                System.out.println(doctor);
            }
        }
    }
}
