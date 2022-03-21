
public class eqStats {
	
	private boolean isWeapon;
	private int level;
	
	private int baseStr;
	private int baseDex;
	private int baseInt;
	private int baseLuk;
	
	private int baseAtk;
	private int baseMAtk;
	
	private int baseHP;
	private int baseMP;
	
	private flame flame;
	
	public eqStats(int level, int baseStr, int baseDex, int baseInt, int baseLuk, int baseAtk, int baseMAtk, int baseHP,
			int baseMP) {
		this.level = level;
		this.baseStr = baseStr;
		this.baseDex = baseDex;
		this.baseInt = baseInt;
		this.baseLuk = baseLuk;
		this.baseAtk = baseAtk;
		this.baseMAtk = baseMAtk;
		this.baseHP = baseHP;
		this.baseMP = baseMP;
		
		flame = new flame(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}

	
	public flame getFlame() {
		return flame;
	}
	
	public void setFlame(flame flame) {
		this.flame = flame;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getStr() {
		return baseStr;
	}

	public int getDex() {
		return baseDex;
	}

	public int getInt() {
		return baseInt;
	}

	public int getLuk() {
		return baseLuk;
	}

	public int getAtk() {
		return baseAtk;
	}

	public int getMAtk() {
		return baseMAtk;
	}

	public int getBaseHP() {
		return baseHP;
	}

	public int getBaseMP() {
		return baseMP;
	}
	
	public boolean isWeapon() {
		return isWeapon;
	}
	
	public int getBaseStr() {
		return baseStr;
	}


	public void setBaseStr(int baseStr) {
		this.baseStr = baseStr;
	}


	public int getBaseDex() {
		return baseDex;
	}


	public void setBaseDex(int baseDex) {
		this.baseDex = baseDex;
	}


	public int getBaseInt() {
		return baseInt;
	}


	public void setBaseInt(int baseInt) {
		this.baseInt = baseInt;
	}


	public int getBaseLuk() {
		return baseLuk;
	}


	public void setBaseLuk(int baseLuk) {
		this.baseLuk = baseLuk;
	}


	public int getBaseAtk() {
		return baseAtk;
	}


	public void setBaseAtk(int baseAtk) {
		this.baseAtk = baseAtk;
	}


	public int getBaseMAtk() {
		return baseMAtk;
	}


	public void setBaseMAtk(int baseMAtk) {
		this.baseMAtk = baseMAtk;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public void setBaseHP(int baseHP) {
		this.baseHP = baseHP;
	}


	public void setBaseMP(int baseMP) {
		this.baseMP = baseMP;
	}


	public void setWeapon(boolean isWeapon) {
		this.isWeapon = isWeapon;
	}
	
	
	
}
