package chapter11;

import chapter10_2.RateIntf;

public class Tax {
    private long number;
    private String name;
    private int fee;

    public Tax(long number, String name, int fee) {
        this.number = number;
        this.name = name;
        this.fee = fee;
    }
    public int zeigaku(RateIntf r) {
        return (int) (fee * r.taxRate(fee));
    }

    public long getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Tax [number=" + number + ", name=" + name + "fee=" + fee + "]";
    }
}
