package com.bjpowernode.domain;

import java.util.Objects;

public class Student {
    private String name;
    private String id;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name) && id.equals(student.id) && age.equals(student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, age);
    }
}
