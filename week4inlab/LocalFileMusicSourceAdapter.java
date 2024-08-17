package week4inlab;

public class LocalFileMusicSourceAdapter implements MusicSource {
    private LocalFileMusicSource localFileMusicSource;

    public LocalFileMusicSourceAdapter(LocalFileMusicSource localFileMusicSource) {
        this.localFileMusicSource = localFileMusicSource;
    }

    @Override
    public void play() {
        localFileMusicSource.playFile();
    }

    @Override
    public void pause() {
        localFileMusicSource.pauseFile();
    }

    @Override
    public void stop() {
        localFileMusicSource.stopFile();
    }

    @Override
    public String getInfo() {
        return localFileMusicSource.getFileInfo();
    }
}