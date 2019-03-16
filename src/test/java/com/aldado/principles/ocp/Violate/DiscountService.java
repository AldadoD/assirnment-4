package com.aldado.principles.ocp.Violate;

import java.math.BigDecimal;

public class DiscountService {


    public BigDecimal applyDiscount(BigDecimal price,Discount discount) {

        return discount.apply(price);

    }

    public BigDecimal applySeniorDiscount(BigDecimal price,SeniorDiscount discount) {

        return discount.apply(price);

    }

}
