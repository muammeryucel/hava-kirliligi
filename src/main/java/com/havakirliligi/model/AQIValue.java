
package com.havakirliligi.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "StationId",
    "Date",
    "SO2",
    "NO2",
    "CO",
    "O3",
    "PM10",
    "PM25",
    "SO2_N",
    "NO2_N",
    "CO_N",
    "O3_N",
    "PM10_N",
    "PM25_N",
    "CO_1",
    "O3_1",
    "PM10_1",
    "AQIIndex",
    "AQIStatus",
    "ContaminantParameter"
})
public class AQIValue {

    @JsonProperty("StationId")
    private String stationId;
    @JsonProperty("Date")
    private String date;
    @JsonProperty("SO2")
    private Double sO2;
    @JsonProperty("NO2")
    private Object nO2;
    @JsonProperty("CO")
    private Object cO;
    @JsonProperty("O3")
    private Object o3;
    @JsonProperty("PM10")
    private Double pM10;
    @JsonProperty("PM25")
    private Object pM25;
    @JsonProperty("SO2_N")
    private Double sO2N;
    @JsonProperty("NO2_N")
    private Object nO2N;
    @JsonProperty("CO_N")
    private Object cON;
    @JsonProperty("O3_N")
    private Object o3N;
    @JsonProperty("PM10_N")
    private Double pM10N;
    @JsonProperty("PM25_N")
    private Object pM25N;
    @JsonProperty("CO_1")
    private Object cO1;
    @JsonProperty("O3_1")
    private Object o31;
    @JsonProperty("PM10_1")
    private Double pM101;
    @JsonProperty("AQIIndex")
    private Double aQIIndex;
    @JsonProperty("AQIStatus")
    private Integer aQIStatus;
    @JsonProperty("ContaminantParameter")
    private String contaminantParameter;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("StationId")
    public String getStationId() {
        return stationId;
    }

    @JsonProperty("StationId")
    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    @JsonProperty("Date")
    public String getDate() {
        return date;
    }

    @JsonProperty("Date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("SO2")
    public Double getSO2() {
        return sO2;
    }

    @JsonProperty("SO2")
    public void setSO2(Double sO2) {
        this.sO2 = sO2;
    }

    @JsonProperty("NO2")
    public Object getNO2() {
        return nO2;
    }

    @JsonProperty("NO2")
    public void setNO2(Object nO2) {
        this.nO2 = nO2;
    }

    @JsonProperty("CO")
    public Object getCO() {
        return cO;
    }

    @JsonProperty("CO")
    public void setCO(Object cO) {
        this.cO = cO;
    }

    @JsonProperty("O3")
    public Object getO3() {
        return o3;
    }

    @JsonProperty("O3")
    public void setO3(Object o3) {
        this.o3 = o3;
    }

    @JsonProperty("PM10")
    public Double getPM10() {
        return pM10;
    }

    @JsonProperty("PM10")
    public void setPM10(Double pM10) {
        this.pM10 = pM10;
    }

    @JsonProperty("PM25")
    public Object getPM25() {
        return pM25;
    }

    @JsonProperty("PM25")
    public void setPM25(Object pM25) {
        this.pM25 = pM25;
    }

    @JsonProperty("SO2_N")
    public Double getSO2N() {
        return sO2N;
    }

    @JsonProperty("SO2_N")
    public void setSO2N(Double sO2N) {
        this.sO2N = sO2N;
    }

    @JsonProperty("NO2_N")
    public Object getNO2N() {
        return nO2N;
    }

    @JsonProperty("NO2_N")
    public void setNO2N(Object nO2N) {
        this.nO2N = nO2N;
    }

    @JsonProperty("CO_N")
    public Object getCON() {
        return cON;
    }

    @JsonProperty("CO_N")
    public void setCON(Object cON) {
        this.cON = cON;
    }

    @JsonProperty("O3_N")
    public Object getO3N() {
        return o3N;
    }

    @JsonProperty("O3_N")
    public void setO3N(Object o3N) {
        this.o3N = o3N;
    }

    @JsonProperty("PM10_N")
    public Double getPM10N() {
        return pM10N;
    }

    @JsonProperty("PM10_N")
    public void setPM10N(Double pM10N) {
        this.pM10N = pM10N;
    }

    @JsonProperty("PM25_N")
    public Object getPM25N() {
        return pM25N;
    }

    @JsonProperty("PM25_N")
    public void setPM25N(Object pM25N) {
        this.pM25N = pM25N;
    }

    @JsonProperty("CO_1")
    public Object getCO1() {
        return cO1;
    }

    @JsonProperty("CO_1")
    public void setCO1(Object cO1) {
        this.cO1 = cO1;
    }

    @JsonProperty("O3_1")
    public Object getO31() {
        return o31;
    }

    @JsonProperty("O3_1")
    public void setO31(Object o31) {
        this.o31 = o31;
    }

    @JsonProperty("PM10_1")
    public Double getPM101() {
        return pM101;
    }

    @JsonProperty("PM10_1")
    public void setPM101(Double pM101) {
        this.pM101 = pM101;
    }

    @JsonProperty("AQIIndex")
    public Double getAQIIndex() {
        return aQIIndex;
    }

    @JsonProperty("AQIIndex")
    public void setAQIIndex(Double aQIIndex) {
        this.aQIIndex = aQIIndex;
    }

    @JsonProperty("AQIStatus")
    public Integer getAQIStatus() {
        return aQIStatus;
    }

    @JsonProperty("AQIStatus")
    public void setAQIStatus(Integer aQIStatus) {
        this.aQIStatus = aQIStatus;
    }

    @JsonProperty("ContaminantParameter")
    public String getContaminantParameter() {
        return contaminantParameter;
    }

    @JsonProperty("ContaminantParameter")
    public void setContaminantParameter(String contaminantParameter) {
        this.contaminantParameter = contaminantParameter;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
