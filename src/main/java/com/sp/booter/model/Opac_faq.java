package com.sp.booter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

public class Opac_faq implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private Timestamp create_time;

    @Column
    private Timestamp last_modified_time;

    @Column
    private Integer status;

    @Column
    private Integer show_order;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public Timestamp getLast_modified_time() {
        return last_modified_time;
    }

    public void setLast_modified_time(Timestamp last_modified_time) {
        this.last_modified_time = last_modified_time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getShow_order() {
        return show_order;
    }

    public void setShow_order(Integer show_order) {
        this.show_order = show_order;
    }
}
