package lab2_ex1;

public class Hourly extends Employee{
    private int hours_worked;

    public Hourly(String name, String address, String phone_number, String rsiNumber, double rate_of_pay){
        super(name, address, phone_number, rsiNumber, rate_of_pay);
        this.hours_worked = 0;
    }

    public void add_hours(int number_of_hours_worked){
        this.hours_worked = number_of_hours_worked;
    }

    @Override
    public double pay() {
        final double OVERTIME_RATE = this.rate_of_pay * 1.5;

        if (this.hours_worked <= 40){
            return super.pay() * this.hours_worked;
        } else {
            int hours_worked = this.hours_worked - 40;
            double overtime_amount = hours_worked * OVERTIME_RATE;
            return (super.pay() * 40) + overtime_amount;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nHours worked: " + this.hours_worked;
    }
}
