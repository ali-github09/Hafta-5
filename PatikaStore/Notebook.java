package PatikaStore;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Notebook extends Product implements Operations{
    Scanner input = new Scanner(System.in);
    private static ArrayList<Notebook> notebookList = new ArrayList<>();

    private int id;

    public Notebook(int id,int price, int discountRate, String name, String brandName, int ram, int harddisck, double screenSize, String memory, int stock) {
        super(price, discountRate, name, brandName, ram, harddisck, screenSize, memory, stock);
        this.id = id;

    }

    public Notebook() {

    }

    static {
        notebookList.add(new Notebook(1,7000,0,"Matebook 14","Huawei",16,256,15,"GB",25));
        notebookList.add(new Notebook(2,3699,0,"V14 IGL", "LENOVO",8,1024,15.6,"GB",20));
        notebookList.add(new Notebook(3,8199,0,"Tuf Gaming","ASUS",32,2048,15.6,"GB",15));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public void runMenu() {
        Notebook nootebook = new Notebook();
        boolean isRunning = true;

        while(isRunning) {
        System.out.println();
        System.out.println("NoteBook Yönetim Paneli!");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
        System.out.print("1 - Notebook Ekleme\n2 - Notebook Silme\n3 - Notebook Listeleme\n4 - Markaya göre Filtrele" +
                "\n5 - Id'ye göre Fİltrele\n0 - Çıkış Yap\n\nTercihiniz : ");
        int selection = input.nextInt();

            switch (selection){
                case 0 :
                    System.out.println("Çıkış yaptınız. İyi günler dileriz");
                    isRunning = false;
                    break;
                case 1:
                nootebook.addProduct();
                    break;
                case 2:
                nootebook.deleteProduct();
                    break;
                case 3:
                nootebook.showProductList();
                    break;
                case 4:
                nootebook.filterbyBrand();
                    break;
                case 5:
                nootebook.filterbyId();
                    break;
                default:
            }
        }
    }


    @Override
    public String toString() {
        return "ID : " + this.getId() + " Model : " + this.getName() + " Marka : "
                + this.getBrandName() + " Fiyat : " + this.getPrice() + " Ram : " + this.getRam() + " Harddisk : " + this.getHarddisck()
                + " ScreenSize : " + this.getScreenSize() + " Memory : " + this.getMemory() + " Stock : " + this.getStock();
    }

    @Override
    public void showProductList() {
        for(Notebook x : notebookList) {
            System.out.println(x);
        }
    }

    @Override
    public void addProduct() {

        Notebook notebook = new Notebook();
        System.out.println("Lütfen eklemez istediğiniz Notebook'a ait özellikleri giriniz");

        System.out.print("ID : ");
        int id = input.nextInt();
        notebook.setId(id);

        System.out.print("Fiyat : ");
        int fiyat = input.nextInt();
        notebook.setPrice(fiyat);


        input.nextLine();

        System.out.print("Marka : ");
        String marka = input.nextLine();
        notebook.setBrandName(marka);

        System.out.print("Hafıza Birimi (gb -tb) : ");
        String memoryUnit = input.nextLine();
        notebook.setMemory(memoryUnit);

        System.out.print("Model : ");
        String model = input.nextLine();
        notebook.setName(model);

        System.out.print("Ram : ");
        int ram = input.nextInt();
        notebook.setRam(ram);

        System.out.print("Harddisk : ");
        int harddisk = input.nextInt();
        notebook.setHarddisck(harddisk);

        System.out.print("Ekran Boyutu : ");
        double ss = input.nextDouble();
        notebook.setScreenSize(ss);

        System.out.print("Stok : ");
        int stock = input.nextInt();
        notebook.setStock(stock);

        notebookList.add(notebook);
    }

    @Override
    public void deleteProduct() {
        System.out.print("Lütfen silmek istediğiniz elemanın ID'sini giriniz : ");
        int selectedId = input.nextInt();
        notebookList.removeIf(notebook -> notebook.getId() == selectedId);
       }

    @Override
    public void filterbyId() {
        System.out.println("Lütfen filtrelemek istediğiniz ID numarasını giriniz : ");
        int selectedID = input.nextInt();
        ArrayList<Notebook> filteredList = new ArrayList<>();
                notebookList.stream()
                .filter(notebook -> notebook.id == selectedID)
                .collect(Collectors.toList());
        for (Notebook item : filteredList) {
            System.out.println(item);
        }
    }

    @Override
    public void filterbyBrand() {

    }
}




