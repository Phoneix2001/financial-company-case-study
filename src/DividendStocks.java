public class DividendStocks extends Stocks implements Assets{
   private double dividents;
    public DividendStocks(String symbol , double currentprice) {
        super(symbol,  currentprice);
        dividents =0.0;
    }

    @Override
    public double getmarketvalue() {
        return super.getmarketvalue()+dividents;
    }

    public void paydivident(double amountpershare){
        dividents+=amountpershare*getTotalshares();
    }
    @Override
    public double getprofit() {
        return 0;
    }
}
