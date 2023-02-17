import java.util.Scanner;

public class Menu {

    static Scanner input=new Scanner(System.in);

    public static void mainMenu(){

        System.out.println("1-Urun tanimla\n" +
                           "2-Urunleri listele\n" +
                           "3-Urun kabul\n" +
                           "4-Urunu rafa koy\n" +
                           "5-Urun cikisi yap\n" +
                           "0-Cikis yap  ");

        String selection= input.next();

        switch (selection){

            case "1":
                ProductOperations.initializeProduct();
                break;
            case "2":
                ProductOperations.listProducts();
                mainMenu();
                break;
            case "3":
                ProductOperations.productsAcceptance();
                break;
            case "4":
                ProductOperations.putTheProductToTheShelf();
                break;
            case "5":
                ProductOperations.takeTheProductOut();
                break;
            case "0":
                System.out.println("Sistemden cikis yapiliyor...");
                break;
            default:
                System.out.println("Gecersiz bir deger girdiniz tekrar deneyiniz");
                mainMenu();
        }
    }

}
