package lesson33.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sergii Bugaienko
 */
@Configuration
public class AppConfig {
    @Bean //(name = "colorCameraRoll")
    public CameraRoll colorCameraRoll(){
        return new ColorCameraRoll();
    }

    @Bean
    public CameraRoll bwCameraRoll() {
        return new BlackWhiteCameraRoll();
    }

    @Bean
    public Camera camera(CameraRoll colorCameraRoll){
        Camera camera = new Camera();
        camera.setCameraRoll(colorCameraRoll);
        return camera;
    }
}
