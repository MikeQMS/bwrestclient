
package com.example.bwrestclient.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.example.bwrestclient.model.OrgUnit;
import com.example.bwrestclient.model.ResponsibleUser;
import com.example.bwrestclient.model.TargetGroup;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "type",
    "categories",
    "reference",
    "location",
    "department",
    "costUnit",
    "targetGroups",
    "workingTimes",
    "locations",
    "contractPeriod",
    "earliestEntryDate",
    "orgUnit",
    "createdDate",
    "responsibleUser",
    "reward",
    "formFieldAnswers",
    "company"
})
@Generated("jsonschema2pojo")
public class JobOpening implements Serializable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("categories")
    private List<Object> categories = null;
    @JsonProperty("reference")
    private Object reference;
    @JsonProperty("location")
    private String location;
    @JsonProperty("department")
    private String department;
    @JsonProperty("costUnit")
    private Object costUnit;
    @JsonProperty("targetGroups")
    private List<TargetGroup> targetGroups = null;
    @JsonProperty("workingTimes")
    private List<WorkingTime> workingTimes = null;
    @JsonProperty("locations")
    private List<Object> locations = null;
    @JsonProperty("contractPeriod")
    private ContractPeriod contractPeriod;
    @JsonProperty("earliestEntryDate")
    private String earliestEntryDate;
    @JsonProperty("orgUnit")
    private OrgUnit orgUnit;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("responsibleUser")
    private ResponsibleUser responsibleUser;
    @JsonProperty("reward")
    private Object reward;
    @JsonProperty("formFieldAnswers")
    private List<Object> formFieldAnswers = null;
    @JsonProperty("company")
    private Object company;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1413283319560216938L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public JobOpening() {
    }

    /**
     * 
     * @param responsibleUser
     * @param reward
     * @param costUnit
     * @param orgUnit
     * @param type
     * @param formFieldAnswers
     * @param contractPeriod
     * @param reference
     * @param earliestEntryDate
     * @param createdDate
     * @param targetGroups
     * @param name
     * @param location
     * @param locations
     * @param company
     * @param id
     * @param categories
     * @param department
     * @param workingTimes
     */
    public JobOpening(Integer id, String name, String type, List<Object> categories, Object reference, String location, String department, Object costUnit, List<TargetGroup> targetGroups, List<WorkingTime> workingTimes, List<Object> locations, ContractPeriod contractPeriod, String earliestEntryDate, OrgUnit orgUnit, String createdDate, ResponsibleUser responsibleUser, Object reward, List<Object> formFieldAnswers, Object company) {
        super();
        this.id = id;
        this.name = name;
        this.type = type;
        this.categories = categories;
        this.reference = reference;
        this.location = location;
        this.department = department;
        this.costUnit = costUnit;
        this.targetGroups = targetGroups;
        this.workingTimes = workingTimes;
        this.locations = locations;
        this.contractPeriod = contractPeriod;
        this.earliestEntryDate = earliestEntryDate;
        this.orgUnit = orgUnit;
        this.createdDate = createdDate;
        this.responsibleUser = responsibleUser;
        this.reward = reward;
        this.formFieldAnswers = formFieldAnswers;
        this.company = company;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("categories")
    public List<Object> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<Object> categories) {
        this.categories = categories;
    }

    @JsonProperty("reference")
    public Object getReference() {
        return reference;
    }

    @JsonProperty("reference")
    public void setReference(Object reference) {
        this.reference = reference;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("department")
    public String getDepartment() {
        return department;
    }

    @JsonProperty("department")
    public void setDepartment(String department) {
        this.department = department;
    }

    @JsonProperty("costUnit")
    public Object getCostUnit() {
        return costUnit;
    }

    @JsonProperty("costUnit")
    public void setCostUnit(Object costUnit) {
        this.costUnit = costUnit;
    }

    @JsonProperty("targetGroups")
    public List<TargetGroup> getTargetGroups() {
        return targetGroups;
    }

    @JsonProperty("targetGroups")
    public void setTargetGroups(List<TargetGroup> targetGroups) {
        this.targetGroups = targetGroups;
    }

    @JsonProperty("workingTimes")
    public List<WorkingTime> getWorkingTimes() {
        return workingTimes;
    }

    @JsonProperty("workingTimes")
    public void setWorkingTimes(List<WorkingTime> workingTimes) {
        this.workingTimes = workingTimes;
    }

    @JsonProperty("locations")
    public List<Object> getLocations() {
        return locations;
    }

    @JsonProperty("locations")
    public void setLocations(List<Object> locations) {
        this.locations = locations;
    }

    @JsonProperty("contractPeriod")
    public ContractPeriod getContractPeriod() {
        return contractPeriod;
    }

    @JsonProperty("contractPeriod")
    public void setContractPeriod(ContractPeriod contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    @JsonProperty("earliestEntryDate")
    public String getEarliestEntryDate() {
        return earliestEntryDate;
    }

    @JsonProperty("earliestEntryDate")
    public void setEarliestEntryDate(String earliestEntryDate) {
        this.earliestEntryDate = earliestEntryDate;
    }

    @JsonProperty("orgUnit")
    public OrgUnit getOrgUnit() {
        return orgUnit;
    }

    @JsonProperty("orgUnit")
    public void setOrgUnit(OrgUnit orgUnit) {
        this.orgUnit = orgUnit;
    }

    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("responsibleUser")
    public ResponsibleUser getResponsibleUser() {
        return responsibleUser;
    }

    @JsonProperty("responsibleUser")
    public void setResponsibleUser(ResponsibleUser responsibleUser) {
        this.responsibleUser = responsibleUser;
    }

    @JsonProperty("reward")
    public Object getReward() {
        return reward;
    }

    @JsonProperty("reward")
    public void setReward(Object reward) {
        this.reward = reward;
    }

    @JsonProperty("formFieldAnswers")
    public List<Object> getFormFieldAnswers() {
        return formFieldAnswers;
    }

    @JsonProperty("formFieldAnswers")
    public void setFormFieldAnswers(List<Object> formFieldAnswers) {
        this.formFieldAnswers = formFieldAnswers;
    }

    @JsonProperty("company")
    public Object getCompany() {
        return company;
    }

    @JsonProperty("company")
    public void setCompany(Object company) {
        this.company = company;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JobOpening.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("categories");
        sb.append('=');
        sb.append(((this.categories == null)?"<null>":this.categories));
        sb.append(',');
        sb.append("reference");
        sb.append('=');
        sb.append(((this.reference == null)?"<null>":this.reference));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("department");
        sb.append('=');
        sb.append(((this.department == null)?"<null>":this.department));
        sb.append(',');
        sb.append("costUnit");
        sb.append('=');
        sb.append(((this.costUnit == null)?"<null>":this.costUnit));
        sb.append(',');
        sb.append("targetGroups");
        sb.append('=');
        sb.append(((this.targetGroups == null)?"<null>":this.targetGroups));
        sb.append(',');
        sb.append("workingTimes");
        sb.append('=');
        sb.append(((this.workingTimes == null)?"<null>":this.workingTimes));
        sb.append(',');
        sb.append("locations");
        sb.append('=');
        sb.append(((this.locations == null)?"<null>":this.locations));
        sb.append(',');
        sb.append("contractPeriod");
        sb.append('=');
        sb.append(((this.contractPeriod == null)?"<null>":this.contractPeriod));
        sb.append(',');
        sb.append("earliestEntryDate");
        sb.append('=');
        sb.append(((this.earliestEntryDate == null)?"<null>":this.earliestEntryDate));
        sb.append(',');
        sb.append("orgUnit");
        sb.append('=');
        sb.append(((this.orgUnit == null)?"<null>":this.orgUnit));
        sb.append(',');
        sb.append("createdDate");
        sb.append('=');
        sb.append(((this.createdDate == null)?"<null>":this.createdDate));
        sb.append(',');
        sb.append("responsibleUser");
        sb.append('=');
        sb.append(((this.responsibleUser == null)?"<null>":this.responsibleUser));
        sb.append(',');
        sb.append("reward");
        sb.append('=');
        sb.append(((this.reward == null)?"<null>":this.reward));
        sb.append(',');
        sb.append("formFieldAnswers");
        sb.append('=');
        sb.append(((this.formFieldAnswers == null)?"<null>":this.formFieldAnswers));
        sb.append(',');
        sb.append("company");
        sb.append('=');
        sb.append(((this.company == null)?"<null>":this.company));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.responsibleUser == null)? 0 :this.responsibleUser.hashCode()));
        result = ((result* 31)+((this.reward == null)? 0 :this.reward.hashCode()));
        result = ((result* 31)+((this.costUnit == null)? 0 :this.costUnit.hashCode()));
        result = ((result* 31)+((this.orgUnit == null)? 0 :this.orgUnit.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.formFieldAnswers == null)? 0 :this.formFieldAnswers.hashCode()));
        result = ((result* 31)+((this.contractPeriod == null)? 0 :this.contractPeriod.hashCode()));
        result = ((result* 31)+((this.reference == null)? 0 :this.reference.hashCode()));
        result = ((result* 31)+((this.earliestEntryDate == null)? 0 :this.earliestEntryDate.hashCode()));
        result = ((result* 31)+((this.createdDate == null)? 0 :this.createdDate.hashCode()));
        result = ((result* 31)+((this.targetGroups == null)? 0 :this.targetGroups.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.locations == null)? 0 :this.locations.hashCode()));
        result = ((result* 31)+((this.company == null)? 0 :this.company.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.categories == null)? 0 :this.categories.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.department == null)? 0 :this.department.hashCode()));
        result = ((result* 31)+((this.workingTimes == null)? 0 :this.workingTimes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobOpening) == false) {
            return false;
        }
        JobOpening rhs = ((JobOpening) other);
        return (((((((((((((((((((((this.responsibleUser == rhs.responsibleUser)||((this.responsibleUser!= null)&&this.responsibleUser.equals(rhs.responsibleUser)))&&((this.reward == rhs.reward)||((this.reward!= null)&&this.reward.equals(rhs.reward))))&&((this.costUnit == rhs.costUnit)||((this.costUnit!= null)&&this.costUnit.equals(rhs.costUnit))))&&((this.orgUnit == rhs.orgUnit)||((this.orgUnit!= null)&&this.orgUnit.equals(rhs.orgUnit))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.formFieldAnswers == rhs.formFieldAnswers)||((this.formFieldAnswers!= null)&&this.formFieldAnswers.equals(rhs.formFieldAnswers))))&&((this.contractPeriod == rhs.contractPeriod)||((this.contractPeriod!= null)&&this.contractPeriod.equals(rhs.contractPeriod))))&&((this.reference == rhs.reference)||((this.reference!= null)&&this.reference.equals(rhs.reference))))&&((this.earliestEntryDate == rhs.earliestEntryDate)||((this.earliestEntryDate!= null)&&this.earliestEntryDate.equals(rhs.earliestEntryDate))))&&((this.createdDate == rhs.createdDate)||((this.createdDate!= null)&&this.createdDate.equals(rhs.createdDate))))&&((this.targetGroups == rhs.targetGroups)||((this.targetGroups!= null)&&this.targetGroups.equals(rhs.targetGroups))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.locations == rhs.locations)||((this.locations!= null)&&this.locations.equals(rhs.locations))))&&((this.company == rhs.company)||((this.company!= null)&&this.company.equals(rhs.company))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.categories == rhs.categories)||((this.categories!= null)&&this.categories.equals(rhs.categories))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.department == rhs.department)||((this.department!= null)&&this.department.equals(rhs.department))))&&((this.workingTimes == rhs.workingTimes)||((this.workingTimes!= null)&&this.workingTimes.equals(rhs.workingTimes))));
    }

}
