package SRP;

public class BillTotal {

	public float billAmount;
	public float billDeduction;
	public float VAT;
	public String code;
	public float getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}
	public float getBillDeduction() {
		return billDeduction;
	}
	public void setBillDeduction(float billDeduction) {
		this.billDeduction = billDeduction;
	}
	public float getVAT() {
		return VAT;
	}
	public void setVAT(float vAT) {
		VAT = vAT;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public BillTotal(float billAmount, float billDeduction, float vAT, String code) {
		super();
		this.billAmount = billAmount;
		this.billDeduction = billDeduction;
		VAT = vAT;
		this.code = code;
	}

	public float calculateBillTotal() {
		
		if(code == "0")
			
			return billAmount - billDeduction;
		
		else 
			
			return (billAmount - billDeduction) + VAT;
		
	}	
}
