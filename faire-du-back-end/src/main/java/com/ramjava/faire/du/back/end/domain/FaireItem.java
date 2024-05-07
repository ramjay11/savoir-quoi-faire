package com.ramjava.faire.du.back.end.domain;

public class FaireItem {
    private Long id;
    private String task;
    private Boolean isDone;

    public FaireItem() {
    }

    public FaireItem(Long id, String task, Boolean isDone) {
        this.id = id;
        this.task = task;
        this.isDone = isDone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }
}
