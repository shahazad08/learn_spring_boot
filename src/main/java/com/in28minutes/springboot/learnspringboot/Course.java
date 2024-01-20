package com.in28minutes.springboot.learnspringboot;

public class Course {
    // Initilization
    // Constructor
    // Getter
    public long Id;
    public String name;
    public String author;

    public Course(long id, String name, String author) {
        Id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
