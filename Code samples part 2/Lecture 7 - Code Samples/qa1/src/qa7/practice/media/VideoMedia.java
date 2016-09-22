package qa7.practice.media;

public class VideoMedia implements Media {

	@Override
	public void play() {
		System.out.println("VideoMedia playing");
	}

	@Override
	public void stop() {
		System.out.println("VideoMedia stopping");
	}
}