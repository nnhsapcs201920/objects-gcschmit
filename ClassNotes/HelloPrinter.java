
/**
 * Every Java program contains one or more classes (e.g., HelloPrinter).
 * 
 * In general, every source file (e.g., HelloPrinter.java) contains one class (e.g., HelloPrinter).
 * 
 * The source file name must match the class name.
 * 
 * By convention, class names start with an uppercase letter.
 *
 * @author gcschmit
 * @version 20 August 2019
 */
public class HelloPrinter
{
    /*
     * A class contains methods.
     * 
     * Most Java programs contain a class with a main method.
     * 
     * The main method is executed when the program starts.
     */
    public static void main(String[] args)
    {
        /*
         * A method contains statements.
         * 
         * Statements may invoke other methods (e.g., println).
         * 
         * In general, methods are invoked on objects (e.g., System.out).
         * 
         * When invoking a method, arguments are passed in parentheses (e.g., "Hello, World!").
         */
        System.out.println("Hello, World!");    // comment at the end of a line

        // this is a single-line comment (like # python)

        /*
         * Identifiers are any combination of:
         *      letters
         *      digits (but not as the first character)
         *      underscores (_)
         *      dollar signs ($)
         *  
         *  These are various identifiers:
         */
        int y, x2, x_y, x$;

        // This is not a valid identifier:
        //int 2y;

        /*
         * Identifiers are case sensitive (case matters).
         * 
         * These are three different identifiers:
         */
        String box, BOX, bOx;

        /*
         * By convention, constants are all uppercase. Use an underscore to separate words.
         */
        int SPEED_OF_LIGHT = 300000000; // m/s

        /*
         * By convention, most other identifiers start with a lowercase letter.
         *      Subsequent words start with an uppercase letter. (CamalCase)
         */
        String firstName;
    }
}



