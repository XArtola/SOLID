package SRP;

import java.sql.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;

// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
// Dedukzioa kalkulatu

		BillDeduction bd = new BillDeduction(billDeduction, deductionPercentage);
		billDeduction = bd.calculateDeduction();

// VAT kalkulatzen dugu

		VAT v = new VAT(billAmount);
		VAT = (float) v.calculateVAT();

// Totala kalkulatzen dugu
		BillTotal bt = new BillTotal(billAmount, billDeduction, VAT, code);
		billTotal = bt.calculateBillTotal();
	}
}














