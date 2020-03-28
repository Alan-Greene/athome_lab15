package lab2_ex1;

public class Employee extends StaffMember {
    private String rsiNumber;
    protected double rate_of_pay;

    public Employee(String name, String address, String phone_number, String rsiNumber, double rate_of_pay){
        super(name, address, phone_number);
        this.rsiNumber = rsiNumber;
        this.rate_of_pay = rate_of_pay;
    }

    public String toString() {
        return super.toString() + "\nrsiNumber: " + this.rsiNumber + "\nRate_of_pay: " + this.rate_of_pay;
    }

    @Override
    public double pay() {
        return this.rate_of_pay;
    }
}
