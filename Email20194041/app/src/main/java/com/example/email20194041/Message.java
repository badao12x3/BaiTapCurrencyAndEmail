package com.example.email20194041;

public class Message {
    private int id;
    private String from;
    private String subject;
    private String message;
    private String timestamp;
    private boolean isImportant;
    private boolean isRead;

    public Message(int id, String from, String subject, String message, String timestamp,  boolean isImportant, boolean isRead) {
        this.id = id;
        this.from = from;
        this.subject = subject;
        this.message = message;
        this.timestamp = timestamp;
        this.isImportant = isImportant;
        this.isRead = isRead;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

}
