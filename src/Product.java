import java.util.Objects;
public class Product {
    int id;
    String name;
    int price;
    String category;

    public Product(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Товар [артикул = " + this.id + ", название = " + this.name + ", цена = " + this.price + ", категория = " + this.category + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //Проверка, не ссылаются ли переменные на один и тот же объект.
        if (o == null || getClass() != o.getClass()) return false;//Проверка на null и совпадение классов
        Product product = (Product) o; // Кастинг
        return id == product.id && Objects.equals(category, product.category);//Сравнение конкретных полей
    }
}

