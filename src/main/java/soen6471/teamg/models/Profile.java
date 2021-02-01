package soen6471.teamg.models;

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
@JsonPropertyOrder({ "name", "dob", "address", "title", "insurance", "previousVisits" })
public class Profile {

    @JsonProperty("name")
    private String name;
    @JsonProperty("dob")
    private String dob;
    @JsonProperty("address")
    private String address;
    @JsonProperty("title")
    private String title;
    @JsonProperty("insurance")
    private Boolean insurance;
    @JsonProperty("previousVisits")
    private List<PreviousVisit> previousVisits = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("dob")
    public String getDob() {
        return dob;
    }

    @JsonProperty("dob")
    public void setDob(String dob) {
        this.dob = dob;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("insurance")
    public Boolean getInsurance() {
        return insurance;
    }

    @JsonProperty("insurance")
    public void setInsurance(Boolean insurance) {
        this.insurance = insurance;
    }

    @JsonProperty("previousVisits")
    public List<PreviousVisit> getPreviousVisits() {
        return previousVisits;
    }

    @JsonProperty("previousVisits")
    public void setPreviousVisits(List<PreviousVisit> previousVisits) {
        this.previousVisits = previousVisits;
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