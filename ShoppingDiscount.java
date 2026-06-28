@FunctionalInterface
interface Discount {
    double calculate(double price, boolean isStudent);
}

public class ShoppingDiscount {

    public static void main(String[] args) {
        Discount discount = (price, isStudent) -> {
            double discounted = isStudent ? price * 0.80: price * 0.95;
            return price > 1000 ? discounted - 50 : discounted;
        };

        System.out.println(discount.calculate(1200, true));
    }

}

