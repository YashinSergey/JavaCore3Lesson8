package lesson.Spring;

public class Camera {
    private ICameraRoll ColorCameraRoll;
    private ICameraRoll bWCameraRoll;

    public ICameraRoll getColorCameraRoll() {
        return ColorCameraRoll;
    }

    public void setColorCameraRoll(ICameraRoll colorCameraRoll) {
        this.ColorCameraRoll = colorCameraRoll;
    }

    public ICameraRoll getBWCameraRoll() {
        return bWCameraRoll;
    }

    public void setbWCameraRoll(ICameraRoll bWCameraRoll) {
        this.bWCameraRoll = bWCameraRoll;
    }

    public void doColorPhotograph(){
        System.out.println("Щёлк!");
        ColorCameraRoll.processing();
    }

    public void doBWPhotograph(){
        System.out.println("Щёлк!");
        bWCameraRoll.processing();
    }
}
