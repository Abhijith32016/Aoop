package week4inlab;

public class OnlineStreamingService {
    private String streamUrl;

    public OnlineStreamingService(String streamUrl) {
        this.streamUrl = streamUrl;
    }

    public void startStream() {
        System.out.println("Starting stream from: " + streamUrl);
    }

    public void pauseStream() {
        System.out.println("Pausing stream");
    }

    public void stopStream() {
        System.out.println("Stopping stream");
    }

    public String getStreamInfo() {
        return "Stream URL: " + streamUrl;
    }
}


