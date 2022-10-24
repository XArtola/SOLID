package SRP;

public class BillDeduction {

	public float billAmount;
	public int deductionPercentage;

	public BillDeduction(float billAmount, int deductionPercentage) {
		super();
		this.billAmount = billAmount;
		this.deductionPercentage = deductionPercentage;
	}

	public float getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}

	public int getDeductionPercentage() {
		return deductionPercentage;
	}

	public void setDeductionPercentage(int deductionPercentage) {
		this.deductionPercentage = deductionPercentage;
	}

	public float calculateDeduction() {

		if (billAmount > 50000)
			return (billAmount * deductionPercentage + 5) / 100;
		else
			return (billAmount * deductionPercentage) / 100;
	}

}













