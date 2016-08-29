package Ex01.collec;

public class Strudent {

	int kor, eng, com, total;
	double avg;

	public Strudent(int kor, int eng, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.com = com;
		this.total = kor + eng + com;
		this.avg = (kor + eng + com) / 3.0;
		System.out.println(toString());
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "¹ÚÁØ±Ô [kor=" + kor + ", eng=" + eng + ", com=" + com + ", total=" + total + ", avg" + (Math.round(avg*100)/100.0) + "]";
	}

}
