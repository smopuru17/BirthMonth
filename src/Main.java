import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int month = 0;
        int intTrash = 0;
        String trash = "";
        System.out.print("Please enter your birthday number: ");

        if (in.hasNextInt()) {
            month = in.nextInt();
            if (month == 1) {
                System.out.println("Your birthday month is January ");
            } else if (month == 2) {
                System.out.println("Your birthday month is February ");
            } else if (month == 3) {
                System.out.println("Your birthday month is March ");
            } else if (month == 4) {
                System.out.println("Your birthday month is April ");
            } else if (month == 5) {
                System.out.println("Your birthday month is May ");
            } else if (month == 6) {
                System.out.println("Your birthday month is June ");
            } else if (month == 7) {
                System.out.println("Your birthday month is July ");
        }  else if (month == 8) {
                 System.out.println("Your birthday month is August ");
        }  else if (month == 9) {
            System.out.println("Your birthday month is September ");
        }  else if (month == 10) {
            System.out.println("Your birthday month is October");
            }  else if (month == 11) {
                System.out.println("Your birthday month is November");
            }  else if (month == 12){
                    System.out.println("Your birthday month is December");
                } else {
                System.out.println("You entered an incorrect month value: " + month);
            }

                        }





        else {
                trash = in.nextLine();
                System.out.println("You entered an incorrect month value: " + trash);
            }


        }
    }

