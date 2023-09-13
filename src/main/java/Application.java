import com.biradarcoders.interfaces.Printable;
import com.biradarcoders.services.ConsoleInput;
import com.biradarcoders.services.ConsoleOutput;
import java.util.InputMismatchException;

public class Application {


    public static void main(String[] args) {

        // Simple first java program to prints data on console
        Printable.print("Hello, World.");
        Printable.printNextLine("Welcome to Java !!");

        try{
            // Take User Integer Input & Print
            ConsoleInput.getInt();
            ConsoleOutput.printInt();

            // Take User One String Input & Print
            ConsoleInput.getString();
            ConsoleOutput.printString();

            // Take User String Line Input & Print
            ConsoleInput.getStringLine();
            ConsoleOutput.printStringLine();

        } catch (InputMismatchException inputMismatchException){
            inputMismatchException.printStackTrace();
            System.out.println("Hey Boss !! Kindly Enter Correct Value ...rerun....");
        } finally {
            System.out.println("Good Bye !!!!!");
        }

    }
}
