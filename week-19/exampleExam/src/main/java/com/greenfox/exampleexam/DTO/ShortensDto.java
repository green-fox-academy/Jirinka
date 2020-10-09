package com.greenfox.exampleexam.DTO;

import com.greenfox.exampleexam.Model.Shortens;

import java.util.List;

public class ShortensDto {

    private long id;
    private String url;
    private String alias;
    private int hitCount;

    public ShortensDto(Shortens shortens){
        this.id = shortens.getId();
        this.url = shortens.getUrl();
        this.alias = shortens.getAlias();
        this.hitCount = shortens.getHitCount();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }
}
