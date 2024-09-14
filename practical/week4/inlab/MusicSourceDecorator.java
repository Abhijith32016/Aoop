package week4inlab;

public abstract class MusicSourceDecorator implements MusicSource {
    protected MusicSource musicSource;

    public MusicSourceDecorator(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    @Override
    public void play() {
        musicSource.play();
    }

    @Override
    public void pause() {
        musicSource.pause();
    }

    @Override
    public void stop() {
        musicSource.stop();
    }

    @Override
    public String getInfo() {
        return musicSource.getInfo();
    }
}
