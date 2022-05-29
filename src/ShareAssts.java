public abstract class  ShareAssts implements Assets {

    private String symbol;
    private double totalcost;

    private double currentprice;

    public ShareAssts(String symbol,  double currentprice) {
        this.symbol = symbol;

        this.currentprice = currentprice;
totalcost=0.0;
    }


    public double getTotalcost() {
        return totalcost;
    }

    public void addcost(double cost){
        totalcost +=cost;
}

// return price per share of assest


    public double getCurrentprice() {
        return currentprice;
    }


    public void setCurrentprice(double currentprice) {
        this.currentprice = currentprice;
    }
    public abstract double getmarketvalue();

    @Override
    public double getprofit() {
        return getmarketvalue()-totalcost;
    }
}
