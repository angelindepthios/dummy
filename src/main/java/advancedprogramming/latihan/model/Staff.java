package advancedprogramming.latihan.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="jobdesc")
    private String jobdesc;
    @Column(name="workhours")
    private int WorkHours;

    public void setId(int id){
        this.id =id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setJobdesc(String jobdesc) {
        this.jobdesc = jobdesc;
    }

    public String getJobdesc() {
        return jobdesc;
    }

    public void setWorkHours(int workHours) {
        WorkHours = workHours;
    }

    public int getWorkHours() {
        return WorkHours;
    }
}
