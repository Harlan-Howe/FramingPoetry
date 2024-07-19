import java.util.Scanner;

public class PoemFramerRunner
{
    private Scanner keyReader;

    public void main()
    {
        keyReader = new Scanner(System.in);
        System.out.println("Enter a poem you would like me to frame, with \"/\" separating the lines:");
        String poemSource = keyReader.nextLine();
        System.out.println(STR."You entered\"\{poemSource}\"");

        // Here are the various things you should write, building to the final framed poem. Once you have that working,
        //   you can comment out lines 16-29.
        printNumberOfLines(poemSource);
        System.out.println("\n...................................\n");

        printLocationsOfSlashes(poemSource);
        System.out.println("\n...................................\n");

        printLengthsOfLines(poemSource);
        System.out.println("\n...................................\n");

        int maxLength = findLongestLine(poemSource);
        System.out.println("\n...................................\n");

        printTopOrBottomOfFrame(maxLength);
        System.out.println("\n...................................\n");

        printPoem(poemSource);

    }

    /**
     * prints the number of lines in this poem. For instance, if the poem is
     * "Silent code, keys click/Java's dance of logic flows/Mind weaves, bytes align."
     * This method should print "3".
     * @param poem - a string containing the poem to analyze.
     */
    public void printNumberOfLines(String poem)
    {
        int numLines = -1; // obviously the wrong answer...
        System.out.println("printNumberOfLines: Not written yet."); // delete this when it is no longer true.
        // TODO: write this method to update the "numLines" variable. It will require a loop.
        //hint: how do the number of slashes and the number of lines in the poem relate to one another?

        System.out.println(STR."There are \{numLines} lines in this poem.");
    }

    /**
     * prints out the index values of the locations of the "/" marks in the poem. For instance, if the poem is
     * "Silent code, keys click/Java's dance of logic flows/Mind weaves, bytes align."
     * then this will print
     * 23
     * 51
     * @param poem - a string containing the poem to analyze.
     */
    public void printLocationsOfSlashes(String poem)
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
     * @param poem - a string containing the poem to analyze.
     */
    public void printLengthsOfLines(String poem)
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
     * @param poem - a string containing the poem to analyze.
     * @return - the number of characters in the longest line of the poem.
     */
    public int findLongestLine(String poem)
    {
        int longestLine = 0;
        System.out.println("findLongestLine: Not written yet."); // delete this when it is no longer true.
        // TODO: write this method to set the value of longestLine. It will require a loop. Yes this will be similar
        //  to the previous method.

        System.out.println(STR."Longest line found: \{longestLine}.");
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
     * @param poem - a string containing the poem to analyze.
     */
    public void printPoem(String poem)
    {
        System.out.println("printPoem: Not written yet.");
        // TODO: write this method. I recommend that you make use of findLongestLine() and printTopOrBottomOfFrame()
        //   (call these two methods; don't reinvent them.)

    }
}
