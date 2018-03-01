package org.sunny.meng.dao;

import org.springframework.stereotype.Component;



@Component
public class FirstGroupEntity {
    private int id;
    private String name;
    private Double salary;
    private String task;

    public FirstGroupEntity(){
        super();
    }

    public FirstGroupEntity(int id, String name, Double salary, String task) {
        this();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FirstGroupEntity that = (FirstGroupEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (salary != null ? !salary.equals(that.salary) : that.salary != null) return false;
        if (task != null ? !task.equals(that.task) : that.task != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (task != null ? task.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FirstGroupEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", task='" + task + '\'' +
                '}';
    }
}
