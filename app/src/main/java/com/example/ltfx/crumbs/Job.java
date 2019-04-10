package com.example.ltfx.crumbs;

import java.util.ArrayList;

public class Job {

    private String title;
    private static int job_id = 0;

    public Job(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static ArrayList<Job> createContactsList(int numContacts) {
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 1; i <= numContacts; i++) {
            jobs.add(new Job("Job " + ++job_id));
        }

        return jobs;
    }
}
