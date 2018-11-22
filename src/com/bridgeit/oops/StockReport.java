package com.bridgeit.oops;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import com.bridgeit.utility.Utility1;

public class StockReport {

	public static void main(String[] args)throws IOException, ParseException, java.text.ParseException, org.json.simple.parser.ParseException
	{
		FileReader fileread=Utility1.fileRead1("StockReport.json");
		Utility1.stockReport(fileread);
	}

}
