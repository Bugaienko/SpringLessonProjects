package lesson33;

/**
 * @author Sergii Bugaienko
 */

public class CameraImpl implements Camera {
    private CameraRoll cameraRoll;


    @Override
    public void makeImage() {
        System.out.println("Click!");
        cameraRoll.processing();
    }

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }
}
