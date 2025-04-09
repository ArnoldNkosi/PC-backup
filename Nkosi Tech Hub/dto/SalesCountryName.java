package com.bmw.proflex.flexapp.prmg.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesCountryName {
    private Map<String, LinkedTreeMapNode> value;
}
