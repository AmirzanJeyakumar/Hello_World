import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

         /*
           Create a calculator app for a painter:
         * Size of the wall
         * What happens if there is things on the wall like a door or socket
         * How many paint buckets will I need to paint my wall
         * What happens if I have different bucket sizes
         * Incorporate arrays: multiple walls with different doors, sockets etc.
         */

        System.out.println("Calculator Initialised!");
        System.out.println("Use metres as a measurement of length and litres for volume");


        Scanner scanner = new Scanner(System.in);

        /*
        Create two array lists that represent wall height and width
        Each index will represent the dimension for a singular wall
        */

        ArrayList<Double> wallHeightList = new ArrayList<>();
        ArrayList<Double> wallWidthList = new ArrayList<>();
        ArrayList<Double> wallAreaList = new ArrayList<>();


        System.out.println("How many walls would you like to paint? (\"Input a number greater than zero\")");
        double numOfWalls = scanner.nextDouble();


        for (int wall = 0; wall < numOfWalls; wall++) {

            System.out.println("What is the height of the wall?");
            double wallHeight = scanner.nextDouble();
            wallHeightList.add(wallHeight);

            System.out.println("What is the width of the wall?");
            double wallWidth = scanner.nextDouble();
            wallWidthList.add(wallWidth);

            double wallArea = wallHeight * wallWidth;
            wallAreaList.add(wallArea);

        }



        /*
        Iterate through the array we created and at every index (wall), we will prompt the user to provide the number of
        objects that we do not want to paint per wall. In a For loop, create two arrays that represent the height and
        width of these objects for every wall that the user has specified.
         */



        for (int wallIndex=0; wallIndex < wallAreaList.size(); wallIndex++) {
            System.out.println("Are there areas of wall (number: " + (wallIndex+1) +") that you do not want to paint? E.g doors, windows and sockets");
            System.out.println("Type in \"Yes\" or \"No\"");
            String excludeAnswer = scanner.nextLine();

            if (excludeAnswer.equalsIgnoreCase("Yes")) {

                System.out.println("How many different objects do you want to exclude from painting on this wall?");
                int numOfObjects = scanner.nextInt();

                double[] objectHeightList = new double[numOfObjects];
                double[] objectWidthList = new double[numOfObjects];
                double[] objectAreaList = new double[numOfObjects];


                for (int object = 0; object < numOfObjects; object++) {

                    System.out.println("What is the height of this object?");
                    double objectHeight = scanner.nextDouble();
                    objectHeightList[object] = objectHeight;


                    System.out.println("What is the width of this object?");
                    double objectWidth = scanner.nextDouble();
                    objectWidthList[object] = objectWidth;

                    double objectArea = objectHeight * objectWidth;

                    // (objectHeightList[object] * objectWidthList[object]);

                }
            }
        }
    }

















}
