package Behavioral_Design_Patterns.visitor.afterJava8;

import java.math.BigDecimal;

public interface ShoppingCartElement {

    default BigDecimal accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
