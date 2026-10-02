
abstract class Product {

    //user
    ProductServices service = new ProductServices();
    private final int product_id;
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
        ProductServices.products.add(this);
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
    protected String getBrand(){
        return this.brand;
    }
    protected String getCategory(){
        return this.category;
    }
    protected int getDelivery(){
        return this.Delivery;
    }
    protected int getReturn_days(){
        return this.Return_days;
    }
    protected int getAdditional_festival_discount(){
        return this.Additional_festival_discount;
    }
    //setmethods
    protected void setCategory(String Category){
        this.category=Category;
    }
    protected void removeAvailable(int a){
        this.available_quantity=this.available_quantity-a;
    }
    protected void addAvailable(int a)
    {
        this.available_quantity=this.available_quantity+a;
    }





}
