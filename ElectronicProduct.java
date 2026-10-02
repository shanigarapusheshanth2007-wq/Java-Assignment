
abstract class ElectronicProduct extends Product {

    protected String Manufacturer;
    protected String Warranty_Period;
    protected String Power_Consumption;

    public ElectronicProduct(String product_name, String brand, int retail_price, int available_quantity, int Discount,
            int Tax, int Delivery, int Return_days, int Additional_festival_discount, String Manufacturer, String Warranty_periodString, String Power_Consumption) {

        super(product_name, brand, retail_price, available_quantity, Discount, Tax, Delivery, Return_days, Additional_festival_discount);

        this.Manufacturer = Manufacturer;
        this.Warranty_Period = Warranty_Period;
        this.Power_Consumption = Power_Consumption;
        this.setCategory("Electronics");
    }

}

class Television extends ElectronicProduct implements SpecialShipping {

    //constructor
    public Television(String product_name, String brand, int retail_price, int available_quantity, int Discount, int Tax, int Delivery, int Return_days, int Additional_festival_discount, String Manufacturer, String Warranty_Period, String Power_Consumption) {
        super(product_name, brand, retail_price, available_quantity, Discount, Tax, Delivery, Return_days, Additional_festival_discount, Manufacturer, Warranty_Period, Power_Consumption);

    }

    //giving actual body
    public void prepareForShipping() {
        System.out.println("Preparing product for special transportation...");
    }

    //1 products abstracct method
    @Override
    public void getDescription() {
        System.out.println("This is a tv and name is :" + this.getProductName());
    }

    //2 products abstracct method
    @Override
    public String getPostPurchaseMessage() {
        return "Handle with care i am a tv costs a lot for you";
    }
}

class Laptop extends ElectronicProduct implements vison, SpecialShipping {

    //constructor
    public Laptop(String product_name, String brand, int retail_price, int available_quantity, String Manufacturer, String Warranty_Period, String Power_Consumption, int Discount, int Tax, int Delivery, int Return_days, int Additional_festival_discount) {
        super(product_name, brand, retail_price, available_quantity, Discount, Tax, Delivery, Return_days, Additional_festival_discount, Manufacturer, Warranty_Period, Power_Consumption);

    }

    //get discriptiuon
    @Override
    protected void getDescription() {
        System.out.println("This is a Laptop and name is :" + this.getProductName());
    }

    //vison method from interface   
    public void vison() {
        System.out.println("This can use vison  and i am a Laptop");
    }

    //giving actual body
    public void prepareForShipping() {
        System.out.println("Preparing product for special transportation...");
    }

    @Override
    public String getPostPurchaseMessage() {
        return "Laptop: Please register your warranty within 30 days.";
    }
}

class BluetoothSpeaker extends ElectronicProduct implements sound {
    //constructor

    public BluetoothSpeaker(String product_name, String brand, int retail_price, int available_quantity, String Manufacturer, String Warranty_Period, String Power_Consumption, int Discount, int Tax, int Delivery, int Return_days, int Additional_festival_discount) {
        super(product_name, brand, retail_price, available_quantity, Discount, Tax, Delivery, Return_days, Additional_festival_discount, Manufacturer, Warranty_Period, Power_Consumption);

    }

    //play method from interface
    @Override
    public void play() {
        System.out.println("This can play sound and i am: Bluetooth speaker");
    }

    @Override
    public void getDescription() {
        System.out.println("This is a Blueetooth speaker and name is: " + this.getProductName());
    }

    @Override
    public String getPostPurchaseMessage() {
        return "Bluettoth speaker: Please register your warranty within 12 days.check sounds if the proper";
    }
}

class WirelessHeadphones extends ElectronicProduct implements sound {

    //constructor
    public WirelessHeadphones(String product_name, String brand, int retail_price, int available_quantity, String Manufacturer, String Warranty_Period, String Power_Consumption, int Discount, int Tax, int Delivery, int Return_days, int Additional_festival_discount) {
        super(product_name, brand, retail_price, available_quantity, Discount, Tax, Delivery, Return_days, Additional_festival_discount, Manufacturer, Warranty_Period, Power_Consumption);
    }

    //play method
    @Override
    public void play() {
        System.out.println("This can play sound and i am: WirelessHeadPhones");
    }

    @Override
    public void getDescription() {
        System.out.println("This is a headphone");
    }

    @Override
    public String getPostPurchaseMessage() {
        return "check the sound before taking delivery";
    }
}
//interfacces
//1 vison

interface vison {

    default void vison() {
        System.out.println("This can show the vison");
    }
}
//2 sound

interface sound {

    default void play() {
        System.out.println("This can play some sound music");
    }
}
//interface 3

interface SpecialShipping {

    default void prepareForShipping() {
        System.out.println("Method not overriden");
    }
}
