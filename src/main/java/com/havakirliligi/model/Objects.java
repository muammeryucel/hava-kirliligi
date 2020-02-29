
package com.havakirliligi.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MesurementLast",
    "AQIValues",
    "Status"
})
public class Objects {

    @JsonProperty("MesurementLast")
    private MesurementLast mesurementLast;
    @JsonProperty("AQIValues")
    private List<AQIValue> aQIValues = null;
    @JsonProperty("Status")
    private Status status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MesurementLast")
    public MesurementLast getMesurementLast() {
        return mesurementLast;
    }

    @JsonProperty("MesurementLast")
    public void setMesurementLast(MesurementLast mesurementLast) {
        this.mesurementLast = mesurementLast;
    }

    @JsonProperty("AQIValues")
    public List<AQIValue> getAQIValues() {
        return aQIValues;
    }

    @JsonProperty("AQIValues")
    public void setAQIValues(List<AQIValue> aQIValues) {
        this.aQIValues = aQIValues;
    }

    @JsonProperty("Status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(Status status) {
        this.status = status;
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
