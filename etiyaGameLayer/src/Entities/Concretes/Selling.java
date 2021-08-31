package Entities.Concretes;

public class Selling {
	
	private int id;
	private Gamer gamer;
	private Game game;
	private Campaing campaing;
	private double CampaingPrice;
	
	public Selling() {
		super();
	}

	public Selling(int id, Gamer gamer, Game game, Campaing campaing, double campaingPrice) {
		super();
		this.id = id;
		this.gamer = gamer;
		this.game = game;
		this.campaing = campaing;
		CampaingPrice = campaingPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Gamer getGamer() {
		return gamer;
	}

	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Campaing getCampaing() {
		return campaing;
	}

	public void setCampaing(Campaing campaing) {
		this.campaing = campaing;
	}

	public double getCampaingPrice() {
		return CampaingPrice;
	}

	public void setCampaingPrice(double campaingPrice) {
		CampaingPrice = campaingPrice;
	}

}
