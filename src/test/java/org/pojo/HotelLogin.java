package org.pojo;

import org.basee.BaseClass;

public class HotelLogin extends BaseClass {
	public static void main(String[] args) {
		launchBrowser();
		loadUrl("http://adactinhotelapp.com/");
		toMaximize();
		toTitle();
		toCurrentUrl();
		HotelPojo h=new HotelPojo();
		fill(h.getTxtUser(), "renu1990@gmail.com");
		fill(h.getTxtPass(), "renuarun");
		toClick(h.getBtnLogin());
	}

}
