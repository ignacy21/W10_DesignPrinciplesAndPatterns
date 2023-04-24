package Behavioral_Design_Patterns.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Bicycle implements ShoppingCartElement {

    private BigDecimal price;
    private BigDecimal discount;


    @Override
    public BigDecimal accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
