package com.in9090.user.server.test.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_test")
public class TTest implements Serializable{
    @Id
    private Long id;

    private String value;



    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    @Override
    public String toString() {
        return "TTest{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}