package lesson33.spring;

/**
 * @author Sergii Bugaienko
 */

public class ColorCameraRoll implements CameraRoll {
    @Override
    public void processing() {
        System.out.println("+1 Color Image");
    }
}
