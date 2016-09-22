package qa7.practice.media;

public class AudioMedia implements Media {

	@Override
	public void play() {
		System.out.println("AudioMedia playing");
	}

	@Override
	public void stop() {
		System.out.println("AudioMedia stopping");
	}
}