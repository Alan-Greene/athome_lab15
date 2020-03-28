package lab2_ex1;

import java.security.spec.ECField;

public class Staff {
    StaffMember[] staffMembers =
            {new Executive("John", "1 This St.", "0874323476", "R6574635", 2423.07),
             new Employee("Paul", "2 That St.", "0854345222", "P8884635", 1246.15),
             new Employee("Dave", "3 Other St.", "0864343566", "S9876635", 1169.23),
             new Hourly("Joanne", "4 Long Ave.", "0836789676", "T0987635", 10.55),
             new Volunteer("Norma", "5 Short ave.", "0864323456"),
             new Volunteer("Kate", "6 Pecks Lane.", "0854676767"),
             new Commission("Molly", "7 Nowhere Rd.", "0864326789", "L6599635", 6.25, 20),
             new Commission("Joe", "8 My Place", "0864344545", "G8888635", 9.75, 15)
            };

    public void process_staff(){
        for (int i = 0; i < staffMembers.length; i++){
            if (staffMembers[i].name.equals("John")){
                Executive john = (Executive) staffMembers[i];
                john.award_bonus(500);
            }

            if (staffMembers[i].name.equals("Joanne")){
                Hourly joanne = (Hourly) staffMembers[i];
                joanne.add_hours(50);
            }

            if (staffMembers[i].name.equals("Molly")){
                Commission molly = (Commission) staffMembers[i];
                molly.add_hours(55);
                molly.add_sales(400);
            }

            if (staffMembers[i].name.equals("Joe")){
                Commission joe = (Commission) staffMembers[i];
                joe.add_hours(45);
                joe.add_sales(950);
            }
        }
    }

    public void pay_day(){
        for (int i = 0; i < staffMembers.length; i++){
            if (staffMembers[i] instanceof Employee) {
                Employee emp = (Employee) staffMembers[i];
                System.out.println(emp.toString());
                System.out.println("Total pay: " + emp.pay());
                System.out.println();
            } else if (staffMembers[i] instanceof Executive){
                Executive exec = (Executive) staffMembers[i];
                System.out.println(exec.toString());
                System.out.println("Total pay: " + exec.pay());
                System.out.println();
            } else if (staffMembers[i] instanceof Hourly){
                Hourly hour = (Hourly) staffMembers[i];
                System.out.println(hour.toString());
                System.out.println("Total pay: " + hour.pay());
                System.out.println();
            } else if (staffMembers[i] instanceof Commission){
                Commission comm = (Commission) staffMembers[i];
                System.out.println(comm.toString());
                System.out.println("Total pay: " + comm.pay());
                System.out.println();
            } else if (staffMembers[i] instanceof Volunteer){
                Volunteer vol = (Volunteer) staffMembers[i];
                System.out.println(vol.toString());
                System.out.println("Total pay: " +  + vol.pay());
                System.out.println();
            }
        }

    }
}