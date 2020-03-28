package lab2_ex1;

public class Volunteer extends StaffMember{
    public Volunteer(String name, String address, String phone_number){
        super(name, address, phone_number);
    }

    @Override
    public double pay() {
        return 0;
    }
}
