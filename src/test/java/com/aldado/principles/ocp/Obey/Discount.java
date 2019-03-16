package com.aldado.principles.ocp.Obey;

import java.math.BigDecimal;

public interface Discount {

    BigDecimal apply(BigDecimal price);
}
