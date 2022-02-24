/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import addressbook.Controller.AddressBook;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kubrabas
 */
public class addressBookView {

    private static Scanner input = new Scanner(System.in);
    
    public static String getAddress() {

        System.out.println("Please enter a new address");
        String address = input.nextLine();
        
        return address;

        
    }

    public static void displayAddressBook(ArrayList<String> addressBook) {

        System.out.println("Your address book contains the following listings:");
        for (String address : addressBook) {
            System.out.println(address);
        }

    }
    public static String getUserResponce(){
        
         System.out.println("Press 1 to enter another address or 0 to quit");
         String userAnswer = input.nextLine();
         return userAnswer;
    }
    

}
