package JavaPractice;

public class TestClassForSingleton {

    String x;

   private static TestClassForSingleton getTestClassForSingleton = null;

   private TestClassForSingleton(){
       x= "this is a singleton class";

    }
    //TestClassForSingleton testClassForSingleton = new TestClassForSingleton();
    public static TestClassForSingleton getInstance(){
       if(getTestClassForSingleton==null){
           getTestClassForSingleton = new TestClassForSingleton();
       }
       return getTestClassForSingleton;
    }

    String a = null;
   public void method1(){

   }

    public static class getInstance extends TestClassForSingleton {
    }
}
