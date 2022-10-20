package org.example.models;

public class HireCashier {
    private String name;
    private String qualification;
    private Integer age;


    public HireCashier(String name, String qualification, Integer age) {
        this.name = name;
        this.qualification = qualification;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
