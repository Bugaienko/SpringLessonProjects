package homework33.randomMusic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Sergii Bugaienko
 */

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private MusicList musicList;

    public  MusicPlayer(MusicList musicList) {
        this.musicList = musicList;
    }

    public String playRandomMusic() {
        return "Playing: " + musicList.getRandomSong();
    }



    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
