package com.workintech.grocery;

import java.util.*;

public class GroceryListApp {
private static LinkedList<String> groceryList = new LinkedList<>();

private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("0 - Uygulamayı Durdur");
            System.out.println("1 - Eleman Ekle");
            System.out.println("2 - Eleman Çıkar");
            System.out.println("Seçiminizi Yapınız!");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    running = false;
                    break;
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                default:
                    System.out.println("Geçersiz seçim");
        }
        }
        scanner.close();
    }
public static void addItem(){
    System.out.println("Eklemek istediğiniz elemanları giriniz (Birden fazla girmek için virgül kullanınız!)");
    String input = scanner.nextLine();
    String[] itemsToAdd = input.split(",");

    for(String item : itemsToAdd){
        if(!checkItemIsInList(item)){
            groceryList.add(item);
            System.out.println(item + " eklendi");
        }else {
            System.out.println(item + " zaten bulunuyor");
        }
    }

printSorted();
}
public static void removeItem(){
    System.out.println("Çıkarmak istediğiniz elemanları giriniz (Birden fazla girmek için virgül kullanınız!");
    String input = scanner.nextLine();
    String[] itemToRemove = input.split(",");

    for(String item : itemToRemove){
        if(checkItemIsInList(item)){
            groceryList.remove(item);
            System.out.println(item + " çıkarıldı");
        }else {
            System.out.println(item + " listede bulunmuyor");
        }
    }
    printSorted();
}
public static boolean checkItemIsInList(String item){
        return groceryList.contains(item);
}
public static void printSorted(){
    Collections.sort(groceryList);
    System.out.println("Liste :");
    for (String item : groceryList) {
        System.out.println(item);
    }
    }

}
