package is2.biddingapp.Main;

import is2.biddingapp.Model.Model;
import is2.biddingapp.controller.Controller;
import is2.biddingapp.view.View;

public class IS2BiddingApp {

    public static void main(String[] args) {
        System.out.println("Test: ");
        
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        
        controller.addUser("Pepe");
        controller.addUser("Juan");
        controller.addUser("Maria");
        
        controller.addItem("Mesa", 100, 5, 5, "Pepe");
        controller.addItem("Silla", 10, 5, 5, "Pepe");
        
        controller.printItems();
    }
    
}
