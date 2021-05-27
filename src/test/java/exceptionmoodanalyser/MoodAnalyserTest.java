package exceptionmoodanalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    public void givenMessage_Whensad_shouldReturnSad()  {

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is  message");

        Assertions.assertEquals("HAPPY", mood);
    }

}
