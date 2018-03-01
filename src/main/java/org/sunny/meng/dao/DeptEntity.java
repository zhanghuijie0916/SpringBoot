package org.sunny.meng.dao;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptEntity {
    private Integer id_dept;
    private String name;
    private String dupt;

    public DeptEntity(){
        super();
    }

    public DeptEntity(Integer id_dept, String name, String dupt) {
        this();
        this.id_dept = id_dept;
        this.name = name;
        this.dupt = dupt;
    }

    private List<FirstGroupEntity> groups;

    public List<FirstGroupEntity> getGroups() {
        return groups;
    }

    public void setGroups(List<FirstGroupEntity> groups) {
        this.groups = groups;
    }


    public Integer getId_dept() {
        return id_dept;
    }

    public void setId_dept(Integer id_dept) {
        this.id_dept = id_dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDupt() {
        return dupt;
    }

    public void setDupt(String dupt) {
        this.dupt = dupt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeptEntity that = (DeptEntity) o;

        if (id_dept != null ? !id_dept.equals(that.id_dept) : that.id_dept != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (dupt != null ? !dupt.equals(that.dupt) : that.dupt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id_dept != null ? id_dept.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (dupt != null ? dupt.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DeptEntity{" +
                "id_dept=" + id_dept +
                ", name='" + name + '\'' +
                ", dupt='" + dupt + '\'' +
                '}';
    }
}
