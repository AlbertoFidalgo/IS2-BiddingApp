package is2.biddingapp.Model;

import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Item> itemList;
    private ArrayList<Bid> bidList;
    
    public User(String name){
        this.name=name;
        itemList = new ArrayList<Item>();
        bidList = new ArrayList<>();
    }
    
    public String getName(){
        return name;
    }
    
    public ArrayList<Item> getItemList(){
        return itemList;
    }
    
    public ArrayList<Bid> getBidList(){
        return bidList;
    }
    
    public void addItem(Item item){
        itemList.add(item);
    }
    
    public void addBid(Bid bid){
        bidList.add(bid);
    }
    
}
