package week4inlab;
public class MusicApp {
    public static void main(String[] args) {
   
        LocalFileMusicSource localFileSource = new LocalFileMusicSource("song.mp3");
        MusicSource localFileAdapter = new LocalFileMusicSourceAdapter(localFileSource);

        MusicSource equalizedLocalFile = new EqualizerDecorator(localFileAdapter);
        MusicSource volumeControlledLocalFile = new VolumeControlDecorator(equalizedLocalFile, 75);

        volumeControlledLocalFile.play();
        volumeControlledLocalFile.pause();
        volumeControlledLocalFile.stop();
        System.out.println(volumeControlledLocalFile.getInfo());

        OnlineStreamingService onlineService = new OnlineStreamingService("http://streamurl.com");
        MusicSource onlineStreamAdapter = new OnlineStreamingServiceAdapter(onlineService);

        MusicSource equalizedOnlineStream = new EqualizerDecorator(onlineStreamAdapter);
        MusicSource volumeControlledOnlineStream = new VolumeControlDecorator(equalizedOnlineStream, 50);

        volumeControlledOnlineStream.play();
        volumeControlledOnlineStream.pause();
        volumeControlledOnlineStream.stop();
        System.out.println(volumeControlledOnlineStream.getInfo());
    }
}
