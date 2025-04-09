package com.bmw.proflex.flexapp.prmg.common.dto;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductTypeContext {
        @SerializedName("productType")
        private String productType;

        @SerializedName("brand")
        private String brand;

        @SerializedName("validFromDate")
        private String validFromDate;

        @SerializedName("validToDate")
        private String validToDate;

        @SerializedName("mdgsDataVersion")
        private int mdgsDataVersion;

        @SerializedName("language")
        private String language;

        @SerializedName("value")
        private LinkedTreeMap value;
    }
