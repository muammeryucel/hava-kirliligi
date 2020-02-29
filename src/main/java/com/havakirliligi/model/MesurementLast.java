
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
    "DataDate",
    "created",
    "SO2",
    "NO2",
    "CO",
    "O3",
    "PM10",
    "PM25",
    "Nem",
    "Sicaklik",
    "RuzgarHizi",
    "RuzgarYon"
})
public class MesurementLast {

    @JsonProperty("StationId")
    private String stationId;
    @JsonProperty("DataDate")
    private String dataDate;
    @JsonProperty("created")
    private String created;
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
    @JsonProperty("Nem")
    private Object nem;
    @JsonProperty("Sicaklik")
    private Object sicaklik;
    @JsonProperty("RuzgarHizi")
    private Object ruzgarHizi;
    @JsonProperty("RuzgarYon")
    private Object ruzgarYon;
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

    @JsonProperty("DataDate")
    public String getDataDate() {
        return dataDate;
    }

    @JsonProperty("DataDate")
    public void setDataDate(String dataDate) {
        this.dataDate = dataDate;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
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

    @JsonProperty("Nem")
    public Object getNem() {
        return nem;
    }

    @JsonProperty("Nem")
    public void setNem(Object nem) {
        this.nem = nem;
    }

    @JsonProperty("Sicaklik")
    public Object getSicaklik() {
        return sicaklik;
    }

    @JsonProperty("Sicaklik")
    public void setSicaklik(Object sicaklik) {
        this.sicaklik = sicaklik;
    }

    @JsonProperty("RuzgarHizi")
    public Object getRuzgarHizi() {
        return ruzgarHizi;
    }

    @JsonProperty("RuzgarHizi")
    public void setRuzgarHizi(Object ruzgarHizi) {
        this.ruzgarHizi = ruzgarHizi;
    }

    @JsonProperty("RuzgarYon")
    public Object getRuzgarYon() {
        return ruzgarYon;
    }

    @JsonProperty("RuzgarYon")
    public void setRuzgarYon(Object ruzgarYon) {
        this.ruzgarYon = ruzgarYon;
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
