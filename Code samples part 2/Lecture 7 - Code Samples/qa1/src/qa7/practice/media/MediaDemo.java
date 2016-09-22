package qa7.practice.media;

public class MediaDemo {
	public static void main(String[] args) {
		MediaPlayer player = new MediaPlayer();
		
		Media audio = new AudioMedia();
		Media video = new VideoMedia();
		
		player.playMedia(audio);
		player.stopMedia(audio);
		player.playMedia(video);
		player.stopMedia(video);
	}
}