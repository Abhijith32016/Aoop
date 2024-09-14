package week4inlab;

public class VolumeControlDecorator extends MusicSourceDecorator {
    private int volumeLevel;

    public VolumeControlDecorator(MusicSource musicSource, int volumeLevel) {
        super(musicSource);
        this.volumeLevel = volumeLevel;
    }

    @Override
    public void play() {
        super.play();
        adjustVolume();
    }

    private void adjustVolume() {
        System.out.println("Adjusting volume to level: " + volumeLevel);
    }
}
