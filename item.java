import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public class item {
    //isSimilar
    
    private String name;
    private static final AtomicInteger id = new AtomicInteger(100); 
    private int itemId;
    boolean heavy;
    boolean dontopen;
    String[] alerts = {"Similar items", "Don't open", "HEAVY"};
    private int[] podSize;
    
    public void setItem(String userName, int[] userPodSize, boolean userDontOpen, boolean userHeavy){
        name = userName;
        podSize = userPodSize;
        itemId = id.incrementAndGet();
        dontopen = userDontOpen;
        heavy = userHeavy;
    }
    
    public String showName(){
        return name;
    }
    
    public int showId(){
        return itemId;
    }
    
    public int[] podSize(){
        return podSize;
    }
    
    public int numOfPodSize(){
        int pods = 0;
        for(int i = 0; i < podSize.length; i++){
            pods++;
        }
        return pods;
    }
    
    public void dontOpen(){
        if(dontopen == true){
            System.out.println(alerts[1]);
        }
    }
    
    public void isHeavy(){
        if(heavy == true){
            System.out.println(alerts[2]);
        }
    }
}
