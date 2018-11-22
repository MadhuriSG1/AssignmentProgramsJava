package com.bridgeit.oops;
import com.bridgeit.utility.Utility1;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.ParseException;



public class InventoryData {
	public static void main(String arghs[]) throws IOException, ParseException
	{
	 
	FileReader fileread=Utility1.fileRead1("/home/bridgelabz/Desktop/Workspace/BasicPrograms/RicePulsesWheats.json");
	try {
		Utility1.RisePulseWheat(fileread);
	} catch (java.text.ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

  