package ro.scoalainformaladavid;

public class SalesRepresentative {
    private String name;
    private int numberOfSales;
    private float quota;

    public SalesRepresentative(String name, int numberOfSales, float quot) {
        this.name = name;
        this.numberOfSales = numberOfSales;
        this.quota = quot;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public float getQuota() {
        return quota;
    }

    public float getRevenue() {
        return quota * numberOfSales;
    }

    @Override
    public String toString() {
        return "SalesRepresentative{"
                + "name='"
                + name
                + '\''
                + ", numberOfSales="
                + numberOfSales
                + ", quota="
                + quota
                + '}';
    }
}
