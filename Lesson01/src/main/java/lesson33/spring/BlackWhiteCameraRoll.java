package lesson33.spring;

/**
 * @author Sergii Bugaienko
 */

public class BlackWhiteCameraRoll implements CameraRoll {

    @Override
    public void processing() {
        System.out.println("+1 BlackWhite Image");
    }
}
