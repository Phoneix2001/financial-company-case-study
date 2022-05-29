public class MutualFunds extends ShareAssts {
private double totalshares;

    public MutualFunds(String symbol, double currentprice, double totalshares) {
        super(symbol, currentprice);
        this.totalshares = totalshares;
    }

    public double getTotalshares() {
        return totalshares;
    }

    @Override
    public double getmarketvalue() {
        return  totalshares*getCurrentprice();

    }


    public void purchase (double shares , double pricepershares){
        totalshares += shares ;
        addcost(shares*pricepershares);
    }
}
