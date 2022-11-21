import java.util.Scanner;
public class SafeInput
{




    public static int getRangedInt(Scanner in, String prompt, int low, int high) {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + " [" + low + " - " + high + "] : ");
            if (in.hasNextInt()) {
                retVal = in.nextInt();
                in.nextLine();
                if (retVal >= low && retVal <= high) {
                    System.out.println("\nYou said that your number is " + retVal);
                    done = true;
                } else {
                    System.out.println("You said that your number is, " + retVal + " but that is out of the range of [" + low + " - " + high + "]");
                }
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number. Please enter a valid number, next time.");
            }
        } while (!done);

        return retVal;
    }


    public static int getInt(Scanner in, String prompt) {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (in.hasNextInt()) {
                retVal = in.nextInt();
                in.nextLine();
                done = true;
            } else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number. Please enter a valid number, next time.");
            }
        } while (!done);

        return retVal;


    }


    public static double getDouble(Scanner in, String prompt) {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (in.hasNextDouble()) {
                retVal = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + "is not a valid number. Please enter a valid number, next time.");
            }
        } while (!done);

        return retVal;
    }


    public static double getRangedDouble(Scanner in, String prompt, double low, double high) {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "] : ");
            if (in.hasNextDouble())
            {
                retVal = in.nextDouble();
                in.nextLine();
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else
                {
                    System.out.println("You said your number is " + retVal + " but that is out of the range! [" + low + " - " + high + "]");
                }
            } else
            {
                trash = in.nextLine();

                System.out.println(trash + " is not a valid number. Please enter a valid number, next time.");

            }

        }
        while (!done);



        return retVal;
    }


    public static String getNonZeroLength(Scanner in, String prompt)
    {
        String retVal = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + ": ");
            retVal = in.nextLine();
            if (retVal.length() > 0)
            {


                done = true;
            } else {
                System.out.println("It is required that you enter at least 1 character.");
            }
            return retVal;
        } while (!done);
    }


    public static boolean getYNConfirm(Scanner in, String prompt)
    {
        String respondYN="";
        boolean retVal = false;
        boolean done=false;

        do
        {
            System.out.println(prompt + ": ");
            respondYN = in.nextLine();

            if(respondYN.equalsIgnoreCase("Y"))
            {
                retVal=true;
                done=true;
            }else if(respondYN.equalsIgnoreCase("N"))
            {
                retVal=false;
                done=true;
            }else
            {
                System.out.println("You must enter Y for Yes or N for No");
            }
        }while (!done);
        return retVal;
    }


    public static String getRegExString(Scanner in, String prompt, String pattern)
    {
        String retVal="";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            retVal = in.nextLine();

            if (retVal.matches(pattern))
            {
                done = true;
            }
            else {
                System.out.println("What you entered does not match the pattern. This is the pattern: " + pattern);
            }
        }while (!done);
        return retVal;
    }



    public static String prettyHeader(String msg)
    {
        Scanner console = new Scanner(System.in);

        int space_taken = (60-6) - msg.length();

        for(int i=1; i <=60; i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int i=1; i<=3; i++)
        {

            System.out.print("*");
        }
        for(int i = 1; i<=space_taken/2; i++)
        {
            System.out.print(" ");
        }
        System.out.print(msg);
        if(msg.length() % 2 >0) {
            for (int i = 1; i <= (space_taken/2)+1; i++)
            {
                System.out.print(" ");
            }
        }
        for(int i=1; i<=3; i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int i=1; i <=60; i++)
        {
            System.out.print("*");
        }
        return msg;
    }

}