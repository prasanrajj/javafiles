package jpa;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sales")
public class Sale {
	@Id
	@GeneratedValue
    private int invno;
	
	@Column(name = "prodid")
	private int product;
	
	@Column(name = "qty")
	private int qty;
	
	@Column(name = "amount")
	private int amount;
	
	@Column(name = "transdate")
	private LocalDate transDate;

	public int getInvno() {
		return invno;
	}

	public void setInvno(int invno) {
		this.invno = invno;
	}

	public int getProduct() {
		return product;
	}

	public void setProduct(int product) {
		this.product = product;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public LocalDate getTransDate() {
		return transDate;
	}

	public void setTransDate(LocalDate transDate) {
		this.transDate = transDate;
	}

	@Override
	public String toString() {
		return "Sale [invno=" + invno + ", product=" + product + ", qty=" + qty + ", amount=" + amount + ", transDate="
				+ transDate + "]";
	}
	
	
}
