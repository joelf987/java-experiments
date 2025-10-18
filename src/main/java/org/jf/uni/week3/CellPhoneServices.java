package org.jf.uni.week3;
import java.util.Scanner;

public class CellPhoneServices {
    private record Plan(int talkMinsUb, int textUb, int dataInGbUb, int price){
        static final int UNLIMITED = -1;

        private String prettyPrint(int integer){
            if (integer == -1){
                return "unlimited";
            }
            else{
                return "up to " + integer;
            }
        }

        @Override
        public String toString() {
            return "Plan{" +
                    "Talk time = " + prettyPrint(talkMinsUb) +
                    ", texts = " + prettyPrint(textUb) +
                    ", data = " + prettyPrint(dataInGbUb) +
                    ", price = $" + price +
                    '}';
        }
    }

    private Plan userPlan;

    private static final Plan PLAN_A = new Plan(500,0,0,49);
    private static final Plan PLAN_B = new Plan(500, Plan.UNLIMITED, 0, 55);
    private static final Plan PLAN_C = new Plan(Plan.UNLIMITED, 100, 0, 61);
    private static final Plan PLAN_D = new Plan(Plan.UNLIMITED, Plan.UNLIMITED, 0, 70);
    private static final Plan PLAN_E = new Plan(Plan.UNLIMITED, Plan.UNLIMITED, 3, 79);
    private static final Plan PLAN_F = new Plan(Plan.UNLIMITED, Plan.UNLIMITED, Plan.UNLIMITED, 87);

    public Plan choosePlan(int talkMins, int numOfTexts, int data){
        if (data == 0){
            if (talkMins <= 500){
                if (numOfTexts == -1){
                    return PLAN_B;
                }
                else{
                    return PLAN_A;
                }
            }
            else{
                if (numOfTexts <= 100){
                    return PLAN_C;
                }
                else{
                    return PLAN_D;
                }
            }
        } else if (data == 3) {
            return PLAN_E;
        }
        else{
            return PLAN_F;
        }
    }




    public static void main(String[] args) {
        Scanner device = new Scanner(System.in);
        System.out.println("Enter the number of talk minutes");
        int talkMins = device.nextInt();
        System.out.println("Enter the number of texts");
        int textNum = device.nextInt();
        System.out.println("Enter the data usage");
        int data = device.nextInt();

        Plan plan = new CellPhoneServices().choosePlan(talkMins, textNum, data);
        System.out.println("Recommended plan is: " + plan);


    }
}
