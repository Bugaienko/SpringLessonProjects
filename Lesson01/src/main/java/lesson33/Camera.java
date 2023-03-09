package lesson33;

/**
 * @author Sergii Bugaienko
 */

public class Camera {
    private CameraRoll cameraRoll;


    public void makeImage() {
        System.out.println("Click!");
        cameraRoll.processing();
    }

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }
}
