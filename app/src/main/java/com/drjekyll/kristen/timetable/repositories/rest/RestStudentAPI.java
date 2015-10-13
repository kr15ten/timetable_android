package com.drjekyll.kristen.timetable.repositories.rest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import com.drjekyll.kristen.timetable.model.Student;
import com.drjekyll.kristen.timetable.repositories.RestAPI;

/**
 * Created by Kristen on 26/09/2015.
 */
public class RestStudentAPI implements RestAPI<Student,Long> {
    final String BASE_URL="http://timetable-drjekyll.rhcloud.com/api/";

    final HttpHeaders requestHeaders = RestMethods.getHeaders();
    final RestTemplate restTemplate = RestMethods.getRestTemplate();

    @Override
    public Student get(Long id) {
        final String url = BASE_URL+"student/"+id.toString();
        HttpEntity<Student> requestEntity = new HttpEntity<Student>(requestHeaders);
        ResponseEntity<Student> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Student.class);
        Student subject = responseEntity.getBody();
        return subject;
    }

    @Override
    public String post(Student entity) {
        final String url = BASE_URL+"student/create";
        HttpEntity<Student> requestEntity = new HttpEntity<Student>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String put(Student entity) {
        final String url = BASE_URL+"student/update/"+entity.getStudNo().toString();
        HttpEntity<Student> requestEntity = new HttpEntity<Student>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String delete(Student entity) {
        final String url = BASE_URL+"student/delete/"+entity.getStudNo().toString();
        HttpEntity<Student> requestEntity = new HttpEntity<Student>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        return responseEntity.getBody();
    }

    @Override
    public List<Student> getAll() {
        List<Student> subjects = new ArrayList<>();
        final String url = BASE_URL + "students/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<Student[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Student[].class);
        Student[] results = responseEntity.getBody();

        for (Student subject : results) {
            subjects.add(subject);
        }
        return subjects;
    }
}
