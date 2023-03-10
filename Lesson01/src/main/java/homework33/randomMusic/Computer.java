package homework33.randomMusic;

/**
 * @author Sergii Bugaienko
 */


public class Computer {
    private int id;
    private MusicPlayer musicPlayer;
    static int counter = 1;


    public Computer(MusicPlayer musicPlayer) {
        this.id = counter++;
        this.musicPlayer = musicPlayer;
    }

    public String playMusic() {
        return "Computer " + id +"-> " + musicPlayer.playRandomMusic();
    }

    @Override
    public String toString() {
        return "Computer " + id;
    }
}
