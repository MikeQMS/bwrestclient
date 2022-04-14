package com.example.bwrestclient.model;

import java.io.Serializable;
import java.util.*;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "language",
        "position",
        "pageTitle",
        "subtitle",
        "pageDescription",
        "jobPublicationURL",
        "applicationFormURL",
        "applicationApplyApiURL",
        "startDate",
        "endDate",
        "introduction",
        "tasks",
        "profile",
        "weOffer",
        "closingText",
        "images",
        "benefits",
        "jobOpening"
})
@Generated("jsonschema2pojo")
public class Job implements Serializable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("language")
    private String language;
    @JsonProperty("position")
    private String position;
    @JsonProperty("pageTitle")
    private String pageTitle;
    @JsonProperty("subtitle")
    private Object subtitle;
    @JsonProperty("pageDescription")
    private Object pageDescription;
    @JsonProperty("jobPublicationURL")
    private String jobPublicationURL;
    @JsonProperty("applicationFormURL")
    private String applicationFormURL;
    @JsonProperty("applicationApplyApiURL")
    private Object applicationApplyApiURL;
    @JsonProperty("startDate")
    private Object startDate;
    @JsonProperty("endDate")
    private Object endDate;
    @JsonProperty("introduction")
    private Object introduction;
    @JsonProperty("tasks")
    private String tasks;
    @JsonProperty("profile")
    private String profile;
    @JsonProperty("weOffer")
    private Object weOffer;
    @JsonProperty("closingText")
    private Object closingText;
    @JsonProperty("images")
    private List<Image> images = new ArrayList<Image>();
    @JsonProperty("benefits")
    private List<Object> benefits = new ArrayList<Object>();
    @JsonProperty("jobOpening")
    private JobOpening jobOpening;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7555751892393034484L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Job() {
    }

    /**
     *
     * @param benefits
     * @param images
     * @param endDate
     * @param pageTitle
     * @param applicationApplyApiURL
     * @param weOffer
     * @param profile
     * @param language
     * @param applicationFormURL
     * @param jobOpening
     * @param closingText
     * @param subtitle
     * @param pageDescription
     * @param jobPublicationURL
     * @param id
     * @param position
     * @param startDate
     * @param introduction
     * @param tasks
     */
    public Job(Integer id, String language, String position, String pageTitle, Object subtitle, Object pageDescription, String jobPublicationURL, String applicationFormURL, Object applicationApplyApiURL, Object startDate, Object endDate, Object introduction, String tasks, String profile, Object weOffer, Object closingText, List<Image> images, List<Object> benefits, JobOpening jobOpening) {
        super();
        this.id = id;
        this.language = language;
        this.position = position;
        this.pageTitle = pageTitle;
        this.subtitle = subtitle;
        this.pageDescription = pageDescription;
        this.jobPublicationURL = jobPublicationURL;
        this.applicationFormURL = applicationFormURL;
        this.applicationApplyApiURL = applicationApplyApiURL;
        this.startDate = startDate;
        this.endDate = endDate;
        this.introduction = introduction;
        this.tasks = tasks;
        this.profile = profile;
        this.weOffer = weOffer;
        this.closingText = closingText;
        this.images = images;
        this.benefits = benefits;
        this.jobOpening = jobOpening;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(String position) {
        this.position = position;
    }

    @JsonProperty("pageTitle")
    public String getPageTitle() {
        return pageTitle;
    }

    @JsonProperty("pageTitle")
    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    @JsonProperty("subtitle")
    public Object getSubtitle() {
        return subtitle;
    }

    @JsonProperty("subtitle")
    public void setSubtitle(Object subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("pageDescription")
    public Object getPageDescription() {
        return pageDescription;
    }

    @JsonProperty("pageDescription")
    public void setPageDescription(Object pageDescription) {
        this.pageDescription = pageDescription;
    }

    @JsonProperty("jobPublicationURL")
    public String getJobPublicationURL() {
        return jobPublicationURL;
    }

    @JsonProperty("jobPublicationURL")
    public void setJobPublicationURL(String jobPublicationURL) {
        this.jobPublicationURL = jobPublicationURL;
    }

    @JsonProperty("applicationFormURL")
    public String getApplicationFormURL() {
        return applicationFormURL;
    }

    @JsonProperty("applicationFormURL")
    public void setApplicationFormURL(String applicationFormURL) {
        this.applicationFormURL = applicationFormURL;
    }

    @JsonProperty("applicationApplyApiURL")
    public Object getApplicationApplyApiURL() {
        return applicationApplyApiURL;
    }

    @JsonProperty("applicationApplyApiURL")
    public void setApplicationApplyApiURL(Object applicationApplyApiURL) {
        this.applicationApplyApiURL = applicationApplyApiURL;
    }

    @JsonProperty("startDate")
    public Object getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("endDate")
    public Object getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("introduction")
    public Object getIntroduction() {
        return introduction;
    }

    @JsonProperty("introduction")
    public void setIntroduction(Object introduction) {
        this.introduction = introduction;
    }

    @JsonProperty("tasks")
    public String getTasks() {
        return tasks;
    }

    @JsonProperty("tasks")
    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    @JsonProperty("profile")
    public String getProfile() {
        return profile;
    }

    @JsonProperty("profile")
    public void setProfile(String profile) {
        this.profile = profile;
    }

    @JsonProperty("weOffer")
    public Object getWeOffer() {
        return weOffer;
    }

    @JsonProperty("weOffer")
    public void setWeOffer(Object weOffer) {
        this.weOffer = weOffer;
    }

    @JsonProperty("closingText")
    public Object getClosingText() {
        return closingText;
    }

    @JsonProperty("closingText")
    public void setClosingText(Object closingText) {
        this.closingText = closingText;
    }

    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    @JsonProperty("benefits")
    public List<Object> getBenefits() {
        return benefits;
    }

    @JsonProperty("benefits")
    public void setBenefits(List<Object> benefits) {
        this.benefits = benefits;
    }

    @JsonProperty("jobOpening")
    public JobOpening getJobOpening() {
        return jobOpening;
    }

    @JsonProperty("jobOpening")
    public void setJobOpening(JobOpening jobOpening) {
        this.jobOpening = jobOpening;
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
        sb.append(Job.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("position");
        sb.append('=');
        sb.append(((this.position == null)?"<null>":this.position));
        sb.append(',');
        sb.append("pageTitle");
        sb.append('=');
        sb.append(((this.pageTitle == null)?"<null>":this.pageTitle));
        sb.append(',');
        sb.append("subtitle");
        sb.append('=');
        sb.append(((this.subtitle == null)?"<null>":this.subtitle));
        sb.append(',');
        sb.append("pageDescription");
        sb.append('=');
        sb.append(((this.pageDescription == null)?"<null>":this.pageDescription));
        sb.append(',');
        sb.append("jobPublicationURL");
        sb.append('=');
        sb.append(((this.jobPublicationURL == null)?"<null>":this.jobPublicationURL));
        sb.append(',');
        sb.append("applicationFormURL");
        sb.append('=');
        sb.append(((this.applicationFormURL == null)?"<null>":this.applicationFormURL));
        sb.append(',');
        sb.append("applicationApplyApiURL");
        sb.append('=');
        sb.append(((this.applicationApplyApiURL == null)?"<null>":this.applicationApplyApiURL));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("introduction");
        sb.append('=');
        sb.append(((this.introduction == null)?"<null>":this.introduction));
        sb.append(',');
        sb.append("tasks");
        sb.append('=');
        sb.append(((this.tasks == null)?"<null>":this.tasks));
        sb.append(',');
        sb.append("profile");
        sb.append('=');
        sb.append(((this.profile == null)?"<null>":this.profile));
        sb.append(',');
        sb.append("weOffer");
        sb.append('=');
        sb.append(((this.weOffer == null)?"<null>":this.weOffer));
        sb.append(',');
        sb.append("closingText");
        sb.append('=');
        sb.append(((this.closingText == null)?"<null>":this.closingText));
        sb.append(',');
        sb.append("images");
        sb.append('=');
        sb.append(((this.images == null)?"<null>":this.images));
        sb.append(',');
        sb.append("benefits");
        sb.append('=');
        sb.append(((this.benefits == null)?"<null>":this.benefits));
        sb.append(',');
        sb.append("jobOpening");
        sb.append('=');
        sb.append(((this.jobOpening == null)?"<null>":this.jobOpening));
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
        result = ((result* 31)+((this.benefits == null)? 0 :this.benefits.hashCode()));
        result = ((result* 31)+((this.images == null)? 0 :this.images.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.pageTitle == null)? 0 :this.pageTitle.hashCode()));
        result = ((result* 31)+((this.applicationApplyApiURL == null)? 0 :this.applicationApplyApiURL.hashCode()));
        result = ((result* 31)+((this.weOffer == null)? 0 :this.weOffer.hashCode()));
        result = ((result* 31)+((this.profile == null)? 0 :this.profile.hashCode()));
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.applicationFormURL == null)? 0 :this.applicationFormURL.hashCode()));
        result = ((result* 31)+((this.jobOpening == null)? 0 :this.jobOpening.hashCode()));
        result = ((result* 31)+((this.closingText == null)? 0 :this.closingText.hashCode()));
        result = ((result* 31)+((this.subtitle == null)? 0 :this.subtitle.hashCode()));
        result = ((result* 31)+((this.pageDescription == null)? 0 :this.pageDescription.hashCode()));
        result = ((result* 31)+((this.jobPublicationURL == null)? 0 :this.jobPublicationURL.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.position == null)? 0 :this.position.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.introduction == null)? 0 :this.introduction.hashCode()));
        result = ((result* 31)+((this.tasks == null)? 0 :this.tasks.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Job) == false) {
            return false;
        }
        Job rhs = ((Job) other);
        return (((((((((((((((((((((this.benefits == rhs.benefits)||((this.benefits!= null)&&this.benefits.equals(rhs.benefits)))&&((this.images == rhs.images)||((this.images!= null)&&this.images.equals(rhs.images))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.pageTitle == rhs.pageTitle)||((this.pageTitle!= null)&&this.pageTitle.equals(rhs.pageTitle))))&&((this.applicationApplyApiURL == rhs.applicationApplyApiURL)||((this.applicationApplyApiURL!= null)&&this.applicationApplyApiURL.equals(rhs.applicationApplyApiURL))))&&((this.weOffer == rhs.weOffer)||((this.weOffer!= null)&&this.weOffer.equals(rhs.weOffer))))&&((this.profile == rhs.profile)||((this.profile!= null)&&this.profile.equals(rhs.profile))))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))))&&((this.applicationFormURL == rhs.applicationFormURL)||((this.applicationFormURL!= null)&&this.applicationFormURL.equals(rhs.applicationFormURL))))&&((this.jobOpening == rhs.jobOpening)||((this.jobOpening!= null)&&this.jobOpening.equals(rhs.jobOpening))))&&((this.closingText == rhs.closingText)||((this.closingText!= null)&&this.closingText.equals(rhs.closingText))))&&((this.subtitle == rhs.subtitle)||((this.subtitle!= null)&&this.subtitle.equals(rhs.subtitle))))&&((this.pageDescription == rhs.pageDescription)||((this.pageDescription!= null)&&this.pageDescription.equals(rhs.pageDescription))))&&((this.jobPublicationURL == rhs.jobPublicationURL)||((this.jobPublicationURL!= null)&&this.jobPublicationURL.equals(rhs.jobPublicationURL))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.position == rhs.position)||((this.position!= null)&&this.position.equals(rhs.position))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.introduction == rhs.introduction)||((this.introduction!= null)&&this.introduction.equals(rhs.introduction))))&&((this.tasks == rhs.tasks)||((this.tasks!= null)&&this.tasks.equals(rhs.tasks))));
    }

}