public class Stocks extends ShareAssts implements Assets {
 private  int totalshares;

    public Stocks(String symbol, double currentprice) {
        super(symbol, currentprice);
        totalshares = 0;
    }


    public int getTotalshares() {
        return totalshares;
    }

    @Override
    public double getmarketvalue() {

        return totalshares*getCurrentprice() ;
    }


    public void purchase(int shares, double pricepershares){
        totalshares +=shares;
        addcost(shares*pricepershares);
    }
}
