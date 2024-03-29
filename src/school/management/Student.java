package school.management;

public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	public Student(int id, String name, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = 0;
		this.feesTotal = 30000;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void payFees(int fees) {
		feesPaid+=fees;
	}
	public int getFeesPaid() {
		return feesPaid;
	}
	public int getFeesTotal() {
		return feesTotal;
	}
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", feesPaid=" + feesPaid + ", feesTotal="
				+ feesTotal + "]";
	}

}
