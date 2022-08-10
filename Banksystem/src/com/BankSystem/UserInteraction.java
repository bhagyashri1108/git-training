package com.BankSystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class UserInteraction {
	
	public static void main(String args[])
	{
	
		String line="";
		Map<Long,BankOperations>bop=new HashMap<Long,BankOperations>();
	//read csv file contains accno and balance and name
		try{
		File csvfile=new File("src\\bankdata.txt");
		BufferedReader br=new BufferedReader(new FileReader(csvfile));
		while((line=br.readLine())!=null) {
			String[] data=line.split(",");
			//create object first
			BankOperations b1=new BankOperations(data[2],Long.parseLong(data[0]),Long.parseLong(data[1]));
			//add data to map
			//System.out.println(data[0]);
			bop.put(Long.parseLong(data[0]),b1);
		}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		//create hashmap
	//create objects
	//BankOperations b1=new BankOperations("abhay",11223344,12345);
	//BankOperations b2=new BankOperations("anand",11223345,44556);
	
	 //bop.put(b1.getAccountId(),b1);
	 //bop.put(b2.getAccountId(),b2);
	
	 for(Map.Entry<Long,BankOperations>mp:bop.entrySet())
	 {
		 System.out.println("Key = " + mp.getKey());
		 BankOperations b3=mp.getValue();
		 System.out.println(b3.getName()+" "+b3.getBalance(mp.getKey()));
	 }
	}
	}
