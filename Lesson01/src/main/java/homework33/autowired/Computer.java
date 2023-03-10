package homework33.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Sergii Bugaienko
 */

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;
    static int counter = 1;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = counter++;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id +"-> " + musicPlayer.playMusic();
    }
}
