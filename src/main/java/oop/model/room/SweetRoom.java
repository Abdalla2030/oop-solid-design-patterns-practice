package main.java.oop.model.room;

public class SweetRoom extends Room {

    private String amenities;

    private double taxMultiplier;

    public SweetRoom(int number, double price, String amenities) {
        super(number, price);
        this.amenities = amenities;
        this.setType("Sweet Room");
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public double getTaxMultiplier() {
        return taxMultiplier;
    }

    public void setTaxMultiplier(double taxMultiplier) {
        this.taxMultiplier = taxMultiplier;
    }

    @Override
    public double calculateTotalAmount(int numberOfDays) {
        return numberOfDays * getPrice() * 30;
    }


}
