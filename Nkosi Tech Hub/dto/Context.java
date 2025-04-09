package com.bmw.proflex.flexapp.prmg.common.dto;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Top-level class representing the JSON structure
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Context {
        @SerializedName("Context")
        private ProductTypeContext productTypeContext;
    }



