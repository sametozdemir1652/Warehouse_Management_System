import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class ProductOperations {

    static Scanner input=new Scanner(System.in);

    public static HashMap<Integer,Product> productHashMap=new HashMap<>();

    static int ID=100;


    public static void initializeProduct(){
        ID++;



        System.out.println("=====Urun Kabul=====");

        System.out.println("Urun ismi giriniz: ");
        input.nextLine();
        String productName= input.nextLine().toLowerCase();

        System.out.println("Urunun ureticisi:");
        String manufacturer= input.nextLine();

        System.out.println("Urunun birimi:");
        String unit= input.next();

        Product product=new Product(productName,manufacturer,0,unit,null);
        productHashMap.put(ID,product);

        Menu.mainMenu();
    }

    public static void listProducts(){
        System.out.printf("%-12s %-12s %-12s %-12s %-12s %-12s\n","id","ismi","ureticisi","miktari","birimi","raf");
        System.out.println("---------------------------------------------------------------");
        for (Map.Entry<Integer, Product> w : productHashMap.entrySet()) {
            System.out.printf("%-12s %-12s %-12s %-12s %-12s %-12s\n",
                              w.getKey(),w.getValue().productName,w.getValue().manufacturer,w.getValue().amount,w.getValue().unit,w.getValue().shelf);
        }

    }

    public static void productsAcceptance(){



        System.out.println("Giris yapmak istediginiz urunun ID'sini giriniz: ");
        int ID=input.nextInt();

        System.out.println("Adet giriniz: ");
        int amount=input.nextInt();

        boolean isNotAvailable=true;

        for (Map.Entry<Integer, Product> w : productHashMap.entrySet()) {
            if (w.getKey()==ID){
                w.getValue().setAmount(amount);
                isNotAvailable=false;
            }
        }
        if (isNotAvailable){
            System.out.println("Girdiginiz ID'ye ait urun bulunmamaktadir...");
        }
        Menu.mainMenu();
    }

    public static void putTheProductToTheShelf(){


        System.out.println("Rafa koymak istediginiz urunun ID'sini giriniz: ");
        int ID=input.nextInt();
        System.out.println("Rafi giriniz: ");
        input.nextLine();
        String shelf=input.nextLine();
        for (Map.Entry<Integer, Product> w : productHashMap.entrySet()) {
            if (w.getKey()==ID){
                w.getValue().setShelf(shelf);
            }
        }
        Menu.mainMenu();
    }

    public static void takeTheProductOut(){



        System.out.println("Cikisini yapmak istediginiz urunun ID'sini giriniz: ");
        int ID=input.nextInt();
        System.out.println("Adet giriniz: ");
        int amount= input.nextInt();

        for (Map.Entry<Integer, Product> w : productHashMap.entrySet()) {
            if (w.getKey()==ID){
                if (w.getValue().amount-amount>0){
                    w.getValue().setAmount(w.getValue().amount-amount);
                }
                else if (w.getValue().amount-amount<0) {
                    System.out.println("Stoktaki urun adetinden fazla mal cikisi yapamazsiniz...");
                    takeTheProductOut();
                }
                else {
                    w.getValue().setAmount(0);
                    w.getValue().setShelf(null);
                }
            }
        }
        Menu.mainMenu();
    }
    

}
