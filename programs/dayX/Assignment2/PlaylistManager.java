package abhyas.dayX.Assignment2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public  class PlaylistManager {
    static Scanner scanner = new Scanner(System.in);
   static int count =0;
   static List<SongDetails> list = new LinkedList<>();
    private static void addSong(String title, String artist, int time) {
        SongDetails obj = new SongDetails();
        obj.title = title;
        obj.artist = artist;
        obj.time = time;
        list.add(obj);
        System.out.println("Song added successfully");
    }
    private static void removeSong(String title) {

        for(SongDetails iter: list ) {
            if(iter.title.equals(title)) {
                list.remove(title);
                System.out.println("Song removed successfully");
                break;
            } else System.out.println("song not exist");
        }
    }
    private static void playSong(String title) {
        for(SongDetails iter: list) {
            if(iter.title.equals(title)) {
                System.out.println("Playing Song: " + iter.title);
                break;
            } else System.out.println("Song not exist");
        }
    }

    public static void main(String[] args) {
        while(true) {
            System.out.println("enter your choice: ");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Play a song");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter Song title");
                    scanner.skip("\\R?");
                    String title = scanner.nextLine();
                    System.out.println("enter artist name");
                    String artist = scanner.nextLine();
                    System.out.println("Enter time duration");
                    int time = scanner.nextInt();
                    addSong(title,artist,time);
                    break;
                }
                case 2: {
                    System.out.println("enter title of song");
                    scanner.skip("\\R?");
                    String title = scanner.nextLine();
                    removeSong(title);
                    break;
                }
                case 3: {
                    System.out.println("Enter title of song you want to play");
                    scanner.skip("\\R?");
                    String title = scanner.nextLine();
                    playSong(title);
                    break;
                }
                case 4: {
                    System.out.println("Exiting.... ");
                    System.exit(0);
                }
                default:
                    System.out.println("Invalid choice");
            }
        }

    }

}
