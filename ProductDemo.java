abstract class Product {
    int productId;
    String name;
    double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();

    void display() {
        double discount = calculateDiscount();
        double finalPrice = price - discount;

        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
        System.out.println();
    }
}

class Electronics extends Product {
    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {
    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.20;
    }
}

class Books extends Product {
    Books(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.15;
    }
}

public class ProductDemo {
    public static void main(String[] args) {

        Product p1 = new Electronics(101, "Laptop", 60000);
        Product p2 = new Clothing(102, "Jacket", 3000);
        Product p3 = new Books(103, "Java Book", 1000);

        p1.display();
        p2.display();
        p3.display();
    }
}