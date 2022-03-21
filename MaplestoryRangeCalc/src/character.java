
public class character {
	
	private int level;
	private equipment[] equips;
	
	private double baseMainStat;
	private double baseSecondaryStat;
	private double weaponAttack;
	private double weaponMultiplier;
	
	public character(int level, equipment[] equips) {
		this.level = level;
		this.equips = equips;
		updateStats();
	}
	
	private void updateStats() {
		baseMainStat = level*5 + 14;
		baseSecondaryStat = 4;
		weaponAttack = 10;
		weaponMultiplier = 1.35;
	}
	
	public equipment[] getEquips() {
		return this.equips;
	}
	
	public double getRange() {
		double damage_range = weaponMultiplier * (4*baseMainStat + baseSecondaryStat) * weaponAttack/100;
		return Math.floor(damage_range);
	}

}
