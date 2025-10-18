package org.jf.uni.week3;
import java.util.List;
import java.util.Scanner
;
import java.util.stream.Stream;

public class TestApartment {

    private static boolean selectApartment(Apartment apartment, int minRooms, int minBaths, int maxRent){
        boolean eligible = true;
        if (apartment.getNumOfRooms() < minRooms){
            eligible= false;
        }
        if (apartment.getNumOfBaths() < minBaths) {
            eligible = false;
        }
        if (apartment.getRent() > maxRent) {
            eligible = false;
        }

        return eligible;
    }

    public static void main(String[] args) {
        Apartment a1 = new Apartment(1, 3,2,12000);
        Apartment a2 = new Apartment(2, 1,1,8000);
        Apartment a3 = new Apartment(3, 2,2,10000);
        Apartment a4 = new Apartment(4, 2,1,9000);
        Apartment a5 = new Apartment(5, 4,2,18000);

        Scanner device = new Scanner(System.in);
        System.out.println("Enter min num of rooms");
        int numRooms = device.nextInt();
        System.out.println("Enter min num of baths");
        int numBaths = device.nextInt();
        System.out.println("Enter max rent");
        int rent = device.nextInt();

        List<Apartment> list = Stream.of(a1, a2, a3, a4, a5)
                .filter(apartment -> selectApartment(apartment, numRooms, numBaths, rent))
                .toList();

        System.out.println("These apartments meet your requirements");
        System.out.println(list);
    }
}
