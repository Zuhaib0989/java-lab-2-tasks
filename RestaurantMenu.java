package RestaurantMenu;

import java.util.Scanner;


public class Restaurant.Menu {

   
    public static void main(String[] args) {
        int num;
        System.out.println("               THE STEAK HOUSE");
        System.out.println("                   MENU");
    System.out.println("              1.TARRAGON STEAK  ");
    System.out.println("              2.MEXICAN STEAK    ");
    System.out.println("              3.MUSHRROM STEAK  ");
   System.out.println("");
    System.out.println("ENTER THE NUMBER OF ITEM YOU WANT TO ORDER");
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    switch(num)
    {
        case 1:
            System.out.println("price of item is 900rs");
        break;
        case 2:
            System.out.println("price of item is 800rs");
    break;
        case 3:
            System.out.println("price of item is 1000rs");
    }
    
    }
    
}