package com.example.microserviceCourse.Controller;

public class HelloWorldBean {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }

}
