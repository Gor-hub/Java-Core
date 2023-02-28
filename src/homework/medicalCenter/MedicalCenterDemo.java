package homework.medicalCenter;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.storage.PersonStorage;
import homework.medicalCenter.util.DateUtil;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;


public class MedicalCenterDemo extends DateUtil implements Commands, Commands1 {
    private static Scanner scanner = new Scanner(System.in);
    private static PersonStorage personStorage = new PersonStorage();

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
                    System.err.println("Wrong command!");
            }
        }
    }


    private static void printPatientsByDoctor() {
        System.out.println("Please input doctor's id");
        String id = scanner.nextLine();
        if (personStorage.getDoctorById(id) != null) {
            personStorage.searchPatientsByDoctorId(id);
        } else {
            System.err.println("Doctor with id " + id + " does not exist");
        }
    }


    private static void addPatient() {
        personStorage.printAllPatients();
        System.out.println("Please input id, name, surname, phone, doctor's id, register date and time(dd/mm/yyyy hh:mm)");
        String[] patientData = scanner.nextLine().split(",");
        String patientId = patientData[0];
        Patient patientById = personStorage.getPatientById(patientId);
        if (patientById == null) {
            String doctorId = patientData[4];
            Doctor doctorById = personStorage.getDoctorById(doctorId);
            if (doctorById != null) {
                try {
                    Date date = stringToDate(patientData[5]);
                    if (personStorage.checkRegisterTime(date)) {
                        Patient patient = new Patient(patientId, patientData[1], patientData[2], patientData[3], doctorById, date);
                        personStorage.addPerson(patient);
                        System.out.println("Patient was added successfully");

                    } else {
                        System.err.println("This time is busy!");
                    }
                } catch (ParseException e) {
                    System.err.println("Format of date is false. Please try again ");
                }
            } else {
                System.err.println("Doctor with id " + doctorId + " does not exist");
            }
        } else {
            System.err.println("Patient with id " + patientId + " is already exists!");
        }

    }


    private static void addDoctor() {
        personStorage.printAllDoctors();
        System.out.println("Please input id,name,surname,phone,email");
        String[] doctorData = scanner.nextLine().split(",");
        if (doctorData.length == 5) {
            String doctorId = doctorData[0];
            Doctor doctorById = personStorage.getDoctorById(doctorId);
            Profession profession = addProfession();
            if (doctorById == null) {
                Doctor doctor = new Doctor(doctorData[0], doctorData[1], doctorData[2], doctorData[3], doctorData[4], profession);
                personStorage.addPerson(doctor);
                System.out.println("Doctor was added successfully");
            } else {
                System.err.println("Doctor with id " + doctorId + " is already exists");
            }
        } else {
            System.err.println("Not enough data!");
        }
    }


    private static Profession addProfession() {
        System.out.println("Please choose and input profession from: ");
        Profession[] values = Profession.values();
        for (Profession value : values) {
            System.out.println(value);
        }
        try {
            String profData = scanner.nextLine();
            String professionStr = profData.toUpperCase();
            return Profession.valueOf(professionStr);
        } catch (IllegalArgumentException e) {
            System.err.println("The profession you wrote does not exists");
            System.out.println("Please try again!");
        }
        return addProfession();
    }

    private static void deleteDoctorById() {
        personStorage.printAllDoctors();
        System.out.println("Please input id");
        String id = scanner.nextLine();
        if (personStorage.getDoctorById(id) != null) {
            personStorage.deleteDoctorById(id);
        } else {
            System.err.println("Doctor with id " + id + " does not exists!");
        }
    }

    private static void searchDoctorByProfession() {
        personStorage.printAllDoctors();
        Profession profession = addProfession();
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
                        Profession profession = addProfession();
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
