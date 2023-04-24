package Behavioral_Design_Patterns.visitor.afterJava8;

import java.math.BigDecimal;

@FunctionalInterface
public interface ShoppingCartVisitor {

    BigDecimal visit(ShoppingCartElement element);
}
