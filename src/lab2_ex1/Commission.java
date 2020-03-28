package lab2_ex1;

public class Commission extends Hourly{
    private double total_sales;
    private double commission_rate;

    public Commission(String name, String address, String phone_number, String rsiNumber, double rate_of_pay, double commission_rate){
        super(name, address, phone_number, rsiNumber, rate_of_pay);
        this.total_sales = 0;
        this.commission_rate = commission_rate;
    }

    public void add_sales(double sales_added){
        this.total_sales = this.total_sales + sales_added;
    }

    @Override
    public double pay() {
        return super.pay() + (this.total_sales * (this.commission_rate / 100));
    }

    @Override
    public String toString() {
        return super.toString()+ "\nTotal sale: " + this.total_sales + "\nCommission rate: " + this.commission_rate;
    }
}
