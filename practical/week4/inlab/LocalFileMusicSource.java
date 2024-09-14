package week4inlab;

// LocalFileMusicSource.java
public class LocalFileMusicSource {
    private String filePath;

    public LocalFileMusicSource(String filePath) {
        this.filePath = filePath;
    }

    public void playFile() {
        System.out.println("Playing local file: " + filePath);
    }

    public void pauseFile() {
        System.out.println("Pausing local file");
    }

    public void stopFile() {
        System.out.println("Stopping local file");
    }

    public String getFileInfo() {
        return "Local file: " + filePath;
    }
}

// LocalFileMusicSourceAdapter.java
