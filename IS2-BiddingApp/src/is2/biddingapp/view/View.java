package is2.biddingapp.view;

public class View {
    
    public void listItems(String[] itemName, String[] itemUser, String[] itemAmount){
        System.out.println("Las subastas existentes son:");
        if(itemName.length==0){
            System.out.println("No hay pujas");
            return;
        }
        
        for (int i = 0; i < itemName.length; i++) {
            System.out.println(itemUser[i] + " vende " + itemName[i] + " por " + itemAmount[i] + "€");
        }
        
    }
    
    public void listUsers(String[] userName){
        System.out.println("Los usuarios son:");
        for (int i = 0; i < userName.length; i++) System.out.println(userName[i]);
        
    }
    
}
