package JavaTask;
interface Playable{
	void play();
}
class FootBall implements Playable{

	@Override
	public void play() {
		System.out.println("To Play FootBall");
		
	}
	
}
class VollyBall implements Playable{

	@Override
	public void play() {
		System.out.println("To Play VollyBall");
		
	}
	
}
class BasketBall implements Playable{

	@Override
	public void play() {
		System.out.println("To Play BasketBall");
		
	}
	
}

public class PlayableInterface {

	public static void main(String[] args) {
		//creating object of each sports
		Playable f=new FootBall();
		Playable v=new VollyBall();
		Playable b=new BasketBall();
		f.play();
		

	}

}
