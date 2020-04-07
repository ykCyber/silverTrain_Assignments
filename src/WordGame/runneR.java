package WordGame;

public class runneR {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			game alfa= new game(i);
			alfa.startGame(i);
		}
	}

}
