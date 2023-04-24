package Behavioral_Design_Patterns.visitor;

import java.math.BigDecimal;
import java.sql.PreparedStatement;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public BigDecimal visit(Apple apple) {
        BigDecimal price = apple.getWeight().multiply(apple.getPricePerKg());
        System.out.printf("Calculated total apple price: %s%n", price);
        return price;
    }

    @Override
    public BigDecimal visit(Bicycle bicycle) {
        BigDecimal priceAfterDiscount = bicycle.getDiscount().subtract(bicycle.getPrice());
        System.out.printf("Calculated total bicycle price: %s%n", priceAfterDiscount);
        return priceAfterDiscount;
    }
}
