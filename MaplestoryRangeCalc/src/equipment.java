
public class equipment {

	private String name;
	private int level;
	private eqStats stats;
	private boolean isWeapon;
	
	public equipment(String name, int level, eqStats stats, boolean isWeapon) {
		this.name = name;
		this.level = level;
		this.stats = stats;
		this.isWeapon = isWeapon;
		stats.setWeapon(isWeapon);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public eqStats getStats() {
		return stats;
	}

	public void setStats(eqStats stats) {
		this.stats = stats;
	}

	public boolean isWeapon() {
		return isWeapon;
	}

	public void setWeapon(boolean isWeapon) {
		this.isWeapon = isWeapon;
	}
	
	
}
