package org.jf.uni.week4;
import java.util.Random;

public class Population {
    /*
Write a class Population which has as attributes:
- a integer - size, as the size of the population
- an array of booleans - pop, one for each member of the population. This will
indicate if someone is infected or not
- a double - initial, which is the probability someone is infected at the start
- a double - recover, which is the probability that an infected person recovers
- a double - transmit, which is the probability of transmitting the disease
- a Random generator object - generator
*/
    private final int size;
    private final double initial;
    private final double recover;
    private final double transmit;
    private boolean[] pop;
    private final Random generator;
/*
Constructor
- The constructor should take in the population size and the three probabilities.
- It should allocate space for the array of booleans.
- It should create the random number generator.
- Then it should have a for-loop which makes each person infected according to the
initial probability.
*/
    public Population(int size, double initial, double recover, double transmit) {
        this.size = size;
        this.initial = initial;
        this.recover = recover;
        this.transmit = transmit;
        this.pop = new boolean[size];
        this.generator = new Random();
        for (int i = 0; i < size; i++) {
            pop[i] = (this.generator.nextDouble() < this.initial);
        }
    }
    /*
getInfections
- Write a getter called getInfections that counts up and returns the number of
infected people.
*/
    public int getInfections(){
        int count = 0;
        for (int i = 0; i < size; i++){
            if (pop[i]) {
                count++;
            }
        }
        return count;
    }

/*
toString
- The toString method should say how many people are infected (as a String).
*/
    public String toString(){
        return "number of infected people are: " + this.getInfections();
    }
/*
update
*/
    public void update(){
        boolean[] newpop = new boolean[size];
        for(int i =0; i < size; i++){
            if (pop[i]){
                newpop[i] = (generator.nextDouble() >= recover);
            }
            else {
                int j = generator.nextInt(size);
                if(pop[j]){
                    newpop[i] = (generator.nextDouble() < transmit);
                }
                else {
                    newpop[i] = false;
                }
            }
        }

        pop = newpop;
    }

    public static void main(String[] args) {
        int[] experiments = new int[100];
        for (int i = 0; i < 100; i++) {
            Population p = new Population(100, 0.25, 0.8, 0.5);
            System.out.println(p);
            int count = 0;
            while (p.getInfections() > 0 && count < 200) {
                p.update();
                count++;
            }
            //System.out.println(count);
            //        for (int i = 0; i < 100; i++){
            //            p.update();
            //        }
            //System.out.println(p);
            experiments[i] = count;
        }
        double cumulative = 0;
        for (int j = 0; j < 99; j++){
            cumulative = cumulative + experiments[j];
        }
        System.out.println("Average is: " + cumulative/100);
    }
}