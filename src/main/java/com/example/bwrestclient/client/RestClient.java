package com.example.bwrestclient.client;

import com.example.bwrestclient.model.Job;
import com.example.bwrestclient.model.TargetGroup;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class RestClient {

    public List<Job> createJob(){
        RestTemplate template = new RestTemplate();
        ResponseEntity<Job[]> re = template.getForEntity("https://burkhardt-weber.dvinci-easy.com/jobPublication/list.json", Job[].class);
        List<Job> jobs = Arrays.asList(re.getBody());

        return jobs;
    }
}
