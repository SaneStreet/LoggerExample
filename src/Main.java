import java.io.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Logging logThis = new Logging();
        logThis.logState();

        try {
            PrintStream myConsole = new PrintStream(new File("D:/IdeaProjects/LoggerExample/DroneLog.txt"));
            System.setOut(myConsole);
            //myConsole.print(logThis.setCurrState("Take Off"));
            myConsole.print(logThis.getCurrState());
            myConsole.print((logThis.getPrevState()));
        }
        catch (FileNotFoundException fx){
            System.out.println(fx);
        }
    }
}
