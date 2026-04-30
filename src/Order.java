import java.util.Arrays;
import java.util.Objects;

public class Order {
    String customer;
    Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Заказ[клиент=" + customer + ", корзина=" + Arrays.toString(basket) + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //Проверка, не ссылаются ли переменные на один и тот же объект.
        if (o == null || getClass() != o.getClass()) return false;//Проверка на null и совпадение классов
        Order order = (Order) o; // Кастинг

        if (!Objects.equals(customer, order.customer)) return false;

        if (this.basket == order.basket) return true;
        if (this.basket == null || order.basket == null) return false;
        if (this.basket.length != order.basket.length) return false;

        for (int i = 0; i < basket.length; i++) {
            Product N1 = this.basket[i];
            Product N2 = order.basket[i];
            if (!(N1 == null ? N2 == null : N1.equals(N2))) return false;
        }
        return true;
    }


}
