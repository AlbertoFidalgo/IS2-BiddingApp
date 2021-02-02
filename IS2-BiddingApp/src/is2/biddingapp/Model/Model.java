package is2.biddingapp.Model;

import java.util.ArrayList;
import java.util.Iterator;

public class Model {
    private ArrayList<User> users;
    private ArrayList<Item> items;
    
    public Model(){
        users = new ArrayList<User>();
        items = new ArrayList<Item>();
    }
    
    public ArrayList<User> getUsers(){
        return users;
    }
    
    public ArrayList<Item> getItems(){
        return items;
    }
    
    public void createUser(String name){
        User user = new User(name);
        users.add(user);
    }
    
    public void createItem(String name, int currentPrice, long creationDate, long timeRemaining, String username){
        User user = findUser(username);
        Item item = new Item(name, currentPrice, creationDate, timeRemaining, user);
        user.addItem(item);
        items.add(item);
        
    }
    
    public void createBid(User user, Item item){
        Bid bid = new Bid(user, item);
        user.addBid(bid);
        item.makeBid(bid);
    }
    
    public User findUser(String name){
        Iterator iterator = users.iterator();
        while(iterator.hasNext()){
            User useriterator = (User)iterator.next();
            if(name.equals(useriterator.getName())){
                return useriterator;
            }
            
        }
        return null;
    }
    
    public String[][] printItems(){
        Iterator iterator = items.iterator();
        String[][] data = new String[3][items.size()];
        int i = 0;
        while(iterator.hasNext()){
            Item item = (Item)iterator.next();
            if(!(item.getActive())){
                i++;
                continue;
            }
            
            data[2][i] = item.getName();
            data[1][i] = String.valueOf(item.getPrice());
            data[0][i] = item.getUser().getName();
            i++;
        }
        return data;
    }
}
