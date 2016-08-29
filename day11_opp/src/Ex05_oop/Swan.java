package Ex05_oop;

public class Swan {
	String name, subject, payment, cellPh;

	public Swan() {

	}

	public Swan(String name, String subject, String payment, String cellPh) {
		super();
		this.name = name;
		this.subject = subject;
		this.payment = payment;
		this.cellPh = cellPh;

		show();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getCellPh() {
		return cellPh;
	}

	public void setCellPh(String cellPh) {
		this.cellPh = cellPh;
	}

	public void show() {
		System.out.println("�̸� : " + name + "\n�μ� : " + subject + "\n�޿� : " + payment + "\n����ó : " + cellPh);
	}

}