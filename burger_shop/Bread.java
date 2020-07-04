package burger_shop;

import java.util.HashMap;
import java.util.Scanner;

public class Bread {
    String Breadname;
    boolean bchoice= true;
    int breadchoice;

    private Scanner scanner = new Scanner(System.in);


    public Bread()
    {

    }
    public void setBread(String breadname)
    {
        this.Breadname = breadname;
    }
    public String getBread()
    {
        return this.Breadname;
    }

    public void DisplayBreadTypeOptions(){
        System.out.println(" Bread  Options \n" +
                "1. White \n" +
                "2. Brown  \n"+
                "3. Wheat \n"+
                "4. Multi Grain \n"
        );
        while (bchoice)
        {
            System.out.println("Enter your Bread Type");
            breadchoice = scanner.nextInt();
            scanner.nextLine();


            if (breadchoice == 1 || breadchoice == 2 || breadchoice == 3 || breadchoice == 4)
            {
                bchoice = false;
                this.setBread(getBreadType(breadchoice));
            }
            else
            {
                System.out.println("Wrong bread type");
            }
        }
    }

    static String getBreadType(int choice)
    {
        String retBreadType = null;

        switch(choice)
        {
            case 1:
                retBreadType = "White";
                break;
            case 2:
                retBreadType = "Brown";
                break;
            case 3:
                retBreadType = "Wheat";
                break;
            case 4:
                retBreadType = "Multi Grain";
                break;
            default:
                break;
        }
        return  retBreadType;
    }
}
