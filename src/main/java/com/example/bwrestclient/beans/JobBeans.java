package com.example.bwrestclient.beans;

import com.example.bwrestclient.client.RestClient;
import com.example.bwrestclient.model.Job;
import com.example.bwrestclient.model.JobOpening;
import com.example.bwrestclient.model.TargetGroup;
import com.example.bwrestclient.model.WorkingTime;
import lombok.Data;
import org.primefaces.PrimeFaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.context.annotation.SessionScope;


import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
@Data
public class JobBeans {

    @Autowired
    private RestClient restClient;
    private List<Job> jobs = new ArrayList<>();
    private Job selectedJob = new Job();

    @PostConstruct
    public void init(){
        System.out.println("init bean...");
        jobs = restClient.createJob();
        PrimeFaces.current().ajax().update("form");
    }

    public RestClient getRestClient() {
        return restClient;
    }

    public void setRestClient(RestClient restClient) {
        this.restClient = restClient;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public JobOpening validationJobOpening(JobOpening jobOpening){
        if (jobOpening.getTargetGroups().isEmpty()){
            jobOpening.getTargetGroups().add(0, new TargetGroup(1, "N/A", "N/A"));
        } else if (jobOpening.getWorkingTimes().isEmpty()) {
            jobOpening.getWorkingTimes().add(0, new WorkingTime(1, "TBD", "TBD"));
        }
        return jobOpening;
    }

    public String validationJobTasks(String texts){
        if(!texts.isEmpty()){
            StringBuilder builder = new StringBuilder(texts);
            builder.insert(0,"<strong><h3>Ihre Aufgaben:</h3></strong>");
            texts = builder.toString();
        } else {
            return texts;
        }
        return texts;
    }
    public String validationJobProfile(String texts){
        if(!texts.isEmpty()){
            StringBuilder builder = new StringBuilder(texts);
            builder.insert(0,"<strong><h3>Ihr Profil:</h3></strong>");
            texts = builder.toString();
        } else {
            return texts;
        }
        return texts;
    }
    @Nullable
    public String validationJobWeOffer(String task){
        if(!task.isEmpty()){
            StringBuilder builder = new StringBuilder();
            builder.insert(0,"<h3>UNSER ANGEBOT</h3>\n" +
                    "\n" +
                    "<ul>\n" +
                    "\t<li>Attraktive Verg&uuml;tungsmodelle</li>\n" +
                    "\t<li>Permanente Weiterbildung- und Schulungsm&ouml;glichkeiten</li>\n" +
                    "\t<li>Flexible Arbeitszeiten</li>\n" +
                    "\t<li>Betriebliche Altersvorsorge</li>\n" +
                    "\t<li>Regelm&auml;&szlig;ige Mitarbeiterevents</li>\n" +
                    "\t<li>Betriebliches Gesundheitsmanagement</li>\n" +
                    "\t<li>Betriebseigene Kantine</li>\n" +
                    "</ul>\n" +
                    "\n" +
                    "<p>Sind Sie interessiert? Dann freuen wir uns auf Ihre Bewerbung &uuml;ber unser Online-Formular:</p></div>\n");
            task = builder.toString();
        } else {
            return  task;
        }
        return task;
    }


    public void sentRequest(){ jobs = restClient.createJob();}

    public Job getSelectedJob() {
        return selectedJob;
    }

    public void setSelectedJob(Job selectedJob) {
        this.selectedJob = selectedJob;
    }

}
