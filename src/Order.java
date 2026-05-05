import java.util.Arrays;
import java.util.Objects;

public class Order {
    private final String customer;
    private final Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Покупатель: " + customer + ", корзина: " + Arrays.toString(basket);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //Проверка, не ссылаются ли переменные на один и тот же объект.
        if (o == null || getClass() != o.getClass()) return false;//Проверка на null и совпадение классов
        Order order = (Order) o; // Кастинг
        return Objects.equals (customer, order.customer)&&Arrays.equals(basket, order.basket);
    }


}
