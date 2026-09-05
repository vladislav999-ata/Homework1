//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(312, "basket", 12, "sport");
        Product product2 = new Product(312, "basket", 12, "sport");
        Product product3 = new Product(315, "basket", 18, "sport");

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product1.equals(product2));
        System.out.println(product2.equals(product3));
        System.out.println(product1.equals(product3));

        Product[] basket1 = {product1, product2};
        Product[] basket2 = {product2, product3};

        Order order1 = new Order("Покупатель ", basket1);
        Order order2 = new Order("Покупатель ", basket2);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order1.equals(order2));

    }
}
