package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMaps {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> map = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */


        Map<String, List<String>> map = new HashMap<>();

        List<String> listOfStateOfUSA = new ArrayList<>();
        List<String> listOfStateOfCanada = new ArrayList<>();

        listOfStateOfCanada.add("Ontario");
        listOfStateOfCanada.add("Toronto");
        listOfStateOfUSA.add("New York");
        listOfStateOfUSA.add("New Jersey");

        map.put("USA", listOfStateOfUSA);
        map.put("CANADA", listOfStateOfCanada);

        System.out.println(map.size());

        System.out.println(map);
    }

}