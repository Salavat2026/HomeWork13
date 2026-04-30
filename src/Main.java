import java.util.Objects;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product N1 = new Product(0001, "ручка", 15, "концтовары");
        System.out.println(N1);
        Product N2 = new Product(0001, "карандаш", 10, "концтовары");// одинаковые id и категория
        System.out.println(N2);
        Product N3 = new Product(0003, "book", 200, "книги");
        System.out.println(N3);


        System.out.println(N1.equals(N2)); // true т.к. id и категории совпали
        System.out.println(N1.equals(N3)); // false т.к. id b категории не совпали

        Product[] basket1 = {N1, N3};
        Product[] basket2 = {new Product(001, "ручка", 15, "концтовары"), N3};
        System.out.println(Arrays.toString(basket1));
        System.out.println(Arrays.toString(basket2));

        Order order1 = new Order("Лиля", basket1);
        Order order2 = new Order("Лиля", basket2);
        Order order3 = new Order("Роман", basket1);
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

        System.out.println("Заказ 1 == Заказ 2: " + order1.equals(order2)); // true
        System.out.println("Заказ 1 == Заказ 3: " + order1.equals(order3)); // false

    }
}