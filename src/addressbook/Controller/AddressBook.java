package addressbook.Controller;

import View.addressBookView;
import Model.AddressBookModel;

/**
 * An application that allows users to enter in a friend's address and stores it 
 * in an "address book". It uses a model, a view and a controller.
 *
 * @author kubrabas
 */
public class AddressBook {

    public static void main(String[] args) {

        AddressBookModel addressBook = new AddressBookModel();
        
        
        boolean keepGoing = true;

        do {
            
           
            String address = addressBookView.getAddress();
            addressBook.getAddressBook().add(address);
            
            String userAnswer = addressBookView.getUserResponce();
           
            
            if (Integer.parseInt(userAnswer) != 1) {
                keepGoing = false;
            }
        } while (keepGoing);
      
        addressBookView.displayAddressBook(addressBook.getAddressBook());
    }

}
