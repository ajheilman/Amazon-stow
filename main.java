import java.util.ArrayList;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        //Creating the array list that includes all tote objects, includes dropped totes as well
        ArrayList<tote> allTotes = new ArrayList<tote>();
        
        //Creating the array list that includes all tote objects that user will add
        ArrayList<tote> addedTotes = new ArrayList<tote>();
        
        //Creating the item sizes for the pod sizes
        int[] small = {6, 9}; // items go into the 6 and 9 bins
        int[] largeSmalls = {6, 9, 12}; // items go into the 6, 9, and 12 bins
        int[] mediums = {9, 12}; // items go into the 9 and 12 bins
        int[] mediums12 = {12};  // items go into the 12 bin
        int[] largeMediums = {12, 16, 18}; // items go into the 12, 16, and 18 bins
        int[] large = {16, 18}; // items go into the 16 and 18 bins
        
        // Creating a new tote, adding it to the 'allTotes' array list, and setting the tote name
        tote tote1 = new tote();
        allTotes.add(tote1);
        tote1.setName("tsX01");
        //Creating an item
        item book = new item();
        book.setItem("Lord of the Rings", largeSmalls, false, false);
        item book2 = book;
        //Adding an item to a tote
        tote1.addItem(book);
        tote1.addItem(book2);
        
        // Creating a new tote, adding it to the 'allTotes' array list, and setting the tote name
        tote tote2 = new tote();
        allTotes.add(tote2);
        tote2.setName("tsX02");
        //Creating an item
        item applePhoneCase = new item();
        applePhoneCase.setItem("Apple iPhone Case", small, false, false);
        //Adding an item to a tote
        tote2.addItem(applePhoneCase);
        //Adding an item to a tote 
        item book3 = book;
        tote2.addItem(book3);
        
        // Creating a new tote, adding it to the 'allTotes' array list, and setting the tote name
        tote tote3 = new tote();
        allTotes.add(tote3);
        tote3.setName("csXP01");
        //Creating moon lamp object
        item moonLamp = new item();
        moonLamp.setItem("Moon Lamp", mediums12, false, false);
        //Adding all moon lamps to tote
        tote3.addItem(moonLamp);
        item moonLamp2 = moonLamp;
        tote3.addItem(moonLamp2);
        item moonLamp3 = moonLamp;
        tote3.addItem(moonLamp3);
        item moonLamp4 = moonLamp;
        tote3.addItem(moonLamp4);
        item moonLamp5 = moonLamp;
        tote3.addItem(moonLamp5);
        item moonLamp6 = moonLamp;
        tote3.addItem(moonLamp6);
        
        // Creating a new tote, adding it to the 'allTotes' array list, and setting the tote name
        tote tote4 = new tote();
        allTotes.add(tote4);
        tote4.setName("csXP02");
        //Creating an item
        item starbucksCups = new item();
        starbucksCups.setItem("Starbucks Keurig Brewers (24 Count)", largeMediums, true, false);
        //Adding an item to a tote
        tote4.addItem(starbucksCups);
        
        // Creating a new tote, adding it to the 'allTotes' array list, and setting the tote name
        tote tote5 = new tote();
        allTotes.add(tote5);
        tote5.setName("tsX03");
        //Creating an item
        item monster = new item();
        monster.setItem("Monster drinks (12 Count)", largeMediums, true, true);
        item monster2 = monster;
        //Adding an item to a tote
        tote5.addItem(monster);
        tote5.addItem(monster2);
        
        // Printing how many items are in each container
        /*System.out.println(tote1.getName() + " has " + tote1.getNumOfItems() + " items.");
        System.out.println(tote2.getName() + " has " + tote2.getNumOfItems() + " items.");
        System.out.println(tote3.getName() + " has " + tote3.getNumOfItems() + " items.");
        System.out.println(tote4.getName() + " has " + tote4.getNumOfItems() + " items.");
        System.out.println(tote5.getName() + " has " + tote5.getNumOfItems() + " items.");*/
        
        // Printing what items are in each container
        /*System.out.println("Tote 1 has:");
        tote1.showItems();
        System.out.println();
        System.out.println("Tote 2 has:");
        tote2.showItems();
        System.out.println();
        System.out.println("Tote 3 has:");
        tote3.showItems();
        System.out.println();
        System.out.println("Tote 4 has:");
        tote4.showItems();
        System.out.println();
        System.out.println("Tote 5 has:");
        tote5.showItems();*/
        
        //Printing all items
        /*System.out.println("All items are:");
        for (int x = 0; x < allTotes.size(); x++){
            allTotes.get(x).showItems();
        }*/
        
        //Printing all items that are on the front sled
        /*System.out.println("All items that are on the front sled are:");
        for (int x = 0; x < addedTotes.size(); x++){
            addedTotes.get(x).showItems();
        }*/
        
        // creating pod objects
        pod sixInchPod = new pod(6, 12, 4);
        pod nineInchPod = new pod(9, 11, 4);
        pod twelveInchPod = new pod(12, 8, 3);
        pod sixteenInchPod = new pod(16, 6, 1);
        pod eightteenInchPod = new pod(18, 5, 1);
        
        
        // if item is heavy and user picked bottom 2 rows of pod
        /*boolean isTrue = false;
        for(int i = 0; i < book.numOfPodSize(); i++){
            if(book.podSize()[i] == sixInchPod.showPodSize()){
                isTrue = true;
            }
        }
        if(isTrue == true){
            System.out.println("IT CAN!!! :-)");
        }
        else{
            System.out.println("It can't :-(");
        }*/
        
        String command;
        int newCommand;
        boolean isTrue = true;
        Scanner keyboard = new Scanner(System.in);
        while(isTrue == true){
            try{
                menu();
                command = keyboard.next();
                if(command.matches("[0-9]+")){
                    newCommand = Integer.parseInt(command);
                }
                else{
                    throw new menuCommandException();
                }
                
                switch(newCommand){
                    case 1:
                        System.out.println();
                        
                        //Prints all the totes that are in the allTotes Arraylist, while also adding a number in front of each tote object
                        System.out.println("Type in a number to add to add that tote to the front sled.");
                        int i = 1;
                        for (tote each : allTotes) {
                            System.out.println((i++) + ". " + each.getName());
                        }
                        
                        //Reads the user input
                        System.out.println();
                        int toteNum = keyboard.nextInt();
                        
                        //If user input is between 0 and the size of the allTotes arraylist, the tote object will: get added to the addedTotes Arraylist, print that the tote was added to the addedTotes Arraylist, and removed from the allTotes Arraylist
                        if(toteNum > 0 && toteNum <= allTotes.size()){
                            System.out.println();
                            addedTotes.add(allTotes.get(toteNum - 1));
                            System.out.println(allTotes.get(toteNum - 1).getName() + " was added to the front sled.");
                            allTotes.remove(toteNum - 1);
                        }
                        //If user input isn't in the allTotes arrylist, it will print an error message and go to the main menu
                        else{
                            System.out.println("You DID NOT type a legit number!");
                        }
                        
                        System.out.println();
                        break;
                        
                    //Prints out all of the tote objects that are in the addedTotes Arraylist
                    case 2:
                        System.out.println();
                        
                        //If the addedTotes arraylist size is >= 1, it prints out all of the tote objects
                        if(addedTotes.size() > 0){
                            //Displays how many totes have been added
                            if(addedTotes.size() == 1){
                                System.out.println("There is " + addedTotes.size() + " tote on the front sled:");
                            }
                            else{
                                System.out.println("There are " + addedTotes.size() + " totes on the front sled:");
                            }
                            
                            //Names the totes in the addedTotes arraylist
                            for (tote each : addedTotes) {
                                System.out.println(each.getName());
                            }
                        }
                        //If the addedTotes arraylist size is equal to 0, it prints out that no totes have been added and goes back to the main menu
                        else{
                            System.out.println("These are no totes in the front sled.");
                        }
                        System.out.println();
                        break;
                        
                    //Displays the number of items are in each case
                    case 3:
                        System.out.println();
                        
                        //If the addedTotes arraylist size is >= 1, it prints out the number of items in each tote
                        if(addedTotes.size() > 0){
                            System.out.println("All items that are on the front sled are:");
                            for (int x = 0; x < addedTotes.size(); x++){
                                System.out.println(addedTotes.get(x).getName() + " has " + addedTotes.get(x).getNumOfItems() + " items.");
                            }
                        }
                        //If the addedTotes arraylist size is equal to 0, it prints out that no totes have been added and goes back to the main menu
                        else{
                            System.out.println("No totes have been added to the front sled.");
                        }
                        
                        System.out.println();
                        
                        break;
                    
                    //Displays the item names that are in the addedTotes arraylist
                    case 4:
                        System.out.println();
                        
                        //If the addedTotes arraylist size is >= 1, it prints each item name
                        if(addedTotes.size() > 0){
                            System.out.println("All items that are on the front sled are:");
                            for (int x = 0; x < addedTotes.size(); x++){
                                addedTotes.get(x).showItems();
                            }
                        }
                        //If the addedTotes arraylist size is equal to 0, it prints out that no totes have been added and goes back to the main menu
                        else{
                            System.out.println("No totes have been added to the front sled.");
                        }
                        
                        System.out.println();
                        
                        break;
                    
                    //Drops a tote from the addedTotes arraylist and adds it to the allTotes arraylist
                    case 5:
                        System.out.println();
                        
                        //If the addedTotes arraylist size is >= 1
                        if(addedTotes.size() > 0){
                            System.out.println("Select which tote you would like to be dropped from the front sled:");
                            
                            //Displays a menu of the totes that user wants to drop
                            int j = 1;//j is equal to ONE, not the letter
                            for (tote each : addedTotes) {
                                System.out.println((j++) + ". " + each.getName());
                            }
                            
                            //Reads the user input
                            System.out.println();
                            int num = keyboard.nextInt();

                            //If user input is between 0 and the allTotes size, the tote object will: get added to allTotes Arraylist, print that the tote was added to the allTotes Arraylist, and removed from the addedTotes Arraylist
                            if(num > 0 && num <= addedTotes.size()){
                                System.out.println();
                                System.out.println(addedTotes.get(num - 1).getName() + " was dropped from the front sled.");
                                addedTotes.remove(num - 1);
                                //allTotes.add(num - 1);
                            }
                            else{
                                System.out.println("You DID NOT type a legit number!");
                            }
                        }
                        //If the addedTotes arraylist size is equal to 0, it prints out that no totes have been added and goes back to the main menu
                        else{
                            System.out.println("No totes have been added to the front sled. So none can be dropped.");
                        }
                        
                        System.out.println();
                        
                        break;
                        
                    //Empties a tote
                    case 6:
                        System.out.println();
                        
                        //If the addedTotes arraylist size is > 0
                        if(addedTotes.size() > 0){
                            System.out.println("Type in a number to empty that tote, and have it removed from the front sled.");
                            System.out.println("Emptying a tote will also remove it from the front sled so make sure tote is empty!");
                            
                            //Displays a menu of the totes that user wants to empty
                            int x = 1;
                            for (tote each : addedTotes) {
                                System.out.println((x++) + ". " + each.getName() + " has " + each.getNumOfItems() + " items.");
                            }
                            
                            //Reads the user input
                            System.out.println();
                            int emptyTote = keyboard.nextInt();

                            //If user input is between 0 and the allTotes size, the tote object will: get added to addedTotes Arraylist, print that the tote was added to the addedTotes Arraylist, and removed from the allTotes Arraylist
                            if(emptyTote <= addedTotes.size()){
                                System.out.println();
                                addedTotes.get(emptyTote - 1).emptyTote();
                                addedTotes.remove(emptyTote - 1);
                            }
                            else{
                                System.out.println("You DID NOT type a legit number!");
                            }
                        }
                        //If the addedTotes arraylist size is equal to 0, it prints out that no totes have been added and goes back to the main menu
                        else{
                            System.out.println("No totes have been added to the front sled.");
                        }
                        
                        System.out.println();
                        
                        break;
                        
                    //Adds an item to a pod
                    case 7:
                        System.out.println();
                        
                        if(addedTotes.size() > 0){
                            System.out.println("All items that are on the front sled are:");
                            for (int x = 0; x < addedTotes.size(); x++){
                                addedTotes.get(x).showItems();
                            }
                        }
                        else{
                            System.out.println("No totes have been added to the front sled.");
                        }
                        
                        System.out.println();
                        break;
                        
                    //Exits the program
                    case 8:
                        isTrue = false;
                        break;
                        
                    default:
                        System.out.println("Something went wrong!");
                        System.exit(0);
                }
                        
            }
            catch (menuCommandException e){
                System.out.println(e.getMessage());
            }
            
        }// end of while
        
        System.out.println("You have exited the program.");
    }// end of main
    
    public static void menu(){
        System.out.println("Enter a number to do the corresponding action:");
        System.out.println("1. add tote to front sled");
        System.out.println("2. view totes (in front sled)");
        System.out.println("3. number of items in each tote (in front sled)");
        System.out.println("4. see items (in front sled)");
        System.out.println("5. drop a tote");
        System.out.println("6. empty tote");
        //System.out.println("7. add item to pod");
        System.out.println("8. exit");
    }
}
