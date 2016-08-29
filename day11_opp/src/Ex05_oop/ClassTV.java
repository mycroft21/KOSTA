package Ex05_oop;

public class ClassTV {

	class color {
		String s, b, w, g, r;
		String TV = null;

		public color() {
			this("shilver", "blue", "white", "gold", "red");
		}

		public color(String s, String b, String w, String g, String r) {
			super();
			this.s = s;
			this.b = b;
			this.w = w;
			this.g = g;
			this.r = r;
		}

		public String getS() {
			return s;
		}

		public void setS(String s) {
			this.s = s;
		}

		public String getB() {
			return b;
		}

		public void setB(String b) {
			this.b = b;
		}

		public String getW() {
			return w;
		}

		public void setW(String w) {
			this.w = w;
		}

		public String getG() {
			return g;
		}

		public void setG(String g) {
			this.g = g;
		}

		public String getR() {
			return r;
		}

		public void setR(String r) {
			this.r = r;
		}

		public String getTV() {
			return TV;
		}

		public void setTV(String tV) {
			TV = tV;
		}

	}

	class Channel {

		String jtbc, ebs, kbs, A, sbs, mbc;
		String ch = null;

		public Channel(String jtbc, String ebs, String kbs, String a, String sbs, String mbc) {
			super();
			this.jtbc = jtbc;
			this.ebs = ebs;
			this.kbs = kbs;
			this.A = a;
			this.sbs = sbs;
			this.mbc = mbc;
		}

		public String getJtbc() {
			return jtbc;
		}

		public void setJtbc(String jtbc) {
			this.jtbc = jtbc;
		}

		public String getEbs() {
			return ebs;
		}

		public void setEbs(String ebs) {
			this.ebs = ebs;
		}

		public String getKbs() {
			return kbs;
		}

		public void setKbs(String kbs) {
			this.kbs = kbs;
		}

		public String getA() {
			return A;
		}

		public void setA(String a) {
			A = a;
		}

		public String getSbs() {
			return sbs;
		}

		public void setSbs(String sbs) {
			this.sbs = sbs;
		}

		public String getMbc() {
			return mbc;
		}

		public void setMbc(String mbc) {
			this.mbc = mbc;
		}

	}

}
