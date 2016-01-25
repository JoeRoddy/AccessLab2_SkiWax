package HandheldWaxPC;
import java.util.Scanner;

public class Handheld {
    private int temperature;
    private String condition;

    Handheld(){
        temperature=promptForTemp("Please enter the expected temperature for your trip (deg. F): ");
        condition=promptForCondition("What are the expected conditions?  Powder(p), Firm(f), or Crusty(c)? ");
        Wax suggestion = Handheld.suggestWax(temperature,condition);
        printWax(suggestion);
        System.out.println("Good luck out there Johnny Tsunami.  Always remember: keep them tips up..");
    }

    public static Wax suggestWax(int temp,String condition){
        String color;
        String variety;

        //Variety Suggestion Logic:
        if (temp>38||temp<=5){
            variety="Standard";
        }
        else{
            if(condition.equals("p")||condition.equals("Powder")||condition.equals("powder")){
                variety="Special";
            }
            else if(condition.equals("c")||condition.equals("Crusty")||condition.equals("crusty")){
                variety="Extra";
            }
            else {variety="Standard";}
        }

        //Color Suggestion Logic:
        if (temp>38){color="Yellow";}
        else if(temp>31){color="Red";}
        else if(temp>26){color="Violet";}
        else if(temp>18){color="Blue";}
        else if(temp>5){color="Green";}
        else{color="White";}

        Wax waxSuggested=new Wax(color,variety);
        return waxSuggested;
    }

    private int promptForTemp(String message){
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        int userInput = scan.nextInt();
        return userInput;
    }

    private String promptForCondition(String message){
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        String userInput = scan.next();
        while (!userInput.equals("p")&&!userInput.equals("Powder")&&!userInput.equals("f")&&!userInput.equals("Firm")
                &&!userInput.equals("c")&&!userInput.equals("Crusty")){
            System.out.println("Please enter a valid condition (ie: 'Crusty', 'c', etc.)");
            userInput=scan.next();
        }
        return userInput;
    }

    public static void printWax(Wax waxToPrint){
        System.out.println("Suggested wax color: "+ waxToPrint.getColor());
        System.out.println("Suggested variety:   "+ waxToPrint.getVariety());
    }
}
