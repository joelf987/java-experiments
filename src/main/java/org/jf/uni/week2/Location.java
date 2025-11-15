package org.jf.uni.week2;

public class Location {
    /* Attributes */
    private String name;
    private double xcoord;
    private double ycoord;

    /* Constructor method*/
    public Location(String name, double xcoord, double ycoord){
        this.name = name;
        this.xcoord = xcoord;
        this.ycoord = ycoord;


    }

    /* Get methods*/

    public String getName(){
        return this.name;
    }
    public double getXcoord(){
        return this.xcoord;
    }
    public double getYcoord(){
        return this.ycoord;
    }



    /* Set methods*/
    public void setName(String name){
        this.name = name;
    }
    public void setXcoord(double xcoord){
        this.xcoord = xcoord;
    }
    public void setYcoord(double ycoord){
        this.ycoord = ycoord;
    }

    public void setBothCoords(double xcoord, double ycoord){
        this.xcoord = xcoord;
        this.ycoord = ycoord;
    }

    public String toString(){
        return this.name + "(" + this.xcoord + "," + this.ycoord + ")";
    }

    public double distance(Location other){
        double xDiff = this.getXcoord() - other.getXcoord();
        double yDiff = this.getYcoord() - other.getYcoord();

        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }




    public static void main(String[] args) {
        Location uni = new Location("University", 2.45, 100.3);

        System.out.println(uni);
        System.out.println(uni.getName());

        uni.setName("University of Birmingham");
        System.out.println(uni.getName());

        uni.setXcoord(3.00);
        System.out.println(uni.getXcoord());

        uni.setYcoord(105.0);
        System.out.println(uni.getYcoord());

        uni.setBothCoords(3.05, 104.6);
        System.out.println(uni);


    }

}
