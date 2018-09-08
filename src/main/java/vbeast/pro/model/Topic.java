package vbeast.pro.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by varun on 7/9/18.
 */

@Entity
public class Topic {

    @Id
    private int id;
    private String name;
    private String desc;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "id-"+this.id+" name-"+this.name+" desc-"+this.desc;
    }

}
