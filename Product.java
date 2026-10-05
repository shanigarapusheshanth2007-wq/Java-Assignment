
import java.util.ArrayList;
import java.util.List;

abstract class Product implements Cloneable {

    //user
    ProductServices service = new ProductServices();
    private int product_id;
    private String product_name;
    private String brand;
    private int retail_price;
    private int available_quantity;
    private String category;
    //more vairables
    private int Discount;
    private int Tax;
    private int Delivery;
    private int Return_days;
    private int Additional_festival_discount;
    private List<Integer> price_history;

    //constructor
    protected Product(String product_name, String brand, int retail_price, int available_quantity, int Discount,
            int Tax, int Delivery, int Return_days, int Additional_festival_discount) {

        this.product_name = product_name;
        this.brand = brand;
        this.retail_price = retail_price;
        this.available_quantity = available_quantity;
        this.product_id = (int) (Math.random() * (100)) + 1;
        this.Discount = Discount;
        this.Tax = Tax;
        this.Delivery = Delivery;
        this.Return_days = Return_days;
        this.Additional_festival_discount = Additional_festival_discount;
        this.Discount = Discount;
        // service.products.add(this);
        ProductServices.addToProduct(this);
    }


    

    //cloning a product
    protected Product(Product p) {

        this.product_name = p.product_name;
        this.brand = p.brand;
        this.retail_price = p.retail_price;
        this.available_quantity = p.available_quantity;
        this.product_id = (int) (Math.random() * (100)) + 1;
        this.Discount = p.Discount;
        this.Tax = p.Tax;
        this.Delivery = p.Delivery;
        this.Return_days = p.Return_days;
        this.Additional_festival_discount = p.Additional_festival_discount;
        this.Discount = p.Discount;
        // service.products.add(this);
        ProductServices.addToProduct(this);
    }

    //made abstract void descripiton 
    protected abstract void getDescription();

    public abstract String getPostPurchaseMessage();

    //methods getProductId() getProductName() getRetailPrice()
    protected int getProductId() {
        // System.out.println("Product id is: "+p.product_id);
        return this.product_id;
    }

    public String getProductName() {
        // System.out.println("Product name is: "+p.product_name);
        return this.product_name;
    }

    protected int getRetailPrice() {
        // System.out.println("Product retail price is: "+p.retail_price+" ₹");
        return this.retail_price;
    }

    protected int getAvailableQuantity() {
        return this.available_quantity;
    }

    protected int getDiscount() {
        return this.Discount;
    }

    protected int getTax() {
        return this.Tax;
    }

    protected String getBrand() {
        return this.brand;
    }

    protected String getCategory() {
        return this.category;
    }

    protected int getDelivery() {
        return this.Delivery;
    }

    protected int getReturn_days() {
        return this.Return_days;
    }

    protected int getAdditional_festival_discount() {
        return this.Additional_festival_discount;
    }

    //setmethods
    protected void setCategory(String Category) {
        this.category = Category;
    }

    protected void removeAvailable(int a) {
        this.available_quantity = this.available_quantity - a;
    }

    protected void addAvailable(int a) {
        this.available_quantity = this.available_quantity + a;
    }

    protected void setRetailPrice(int price) {
        System.out.println("Previous price is :₹ "+price_history.get(price_history.size()-1));
        this.retail_price = price;
        price_history.add(price);
        return;
    }

    //overiding the object global class methods
    //print produts using there reference by overriding the to string method
    // public String toString() {
    //     return this.getClass().getSimpleName() + " :  " + this.getCategory();
    // }
    public String toString() {
        return getClass().getName() + '@' + Integer.toHexString(hashCode());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) {
            return false;
        }
        Product p = (Product) obj;
        if (p.getProductName().equals(this.product_name) && p.getRetailPrice() == this.retail_price) {
            return true;
        } else {
            return false;
        }
    }

    //overrite the hashcode
    @Override
    public int hashCode() {
        return this.getProductName().hashCode();
    }

    //clone method overriding 
    public Object clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }

    //object history creator 
    protected void history_creator() {
        this.price_history = new ArrayList<Integer>();
        return;
    }

    protected void price_history() {
        for (int i = 0; i < price_history.size(); i++) {
            System.out.println("Price " + i + " is : " + price_history.get(i));
        }
        return;
    }
}
