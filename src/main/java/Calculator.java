import java.lang.reflect.Array;
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

    }

    public static void roomPaintVolume() {


        Scanner scanner = new Scanner(System.in);

        /*
        Create two array lists that represent wall height and width
        Each index will represent the dimension for a singular wall
        */

        ArrayList<Double> wallHeightList = new ArrayList<>();
        ArrayList<Double> wallWidthList = new ArrayList<>();

        System.out.println("How many walls would you like to paint? (\"Input a number greater than zero\")");
        double numOfWalls = scanner.nextDouble();

        for (int i = 1; i <= numOfWalls; i++) {

            System.out.println("What is the height of the wall?");
            double wallHeight = scanner.nextDouble();
            wallHeightList.add(wallHeight);

            System.out.println("What is the width of the wall?");
            double wallWidth = scanner.nextDouble();
            wallWidthList.add(wallWidth);

        }

        /*
        Iterate through the array we created and at every index (wall), we will prompt the user to provide the number of
        objects that we do not want to paint per wall. In a For loop, create two arrays that represent the height and
        width of these objects for every wall that the user has specified.
         */

        for (int wallIndex=0; wallIndex < wallHeightList.size(); wallIndex++) {
            System.out.println("Are there areas of wall (number: " + wallIndex +") that you do not want to paint? E.g doors, windows and sockets");
            System.out.println("Type in \"Yes\" or \"No\"");
            String excludeAnswer = scanner.nextLine();

            if (excludeAnswer.equalsIgnoreCase("Yes")) {

                System.out.println("How many different objects do you want to exclude from painting on this wall?");
                double numOfObjects = scanner.nextDouble();

                

                for (int i = 1; i <= numOfObjects; i++) {

                    System.out.println("What is the height of this object?");
                    double objectHeight = scanner.nextDouble();
                    System.out.println("What is the width of this object?");
                    double objectWidth = scanner.nextDouble();


                }
            }
        }
















    }

















}
