import java.util.Scanner;

public class PoemFramer
{

    private final String poemSource;

    public PoemFramer()
    {
        Scanner keyReader = new Scanner(System.in);
        System.out.println("Enter a poem you would like me to frame, with \"/\" separating the lines:");
        poemSource = keyReader.nextLine();
        System.out.println("You entered\"" + poemSource + "\"");
    }

    /**
     * prints the number of lines in this poem. For instance, if the poem is
     * "Silent code, keys click/Java's dance of logic flows/Mind weaves, bytes align."
     * This method should print "3".
     */
    public void printNumberOfLines()
    {
        int numLines = -1; // obviously the wrong answer...
        System.out.println("printNumberOfLines: Not written yet."); // delete this when it is no longer true.
        // TODO: write this method to update the "numLines" variable. It will require a loop.
        //hint: how do the number of slashes and the number of lines in the poem relate to one another?

        System.out.println("There are " + numLines + " lines in this poem.");
    }

    /**
     * prints out the index values of the locations of the "/" marks in the poem. For instance, if the poem is
     * "Silent code, keys click/Java's dance of logic flows/Mind weaves, bytes align."
     * then this will print
     * 23
     * 51
     */
    public void printLocationsOfSlashes()
    {
        System.out.println("printLocationsOfSlashes: Not written yet."); // delete this when it is no longer true.
        // TODO: Write this method. It will require a loop. Yes, this will be similar to the previous method.

    }

    /**
     * prints out the length of each line in the poem. For instance, if the poem is
     * "Silent code, keys click/Java's dance of logic flows/Mind weaves, bytes align."
     * then this will print
     * 23
     * 27
     * 25
     */
    public void printLengthsOfLines()
    {
        System.out.println("printLengthsOfLines: Not written yet."); // delete this when it is no longer true.
        // TODO: Write this method. It will require a loop. Yes, this will be similar to the previous method.

    }

    /**
     * finds the length of the longest line in this poem. For instance, if the poem is
     * "Silent code, keys click/Java's dance of logic flows/Mind weaves, bytes align."
     * then this will print
     * "Longest line found: 27"
     * and return 27.
     * @return - the number of characters in the longest line of the poem.
     */
    public int findLongestLine()
    {
        int longestLine = 0;
        System.out.println("findLongestLine: Not written yet."); // delete this when it is no longer true.
        // TODO: write this method to set the value of longestLine. It will require a loop. Yes this will be similar
        //  to the previous method.

        System.out.println("Longest line found: " + longestLine + ".");
        return longestLine;
    }

    /**
     * prints a string in the format of "+--------+" with enough dashes to enclose the longest line of the poem.
     * @param longestLineLength - the number of characters in the longest line of the poem.
     */
    public void printTopOrBottomOfFrame(int longestLineLength)
    {
        System.out.println("printTopOrBottomOfFrame: Not written yet."); // delete this when it is no longer true.
        // TODO: write this method. It will require a loop.

    }

    /**
     * prints the framed poem.
     */
    public void printPoem()
    {
        System.out.println("printPoem: Not written yet.");
        // TODO: write this method. I recommend that you make use of findLongestLine() and printTopOrBottomOfFrame()
        //   (call these two methods; don't reinvent them.)

    }
}
