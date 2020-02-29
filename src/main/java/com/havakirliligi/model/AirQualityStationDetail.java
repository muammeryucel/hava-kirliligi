
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
    "result",
    "objects"
})
public class AirQualityStationDetail {

    @JsonProperty("result")
    private Boolean result;
    
    @JsonProperty("objects")
    private Objects objects;

    @JsonProperty("result")
    public Boolean getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Boolean result) {
        this.result = result;
    }

    @JsonProperty("objects")
    public Objects getObjects() {
        return objects;
    }

    @JsonProperty("objects")
    public void setObjects(Objects objects) {
        this.objects = objects;
    }
}
