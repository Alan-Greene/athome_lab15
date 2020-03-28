package lab2_ex1;

public abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone_number;

    public StaffMember(String name, String address, String phone_number){
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }

    public String toString(){
        return "Name: " + this.name + "\nAddress: " + this.address + "\nPhone number: " + this.phone_number;
    }

    public abstract double pay();
}
