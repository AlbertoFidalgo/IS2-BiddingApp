package is2.biddingapp.view;

public class View {
    
    public void listItems(String[][] data){
        System.out.println("Las subastas existentes son:");
        if(data[0].length==0){
            System.out.println("No hay pujas");
            return;
        }
        
        for (int i = 0; i < data[0].length; i++) {
            System.out.println(data[0][i] + " vende " + data[1][i] + " por " + data[2][i] + "€");
        }
        
    }
    
    public void listUsers(String[] userName){
        System.out.println("Los usuarios son:");
        for (int i = 0; i < userName.length; i++) System.out.println(userName[i]);
        
    }
    
}
