public class Product {


    int id;
    String productName;
    String manufacturer;
    int amount=0;
    String unit;
    String shelf=null;

    public Product(String productName, String manufacturer, int amount, String unit, String shelf) {
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.amount = amount;
        this.unit = unit;
        this.shelf = shelf;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", amount=" + amount +
                ", unit='" + unit + '\'' +
                ", shelf='" + shelf + '\'' +
                '}';
    }
}
