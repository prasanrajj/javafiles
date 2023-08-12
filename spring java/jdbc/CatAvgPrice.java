package jdbc;

public class CatAvgPrice {
	private String code;
	private double avgPrice;
	
	
	public CatAvgPrice(String code, double avgPrice) {
		super();
		this.code = code;
		this.avgPrice = avgPrice;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getAvgPrice() {
		return avgPrice;
	}

	public void setAvgPrice(double avgPrice) {
		this.avgPrice = avgPrice;
	}

}
