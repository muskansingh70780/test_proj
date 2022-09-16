
class Player {
	public void PlayerQuality() {
		System.out.println("Very Energetic");
	}
}
class Cricket_Player extends Player{
	public void PlayerQuality() {
		System.out.println("Good at batting");
	}
}
class Football_Player extends Player{
	public void PlayerQuality() {
		System.out.println("Very polite behaviour");
	}
}
class Hockey_Player extends Player{
	public void PlayerQuality() {
		System.out.println("Generous");
	}
}
class Main{
	public static void main(String[] args) {
		Player p=new Player();
		Player c=new Cricket_Player();
		Player f=new Football_Player();
		Player h=new Hockey_Player();
		p.PlayerQuality();
		c.PlayerQuality();
		f.PlayerQuality();
		h.PlayerQuality();
	}
}

