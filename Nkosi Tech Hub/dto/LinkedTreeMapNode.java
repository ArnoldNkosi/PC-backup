package com.bmw.proflex.flexapp.prmg.common.dto;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;
import lombok.*;

import java.util.HashMap;
import java.util.Map;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LinkedTreeMapNode {
    private Map<String, LinkedTreeMap> nestedNodes = new HashMap<>();
    private Map<String, String> values = new HashMap<>();
    // Maps for string-to-string translations
    @SerializedName("key2Value")
    private Map<String, String> key2Value = new HashMap<>();

    @SerializedName("value2Key")
    private Map<String, String> value2Key = new HashMap<>();

    @SerializedName("Sales Country Cluster|Sales Area Detail")
    private LinkedTreeMap salesCountryClusterSalesAreaDetail;

    @SerializedName("Sales Country Cluster|Temperate Zone")
    private LinkedTreeMap salesCountryClusterTemperateZone;

    @SerializedName("Sales Country Cluster")
    private LinkedTreeMap salesCountryCluster;

    @SerializedName("Sub-Region|Region")
    private LinkedTreeMap subRegionRegion;

    @SerializedName("Sales Area|Sub-Region")
    private LinkedTreeMap salesAreaSubRegion;

    @SerializedName("Country|Sales Country Cluster")
    private LinkedTreeMap countrySalesCountryCluster;

    @SerializedName("levelName")
    private LinkedTreeMap levelName;

    @SerializedName("Sub-Region|Temperate Zone")
    private LinkedTreeMap subRegionTemperateZone;

    @SerializedName("Sales Area Detail|name")
    private LinkedTreeMap salesAreaDetailName;

    @SerializedName("Sub-Region")
    private LinkedTreeMap subRegion;

    @SerializedName("Sales Area Detail|Temperate Zone")
    private LinkedTreeMap salesAreaDetailTemperateZone;

    @SerializedName("Sales Area")
    private LinkedTreeMap salesArea;

    @SerializedName("Sales Area Detail|Sales Area")
    private LinkedTreeMap salesAreaDetailSalesArea;

    @SerializedName("Sub-Region|name")
    private LinkedTreeMap subRegionName;
    public LinkedTreeMap getNestedNode(String key) {
        return nestedNodes.get(key);
    }
    public void addNestedNode(String key, LinkedTreeMap node) {
        nestedNodes.put(key, node);
    }
    public String getValue(String key) {
        return values.get(key);
    }
    public void addValue(String key, String value) {
        values.put(key, value);
    }
}
