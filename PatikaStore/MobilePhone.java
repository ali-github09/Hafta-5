package PatikaStore;

import java.util.ArrayList;

public class MobilePhone extends Product implements Operations{

    private static ArrayList<Product> ProductList = new ArrayList<>();
    private int camera;
    private int batteryCapacity;
    private String color;
    private int id;


    public MobilePhone(int price, int discountRate, String name, String brandName, int ram, int harddisck, int screenSize, String memory, int stock, int camera, int batteryCapacity, String color) {
        super(price, discountRate, name, brandName, ram, harddisck, screenSize, memory, stock);

        this.camera = camera;
        this.batteryCapacity = batteryCapacity;
        this.color = color;
    }

    public MobilePhone() {
    }

    @Override
    public void runMenu() {

    }

    @Override
    public void showProductList() {

    }

    @Override
    public void addProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void filterbyId() {

    }

    @Override
    public void filterbyBrand() {

    }
}
