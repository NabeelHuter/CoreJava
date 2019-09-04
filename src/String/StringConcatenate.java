package String;

public class StringPractice1 {

    public static void main(String [] args){
        //a+b+c
        String a = "people";
        String b = "and";
        String c = "tech";
        System.out.println(a+b+c);

        //concat
        String x = "Rock";
        String y = "star";

        String z = x.concat(y);
        System.out.println(z);

        //StringBuilder

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rock");
        stringBuilder.append("star");
        System.out.println(stringBuilder);

        String numbers = "";

        StringBuilder stringBuilder2 = new StringBuilder();
        for(int i=0;i<5;i++){
            stringBuilder2.append(i);
        }
        System.out.println(stringBuilder);


    }
}
