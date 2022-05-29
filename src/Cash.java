public class Cash  implements Assets{
    double totalAmount;
    @Override
    public double getmarketvalue() {
        return totalAmount;
    }

    public Cash(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public double getprofit() {

        return 0;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
