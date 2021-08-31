package UserInterface;

import Business.Concretes.CampaingManager;
import Business.Concretes.GameManager;
import Business.Concretes.GamePlayManager;
import Business.Concretes.GamerManager;
import Business.Concretes.KidsCalculate;
import Business.Concretes.OldCalculate;
import Business.Concretes.SellingManager;
import DataAccess.Concretes.Hibernate.HibernateCampaingDao;
import DataAccess.Concretes.Hibernate.HibernateGameDao;
import DataAccess.Concretes.Hibernate.HibernateGamerDao;
import DataAccess.Concretes.Jdbc.JdbcGameDao;
import DataAccess.Concretes.Jdbc.JdbcSellingDao;
import Entities.Concretes.Campaing;
import Entities.Concretes.Game;
import Entities.Concretes.Gamer;
import Entities.Concretes.Selling;

public class Main {

	public static void main(String[] args) {
		
		
		// Oyun Ekleme

		Game game = new Game(1,"CS","FPS",50,100);
		GameManager gameManager = new GameManager(new JdbcGameDao());
		gameManager.add(game);
		
		// Oyunncu Ekleme
		
		Gamer gamer = new Gamer(1,"123456789","Abdullah","Bilgen",1920,1);
		GamerManager gamerManager = new GamerManager(new HibernateGamerDao());
		gamerManager.add(gamer);
		
		// Yaþ Sorgusu
		
		GamePlayManager gamePlayManager = new GamePlayManager(new OldCalculate());
		gamePlayManager.gamesPlay(gamer, game);
		
		// Kampanya
		
		Campaing campaing = new Campaing(1,"Anlýk Ýndirim",25);
		CampaingManager campaingManager = new CampaingManager(new HibernateCampaingDao());
		campaingManager.add(campaing);

		// Satýþ
		
		Selling selling = new Selling(1,gamer,game,campaing,100);
		SellingManager sellingManager = new SellingManager(new JdbcSellingDao());
		sellingManager.campaingSales(selling);
		
		
	}

}
