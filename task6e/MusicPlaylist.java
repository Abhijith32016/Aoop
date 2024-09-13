package task6e;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MusicPlaylist {
    private LinkedList<String> playlist;
    private Scanner scanner;

    public MusicPlaylist() {
        playlist = new LinkedList<>();
        scanner = new Scanner(System.in);
    }
    public void addSong() {
        System.out.print("Enter the song name to add: ");
        String song = scanner.nextLine();
        playlist.add(song);
        System.out.println("Song added.");
    }
    public void removeSong() {
        System.out.print("Enter the song name to remove: ");
        String song = scanner.nextLine();
        boolean removed = playlist.remove(song);
        if (removed) {
            System.out.println("Song removed.");
        } else {
            System.out.println("Song not found.");
        }
    }
    public void moveSong() {
        System.out.print("Enter the song name to move: ");
        String song = scanner.nextLine();
        ListIterator<String> iterator = playlist.listIterator();
        int index = -1;
        while (iterator.hasNext()) {
            if (iterator.next().equals(song)) {
                index = iterator.previousIndex();
                break;
            }
        }

        if (index == -1) {
            System.out.println("Song not found.");
            return;
        }

        System.out.print("Enter the new position (1-based index): ");
        int newPosition = scanner.nextInt();
        scanner.nextLine(); 

        if (newPosition < 1 || newPosition > playlist.size()) {
            System.out.println("Invalid position.");
            return;
        }
        playlist.remove(index);
        playlist.add(newPosition - 1, song);
        System.out.println("Song moved.");
    }
    public void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty.");
            return;
        }
        System.out.println("Current Playlist:");
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println((i + 1) + ": " + playlist.get(i));
        }
    }
    public void run() {
        while (true) {
            System.out.println("\nMusic Playlist Menu:");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Move Song");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addSong();
                    break;
                case 2:
                    removeSong();
                    break;
                case 3:
                    moveSong();
                    break;
                case 4:
                    displayPlaylist();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();
        playlist.run();
    }
}
