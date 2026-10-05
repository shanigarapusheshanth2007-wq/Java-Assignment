
abstract class GroceryProduct extends Product {

    protected String Manufacturing;
    protected int Expire;
    protected int Weight;

    //constructor
    protected GroceryProduct(String product_name, String brand, int retail_price, int available_quantity, int Discount,
            int Tax, int Delivery, int Return_days, int Additional_festival_discount, String Manufacturing, int Expire, int Weight) {
        super(product_name, brand, retail_price, available_quantity, Discount, Tax, Delivery, Return_days, Additional_festival_discount);
        this.Manufacturing = Manufacturing;
        this.Expire = Expire;
        this.Weight = Weight;
        this.setCategory("Grocery");
    }
//clone

    protected GroceryProduct(GroceryProduct g) {
        super(g);
        this.Manufacturing = g.Manufacturing;
        // this.Expire = g.Expire;
        this.Weight = g.Weight;
        this.setCategory("Grocery");
    }

    protected int getWeight() {
        return Weight;
    }
        @Override
    public void printDetails()
    {
        super.printDetails();
        System.out.println("weight is :"+Weight);
        System.out.println("Expire :"+Expire);
    }
}

class Milk extends GroceryProduct implements Expirable {

    ProductServices service = new ProductServices();
    //constructor

    public Milk(String product_name, String brand, int retail_price,
            int available_quantity, int Discount, int Tax, int Delivery,
            int Return_days, int Additional_festival_discount,
            String Manufacturing, int Expire, int Weight) {

        super(product_name, brand, retail_price, available_quantity,
                Discount, Tax, Delivery, Return_days,
                Additional_festival_discount, Manufacturing, Expire, Weight);

        this.Expire = Expire;
        this.Weight = Weight;
        this.setCategory("Electronics");
    }

    //clone constructor
    public Milk(Milk m) {
        super(m);
        // this.Expire = m.Expire;
    }

    @Override
    public void getExpiryDate() {
        System.out.println("Expire date is :" + this.Expire);
    }

    public void getDescription(Product p) {
        System.out.println(p.getProductName() + " | " + p.getProductId() + " | " + p.getBrand() + " |");
    }

    @Override
    public void getDescription() {
        System.out.println("This is a Milk bottel");
    }

    @Override
    public String getPostPurchaseMessage() {

        return "Keep refrigerated and consume before expiry.";
    }

    //getter
    public int getExpire() {
        return Expire;
    }

    //ssetter
    public void setExpire(int i) {
        this.Expire = i;
    }


}

class Bread extends GroceryProduct implements Expirable {
    //constructor

    public Bread(String product_name, String brand, int retail_price,
            int available_quantity, int Discount, int Tax, int Delivery,
            int Return_days, int Additional_festival_discount,
            String Manufacturing, int Expire, int Weight) {
        super(product_name, brand, retail_price, available_quantity,
                Discount, Tax, Delivery, Return_days, Additional_festival_discount, Manufacturing, Expire, Weight);
    }

    public Bread(Bread m) {
        super(m);
        // this.Expire = m.Expire;
    }

    @Override
    public void getExpiryDate() {
        System.out.println("Expire date is :" + this.Expire + "and not expire yest");
    }

    @Override
    public void getDescription() {
        System.out.println("This is a bread bun");
    }

    @Override
    public String getPostPurchaseMessage() {
        return "Keep refrigerated and consume before expiry.";
    }

}

class Juice extends GroceryProduct implements Expirable {
    //constructor

    public Juice(String product_name, String brand, int retail_price,
            int available_quantity, int Discount, int Tax, int Delivery,
            int Return_days, int Additional_festival_discount,
            String Manufacturing, int Expire, int Weight) {

        super(product_name, brand, retail_price, available_quantity,
                Discount, Tax, Delivery, Return_days,
                Additional_festival_discount, Manufacturing, Expire, Weight);
    }

    public Juice(Juice m) {
        super(m);
        // this.Expire = m.Expire;
    }

    @Override
    public void getExpiryDate() {
        System.out.println("Expire date is :" + this.Expire + "and not expire yest");
    }

    @Override
    public void getDescription() {
        System.out.println("This is a Jucice bottle");
    }

    @Override
    public String getPostPurchaseMessage() {
        return "Placce it in a fridge";
    }
}
//
//implementations

interface Expirable {

    void getExpiryDate();

    default void checkExpiry() {
        System.out.println("Checking whether the product has expired...has not declared method in it(Not overriden)");
    }
}
