import java.util.*;

public class GroceryList extends ListMenu implements MenuReturner {


    Scanner scanGrocery = new Scanner(System.in);
    Scanner scanStore = new Scanner(System.in);

    ArrayList Stores;
    ArrayList Groceries;


    GroceryList(){
        System.out.println();
        System.out.println("Constructor of GroceryList");
        System.out.println("You have created a GroceryList");
        System.out.println();
    }

    public void addGrocery() {
        System.out.println("Would you like to add a Grocery to the List?");
        if (scanGrocery.hasNext("yes")) {

        }
    }




    public void createGroceryList() {
        this.setStore();
        this.addGrocery();
    }

    public void setStore () {
        Stores = new ArrayList();
        System.out.println("Which stores do you want to go to?");
        Stores.add(scanStore.nextLine());
        System.out.println("You have selected to go to " + Stores);
        System.out.println();
    }


    @Override
    public void returnToMenu() {

    }
} //close class

