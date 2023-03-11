package homework.medicalCenter.storage;

import homework.medicalCenter.model.Profession;
import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.model.Person;
import homework.medicalCenter.util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonStorage extends DateUtil {
    private Person[] persons = new Person[10];
    private int size = 0;


    public void addPerson(Person person) {
        if (persons.length == size) {
            extend();
        }
        persons[size] = person;
        size++;
    }


    public void extend() {
        Person[] tmp = new Person[persons.length + 10];
        System.arraycopy(persons, 0, tmp, 0, persons.length);
        persons = tmp;
    }


    public void printAllDoctors() {
        boolean bul = false;
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
                Doctor doctor = (Doctor) persons[i];
                System.out.println(doctor);
                bul = true;
            }
        }
        if (!bul) {
            System.out.println("No doctors");
        }
    }

    public void printAllPatients() {
        boolean bul = false;
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                Patient patient = (Patient) persons[i];
                System.out.println(patient);
                bul = true;
            }
        }
        if (!bul) {
            System.out.println("No patients");
        }
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
                Doctor doctor = (Doctor) persons[i];
                if (doctor.getId().equals(id)) {
                    return doctor;
                }
            }
        }
        return null;
    }

    public Patient getPatientById(String id) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                Patient patient = (Patient) persons[i];
                if (patient.getId().equals(id)) {
                    return patient;
                }
            }
        }
        return null;
    }

    public void searchDoctorByProfession(Profession profession) {
        boolean bul = false;
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
                Doctor doctor = (Doctor) persons[i];
                if (doctor.getProfession() == profession) {
                    System.out.println(doctor);
                    bul = true;
                }
            }
        }
        if (!bul) {
            System.out.println("Doctor with profession " + profession + " does not exists!");
        }
    }

    public void deleteDoctorById(String id) {
        Doctor doctor = getDoctorById(id);
        Person[] tmp = new Person[size];
        int a = 0;
        for (int j = 0; j < size; j++) {
            if (!(persons[j].equals(doctor))) {
                tmp[a++] = persons[j];
            }
        }
        persons = tmp;
        size--;
        System.out.println("Doctor with id " + id + " was deleted successfully");
    }


    public void searchPatientsByDoctorId(String id) {
        boolean bul = false;
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                Patient patient = (Patient) persons[i];
                if ((patient.getDoctor().getId()).contains(id)) {
                    bul = true;
                }
            }
        }
        if (!bul) {
            System.out.println("Doctor with id " + id + " does not have patients");
        }
    }

    public void printTodaysPatient() {
        boolean bul = false;
        Date date = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyy");
        String day1 = sd.format(date);
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                Patient patient = (Patient) persons[i];
                String day = sd.format(patient.getRegisterDateTime());
                if (day.equals(day1)) {
                    System.out.println(patient);
                    bul = true;
                }
            }
        }
        if (!bul) {
            System.out.println("Today are not patients!");
        }
    }


    public Boolean checkRegisterTime(Date date) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                Patient patient = (Patient) persons[i];
                String day = DateUtil.dateToString(patient.getRegisterDateTime());
                String day1 = DateUtil.dateToString(date);
                if (day.equals(day1)) {
                    return false;
                }
            }
        }
        return true;
    }
}
