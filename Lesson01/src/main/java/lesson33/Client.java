package lesson33;

/**
 * @author Sergii Bugaienko
 */

public class Client {
    public static void main(String[] args) {
        CameraRoll colorCameraRoll = new ColorCameraRoll();
        CameraRoll blackWhiteCameraRoll = new BlackWhiteCameraRoll();
        Camera camera = new Camera();
        camera.setCameraRoll(colorCameraRoll);
        camera.makeImage();
    }
}
