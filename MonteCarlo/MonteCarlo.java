import components.random.Random;
import components.random.Random1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Monte Carlo Estimate: Generate pseudo-random points in [0.0,2.0). Count the
 * interval that fall inside the circle of radius 1.0 centered at the point
 * (1.0, 1.0).
 *
 * @author - busgano.1
 */
public final class MonteCarlo {

    /**
     * Checks whether the given point (xCoord, yCoord) is inside the circle of
     * radius 1.0 centered at the point (1.0, 1.0).
     *
     * @param xCoord
     *            the x coordinate of the point
     * @param yCoord
     *            the y coordinate of the point
     * @return true if the point is inside the circle, false otherwise
     */

    private static boolean pointIsInCircle(double xCoord, double yCoord) {

        double radius = 1.0;
        boolean test = false;

        /*
         * Distance formula for Circle
         */

        if (Math.sqrt((xCoord - 1.0) * (xCoord - 1.0)
                + (yCoord - 1.0) * (yCoord - 1.0)) <= radius) {
            test = true;
        }
        return test;
    }

    /**
     * Generates n pseudo-random points in the [0.0,2.0) x [0.0,2.0) square and
     * returns the number that fall in the circle of radius 1.0 centered at the
     * point (1.0, 1.0).
     *
     * @param n
     *            the number of points to generate
     * @return the number of points that fall in the circle
     */

    private static int numberOfPointsInCircle(int n) {

        int counter = 0;
        Random generator = new Random1L();

        for (int i = 1; i <= n; i++) {

            /*
             * Generate two random numbers between 0.0 and 2.0
             */
            double x = 2 * generator.nextDouble();
            double y = 2 * generator.nextDouble();

            /*
             * Count how many are within the boundary
             */

            if (pointIsInCircle(x, y)) {
                counter++;
            }

        }

        return counter;
    }

    /**
     * Main method.
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
         * Open input and output streams
         */
        SimpleReader input = new SimpleReader1L();
        SimpleWriter output = new SimpleWriter1L();
        /*
         * Ask user for number of points to generate
         */
        output.print("Number of points: ");
        int n = input.nextInteger();

        output.println(
                "The number of points in circle: " + numberOfPointsInCircle(n));

        /*
         * Close input and output streams
         */
        input.close();
        output.close();
    }

}