package is2.biddingapp.controller;

import is2.biddingapp.Model.Model;
import is2.biddingapp.view.View;
import java.util.ArrayList;

public class Controller {
    
    private Model model;
    private View view;
    
    public Controller(Model model, View view){
        this.model=model;
        this.view=view;
    }
    
    public void addUser(String name){
        model.createUser(name);
    }
    
    public void addItem(String name, int currentPrice, long creationDate, long timeRemaining, String username){
        model.createItem(name, currentPrice, creationDate, timeRemaining, username);
        
    }
    
    public void printItems(){
        view.listItems(model.printItems());
    }
    
}
