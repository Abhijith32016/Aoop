package week4inlab;
public class EqualizerDecorator extends MusicSourceDecorator {
    public EqualizerDecorator(MusicSource musicSource) {
        super(musicSource);
    }

    @Override
    public void play() {
        super.play();
        applyEqualizer();
    }

    private void applyEqualizer() {
        System.out.println("Applying equalizer settings.");
    }
}
