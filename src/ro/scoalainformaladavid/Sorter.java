package ro.scoalainformaladavid;

public class Sorter {

    public SalesRepresentative[] sort(SalesRepresentative[] representatives) {
        int n = representatives.length;
        SalesRepresentative aux;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (representatives[j].getRevenue() < representatives[j + 1].getRevenue()) {
                    aux = representatives[j];
                    representatives[j] = representatives[j + 1];
                    representatives[j + 1] = aux;
                }
            }
        }
        return representatives;
    }
}
