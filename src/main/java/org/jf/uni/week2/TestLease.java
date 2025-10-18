package org.jf.uni.week2;
import java.util.Scanner;

public class TestLease {
    public static void main(String[] args) {
        Lease lease1 = getData();
        Lease lease2 = getData();
        Lease lease3 = getData();
        Lease lease4 = new Lease();

        System.out.println(showData(lease1));
        lease1.addPetFee();
        System.out.println(showData(lease1));

        System.out.println(showData(lease2));
        System.out.println(showData(lease3));
        System.out.println(showData(lease4));
    }

    private static Lease getData() {
        Lease lease = new Lease();
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter the tenant name");
        String tenantName = inputDevice.nextLine();
        lease.setTenantName(tenantName);
        System.out.println("Enter apartment number");
        int apartmentNumber = Integer.parseInt(inputDevice.nextLine());
        lease.setApartmentNum(apartmentNumber);
        System.out.println("Enter the monthly rent");
        double monthlyRent = Double.parseDouble(inputDevice.nextLine());
        lease.setMonthlyRent(monthlyRent);
        System.out.println("Enter the lease term");
        int leaseTerm = Integer.parseInt(inputDevice.nextLine());
        lease.setLeaseLength(leaseTerm);
        return lease;
    }

    private static String showData(Lease lease){
        return lease.toString();
    }


}
