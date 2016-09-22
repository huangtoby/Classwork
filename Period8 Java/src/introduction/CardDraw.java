package introduction;

public class CardDraw {

	public static void main(String[] args) {
		String[] faces = {"The King","The Queen","The Jack"};
		String[] suits = {"Spades","Hearts","Clubs","Diamonds"};
		int face = (int)(Math.random()*faces.length);
		int suit = (int)(Math.random()*suits.length);
		System.out.println(faces[face]+" of "+suits[suit]);

	}

}
