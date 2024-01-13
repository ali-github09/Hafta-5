package PatikaStore;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;



public class Main {
    public static void main(String[] args) {

        boolean isRunning = true;

        while(isRunning){
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("Patika Store Ürün Yönetim Paneli!");
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
            System.out.print("1 - Notebook İşlemleri\n2 - Cep Telefonu İşlemleri\n3 - Marka Listeleme\n0 - Çıkış Yap\n\nTercihiniz : ");
            int a = input.nextInt();

            switch (a){
                case 0 :
                    System.out.println("Çıkış yaptınız. İyi günler dileriz");
                    isRunning = false;
                    break;
                case 1:
                    Notebook notebook = new Notebook();
                    notebook.runMenu();
                    break;
                case 2:
                    MobilePhone mobilephone = new MobilePhone();
                    mobilephone.runMenu();
                    break;
                case 3:
                    Brand brand = new Brand();
                    brand.printBrandList();
                    break;
                default:
                    System.out.println("Lütfen geçerli bir sayı giriniz");
            }
        }
    }
}
