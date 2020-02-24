package com.vnr.krishnaharshini.epam.logger;
import com.vnr.krishnaharshini.epam.interestcalculator.*;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SiandCi {
	private static Logger LOGGER=LogManager.getLogger(SiandCi.class);
	public static void main(String args[]) 
	{
		int choice;
		
		Scanner read=new Scanner(System.in);
		LOGGER.info("1.Calculet Simple Interest 2.Calculate Compound Interest");
		choice=read.nextInt();
		InterestCalci calculator=new InterestCalci();
		if(choice==1)
			calculator.SimpleInterest();
		else if(choice==2)
			calculator.CompoundInterest();
		else
			LOGGER.error("invalid choice");
		read.close();
		
	}
	

}