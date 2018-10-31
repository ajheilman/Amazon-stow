import java.util.ArrayList;
public class tote extends item{

    private String name;
    private ArrayList<item> toteObj;
    private int numOfItems = 0;
    
    public tote(){
        name = "No name yet.";
        toteObj = new ArrayList<item>();
    }

    public void setName(String n){
        name = n;
    }
    
    public void addItem(Object newItem){
        toteObj.add((item) newItem);
        numOfItems++;
    }
    
    public String getName(){
        return name;
    }
    
    public int getNumOfItems(){
        return numOfItems;
    }
    
    public void showItems(){
        if(toteObj.isEmpty() == false){
            for (item item : toteObj){
                System.out.println(item.showName());
            }
        }
    }
    
    public void emptyTote(){
        if(toteObj.isEmpty() == true){
            System.out.println(name + " is already empty.");
        }
        else{
            toteObj.clear();
            System.out.println(name + " has been emptied.");
        }
    }
}
