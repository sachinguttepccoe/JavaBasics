import com.javabasics.services.JavaStdIO;
import com.javabasics.services.Welcome;

public class Application {
    public static void main(String[] args) {

        // Simple first java program to prints data on console  
           Welcome.displayMessage("Hello, World.");

        // standard input and output program with scanner
        JavaStdIO javaStdIOObj = new JavaStdIO(System.in, System.out);
        javaStdIOObj.displayScannerInput();
    }
}
