package suju;

public class Cliunt {

	int ClNum, HP;
	String Ad, CLname;
	boolean sp = false;

	public Cliunt(int clNum, String cLname, String ad, int hP, boolean sp) {

		this.ClNum = clNum;
		this.Ad = ad;
		this.HP = hP;
		this.CLname = cLname;
		this.sp = sp;
	}

	public Cliunt() {
		// TODO Auto-generated constructor stub
	}

	public int getClNum() {
		return ClNum;
	}

	public String getAd() {
		return Ad;
	}

	public int getHP() {
		return HP;
	}

	public String getCLname() {
		return CLname;
	}

	public void setClNum(int clNum) {
		ClNum = clNum;
	}

	public void setAd(String ad) {
		Ad = ad;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public void setCLname(String cLname) {
		CLname = cLname;
	}

	public void setSp(boolean sp) {
		this.sp = sp;
	}

	public boolean isSp() {
		return sp;
	}

	@Override
	public String toString() {
		return "[ 고객번호 : " + ClNum + "\t이름 : " + CLname + "\t연락처 : " + HP + "\t주소 : " + Ad + "\t특별회원 : " + sp + "]";
	}

}
