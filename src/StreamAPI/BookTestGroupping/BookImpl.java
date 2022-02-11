package StreamAPI.BookTestGroupping;

public class BookImpl<S, I extends Number> implements Book {
    String category;
    int price;

    public BookImpl(String category, int price) {
        this.category = category;
        this.price = price;
    }

    public BookImpl() {

    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public int getPrice() {
        return price*10;
    }
}
