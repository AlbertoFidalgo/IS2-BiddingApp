package is2.biddingapp.Model;

import java.util.ArrayList;

public class Item {
    private String name;
    private User itemSeller;
    private ArrayList<Bid> bidList;
    private ArrayList<Image> imageList;
    private int currentPrice;
    private long creationDate;
    private long timeRemaining;
    private boolean active;
    
    public Item(String name, int currentPrice, long creationDate, long timeRemaining, User user){
        this.name=name;
        this.currentPrice=currentPrice;
        this.creationDate=creationDate;
        this.timeRemaining=timeRemaining;
        this.itemSeller=user;
        bidList = new ArrayList<Bid>();
        imageList = new ArrayList<Image>();
        this.active=true;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPrice(){
        return currentPrice;
    }
    
    public long getTimeRemaining(){
        return timeRemaining;
    }
    
    public ArrayList<Image> getImages(){
        return imageList;
    }
    
    public ArrayList<Bid> getBidList(){
        return bidList;
    }
    
    public void updateTime(long currentDate){
        timeRemaining=currentDate-creationDate;
        if(timeRemaining < 0){
            timeRemaining=0;
            active=false;
        }
    }
    
    public void makeBid(Bid bid){
        bidList.add(bid);
    }
    
    public void addImage(Image image){
        imageList.add(image);
    }
}
