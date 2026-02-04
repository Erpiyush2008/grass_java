class Product {

    public int productId;
    public double price;
}
public class non_encapuslated {
    public static void main(String[] args) {

        Product p = new Product();
        p.productId = 501;
        p.price = 999.99;

        System.out.println(p.productId);
        System.out.println(p.price);
    }
}
