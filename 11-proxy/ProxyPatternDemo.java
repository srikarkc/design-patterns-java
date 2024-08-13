public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image is loaded from disk when it's first accessed
        System.out.println("Accessing image1 for the first time:");
        image1.display();

        System.out.println("\nAccessing image1 again:");
        image1.display();

        // Image is loaded from disk when it's first accessed
        System.out.println("\nAccessing image2 for the first time:");
        image2.display();
    }
}
