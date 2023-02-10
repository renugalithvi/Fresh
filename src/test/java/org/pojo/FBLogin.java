package org.pojo;

import org.basee.BaseClass;

public class FBLogin extends BaseClass {
	public static void main(String[] args) {
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		toMaximize();
		toTitle();
		toCurrentUrl();
		LoginPojo l=new LoginPojo();
		fill(l.getTxtUser(), "renurenu1990@gmail.com");
		fill(l.getTxtPass(), "arunrenu");
		toClick(l.getBtnLogin());
	}

}
