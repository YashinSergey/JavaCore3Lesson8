package lesson.Spring;

public class Photographer {
    public static void main(String[] args) {
        ICameraRoll cameraRoll = new ColorCameraRoll();
        Camera camera = new Camera();
        camera.setColorCameraRoll(cameraRoll);
        camera.doColorPhotograph();
    }
}
