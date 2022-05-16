import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Calculator Initialised!");
        System.out.println("Use metres as a measurement of length and litres for volume");


        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> wallAreaList = new ArrayList<>();

        System.out.println("How many walls would you like to paint? (\"Input a number greater than zero\")");
        double numOfWalls = scanner.nextDouble();

        for (int wall = 0; wall < numOfWalls; wall++) {

            System.out.println("What is the height of the wall?");
            double wallHeight = scanner.nextDouble();

            System.out.println("What is the width of the wall?");
            double wallWidth = scanner.nextDouble();

            double wallArea = wallHeight * wallWidth;
            wallAreaList.add(wallArea);
        }

        ArrayList<Double> objectAreaList = new ArrayList<>();

        for (int wallIndex=0; wallIndex < numOfWalls; wallIndex++) {

            System.out.println("How many different objects do you want to exclude from painting on wall number: " + (wallIndex+1) +"?");
            int numOfObjects = scanner.nextInt();
            if (numOfObjects>0) {
                for (int object = 0; object < numOfObjects; object++) {

                    System.out.println("What is the height of this object?");
                    double objectHeight = scanner.nextDouble();

                    System.out.println("What is the width of this object?");
                    double objectWidth = scanner.nextDouble();

                    double objectArea = objectHeight * objectWidth;
                    objectAreaList.add(object, objectArea);

                }
            }
        }

        ArrayList<Double> finalAreaList = new ArrayList<>();
        double totalFinalArea = 0;

        for (int wall=0; wall < numOfWalls; wall++ ) {
            double finalArea = wallAreaList.get(wall) - objectAreaList.get(wall);
            finalAreaList.add(finalArea);
        }

        for (int wall=0; wall < numOfWalls; wall++ ) {
            totalFinalArea += finalAreaList.get(wall);
        }

        System.out.println("Area that needs to be painted: " + totalFinalArea);
        System.out.println("What is the volume of your paint bucket?");
        double bucketVolume = scanner.nextDouble();

        double paintVolume = totalFinalArea * 0.1;
        System.out.println("Volume of paint required: " + paintVolume);

        double bucket = Math.ceil(paintVolume/bucketVolume);
        System.out.println("Number of buckets required: " + bucket);
    }

















}
