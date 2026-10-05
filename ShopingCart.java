
import java.util.ArrayList;

class ShopingCart {

    private ArrayList<Product> cart = new ArrayList<Product>();

    protected void addProduct(Product pp) {
        for (Product p : cart) {

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
        cart.add(pp);
        System.out.println("Product added to the cart");
    }

    protected void addProduct(Product[] p) {

        for (Product product : p) {
            cart.add(product);
        }
    }

    protected void addProduct(Product p, int count) {
        for (int i = 0; i < cart.size(); i++) {
            cart.add(p);
        }
    }

    protected void removeProduct(Product p) {
        cart.remove(findindex(p));
    }

    private int findindex(Product p) {
        for (int i = 0; i < cart.size(); i++) {
            if (p.getProductId() == cart.get(i).getProductId()) {
                return i;
            }
        }
        return 0;
    }

    protected void displayCart() {
        System.out.println("----------------------------------------Your cart-------------------------------------------------");
        for (Product p : cart) {
            ProductServices.getDetails(p);
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    protected double calculateTotal() {
        double sum = 0;
        for (Product p : cart) {
            sum = sum + p.getRetailPrice();
        }
        return sum;
    }

    protected double calDiscount() {
        double ans = 0;
        for (Product p : cart) {
            ans = ans + p.getDiscount() * 0.01 * p.getRetailPrice();
        }
        return ans;
    }

    protected double calTax() {
        double ans = 0;
        for (Product p : cart) {
            ans = ans + p.getTax() * 0.01 * p.getRetailPrice();
        }
        return ans;
    }

    protected double calDelivery() {
        double ans = 0;
        for (Product p : cart) {
            ans = ans + p.getDelivery();
        }
        return ans;
    }

    protected void checkout() {
        System.out.println("--- Checkout ---");
        System.out.println("Items :" + cart.size());
        System.out.println("Subtotal :₹ " + calculateTotal());
        System.out.println("Discount: ₹ " + calDiscount());
        System.out.println("Tax: ₹ " + calTax());
        System.out.println("----------------");
        System.out.println("Final Total: ₹ " + (calculateTotal() - calDiscount() + calTax() + calDelivery()));
        System.out.println("Order placed successfully!");
    }

}
