package homework33.randomMusic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Sergii Bugaienko
 */

public class MusicList {
    private List<Music> musicList;
    public MusicList(Music ...musics) {
        musicList = new ArrayList<>();
        musicList.addAll(Arrays.asList(musics));
    }

    public String getRandomSong() {
        int randomInd = new Random().nextInt(musicList.size());
        return musicList.get(randomInd).getSong();
    }
}
