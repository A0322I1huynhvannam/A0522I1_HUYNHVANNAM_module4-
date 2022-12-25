package com.example.repo;

import com.example.model.Song;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SongRepo {
    private static List<Song> music;
    static {
        music = new LinkedList<>();
        music.add( new Song("Waiting For You","MONO","Nhac","https://www.nhaccuatui.com/playlist/top-100-nhac-tre-hay-nhat-va.m3liaiy6vVsF.html") );
        music.add( new Song("Người Tình Mùa Đông ","Đức Phúc","Nhac","https://www.nhaccuatui.com/playlist/top-100-nhac-tre-hay-nhat-va.m3liaiy6vVsF.html?st=3") );
    }
    public List<Song> showAll(){
        return music;
    }
    public void addMusic(Song music1){
        music.add(music1);
    }
}
