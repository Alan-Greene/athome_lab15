package lab2_ex1;

public class Executive extends Employee {
    private double bonus;

    public Executive(String name, String address, String phone_number, String rsiNumber, double rate_of_pay){
        super(name, address, phone_number, rsiNumber, rate_of_pay);
        this.bonus = 0;
    }

    public void award_bonus(double bonus_amount){
        this.bonus = this.bonus + bonus_amount;
    }

    @Override
    public double pay() {
        return super.pay() + this.bonus;
    }
}
