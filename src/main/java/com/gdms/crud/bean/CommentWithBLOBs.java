package com.gdms.crud.bean;

public class CommentWithBLOBs extends Comment {
    private String context;

    private String dianzanzheno;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public String getDianzanzheno() {
        return dianzanzheno;
    }

    public void setDianzanzheno(String dianzanzheno) {
        this.dianzanzheno = dianzanzheno == null ? null : dianzanzheno.trim();
    }
}