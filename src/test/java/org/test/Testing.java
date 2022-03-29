package org.test;

import java.io.IOException;

import org.base.BaseClass;

import com.pojo.PojoUserName;

public class Testing extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		launchBrowser();
		passUrl(" http://www.adactin.com/HotelApp/");
		PojoUserName p = new PojoUserName();
		passInput(p.getPass(), excelRead(1, 0));
		Thread.sleep(2000);
		passInput(p.getPass(), excelRead(1, 1));
		Thread.sleep(3000);

	}

}
