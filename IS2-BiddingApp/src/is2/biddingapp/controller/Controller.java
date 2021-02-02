package is2.biddingapp.controller;

import is2.biddingapp.Model.Model;
import is2.biddingapp.view.View;
import java.util.Iterator;

public class Controller {
    
    private Model model;
    private View view;
    
    public Controller(Model model, View view){
        this.model=model;
        this.view=view;
    }
    
}
