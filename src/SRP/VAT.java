package SRP;

public class VAT {

	public float billAMount;

	public VAT(float billAMount) {
		super();
		this.billAMount = billAMount;
	}

	public float getBillAMount() {
		return billAMount;
	}

	public void setBillAMount(float billAMount) {
		this.billAMount = billAMount;
	}

	public float  calculateVAT() {
	
	return  (float) (billAMount * 0.16);
	}

}
