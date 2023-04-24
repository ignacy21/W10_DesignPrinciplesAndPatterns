package Behavioral_Design_Patterns.visitor;

import java.math.BigDecimal;

public interface ShoppingCartElement {

    BigDecimal accept(ShoppingCartVisitor visitor);
}
