package is2.biddingapp.Model;

import java.util.ArrayList;

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
    
    public void createUser(String name){
        User user = new User(name);
        users.add(user);
    }
    
    public void createItem(String name, int currentPrice, long creationDate, long timeRemaining, User user){
        Item item = new Item(name, currentPrice, creationDate, timeRemaining, user);
        user.addItem(item);
        
    }
    
    public void createBid(User user, Item item){
        Bid bid = new Bid(user, item);
        user.addBid(bid);
        item.makeBid(bid);
    }
}
