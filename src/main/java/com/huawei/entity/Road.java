package com.huawei.entity;

public class Road {
    private String id;
    private int length;
    private int speed;
    //车道数目
    private int channel;
    private String from;
    private String to;
    private int isDuplex;

    public Road(String id, int length, int speed, int channel, String from, String to, int isDuplex) {
        this.id = id;
        this.length = length;
        this.speed = speed;
        this.channel = channel;
        this.from = from;
        this.to = to;
        this.isDuplex = isDuplex;
    }

    public Road() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Integer isDuplex() {
        return isDuplex;
    }

    public void setDuplex(Integer duplex) {
        isDuplex = duplex;
    }

    public int getIsDuplex() {
        return isDuplex;
    }

    public void setIsDuplex(int isDuplex) {
        this.isDuplex = isDuplex;
    }
}
