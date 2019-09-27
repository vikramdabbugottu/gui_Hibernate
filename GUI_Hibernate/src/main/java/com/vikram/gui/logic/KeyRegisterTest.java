package com.vikram.gui.logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vikram.gui.pojo.KeyRegisterModel;

public class KeyRegisterTest {

	public static void main(String[] args) {
		KeyRegisterModel keyregmodel=new KeyRegisterModel();
		keyregmodel.setId(1);
		keyregmodel.setDistrictNumber("2003");
		keyregmodel.setAdress("Kungsgatan 34");
		keyregmodel.setAdressMoreInfo("Keyfinns");
		keyregmodel.setKeyModel("ASSA-Combi");
		keyregmodel.setKeyType("TB1");
		keyregmodel.setKeyFRAS("324fg56");
		keyregmodel.setKeySystemNumber("HH345675");
		keyregmodel.setAdressOwnerContactDetails("HSB-Maria-013280092");
		keyregmodel.setOwnerMoreInfo("got key in 2019");
		
		SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		session.save(keyregmodel);
		session.getTransaction().commit();
		session.close();
	}

}
