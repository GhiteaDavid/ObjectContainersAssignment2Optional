package ro.scoalainformaladavid;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative[] representatives = new SalesRepresentative[3];

        SalesRepresentative saleGuy1 = new SalesRepresentative("Steve", 3, 200);
        SalesRepresentative saleGuy2 = new SalesRepresentative("John", 5, 1000);
        SalesRepresentative saleGuy3 = new SalesRepresentative("Mike", 6, 700);

        representatives[0] = saleGuy1;
        representatives[1] = saleGuy2;
        representatives[2] = saleGuy3;

        for (SalesRepresentative saleGuy : representatives) {
            System.out.println(saleGuy);
        }

        System.out.println("===================");

        Sorter sort = new Sorter();
        SalesRepresentative[] sortedRepresentatives = sort.sort(representatives);
        for (SalesRepresentative s : sortedRepresentatives) {
            System.out.println(s);
        }
    }
}
