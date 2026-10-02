
import java.util.ArrayList;

class ProductServices {

    static ArrayList<Product> products = new ArrayList<Product>();

    static public void getDetails(Product p) {
        System.out.println("--->Details");
        System.out.println(p.getCategory());
        System.out.println("Discount : " + p.getDiscount() + "% | Tax: " + p.getTax() + "% | Delivery: ₹" + p.getDelivery() + "\n"
                + "Return: " + p.getReturn_days() + " days | Additional festival discount: " + p.getAdditional_festival_discount() + "%");
        // System.out.println("-------------------------------------------------------------=------------");ff
    }
    //search methods
    //by id

    public Product searcgById(int id) {
        System.out.println("------------------------------Searchbyid-------------------------------------------");

        for (Product i : products) {
            if (i.getProductId() == id) {
                return i;
            }
        }

        System.out.println("Product with id " + id + " not found!");
        return null;
    }

    //by name
    public Product searchByName(String name) {
        System.out.println("------------------------------Searchbyid-------------------------------------------");

        for (Product i : products) {
            if (i.getProductName() == name) {
                return i;
            }
        }

        System.out.println("Product with id " + name + " not found!");
        return null;
    }

    //min price product
    public Product minPriceProduct() {
        if (products == null) {
            System.out.println("This is null no product present in it");
            return null;
        }
        int min = Integer.MAX_VALUE;
        Product ans = null;
        for (Product p : products) {
            if (p.getRetailPrice() < min) {
                min = p.getRetailPrice();
                ans = p;
            }
        }
        return ans;
    }

    //max price product
    public Product maxPriceProduct() {
        if (products == null) {
            System.out.println("This is null no product present in it");
            return null;
        }
        int max = Integer.MIN_VALUE;
        Product ans = null;
        for (Product p : products) {
            if (p.getRetailPrice() < max) {
                max = p.getRetailPrice();
                ans = p;
            }
        }
        return ans;
    }

    //average price,
    public double averagePrice() {
        double ans = 0;
        for (Product p : products) {
            ans = ans + p.getRetailPrice();
        }
        return ans / products.size();
    }

    // retail inventory value 
    public double retailinventoryvalue(Product pa) {
        double ans = pa.getRetailPrice() * pa.getAvailableQuantity();
        return ans;
    }

    public void CommonProductProcessing(Product p) {
        System.out.println("----------------------------Common Product Processing-------------------------");
        System.out.println("name :" + p.getProductName());
        System.out.println("retail price :" + p.getRetailPrice() + " ₹");
        System.out.println("category :" + p.getCategory());
        System.out.println("Avialable quantity :" + p.getAvailableQuantity());
        System.out.println("Product id: " + p.getProductId());
        System.out.println("Brand :" + p.getBrand());
        System.out.println("Additional_festival_discount :" + p.getAdditional_festival_discount());
        System.out.println("------------------------------------------------------------------------------");
    }

    //displpay all displayProductDetails()
    public void displayProductDetails() {
        System.out.println("-------------------------------------------All product details-----------------------------------");
        for (int i = 0; i < products.size(); i++) {
            System.out.println("-->product number " + i + "");
            ProductServices.getDetails(products.get(i));
        }
        System.out.println("-------------------------------------------------End---------------------------------------------");
    }

    //dalculateDiscount(),
    public void calculateDiscount() {
        System.out.println("-------------------------------------------All product Discount() details-----------------------------------");
        for (int i = 0; i < products.size(); i++) {
            System.out.println("-->product number " + i + "");
            System.out.println("Discount is: " + products.get(i).getDiscount() + " %");
        }
        System.out.println("-------------------------------------------------End---------------------------------------------");
    }

    //calculateTax(),
    public void calculateTax() {
        System.out.println("-------------------------------------------All product Tax-----------------------------------");
        for (int i = 0; i < products.size(); i++) {
            System.out.println("-->product number " + i + "");
            System.out.println("Tax is: " + products.get(i).getTax() + " %");
        }
        System.out.println("-------------------------------------------------End---------------------------------------------");
    }

    // calculateDeliveryCharge(),
    public void calculateDeliveryCharge() {
        System.out.println("-----------------------------------Deliverycharges------------------------------------------");
        for (int i = 0; i < products.size(); i++) {
            System.out.println("-->product number " + i + "");
            System.out.println("Delivery charge is: " + products.get(i).getDelivery() + " %");
        }
        System.out.println("-------------------------------------------------End---------------------------------------------");

    }


}
