package com.vnr.krishnaharshini.epam.interestcalculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class InterestCalci {
	int principle,time,rateofinterest;
	private static Logger LOGGER=LogManager.getLogger(InterestCalci.class);
	
	public void readInput()
	{
		Scanner read=new Scanner(System.in);
		LOGGER.info("enter the principle amount");
		principle=read.nextInt();
		LOGGER.info("enter time period");
		time=read.nextInt();
		LOGGER.info("enter rate of interest");
		rateofinterest=read.nextInt();
		read.close();
	}
	public void SimpleInterest()
	{
		readInput();
		double simpleinterest=(double)principle*time*rateofinterest/100;
		LOGGER.info("Simple interest is "+simpleinterest);
	}
	public void CompoundInterest()
	{
		readInput();
		float CI;
		CI=1+rateofinterest*(float)0.01;
		CI=(float)Math.pow(CI, time);
		CI=principle*CI-principle;
		LOGGER.info("Compound interest is "+CI);
	}

}