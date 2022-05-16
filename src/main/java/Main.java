import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Create a calculator app for a painter:
         * Size of the wall
         * What happens if there is things on the wall like a door or socket
         * How many paint buckets will I need to paint my wall
         * What happens if I have different bucket sizes
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator Initialised!");
        System.out.println("Use metres as a measurement of length and litres for volume");


        System.out.println("How many walls would you like to paint? (\"Input a number greater than zero\")");

        double numOfWalls = scanner.nextDouble();
        double totalWallArea = 0;

        for (int i = 1; i <= numOfWalls; i++) {

            System.out.println("What is the height of the wall?");
            double wallHeight = scanner.nextDouble();
            System.out.println("What is the width of the wall?");
            double wallWidth = scanner.nextDouble();

            totalWallArea = totalWallArea + (wallHeight * wallWidth);
        }

        System.out.println("Are there areas of the wall that you do not want to paint? E.g doors, windows and sockets");
        System.out.println("Type in \"Yes\" or \"No\"");
        String excludeAnswer = scanner.nextLine();

        double totalExcludeArea = 0;

        if (excludeAnswer.equalsIgnoreCase("Yes")) {

            System.out.println("How many different areas do you want to exclude from painting?");
            double numOfObjects = scanner.nextDouble();

            for (int i = 1; i <= numOfObjects; i++) {

                System.out.println("What is the height of this object?");
                double objectHeight = scanner.nextDouble();
                System.out.println("What is the width of this object?");
                double objectWidth = scanner.nextDouble();

                totalExcludeArea = totalExcludeArea + (objectHeight * objectWidth);
            }
        }

        System.out.println("How many coats of paint do you want to apply to the area?");
        int coat = scanner.nextInt();

        System.out.println("What is the volume of your paint bucket?");
        double bucketVolume = scanner.nextDouble();

        double finalArea = (totalWallArea - totalExcludeArea)*(coat*1.0);
        System.out.println("Area that needs to be painted: " + finalArea);

        double paintVolume = finalArea * 0.1;
        System.out.println("Volume of paint required: " + paintVolume);

        double bucket = Math.ceil(paintVolume/bucketVolume);
        System.out.println("Number of buckets required: " + bucket);


    }
}







