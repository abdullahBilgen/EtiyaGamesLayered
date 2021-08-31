package Entities.Concretes;

public class User {
	
	private int id ;
	private String tcNo;
	private String isim;
	private String soy›sim;
	private int dogumTarihi;
	private int cinsiyet;
	
	public User() {
		super();
	}

	public User(int id, String tcNo, String isim, String soy›sim, int dogumTarihi, int cinsiyet) {
		super();
		this.id = id;
		this.tcNo = tcNo;
		this.isim = isim;
		this.soy›sim = soy›sim;
		this.dogumTarihi = dogumTarihi;
		this.cinsiyet = cinsiyet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoy›sim() {
		return soy›sim;
	}

	public void setSoy›sim(String soy›sim) {
		this.soy›sim = soy›sim;
	}

	public int getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(int dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public int getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(int cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	

}
