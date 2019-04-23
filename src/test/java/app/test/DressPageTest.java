package app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import app.pages.Basepage;
import app.pages.DressPageObjects;
import app.pages.HomePageObjects;


public class DressPageTest {
	HomePageObjects hpo;
	Basepage bp;
	DressPageObjects dpo;
	
	public DressPageTest(){
   	     bp = new Basepage();
	     hpo = new HomePageObjects();
	     dpo = new DressPageObjects();
	      }
	@Test
	public  void verigysizedresscheckbox()
	{
		hpo.getdresstab().click();
		System.out.println(dpo.getsmallcheckbox().isDisplayed());
		Assert.assertTrue(dpo.getsmallcheckboxtext().getText().contains("S "));
		Assert.assertTrue(dpo.getsmediumcheckboxtext().getText().contains("M "));
		Assert.assertTrue(dpo.getlargeboxtext().getText().contains("L "));
		
	}
	@Test
	public  void verigydresscount()
	{
		hpo.getdresstab().click();
		String str1= "There are ";
		String str2= " products.";
		String str3= str1+dpo.getDressPagecountbycounting()+str2;
		System.out.println(str3);
	  	Assert.assertTrue( dpo.getDressPagecount().getText().equals(str3));
	  	dpo.getcasualdressoption().click();
	  	str1= "There is ";
	    str2= " product.";
	    str3=str1+dpo.getDressPagecountbycounting()+str2;
	    System.out.println(str3);
	    System.out.println(dpo.getDressPagecount().getText());
	    Assert.assertTrue( dpo.getDressPagecount().getText().equals(str3));
	    hpo.getdresstab().click();
	  	dpo.geteveningdressoption().click();
	  	str3=str1+dpo.getDressPagecountbycounting()+str2;
	    System.out.println(str3);
	    System.out.println(dpo.getDressPagecount().getText());
	  	Assert.assertTrue( dpo.getDressPagecount().getText().equals(str3));
	   	hpo.getdresstab().click();
     	dpo.getsummerdressoption().click();
     	str1= "There are ";
     	str2= " products.";
	  	str3=str1+dpo.getDressPagecountbycounting()+str2;
	  	System.out.println(str3);
	  	System.out.println(dpo.getDressPagecount().getText());
	  	Assert.assertTrue( dpo.getDressPagecount().getText().equals(str3));
	}
	public void verifyaddcartproduct1()
	{
		
	}
}
