package PatikaStore;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone extends Product implements Operations{

    Scanner input = new Scanner(System.in);
    private static ArrayList<MobilePhone> phoneList = new ArrayList<>();

    private int camera;
    private int batteryCapacity;
    private String color;
    private int id;


    public MobilePhone(int id,int price, int discountRate, String name, String brandName, int ram, int harddisck, int screenSize, String memory, int stock, int camera, int batteryCapacity, String color) {
        super(price, discountRate, name, brandName, ram, harddisck, screenSize, memory, stock);
        this.id = id;
        this.camera = camera;
        this.batteryCapacity = batteryCapacity;
        this.color = color;
    }

    public MobilePhone() {
    }

    static {
        phoneList.add(new MobilePhone(1,14000,0,"Iphone 11","APPLE",16,512,15,"GB",15,16,185,"red"));
        phoneList.add(new MobilePhone(2,15000,0,"Galaxy 15","SAMSUNG",32,512,16,"GB",20,20,200,"blue"));
        phoneList.add(new MobilePhone(3,13000,0,"MATE 4","XIOMI",32,512,17,"GB",14,34,150,"green"));
    }

    @Override
    public void runMenu() {
        MobilePhone mobilePhone = new MobilePhone();
        boolean isRunning = true;

        while(isRunning) {
            System.out.println();
            System.out.println("MobilePhone Yönetim Paneli!");
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
            System.out.print("1 - MobilePhone Ekleme\n2 - MobilePhone Silme\n3 - MobilePhone Listeleme\n4 - Markaya göre Filtrele" +
                    "\n5 - Id'ye göre Fİltrele\n0 - Çıkış Yap\n\nTercihiniz : ");

            int selection = input.nextInt();

            switch (selection){
                case 0 :
                    System.out.println("Çıkış yaptınız. İyi günler dileriz");
                    isRunning = false;
                    break;
                case 1:
                    mobilePhone.addProduct();
                    break;
                case 2:
                    mobilePhone.deleteProduct();
                    break;
                case 3:
                    mobilePhone.showProductList();
                    break;
                case 4:
                    mobilePhone.filterbyBrand();
                    break;
                case 5:
                    mobilePhone.filterbyId();
                    break;
                default:
            }
        }
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return " Id : " + this.getId() + " Model : " + this.getName() + " Brand : " + this.getBrandName() + " ram : " + this.getRam()
                + " harddisk : " + this.getHarddisck() + " memory : " + this.getMemory() + " Screen Size : " + this.getScreenSize()
                + " Color : " + this.getColor();
    }


    @Override
    public void showProductList() {
        for(MobilePhone x : phoneList){
            System.out.println(x);
        }
    }

    @Override
    public void addProduct() {
        MobilePhone mobilePhone = new MobilePhone();
        System.out.println("Lütfen eklemez istediğiniz Cep Telefonuna ait özellikleri giriniz");

        System.out.print("ID : ");
        int id = input.nextInt();
        mobilePhone.setId(id);

        System.out.print("Fiyat : ");
        int fiyat = input.nextInt();
        mobilePhone.setPrice(fiyat);


        input.nextLine();

        System.out.print("Marka : ");
        String marka = input.nextLine();
        mobilePhone.setBrandName(marka);

        System.out.print("Model : ");
        String model = input.nextLine();
        mobilePhone.setName(model);

        System.out.print("Hafıza Birimi (gb -tb) : ");
        String memoryUnit = input.nextLine();
        mobilePhone.setMemory(memoryUnit);

        System.out.print("Color :  ");
        String color = input.nextLine();
        mobilePhone.setColor(color);

        System.out.print("Ram : ");
        int ram = input.nextInt();
        mobilePhone.setRam(ram);

        System.out.print("Harddisk : ");
        int harddisk = input.nextInt();
        mobilePhone.setHarddisck(harddisk);

        System.out.print("Ekran Boyutu : ");
        double ss = input.nextDouble();
        mobilePhone.setScreenSize(ss);

        System.out.print("Stok : ");
        int stock = input.nextInt();
        mobilePhone.setStock(stock);

        phoneList.add(mobilePhone);
    }

    @Override
    public void deleteProduct() {
        System.out.print("Lütfen silmek istediğiniz elemanın ID'sini giriniz : ");
        int selectedId = input.nextInt();
        phoneList.removeIf(mobilePhone -> mobilePhone.getId() == selectedId);
    }

    @Override
    public void filterbyId() {
        System.out.println("Lütfen filtrelemek istediğiniz ID numarasını giriniz : ");
        int selectedID = input.nextInt();

        ArrayList<MobilePhone> filteredList1 = new ArrayList<>();

        for (MobilePhone mobilePhone : phoneList) {
            if (mobilePhone.getId() == selectedID) {
                filteredList1.add(mobilePhone);
            }
        }

        for (MobilePhone mobilePhone : filteredList1) {
            System.out.println(mobilePhone);
        }
    }

    @Override
    public void filterbyBrand() {
        System.out.println("Lütfen filtrelemek istediğiniz markayı  giriniz : ");
        String selectedBrand = input.nextLine();
        ArrayList<MobilePhone> filteredList2 = new ArrayList<>();

            for (MobilePhone mobilePhone : phoneList) {
            if (mobilePhone.getBrandName().equals(selectedBrand) ) {
                filteredList2.add(mobilePhone);
            }
        }

        for (MobilePhone mobilePhone : filteredList2) {
            System.out.println(mobilePhone);
        }
    }
}
