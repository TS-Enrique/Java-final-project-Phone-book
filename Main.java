import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        ArrayList<PhoneBook> phoneBook = new ArrayList<>();

        while(true){
            System.out.println("\n---Phone Book Menu---");
            System.out.println("1. Add entry");
            System.out.println("2. View all entries");
            System.out.println("3. Exit");
            System.out.print("Choice: ");

            String choice = userInput.nextLine();

            if(choice.equals("1")){
                try{
                    System.out.print("Name: ");
                    String name = userInput.nextLine();
                    System.out.print("Job: ");
                    String job = userInput.nextLine();
                    System.out.print("Area Code (3 digits): ");
                    int areaCode = Integer.parseInt(userInput.nextLine());
                    System.out.print("Phone Number (7 digits): ");
                    int digits = Integer.parseInt(userInput.nextLine()); 

                    phoneBook.add(new TexasPhoneBook(areaCode, digits, name, job));
                    System.out.println("Added successfully!");

                
                }
                catch (Exception e){
                    System.out.println("Error:  " + e.getMessage());
                }
            }
            else if(choice.equals("2")){
                    System.out.println("\nCurrent Records");
                    if(phoneBook.isEmpty()){
                        System.out.println("No records found");
                    }
                    for(PhoneBook p : phoneBook){
                        p.WhereFrom();
                    }

                }

            else if (choice.equals("3")){
                break;
            }

        }
        userInput.close();
    }
        
}
