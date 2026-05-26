package dev.uudt;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    // write code here

    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {

        Song song = songs.findSong(trackNumber);
        if (song != null) {
            playList.add(song);
            System.out.println("The song " + song.getTitle() + " is successfully added to the album using its trackNumber");
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {

        Song song = songs.findSong(title);
        if (song != null) {
            playList.add(song);
            System.out.println("The song " + song.getTitle() + " is successfully added to the album by its title");
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }



    public static class SongList {

        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {

            if (findSong(song.getTitle()) == null) {
                songs.add(song);
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

        private Song findSong(int trackNumber) {

            int index = trackNumber - 1;
            if (index >= 0 && index < songs.size()) {
                return songs.get(index);
            }
            return null;
        }


    }

}