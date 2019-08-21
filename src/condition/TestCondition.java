package condition;

public class TestCondition {


    public static void main(String[] args) {

        int a = 4;
        if (a > 3) {

            System.out.println("a is greater than 3");
        } else{
            System.out.println("a is less than 3");
        }

        int b =7;
        if (b > 5) {
            System.out.println("b is greater than 5");
        } else {
            System.out.println("b is less than 5");
        }
//&& -And
//| - Or
// ! - Not
        int s =10;
        int t = 12;

        if(s > 10 && t >12) {
            System.out.println("we won");
        } else if (s == 12 | t == 12){
            System.out.println("we lost");
        } else if( s!=12);{
            System.out.println("nothing");
        }


    }

}