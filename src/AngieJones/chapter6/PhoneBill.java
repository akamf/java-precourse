package AngieJones.chapter6;

/*
    Enhance the Phone Bill exercise by redoing it in an object-oriented style.

    - A phone bill should have an id, base cost, number of allotted minutes,
      and number of minutes used. One should also be able to calculate the
      overage, tax, and total on a phone bill, and also be able to print
      an itemized bill.

    - Include the following constructors: default, id-only, all fields.
      No matter which constructor is used, all fields should be set.

    - Create a class that instantiates a phone bill and prints the itemized bill.
*/

public class PhoneBill {
    private static final double OVERAGE_RATE = 0.25;
    private static final double TAX_RATE = 0.15;

    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    public PhoneBill() {
        this.id = 0;
        this.baseCost = 0.0;
        this.allottedMinutes = 0;
        this.minutesUsed = 0;
    }

    public PhoneBill(int id) {
        this.id = id;
        this.baseCost = 0.0;
        this.allottedMinutes = 0;
        this.minutesUsed = 0;
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;

    }

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(int baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public double getOverageMinutes() {
        return minutesUsed - allottedMinutes;
    }

    public boolean isOverLimit() {
        return getOverageMinutes() > allottedMinutes;
    }

    private double calculateOverageFee() {
        int extraMinutes = Math.max(0, minutesUsed - allottedMinutes);
        return extraMinutes * OVERAGE_RATE;
    }

    private double calculateTax(double subtotal) {
        return subtotal * TAX_RATE;
    }

    public double calculateTotal() {
        double overageFee = calculateOverageFee();
        double subtotal = baseCost + overageFee;
        double tax = calculateTax(subtotal);
        return subtotal + tax;
    }

    public  void printBill() {
        double overageFee = calculateOverageFee();
        double subtotal = baseCost + overageFee;
        double tax = calculateTax(subtotal);
        double total = calculateTotal();

        System.out.println("\n--- Itemized Phone Bill ---");
        System.out.printf("Customer ID: %d%n", id);
        System.out.printf("Plan Fee: $%.2f%n", baseCost);
        System.out.printf("Allotted Minutes: %d%n", allottedMinutes);
        System.out.printf("Minutes Used: %d%n", minutesUsed);
        System.out.printf("Overage Fee: $%.2f%n", overageFee);
        System.out.printf("Tax (15%%): $%.2f%n", tax);
        System.out.printf("Total Bill: $%.2f%n", total);
    }

}
