package enumPractice;

public class Week {
    Days days;

    String name;

    public  Week(Days days){
        this.days = days;

    }
    public void whatToDo(){
        switch (days){
               case Saturday:
                  System.out.println("Today is saturday & i'm not working today");
               break;
               case Sunday:
                   System.out.println("Today is sunday & i'm going fishing");
                break;
                case Monday:
                case Tuesday:
                case Wednesday:
                case Thursday:
                case Friday:
                System.out.println("Today i'm going to work");
                break;
            default:
                System.out.println("Today i'm going to watch movies");
                break;
        }
    }
}
