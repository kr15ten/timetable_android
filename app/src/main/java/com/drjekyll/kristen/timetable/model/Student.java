package com.drjekyll.kristen.timetable.model;

/**
 * Created by Kristen on 26/09/2015.
 */
public class Student {
    private Long studNo;
    private String name, surname, courseCode;
    private int creditsEarned, courseYear;

    public Long getStudNo(){
        return studNo;
    }

    public void setId(Long id){
        this.studNo = id;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }


    public String getCourseCode()
    {
        return courseCode;
    }

    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }


    public int getCreditsEarned(){
        return creditsEarned;
    }

    public void increaseCredits(int credits){
        creditsEarned += credits;
    }


    public int getCourseYear()
    {
        return courseYear;
    }

    public void incrementCourseYear(){
        courseYear++;
    }

    public void setCourseYear(int courseYear) {
        this.courseYear = courseYear;
    }
}
