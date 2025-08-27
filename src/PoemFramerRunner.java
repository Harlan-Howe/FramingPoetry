import java.util.Scanner;

public class PoemFramerRunner
{
    public static void main(String[] args)
    {
        PoemFramer pf = new PoemFramer();

        // Here are the various things you should write, building to the final framed poem. Once you have that working,
        //   you can comment out lines 12-26.
        pf.printNumberOfLines();
        System.out.println("\n...................................\n");

        pf.printLocationsOfSlashes();
        System.out.println("\n...................................\n");

        pf.printLengthsOfLines();
        System.out.println("\n...................................\n");

        int maxLength = pf.findLongestLine();
        System.out.println("Max length: "+maxLength);
        System.out.println("\n...................................\n");

        pf.printTopOrBottomOfFrame(maxLength);
        System.out.println("\n...................................\n");

        pf.printPoem();

    }

}
