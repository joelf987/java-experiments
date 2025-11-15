package org.jf.uni.week2;

public class Lease {
    private String tenantName;
    private int apartmentNum;
    private double monthlyRent;
    private int leaseLength;

    public Lease() {
        this.tenantName = "XXX";
        this.apartmentNum = 0;
        this.monthlyRent = 1000;
        this.leaseLength = 12;

    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getTenantName() {
        return tenantName;
    }

    public int getApartmentNum() {
        return apartmentNum;
    }

    public void setApartmentNum(int apartmentNum) {
        this.apartmentNum = apartmentNum;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public int getLeaseLength() {
        return leaseLength;
    }

    public void setLeaseLength(int leaseLength) {
        this.leaseLength = leaseLength;
    }

    @Override
    public String toString() {
        return "Lease{" +
                "tenantName='" + tenantName + '\'' +
                ", apartmentNum=" + apartmentNum +
                ", monthlyRent=" + monthlyRent +
                ", leaseLength=" + leaseLength +
                '}';
    }

    public static String explainPetPolicy(){
        return "A pet fee of $10 is added to monthly rent";
    }

    public void addPetFee(){
        this.monthlyRent += 10;
        String s = explainPetPolicy();
    }


}
