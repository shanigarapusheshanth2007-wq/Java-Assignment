
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ProductServices {

    static List<Product> products = new ArrayList<Product>();
    static Set<Product> products1 = new HashSet<Product>();

    static public void getDetails(Product p) {
        System.out.println("--->Details");
        System.out.println(p.getCategory());
        System.out.println("Retail price :" + p.getRetailPrice());
        System.out.println("Discount : " + p.getDiscount() + "% | Tax: " + p.getTax() + "% | Delivery: ₹" + p.getDelivery() + "\n"
                + "Return: " + p.getReturn_days() + " days | Additional festival discount: " + p.getAdditional_festival_discount() + "%");
        // System.out.println("-------------------------------------------------------------=------------");ff
    }

    //search methods
    //by id
    //update product


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
            if (i.getProductName().equals(name)) {
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
    //for(Product p: products)

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

    //
    static void addToProduct(Product pp) {

        for (Product p : products) {

            if (p.equals(pp)) {
                System.out.println("Product already exists");

                System.out.println("Previous available quantity: "
                        + p.getAvailableQuantity());

                System.out.println("Added quantity: "
                        + pp.getAvailableQuantity());

                p.addAvailable(pp.getAvailableQuantity());

                System.out.println("Total available quantity: "
                        + p.getAvailableQuantity());

                return;
            }
        }

        // If we reach here, product was NOT found
        products.add(pp);
        products1.add(pp);
        System.out.println("New product added");
        pp.history_creator();
        pp.setRetailPrice(pp.getRetailPrice());
    }

    public void printall() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

}
