public class Worm {

	private String name;
	private int life;
	private int attack;

	public Worm(String name, int life, int attack) {
		
		this.name = name;
		this.life = life;
		this.attack = attack;
	
    	}
	// Getter
	public String getName() {
		return this.name;
	}

	public int getLife() {
		return this.life;
	}

	public int getAttack() {
		return this.attack;
	}
	
	// Setter
	public void setName(String name) {
		this.name=name;
	}
	public void setLife( int life) {
		this.life=life;
	}
	public void setAttack(int attack) {
		this.attack=attack;
	}

	public void fight(Worm adverse) {
		if(this.life <= adverse.life && this.life>0 && adverse.life>0){
			System.out.println("Worm1 attacks first !");
			this.life-=adverse.attack;
			adverse.life=adverse.life - this.attack;
						
				
		}else if (this.life > adverse.life && this.life>0 && adverse.life>0 ){	
			System.out.println("Worm2 attacks first !");
			adverse.life=adverse.life - this.attack;
			this.life-=adverse.attack;
						
		}

		if (this.life<=0) {
			System.out.println(this.name+ " has " + this.life+" points remaining ");
			System.out.println(adverse.name+  " has " + adverse.life+" points remaining ");
			System.out.println(adverse.name + " is the winner !!!! ");
		} else {
			System.out.println(this.name+ " : Points remaining " + this.life);
			System.out.println(adverse.name+ " : Points remaining " + adverse.life);
		}

		

	}	
		
}
