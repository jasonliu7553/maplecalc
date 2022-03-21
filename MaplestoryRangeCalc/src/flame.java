
public class flame {

	private int atk;
	private int mAtk;
	
	private int hp;
	private int str;
	private int dex;
	private int intl;
	private int luk;
	
	private int allStat;
	private int dmg;
	private int bossDmg;
	
	public flame(int atk, int mAtk, int hp, int str, int dex, int intl, int luk, int allStat, int dmg, int bossDmg) {
		this.atk = atk;
		this.mAtk = mAtk;
		this.hp = hp;
		this.str = str;
		this.dex = dex;
		this.intl = intl;
		this.luk = luk;
		this.allStat = allStat;
		this.dmg = dmg;
		this.bossDmg = bossDmg;
	}
	
	//Requires 10 elements
	public void setFlame(int[] flame){
		atk = flame[0];
		mAtk = flame[1];
		hp = flame[2];
		str = flame[3];
		dex = flame[4];
		intl = flame[5];
		luk = flame[6];
		allStat = flame[7];
		dmg = flame[8];
		bossDmg = flame[9];
	}
	
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getmAtk() {
		return mAtk;
	}
	public void setmAtk(int mAtk) {
		this.mAtk = mAtk;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getStr() {
		return str;
	}
	public void setStr(int str) {
		this.str = str;
	}
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	public int getInt() {
		return intl;
	}
	public void setInt(int intl) {
		this.intl = intl;
	}
	public int getLuk() {
		return luk;
	}
	public void setLuk(int luk) {
		this.luk = luk;
	}
	public int getAllStat() {
		return allStat;
	}
	public void setAllStat(int allStat) {
		this.allStat = allStat;
	}
	public int getDmg() {
		return dmg;
	}
	public void setDmg(int dmg) {
		this.dmg = dmg;
	}
	public int getBossDmg() {
		return bossDmg;
	}
	public void setBossDmg(int bossDmg) {
		this.bossDmg = bossDmg;
	}
	
	
	
	
}
