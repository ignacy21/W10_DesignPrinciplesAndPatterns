package Behavioral_Design_Patterns.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Apple implements ShoppingCartElement {

    private BigDecimal pricePerKg;

    private BigDecimal weight;

    @Override
    public BigDecimal accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
