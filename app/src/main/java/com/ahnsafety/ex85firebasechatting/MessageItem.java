package com.ahnsafety.ex85firebasechatting;

public class MessageItem {

    String name;
    String messag;
    String time;
    String profileUrl;

    public MessageItem(String name, String messag, String time, String profileUrl) {
        this.name = name;
        this.messag = messag;
        this.time = time;
        this.profileUrl = profileUrl;
    }

    //firebase DB에 객체로 값을 읽어올 때..
    //파라미터가 비어있는 생성자가 필요함.
    public MessageItem() {
    }

    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessag() {
        return messag;
    }

    public void setMessag(String messag) {
        this.messag = messag;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }
}
