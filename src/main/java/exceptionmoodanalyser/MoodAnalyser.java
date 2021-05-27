package exceptionmoodanalyser;

public class MoodAnalyser {
    public String analyseMood(String message) {
        //The Java if-else statement also tests the condition.
        // It executes the if block if condition is true otherwise else block is executed.
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }

}
