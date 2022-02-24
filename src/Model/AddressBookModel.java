
package Model;

import java.util.ArrayList;

/**
 *
 * @author kubrabas
 */
public class AddressBookModel {
      private ArrayList<String> addressBook = new ArrayList<String>();

    public ArrayList<String> getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(ArrayList<String> addressBook) {
        this.addressBook = addressBook;
    }
}
