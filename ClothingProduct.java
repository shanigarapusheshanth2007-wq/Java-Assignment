
abstract class ClothingProduct extends Product {

    protected int Size;
    protected String Material;
    protected String Gender;

    //constructor
    protected ClothingProduct(String product_name, String brand, int retail_price, int available_quantity, int Discount,
            int Tax, int Delivery, int Return_days, int Additional_festival_discount, String Material, String Gender, int size) {
        super(product_name, brand, retail_price, available_quantity, Discount,
                Tax, Delivery, Return_days, Additional_festival_discount);
        this.setCategory("Clothing");
        this.Gender = Gender;
        this.Material = Material;
        this.Size = Size;
    }

    protected ClothingProduct(ClothingProduct c) {
        super(c);
        this.setCategory("Clothing");
        this.Gender = Gender;
        this.Material = Material;
        this.Size = Size;
    }

}

class Shirt extends ClothingProduct {

    //constructor
    public Shirt(String product_name, String brand, int retail_price, int available_quantity, int Discount, int Tax, int Delivery, int Return_days, int Additional_festival_discount, String Material, String Gender, int Size) {
        super(product_name, brand, retail_price, available_quantity, Discount, Tax, Delivery, Return_days, Additional_festival_discount, Material, Gender, Size);
    }

    public Shirt(Shirt s) {
        super(s);
    }

    @Override
    protected void getDescription() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getPostPurchaseMessage() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

class Jeans extends ClothingProduct {

    //constructor
    //constructor
    public Jeans(String product_name, String brand, int retail_price, int available_quantity, int Discount, int Tax, int Delivery, int Return_days, int Additional_festival_discount, String Material, String Gender, int Size) {
        super(product_name, brand, retail_price, available_quantity, Discount, Tax, Delivery, Return_days, Additional_festival_discount, Material, Gender, Size);

    }

    public Jeans(Shirt s) {
        super(s);
    }

    @Override
    protected void getDescription() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getPostPurchaseMessage() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

class Jacket extends ClothingProduct {

    //constructor
    public Jacket(String product_name, String brand, int retail_price, int available_quantity, int Discount, int Tax, int Delivery, int Return_days, int Additional_festival_discount, String Material, String Gender, int Size) {
        super(product_name, brand, retail_price, available_quantity, Discount, Tax, Delivery, Return_days, Additional_festival_discount, Material, Gender, Size);
    }

    public Jacket(Shirt s) {
        super(s);
    }

    @Override
    protected void getDescription() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getPostPurchaseMessage() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
