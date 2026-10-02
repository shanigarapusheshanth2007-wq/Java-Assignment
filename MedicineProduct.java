abstract class MedicineProduct extends Product{
    protected String Manufacturer;
    protected String Expire;
    protected int Dosage;
    
    //constructor
    protected MedicineProduct(String product_name,String brand,int retail_price,int available_quantity,int Discount,
    int Tax,int Delivery,int Return_days,int Additional_festival_discount,String Manufacutring,String Expire,int Dosage)
    { 
        super(product_name,brand,retail_price,available_quantity,Discount,Tax,Delivery,Return_days,Additional_festival_discount);
        
        this.Manufacturer=Manufacutring;
        this.Expire=Expire;
        this.Dosage=Dosage;
        this.setCategory("Medicine");
    }

}
    class Dolo extends MedicineProduct implements Expirable{
    public Dolo(String product_name,String brand,int retail_price,int available_quantity,int Discount,
    int Tax,int Delivery,int Return_days,int Additional_festival_discount,String Manufacutring,String Expire,int Dosage)
    {
        super(product_name,brand,retail_price,available_quantity,Discount,Tax,Delivery,Return_days,Additional_festival_discount,Manufacutring,Expire,Dosage);
    }

    @Override
    public void getExpiryDate() {
        System.out.println("Expires in "+Expire+" days and this is a medicine");
    }

    @Override
    public void getDescription() {
        System.out.println("This is a dolo tablet");
    }

    @Override
    public String getPostPurchaseMessage() {
        System.out.println("-------------------------------getPostPurchaseMessage-------------------------------------");
        return "Store according to the manufacturer’s instructions.";
    }
    
    }