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


    }
}