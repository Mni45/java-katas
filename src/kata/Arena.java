public class Arena {
	

	public static void main(String[] args){
		Worm worm1 = new Worm("worm1", 100, 10);
		Worm worm2 = new Worm("worm2", 100, 20);

		while(worm1.getLife() > 0 && worm2.getLife() > 0){
			worm1.fight(worm2);
		}

	}

}
