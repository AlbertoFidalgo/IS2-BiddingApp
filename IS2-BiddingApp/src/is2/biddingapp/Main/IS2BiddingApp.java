package is2.biddingapp.Main;

import is2.biddingapp.Model.Model;
import is2.biddingapp.controller.Controller;
import is2.biddingapp.view.View;

public class IS2BiddingApp {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
    }
    
}
