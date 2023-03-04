package org.example;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Camera {
    private String model;
    private String resolution;
    private double zoom;
    private String memoryCardType;
    private int photosCount;
    private static Camera instance;

    public static Camera getInstance(String model, String resolution, double zoom, String memoryCardType, int photosCount) {
        if (instance == null) {
            instance = new Camera(model, resolution, zoom, memoryCardType, photosCount);
        }
        return instance;
    }

    public Camera(String r, double z) {
    }

    public void resetZoom() {
        zoom = 1;
    }

    public void savePhoto() {
        photosCount++;
    }

    public void eraseMemory() {
        photosCount = 0;
    }

    public void changeSettings(String resolution, double zoom) {
        this.resolution = resolution;
        this.zoom = zoom;
    }
    public static void main(String[] args) {
        Camera[] list = new Camera[4];
        list[0] = new Camera();
        list[1] = new Camera("Samsung m3000", "1024х768", 2.9, "SD", 5);
        list[2] = Camera.getInstance("Nicon", "780x399", 4.0, "SD", 4949994);
        list[3] = Camera.getInstance("Nicon", "49894x6364", 4188.4, "SD", 234);

        int i = 0;
        while (i < list.length) {
            System.out.println(list[i].toString());
            i++;
        }
    }
}



