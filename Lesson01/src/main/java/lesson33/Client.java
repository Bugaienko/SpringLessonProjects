package lesson33;

/**
 * @author Sergii Bugaienko
 */

public class Client {
    public static void main(String[] args) {
        CameraRoll colorCameraRoll = new ColorCameraRoll();
        CameraRoll blackWhiteCameraRoll = new BlackWhiteCameraRoll();
        CameraImpl camera = new CameraImpl();

        camera.setCameraRoll(colorCameraRoll);
        camera.makeImage();

        camera.setCameraRoll(blackWhiteCameraRoll);
        camera.makeImage();
    }
}
