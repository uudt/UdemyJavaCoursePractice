package dev.uudt;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    // write code here
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double songDuration) {
        if (findSong(songTitle) == null) {
            songs.add(new Song(songTitle, songDuration));
            return true;
        }
        return false;
    }

    private Song findSong(String songTitle) {
        for (Song song : songs) {
            if (song.getTitle().equals(songTitle)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int songAlbumNumber, LinkedList<Song> playlist) {
        if (songAlbumNumber > 0 && songs.size() <= songAlbumNumber) {
            playlist.add(songs.get(songAlbumNumber - 1));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        if (findSong(songTitle) == null) {
            return false;
        }
        return playlist.add(findSong(songTitle));
    }
}