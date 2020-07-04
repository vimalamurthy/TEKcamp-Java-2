package burger_shop;
import java.util.Scanner;

public class Meat {
    String Meatname;
    boolean mchoice = true;
    int meatchoice;
    private Scanner scanner = new Scanner(System.in);


    public void setMeat(String meatname)
    {
        this.Meatname = meatname;
    }
    public String getMeat()
    {
        return this.Meatname;
    }

    public void DisplayMeatOptions(){
        System.out.println(" Meat Options \n" +
                "1. Chicken \n" +
                "2. Beef  \n"+
                "3. Steak \n"
        );
        while (mchoice)
        {
            System.out.println("Enter your Meat Choice ");
            meatchoice = scanner.nextInt();
            scanner.nextLine();
            if (meatchoice == 1 || meatchoice == 2 || meatchoice == 3 || meatchoice == 4)
            {
                mchoice = false;
                this.setMeat(getMeatType(meatchoice));
            }
            else
            {
                System.out.println("wrong meat type");
            }
        }

    }
    static String getMeatType(int choice)
    {
        String retMeatType = null;

        switch(choice)
        {
            case 1:
                retMeatType = "Chicken";
                break;
            case 2:
                retMeatType = "Beef";
                break;
            case 3:
                retMeatType = "Steak";
                break;
            default:
                // code block
        }
        return  retMeatType;
    }

}
