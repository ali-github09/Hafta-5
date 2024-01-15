package PatikaStore;

public abstract class Product {
    private int price;
    private int discountRate;
    private String name;
    private String brandName;
    private int ram;
    private int harddisck;
    private double screenSize;
    private String memory;
    private int stock;

    public Product(int price, int discountRate, String name, String brandName, int ram, int harddisck, double screenSize, String memory, int stock) {
        this.price = price;
        this.discountRate = discountRate;
        this.name = name;
        this.brandName = brandName;
        this.ram = ram;
        this.harddisck = harddisck;
        this.screenSize = screenSize;
        this.memory = memory;
        this.stock = stock;
    }

    public Product() {

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHarddisck() {
        return harddisck;
    }

    public void setHarddisck(int harddisck) {
        this.harddisck = harddisck;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
