package homework33.randomMusic;

/**
 * @author Sergii Bugaienko
 */


public class Computer {
    private int id;
    private MusicPlayer musicPlayer;


    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
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
