package com.example.model;

public class Song {
    private String nameSong;
    private String singer;
    private String kind;
    private String link;

    public Song() {
    }

    public Song(String nameSong, String singer, String kind, String link) {
        this.nameSong = nameSong;
        this.singer = singer;
        this.kind = kind;
        this.link = link;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
