package lesson33.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sergii Bugaienko
 */
@Configuration
public class AppConfig {
    @Bean //(name = "cameraRoll")
    public CameraRoll cameraRoll(){
        return new ColorCameraRoll();
    }

    @Bean
    public Camera camera(CameraRoll cameraRoll){
        Camera camera = new Camera();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }


}
