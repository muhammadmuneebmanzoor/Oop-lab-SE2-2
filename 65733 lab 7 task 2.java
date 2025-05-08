class Person {
    String name; int age;
    Person(String name, int age) { this.name = name; this.age = age; }
    void print() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}

class Patient extends Person {
    String disease, medicine;
    Patient(String name, int age, String disease, String medicine) {
        super(name, age);
        this.disease = disease; this.medicine = medicine;
    }
    void print() {
        super.print();
        System.out.println("Disease: " + disease + "\nMedicine: " + medicine);
    }
}

class MedicarePatient extends Patient {
    String hospital, ward; int room;
    MedicarePatient(String name, int age, String disease, String medicine,
                    String hospital, String ward, int room) {
        super(name, age, disease, medicine);
        this.hospital = hospital; this.ward = ward; this.room = room;
    }
    void print() {
        super.print();
        System.out.println("Hospital: " + hospital + "\nWard: " + ward + "\nRoom: " + room);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Patient("Ali", 40, "Flu", "Paracetamol");
        Person p2 = new MedicarePatient("Sara", 30, "Asthma", "Inhaler", "City Hospital", "B", 105);
        p1.print(); System.out.println();
        p2.print();
    }
}
