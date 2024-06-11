import java.util.HashMap;
import java.util.Map;

public class TrackListExample {

    public static void main(String[] args) {

        Map<String, String> trackList = new HashMap<>();

        trackList.put("Hello", "Hello It's me !!");
        trackList.put("love it", "i love it !!");
        trackList.put("track three", "bla bla bla");
        trackList.put("Piano Man", "I love to play on pianoo");

        String songTitle = "Hello";
        String songLyrics = trackList.get(songTitle);
        System.out.println("Track: " + songTitle + "\nLyrics: " + songLyrics);

        System.out.println("\nAll tracks:");
        trackList.forEach((track, lyrics) -> {
            System.out.println("Track: " + track + "\nLyrics: " + lyrics + "\n");
        });
    }
}
