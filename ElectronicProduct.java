
abstract class ElectronicProduct extends Product {

    protected String Manufacturer;
    protected String Warranty_Period;
    protected String Power_Consumption;
    protected Manufacturer Manufacture;

    public ElectronicProduct(String product_name, String brand, int retail_price, int available_quantity, int Discount,
            int Tax, int Delivery, int Return_days, int Additional_festival_discount, String Manufacturer, String Warranty_periodString, String Power_Consumption,
            Manufacturer m) {

        super(product_name, brand, retail_price, available_quantity, Discount, Tax, Delivery, Return_days, Additional_festival_discount);

        this.Manufacturer = Manufacturer;
        this.Warranty_Period = Warranty_Period;
        this.Power_Consumption = Power_Consumption;
        this.setCategory("Electronics");
        this.Manufacture = m;
    }

    public ElectronicProduct(ElectronicProduct e) {
        super(e);
        this.Manufacturer = Manufacturer;
        this.Warranty_Period = Warranty_Period;
        this.Power_Consumption = Power_Consumption;
        this.setCategory("Electronics");
    }

}

class Television extends ElectronicProduct implements SpecialShipping {

    //constructor
    public Television(String product_name, String brand, int retail_price, int available_quantity, int Discount, int Tax, int Delivery, int Return_days, int Additional_festival_discount, String Manufacturer, String Warranty_Period, String Power_Consumption, Manufacturer m) {
        super(product_name, brand, retail_price, available_quantity, Discount, Tax, Delivery, Return_days, Additional_festival_discount, Manufacturer, Warranty_Period, Power_Consumption, m);

    }

    public Television(Television t) {
        super(t);
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
    public Laptop(String product_name, String brand, int retail_price, int available_quantity, String Manufacturer, String Warranty_Period, String Power_Consumption, int Discount, int Tax, int Delivery, int Return_days, int Additional_festival_discount, Manufacturer m) {
        super(product_name, brand, retail_price, available_quantity, Discount, Tax, Delivery, Return_days, Additional_festival_discount, Manufacturer, Warranty_Period, Power_Consumption, m);

    }

    //clone
    public Laptop(Television t) {
        super(t);
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

    public BluetoothSpeaker(String product_name, String brand, int retail_price, int available_quantity, String Manufacturer, String Warranty_Period, String Power_Consumption, int Discount, int Tax, int Delivery, int Return_days, int Additional_festival_discount, Manufacturer m) {
        super(product_name, brand, retail_price, available_quantity, Discount, Tax, Delivery, Return_days, Additional_festival_discount, Manufacturer, Warranty_Period, Power_Consumption, m);

    }

    //clone
    public BluetoothSpeaker(Television t) {
        super(t);
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
    public WirelessHeadphones(String product_name, String brand, int retail_price, int available_quantity, String Manufacturer, String Warranty_Period, String Power_Consumption, int Discount, int Tax, int Delivery, int Return_days, int Additional_festival_discount, Manufacturer m) {
        super(product_name, brand, retail_price, available_quantity, Discount, Tax, Delivery, Return_days, Additional_festival_discount, Manufacturer, Warranty_Period, Power_Consumption, m);
    }

    //clone
    public WirelessHeadphones(Television t) {
        super(t);
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

class Manufacturer {

    private String Name;
    private String country;

    public Manufacturer(String Name, String country) {
        this.Name = Name;
        this.country = country;
    }

    //clone deep copy
    public Manufacturer(Manufacturer m) {
        this.Name = m.Name;
        this.country = m.country;
    }

    //getter setters
    protected void setName(String name) {
        this.Name = name;
    }

    protected void setCountry(String country) {
        this.country = country;
    }

    protected String getName() {
        return this.Name;
    }

    protected String getCountry() {
        return this.country;
    }

    public void display() {
        System.out.println("***************Manufacturer info***********");
        System.out.println("Name is :" + this.Name);
        System.out.println("Country is : " + this.country);
    }
}
