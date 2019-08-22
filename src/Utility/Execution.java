package Utility;
import java.io.IOException;
import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.InputStream;


public class Execution {
    public static void main(String[] args) {
        //for your understanding
        //Users/peoplentech/Documents/WeekDays-August/CoreJava/src/utility/information.txt
        String filepath = "src/utility/information.txt";

        String value = null;
        String value2 = null;
        Utility.DataReader dataReader = new Utility.DataReader();
        value = dataReader.readMyTextFile("src/test.txt");
        value2 = dataReader.readMyTextFile("src/utility/information.txt");
        System.out.println("value is : " + value);
        System.out.println("value 2 is : " + value2);

        System.out.println("*********** new Properties Reader*********");
        Properties properties1 = dataReader.getProperties("src/new.properties");

        System.out.println(properties1.getProperty("name"));
        System.out.println(properties1.getProperty("id"));

        System.out.println("*********** peopleNtech Properties Reader*********");
        Properties properties2 = dataReader.getProperties("src/utility/peopleNtech.properties");
        System.out.println(properties2.getProperty("year"));
        System.out.println(properties2.getProperty("date"));
        System.out.println(properties2.getProperty("subject"));


    }
}