public class Main {
    public static void main(String[] args) {

        MusicBox mbox = new MusicBox("S34TG65", 'Y', "Raindrops", "Misty",
                "The path less traveled", "Country", "BZEE Music", "Rhythm Divine");

        System.out.println("Now playing the song");
        mbox.playSong(mbox.getSongID(), mbox.getPremiumSong(), 2);

        MusicBox mbox2 = new MusicBox("S45TJ76", 'N', "Sunrise", "Dawn",
                "A new day", "Pop", "Sony Music", "Melodies of Life");

        System.out.println("Now playing another song");
        mbox2.playSong(mbox2.getSongID(), mbox2.getPremiumSong(), 1);
    }
}