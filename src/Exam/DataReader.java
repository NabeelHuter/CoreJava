package Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class DataReader {

    public static void main(String[] args) throws IOException {
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         *
         * After reading from file using BufferedReader API, store each word into LinkedList & ArrayList
         * Use For Each loop/while loop/Iterator to retrieve data.
         */

        DataReader dataReader = new DataReader();
        String value = dataReader.readMyTextFile("src/test/questions.txt");


        ArrayList<String> list = new ArrayList<>();

        //option 1
        String[] values = value.split(" ");
        list.addAll(Arrays.asList(values));

        //option2
        list.addAll(Arrays.asList(value.split(" ")));

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

    public String readMyTextFile(String filePath) {
        String container;
        String finalText = null;
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((container = bufferedReader.readLine()) != null) {
                finalText = finalText + container;
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return finalText;
    }

}