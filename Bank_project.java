
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Bank_project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        Random ra = new Random();
        int Amount = 0;
        String exit ="no";
        HashMap<Integer, String> data = new HashMap<Integer, String>();
        System.out.println("---------------------------------------");
        System.out.println("WELCOME TO THE ONLINE BANKING SYSTEM!🏦💸");
        System.out.println("---------------------------------------");
        while (exit.equals("no")){
            System.out.println("New customer 1!");
        System.out.println("existing customer 2!");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Name:");
                    String name = input.next();
                    int account_number = ra.nextInt(1000,100000);
                    data.put(account_number, name);
                    System.out.print("enter some amount you want to add more than 500 Rupees!:");
                    Amount += input.nextInt();
                    System.out.println("your Account sucessfully created 👍");
                    System.out.println("your Account Number is: " + account_number);

                    break;
                case 2:
                    System.out.println("enter your name");
                    String name1=input.next();
                    System.out.println("enter your account number");
                    int acc_num=input.nextInt();
                    if(data.get(acc_num).equals(name1)) {
                        System.out.println("Add money! (1)");
                        System.out.println("withdraw money(2):");
                        System.out.println("Enquery(3):");
                        int ch = input.nextInt();
                        switch (ch) {
                            case 1:
                                System.out.print("enter some amount you want to add!:");
                                Amount += input.nextInt();
                                break;
                            case 2:
                                System.out.print("enter some amount you want to withdraw!:");
                                int wit = input.nextInt();
                                if (wit < Amount) {
                                    Amount -= wit;
                                }else {
                                    System.out.print("enter valid amount⚠️:");

                                }
                                break;
                            case 3:
                                System.out.println("your current account balance is:" + Amount);

                        }
                    }
            }
            System.out.print("you want to exit the bank (yes) or (no):");
            exit = input.next();
            if(exit.equals("yes")){
                System.out.println("thanks for Visiting😊");
                break;
            }
        }
    }
}

