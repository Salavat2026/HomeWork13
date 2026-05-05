import java.util.Objects;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product pen = new Product(0001, "ручка", 15, "концтовары");
        Product pencil = new Product(0002, "карандаш", 10, "концтовары");
        Product book = new Product(0003, "книга", 200, "литература");
        Product pencil2 = new Product(0002, "карандаш", 10, "концтовары");

        System.out.println(pen);

        System.out.println(pen.equals(pencil));
        System.out.println(book.equals(pencil));
        System.out.println(pencil.equals(pencil2));

        Product[] productBasket1 = {pen, pencil};
        Product[] productBasket2 = {pencil, pen};
        Product[] productBasket3 = {pen, pencil};

        Order order1 = new Order("Customer 1", productBasket1 );
        Order order2 = new Order("Customer 2", productBasket2 );
        Order order3 = new Order("Customer 1", productBasket3 );

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println("order1 = order2 = "+ order1.equals(order2));
        System.out.println("order1 = order3 = "+ order1.equals(order3));



    }
}