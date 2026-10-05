
class test {

    public static void main(String[] args) throws CloneNotSupportedException {
        //     Product m1 = new Dolo("Dolo", "yashika health", 99, 1000, 12, 3, 4, 6, 10,
        //             "Yashika Manufacturers", "2028", 120);
        //     Product m2 = new Dolo("Dolo1", "sheshi health", 81, 500, 11, 3, 4, 9, 10,
        //             "Sheshi Manufacturers", "2029", 120);
        //     //grocery
        //     Product g1 = new Milk("Milk", "Amul", 200, 145, 12, 1, 22, 1, 1, "Amul", 12, 1000);

        //     Product g2 = new Bread("Bread", "Bread babi", 199, 145, 12, 1, 22, 1, 22, "Yahshikas bread", 12, 1000);
        //     Product g3 = new Juice("juice", "papas juices", 111, 145, 11, 1, 12, 1, 12, "papas juice manufacture", 1, 12);
        //     //electronic 
        //     Product e1 = new Television("TV", "Sony", 58000, 34, 12, 1, 1200, 12, 1, "yashus tvs", "32days", "more");
        //     ProductServices p = new ProductServices();
        //     p.getDetails(g3);
        //     p.getDetails(e1);
        //     // Milk gg1=(Milk) g1;
        //     Milk g4 = new Milk("Milk", "Amul", 200, 145, 12, 1, 22, 1, 1, "Amul", 12, 1000);
        //     g1.getDescription();
        //     Product found = p.searcgById(g1.getProductId());
        //     System.out.println("ID I am searching for: " + g1.getProductId());
        //     if (found != null) {
        //         p.getDetails(found);
        //     } else {
        //         System.out.println("Product was NOT found");
        //     }
        // }
        // ProductServices p = new ProductServices();
        // Product g1 = new Milk(
        //         "Milk", "Amul", 200, 145, 12, 1, 22, 1, 1,
        //         "Amul", 12, 1000
        // );
        // Product g2 = new Bread(
        //         "Bread", "Bread babi", 199, 145, 12, 1, 22, 1, 22,
        //         "Yahshikas bread", 12, 1000
        // );
        // Product found = p.searcgById(g1.getProductId());
        // if (found != null) {
        //     p.getDetails(found);
        // }
        // //min max products
        // Product min = p.minPriceProduct();
        // if (min != null) {
        //     p.getDetails(min);
        // } else {
        //     System.out.println("No product found.");
        // }
        // Product max = p.maxPriceProduct();
        // if (max != null) {
        //     p.getDetails(max);
        // } else {
        //     System.out.println("No product found.");
        // }
        // System.out.println("Average price is :" + p.averagePrice());
        // // retail inventory value 
        // System.out.println(p.retailinventoryvalue(g1));
        // p.CommonProductProcessing(g2);
        // p.displayProductDetails();
        // p.calculateDeliveryCharge();
        // ShopingCart sc=new ShopingCart();
        // sc.addProduct(g2);
        // sc.addProduct(g1);
        // sc.Display();
        // Product p1 = new Milk(
        //         "Full Cream Milk", "Amul", 65, 50, 5, 5, 20, 7, 10,
        //         "01-10-2026", 7, 500
        // );
        // Product p2 = new Bread(
        //         "Brown Bread", "Britannia", 45, 30, 5, 5, 15, 3, 5,
        //         "01-10-2026", 5, 400
        // );
        // Product p3 = new Juice(
        //         "Mango Juice", "Real", 120, 20, 10, 5, 25, 7, 10,
        //         "25-09-2026", 180, 1000
        // );
        // Product p4 = new Milk(
        //         "Toned Milk", "Nandini", 55, 40, 3, 5, 20, 7, 5,
        //         "02-10-2026", 6, 500
        // );
        // Product p5 = new Bread(
        //         "Multigrain Bread", "Harvest Gold", 65, 20, 8, 5, 15, 3, 5,
        //         "02-10-2026", 6, 400
        // );
        // Product p6 = new Juice(
        //         "Orange Juice", "Tropicana", 110, 15, 8, 5, 25, 7, 10,
        //         "26-09-2026", 180, 1000
        // );
        // Product p7 = new Milk(
        //         "Low Fat Milk", "Heritage", 60, 35, 4, 5, 20, 7, 5,
        //         "01-10-2026", 6, 500
        // );
        // Product p8 = new Bread(
        //         "Milk Bread", "English Oven", 50, 25, 5, 5, 15, 3, 5,
        //         "02-10-2026", 5, 400
        // );
        // Product p9 = new Juice(
        //         "Apple Juice", "Real", 130, 18, 10, 5, 25, 7, 10,
        //         "28-09-2026", 180, 1000
        // );
        // // Product duplicate = new Juice(
        // //         "Apple Juice", "Real", 130, 18, 10, 5, 25, 7, 10,
        // //         "28-09-2026", 180, 1000
        // // );
        // Product p10 = new Milk(
        //         "Organic Milk", "Country Delight", 80, 15, 5, 5, 20, 7, 10,
        //         "01-10-2026", 5, 500
        // );
        // //electronics
        // Product e4 = new Laptop(
        //         "Business Laptop", "Dell",
        //         72000, 12,
        //         "Dell Technologies", "3 Years", "65W",
        //         8, 18, 250, 10, 5
        // );
        // Product e5 = new Laptop(
        //         "MacBook Air", "Apple",
        //         105000, 6,
        //         "Apple Inc.", "1 Year", "30W",
        //         5, 18, 300, 7, 5
        // );
        // Product e6 = new BluetoothSpeaker(
        //         "Portable Bluetooth Speaker", "JBL",
        //         8500, 25,
        //         "JBL", "1 Year", "20W",
        //         10, 18, 100, 7, 5
        // );
        // Product e7 = new BluetoothSpeaker(
        //         "Party Speaker", "Sony",
        //         15000, 15,
        //         "Sony India", "1 Year", "50W",
        //         8, 18, 150, 7, 5
        // );
        // Product e8 = new WirelessHeadphones(
        //         "Wireless Headphones", "Boat",
        //         3500, 40,
        //         "Boat", "1 Year", "5W",
        //         15, 18, 50, 7, 5
        // );
        // Product e9 = new WirelessHeadphones(
        //         "Noise Cancelling Headphones", "Sony",
        //         22000, 10,
        //         "Sony India", "2 Years", "8W",
        //         10, 18, 100, 7, 5
        // );
        // Product e10 = new Television(
        //         "OLED 65 Inch TV", "Sony",
        //         145000, 5,
        //         12, 18, 700, 10, 5,
        //         "Sony Electronics", "3 Years", "180W"
        // );
        // //medicines
        // Product m1 = new Dolo(
        //         "Dolo 650", "Micro Labs",
        //         30, 100,
        //         5, 5, 20, 7, 5,
        //         "Micro Labs Limited", "365", 650
        // );
        // Product m2 = new Dolo(
        //         "Dolo 500", "Micro Labs",
        //         25, 80,
        //         3, 5, 20, 7, 5,
        //         "Micro Labs Limited", "300", 500
        // );
        // ProductServices service = new ProductServices();
        // // service.displayCart();
        // // service.calculateDeliveryCharge();
        // ShopingCart c = new ShopingCart();
        // c.addProduct(new Product[]{p1, p3, m1, m2, e1});
        // // c.displayCart();
        // service.printall();
        // System.out.println(p1.equals("helo"));
        // Product p1 = new Milk(
        //         "Full Cream Milk", "Amul", 65, 50, 5, 5, 20, 7, 10,
        //         "01-10-2026", 7, 500
        // );
        // Product p2 = new Bread(
        //         "Full Cream Milk", "Britannia", 45, 30, 5, 5, 15, 3, 5,
        //         "01-10-2026", 5, 400
        // );
        // Product p3 = new Juice(
        //         "Full Cream Milk", "Real", 120, 20, 10, 5, 25, 7, 10,
        //         "25-09-2026", 180, 1000
        // );
        // Product milk1 = new Milk(
        //         "Amul Milk",
        //         "Amul",
        //         60, // retail_price
        //         5, // available_quantity
        //         10, // Discount
        //         5, // Tax
        //         20, // Delivery
        //         7, // Return_days
        //         5, // Additional_festival_discount
        //         "01-10-2026", // Manufacturing
        //         10, // Expire
        //         500 // Weight
        // );
        // Product milk2 = new Milk(
        //         "arun Milk",
        //         "Amul",
        //         60, // retail_price
        //         10, // available_quantity
        //         10, // Discount
        //         5, // Tax
        //         20, // Delivery
        //         7, // Return_days
        //         5, // Additional_festival_discount
        //         "02-10-2026", // Manufacturing
        //         10, // Expire
        //         500 // Weight
        // );
        // Product milk3 = (Product) milk1.clone();
        // Product e1 = new Television(
        //         "Smart TV 55 Inch", "Samsung",
        //         65000, 10,
        //         10, 18, 500, 7, 5,
        //         "Samsung Electronics", "2 Years", "120W"
        // );
        // Product e2 = new Television(
        //         "LED TV 43 Inch", "LG",
        //         45000, 15,
        //         8, 18, 500, 7, 5,
        //         "LG Electronics", "2 Years", "100W"
        // );
        // Product e3 = new Laptop(
        //         "Gaming Laptop", "ASUS",
        //         85000, 8,
        //         "ASUS India", "2 Years", "180W",
        //         10, 18, 300, 10, 5
        // );
        // ShopingCart sc = new ShopingCart();
        // // sc.addProduct(milk1);
        // // sc.addProduct(milk2);
        // System.out.println("---------------------------------------------------");
        // System.out.println(ProductServices.products1);
        // milk3.getBrand();
        // milk3.getDescription();
        // // milk1.setRetailPrice(10);
        // // milk1.setRetailPrice(20);
        // // milk1.setRetailPrice(30);
        // // milk1.setRetailPrice(40);
        // // milk1.setRetailPrice(50);
        // // milk1.setRetailPrice(60);
        // // milk1.setRetailPrice(70);
        // // milk1.setRetailPrice(80);
        // // milk1.setRetailPrice(10);
        // milk1.price_history();
        // System.out.println(milk3.equals(milk1));
        // Product e4 = (Product) e1.clone();
        // e4.getDescription();
        // e4.setCategory("nothing");
        // System.out.println(e4.getCategory());
        // Product e5=new (Product)e1.clone();
        // Product milk1 = new Milk(
        //         "Amul Milk",
        //         "Amul",
        //         60, // retail_price
        //         5, // available_quantity
        //         10, // Discount
        //         5, // Tax
        //         20, // Delivery
        //         7, // Return_days
        //         5, // Additional_festival_discount
        //         "01-10-2026", // Manufacturing
        //         10, // Expire
        //         500 // Weight
        // );
        // Product testing = new Milk(
        //         "arun Milk",
        //         "Amul",
        //         8000, // retail_price
        //         10, // available_quantity
        //         10, // Discount
        //         5, // Tax
        //         20, // Delivery
        //         7, // Return_days
        //         5, // Additional_festival_discount
        //         "02-10-2026", // Manufacturing
        //         10, // Expire
        //         500 // Weight
        // );
        // // Milk copy = new Milk((Milk) testing);
        // // Product n = (Product) copy;
        // ProductServices service = new ProductServices();
        // // service.getDetails(n);
        // Product original = new Milk(
        //         "Milk", "Amul", 60, 100,
        //         5, 18, 10, 7, 0,
        //         "01-10-2026", 7, 2
        // );
        // Milk copy = new Milk((Milk) original);
        // // System.out.println(original.getExpire());
        // // service.getDetails(copy);
        // System.out.println("------------------------------------------------");
        // System.out.println(copy.getExpire());
        Manufacturer m1 = new Manufacturer("Sheshanth ", "india");
        Product tv = new Television(
                "Smart TV",
                "Samsung",
                50000,
                10,
                10,
                18,
                500,
                7,
                5,
                "Samsung",
                "2 years",
                "150W",
                new Manufacturer("Samsung", "South Korea")
        );
        Product laptop = new Laptop(
                "Gaming Laptop",
                "Dell",
                80000,
                5,
                "Dell",
                "3 years",
                "180W",
                10,
                18,
                500,
                7,
                5,
                new Manufacturer("Dell", "USA")
        );
        Product speaker = new BluetoothSpeaker(
                "Bluetooth Speaker",
                "Sony",
                8000,
                20,
                "Sony",
                "1 year",
                "20W",
                5,
                18,
                100,
                7,
                2,
                new Manufacturer("Sony", "Japan")
        );
        Product headphones = new WirelessHeadphones(
                "Wireless Headphones",
                "Boat",
                3000,
                30,
                "Boat",
                "1 year",
                "10W",
                5,
                18,
                50,
                7,
                2,
                new Manufacturer("Boat", "India")
        );
        Product tv2 = new Television(
                "OLED TV",
                "LG",
                90000,
                5,
                8,
                18,
                700,
                10,
                5,
                "LG",
                "3 years",
                "200W",
                new Manufacturer("LG", "South Korea")
        );
        ProductServices service = new ProductServices();
        service.printall();
        Manufacturer m2 = new Manufacturer(m1);
        m2.setName("sai Yashika fellow");
        m1.display();
        m2.display();
    }
}
