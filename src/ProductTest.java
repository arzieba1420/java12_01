public class ProductTest {
    public static void main(String[] args) {
        Product testProduct = new Product("mleko",2.50);

        Product [] products  = new Product[3];
        products[0] = new Product("mleko",2.50);
        products[1] = new Product("jajka",5.00);
        products[2] = new Product("bułka",0.99);

        for (Product p:products) {
            if (p.equals(testProduct)){
                System.out.println(p.toString()+ " - Ten sam produkt");
            } else System.out.println(p.toString() + " -  Inny produkt");
        }
    }
}
