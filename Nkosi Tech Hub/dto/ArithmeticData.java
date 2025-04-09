package com.bmw.proflex.flexapp.prmg.common.dto;

import com.bmw.proflex.flexapp.prmg.common.entity.Arithmetic;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class ArithmeticData implements Serializable {
    private Long id;
    private String name;
    private Long number;
    private String excludeOrInclude;
    private String operator;
    private String lowValue;
    private String highValue;
    private String description;

    public ArithmeticData(Arithmetic arithmetic) {
        this.id = arithmetic.getId();
        this.name = arithmetic.getName();
        this.number = arithmetic.getNumber();
        this.excludeOrInclude = arithmetic.getExcludeOrInclude();
        this.operator = arithmetic.getOperator();
        this.lowValue = arithmetic.getLowValue();
        this.highValue = arithmetic.getHighValue();
        this.description = arithmetic.getDescription();
    }
}
