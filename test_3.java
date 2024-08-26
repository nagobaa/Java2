public class newJavaFile{
   
    public static void main(String args[]){
        
        boolean iscodingFun = true;
        boolean funOutDoorDay = false;
        System.out.print("Is coding Fun?");
        System.out.println(" " + iscodingFun);
        System.out.print("Is it fun to go outside against one's will?");
        System.out.println(" " + funOutDoorDay);
        
        //
        int items = 50;
        float costPerItem = 7.99f;
        float totalCost = items + costPerItem;
        char currency = '$'; // " " går inte här
        
        //Print Varibles
        System.out.println("Number of items: " + items);
        System.out.println("Cost per Item:" + costPerItem + currency);
        System.out.println("Total cost: " + totalCost + currency);
    }
}
