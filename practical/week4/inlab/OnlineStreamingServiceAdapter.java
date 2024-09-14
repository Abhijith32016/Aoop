package week4inlab;

public class OnlineStreamingServiceAdapter implements MusicSource {
    private OnlineStreamingService onlineStreamingService;

    public OnlineStreamingServiceAdapter(OnlineStreamingService onlineStreamingService) {
        this.onlineStreamingService = onlineStreamingService;
    }

    @Override
    public void play() {
        onlineStreamingService.startStream();
    }

    @Override
    public void pause() {
        onlineStreamingService.pauseStream();
    }

    @Override
    public void stop() {
        onlineStreamingService.stopStream();
    }

    @Override
    public String getInfo() {
        return onlineStreamingService.getStreamInfo();
    }
}