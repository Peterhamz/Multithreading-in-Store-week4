package org.example.models;

public abstract class Staff {
    private String id;
    private String name;
    private String phoneNumber;
    private String qualification;
    private Integer age;
    private Address address;

    public Staff(String id, String name, String phoneNumber, String qualification,
                 Integer age, Address address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.qualification = qualification;
        this.age = age;
        this.address = address;

    }

    public Staff() {

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", qualification='" + qualification + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

}