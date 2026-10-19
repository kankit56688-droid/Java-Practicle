class Product {
    String name;
    double price;
    int quantity;

    Product() {
        name = "Unknown";
        price = 0;
        quantity = 0;
    }

    Product(String n) {
        name = n;
        price = 0;
        quantity = 0;
    }

    Product(String n, double p) {
        name = n;
        price = p;
        quantity = 1;
    }

    Product(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    double total() {
        return price * quantity;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + total());
    }
}

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mouse", 500);
        Product p4 = new Product("Keyboard", 1000, 2);

        System.out.println("Product 1");
        p1.show();

        System.out.println("\nProduct 2");
        p2.show();

        System.out.println("\nProduct 3");
        p3.show();

        System.out.println("\nProduct 4");
        p4.show();
    }
}
