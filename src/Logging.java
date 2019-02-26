//imports
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Logging {

    String currState;
    String prevState;

    public String getPrevState() {
        return prevState;
    }

    public void setPrevState(String prevState) {
        this.prevState = prevState;
    }
    public String getCurrState() {
        return currState;
    }

    public void setCurrState(String currState) {
        this.currState = currState;
    }



    public String logState(){
        String currState = getCurrState();
        String prevState = getPrevState();
        Logger logger = Logger.getLogger("DroneLog");
        FileHandler fh;
        try {
            //configure logger, handler and formatter
            fh = new FileHandler("D:/IdeaProjects/LoggerExample/DroneLog.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            //statement to log messages
            logger.info(currState);
            logger.info(prevState);
        }

        catch (SecurityException e){
            e.printStackTrace();
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        return "States logged: " + prevState + " & " + currState;
    }


}
