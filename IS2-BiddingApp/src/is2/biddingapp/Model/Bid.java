package is2.biddingapp.Model;

public class Bid {
    private User bidder;
    private Item item;
    
    public Bid(User bidder, Item item){
        this.bidder=bidder;
        this.item=item;
    }
    
    public User getBidder(){
        return bidder;
    }
    
    public Item getItem(){
        return item;
    }
    
}
