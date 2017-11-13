package com.jakubbilinski.stickystickynotesandroid.database.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by jbili on 13.11.2017.
 */

@Entity
public class NotesEntity {
    @PrimaryKey
    private int Id;
    @ColumnInfo(name = "ServerId")
    private int serverId;
    @ColumnInfo(name = "Context")
    private String context;
    @ColumnInfo(name = "LastEditDate")
    private String lastEditDate;

    public NotesEntity(int serverId, String context, String lastEditDate) {
        this.serverId = serverId;
        this.context = context;
        this.lastEditDate = lastEditDate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getServerId() {
        return serverId;
    }

    public void setServerId(int serverId) {
        this.serverId = serverId;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(String lastEditDate) {
        this.lastEditDate = lastEditDate;
    }
}