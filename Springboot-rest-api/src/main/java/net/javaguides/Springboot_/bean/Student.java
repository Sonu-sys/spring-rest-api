package net.javaguides.Springboot_.bean;

public class Student {
    private int id;
    private String firtName;
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Student() {
        this.id = id;
        this.firtName = firtName;
        this.lastName = lastName;
    }
}
