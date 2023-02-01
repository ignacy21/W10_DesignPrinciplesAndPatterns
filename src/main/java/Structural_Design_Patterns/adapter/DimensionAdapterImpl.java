package Structural_Design_Patterns.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class DimensionAdapterImpl implements DimensionAdapter {

    private static final double INC_TO_METER = 0.0254;
    private Dimension dimension;

    @Override
    public BigDecimal getDimension() {
        return convertInchToMeter(dimension.getDimension());
    }

    private BigDecimal convertInchToMeter(BigDecimal dimension) {
        return BigDecimal.valueOf(INC_TO_METER).multiply(dimension);
    }
}
