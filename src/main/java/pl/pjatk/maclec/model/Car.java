package pl.pjatk.maclec.model;

public class Car {

    private final String mark;
    private final int productionYear;

    public Car(String mark, int productionYear) {
        this.mark = mark;
        this.productionYear = productionYear;
    }

    public String getMark() {
        return mark;
    }

    public int getProductionYear() {
        return productionYear;
    }
}
