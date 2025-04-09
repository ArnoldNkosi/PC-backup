package com.bmw.proflex.flexapp.prmg.common.dto;

import com.bmw.proflex.flexapp.prmg.common.enums.BrandCode;

import java.io.Serializable;

/**
 * <b>ProductTypeIdIdBrandCode DTO</b>
 *
 * @author Thinus de Kock
 * @version 19.4
 */
public class ProductTypeIdBrandCode implements Serializable {

    private static final long serialVersionUID = 3283187597034403355L;
    private String productTypeId;
    private BrandCode brandCode;

    public ProductTypeIdBrandCode() {
    }

    public ProductTypeIdBrandCode(String productTypeId, BrandCode brandCode) {
        this.productTypeId = productTypeId;
        this.brandCode = brandCode;
    }

    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    public BrandCode getBrand() {
        return brandCode;
    }

    public void setBrand(BrandCode brandCode) {
        this.brandCode = brandCode;
    }
}