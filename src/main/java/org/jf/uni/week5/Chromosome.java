package org.jf.uni.week5;
import java.util.Random;


public class Chromosome {
    private int size;
    private boolean[] gene;
    private final Random generator;

    public Chromosome(Random generator, int size) {
        this.generator = generator;
        this.size = size;
        this.gene = new boolean[size];

        for(int i = 0; i < size; i++){
            this.gene[i] = (generator.nextDouble() < 0.5);
        }

    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++){
            if (gene[i]){
                    result = result + "1";
            }
            else{
                result = result + "0";
            }
        }
        return result;
    }

    public void mutate(){
        int index = generator.nextInt(size);
        gene[index] =! gene[index];
    }

    public Chromosome copy(){
        Chromosome c1 = new Chromosome(generator, size);
        for (int i = 0; i < size; i++){
            c1.gene[i] = this.gene[i];
        }
        return c1;
    }

    public int fitness(){
        int count = 0;
        for (int i = 0; i < size; i++){
            if (gene[i]){
                count ++;
            }
        }
        return count;
    }
    public int leadingOnes(){
        int index = 0;
        while (index < size && gene[index]){
            index++;
        }
        return index;
    }

    public void mutate(double p){
        for (int i = 0; i < size; i++){
            if(generator.nextDouble() < p){
                gene[i] = !gene[i];
            }
        }

    }

    public int gap(){
        int count = 0;
        for (int i = 0; i < size; i++){
            if(gene[i]){
                count++;
            }
        }
        if(count == (size-1)){
            return 0;
        }
        else {
            return count;
        }
    }


    public static void main(String[] args) {
        Random generator = new Random();
        int length = 25;
        Chromosome x = new Chromosome(generator, length);
        System.out.println(x);
        System.out.println(x.fitness());
        System.out.println(x.leadingOnes());
        int count = 0;
        while ((x.fitness() < length) || count == 1000){
            Chromosome y = x.copy();
            y.mutate(1/ (double) length);
            if (y.gap() > x.gap()){
                x = y;
            }
            count++;
        }
        System.out.println(count);
    }
}
