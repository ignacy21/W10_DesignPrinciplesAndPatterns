package Behavioral_Design_Patterns.visitor.afterJava8;

import java.math.BigDecimal;
import java.util.Map;
import java.util.function.Function;

public class ShoppingCartVisitorMap implements Function<Class<? extends ShoppingCartElement>, ShoppingCartVisitor> {

    private static final Map<Class<? extends ShoppingCartElement>, ? extends ShoppingCartVisitor> VISITORS = Map.of(
            Apple.class, element -> visit((Apple) element),
            Bicycle.class, element -> visit((Bicycle) element)
            );

    private static BigDecimal visit(final Apple apple) {
        BigDecimal totalCost = apple.getWeight().multiply(apple.getPricePerKg());
        System.out.printf("Calculated total apple price: %s%n", totalCost);
        return totalCost;
    }
    private static BigDecimal visit(final Bicycle bicycle) {
        BigDecimal totalCost = bicycle.getPrice().multiply(bicycle.getDiscount());
        System.out.printf("Calculated total bicycle price: %s%n", totalCost);
        return totalCost;
    }

    @Override
    public ShoppingCartVisitor apply(Class<? extends ShoppingCartElement> aClass) {
        return VISITORS.get(aClass);
    }
}
