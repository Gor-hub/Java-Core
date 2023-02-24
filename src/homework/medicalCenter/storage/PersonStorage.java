package homework.medicalCenter.storage;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.model.Person;
import homework.medicalCenter.util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonStorage extends DateUtil {
    private Person[][] persons = new Person[2][10];
    private int size = 0;
    private int size1 = 0;

    public void addDoctors(Person person) {
        if (persons[0].length == size) {
            extend();
        }
        persons[0][size] = person;
        size++;
    }

    public void addPatients(Person person) {
        if (persons[1].length == size1) {
            extend1();
        }
        persons[1][size1] = person;
        size1++;
    }

    public void extend() {
        Person[] tmp = new Person[persons[0].length + 10];
        System.arraycopy(persons[0], 0, tmp, 0, persons[0].length);
        persons[0] = tmp;
    }

    public void extend1() {
        Person[] tmp = new Person[persons[1].length + 10];
        System.arraycopy(persons[1], 0, tmp, 0, persons[1].length);
        persons[1] = tmp;
    }

    public void printAllDoctors() {
        for (int i = 0; i < size; i++) {
            System.out.println(persons[0][i]);
        }
    }

    public void printAllPatients() {
        for (int i = 0; i < size1; i++) {
            System.out.println(persons[1][i]);
        }
    }

    public void printDoctors(Doctor[] doctor) {
        for (int i = 0; i < doctor.length; i++) {
            System.out.println(doctor[i]);
            System.out.println();
        }

    }

    public void printPatients(Patient[] patients) {
        for (int i = 0; i < patients.length; i++) {
            System.out.println(patients[i]);
        }
    }


    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[0][i];
            if (person.getId().equals(id)) {
                return (Doctor) person;
            }
        }
        return null;
    }


    public Patient getaPatientById(String id) {
        for (int i = 0; i < size1; i++) {
            Person person = persons[1][i];
            if (person.getId().equals(id)) {
                return (Patient) person;
            }
        }
        return null;
    }

    public Doctor[] searchDoctorByProfession(String profession) {
        int size2 = 0;
        int a = 0;
        Doctor[] tmp = new Doctor[size];
        for (int i = 0; i < size; i++) {
            Doctor doctor = (Doctor) persons[0][i];
            if (doctor.getProfession().contains(profession)) {
                tmp[a++] = doctor;
                ++size2;
            }
        }
        Doctor[] doctors = new Doctor[size2];
        System.arraycopy(tmp, 0, doctors, 0, doctors.length);
        return doctors;
    }

    public void deleteDoctorById(String id) {
        Person person = getDoctorById(id);
        Person[] tmp = new Person[persons.length];
        int a = 0;
        for (int j = 0; j < size - 1; j++) {
            if (tmp[a].equals(person)) {
                tmp[a++] = persons[0][j];
            }
        }
        size--;
        persons[0] = tmp;
        System.out.println("Doctor with id " + id + " was deleted successfully");
    }


    public Doctor searchDoctorDataById(String id) {
        for (int i = 0; i < size; i++) {
            Doctor doctor = (Doctor) persons[0][i];
            if (doctor.getId().equals(id)) {
                return doctor;
            }
        }
        return null;
    }


    public Patient[] searchPatientsByDoctorId(String id) {
        int b = 0;
        int a = 0;
        boolean bul = false;
        Patient[] tmp = new Patient[size1];
        for (int i = 0; i < size1; i++) {
            Patient patient = (Patient) persons[1][i];
            if ((patient.getDoctor().getId()).contains(id)) {
                tmp[a++] = patient;
                ++b;
                bul = true;
            }
        }
        if (!bul) {
            return null;
        }
        Patient[] patients = new Patient[b];
        System.arraycopy(tmp, 0, patients, 0, patients.length);
        return patients;
    }

    public void printTodaysPatient() {
        boolean bul = false;
        Date date = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyy");
        String day1 = sd.format(date);
        for (int i = 0; i < size1; i++) {
            Patient patient = (Patient) persons[1][i];
            String day = sd.format(patient.getRegisterDateTime());
            if (day.equals(day1)) {
                System.out.println(patient);
                bul = true;
            }
        }
        if (!bul) {
            System.out.println("Today are not patients!");
        }
    }


    public Boolean checkRegisterTime(Date date) {
        for (int i = 0; i < size1; i++) {
            Patient patient = (Patient) persons[1][i];
            String day = DateUtil.dateToString(patient.getRegisterDateTime());
            String day1 = DateUtil.dateToString(date);
            if (day.equals(day1)) {
                return false;
            }
        }
        return true;
    }
}
