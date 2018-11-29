package com.bridgeit.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgeit.utility.Utility1;


public class AddressManager implements AddressManagerInterface {
	ObjectMapper objectMapper = new ObjectMapper();
	AddressBookInterface addressbook=new AddressBook();
	ArrayList<Person> arraylist=new ArrayList<Person>();
	File file;File newfile;
	static Scanner s=new Scanner(System.in);
	
	//For creating new addressbook
	public void create() {
		System.out.println("Give a name to your new address book:");

		file = new File(Utility1.ipstring()+".json");
		try {
			if (file.createNewFile()) {
				System.out.println("Address book is created!");
			}else
				{
					System.out.println("Cannot create new Addressbook");
				}
			
		} catch (IOException e) {
			System.out.println("Cannot create new Addressbook.");
			create();
		}
	}
	//Open the addressbook
	public void open() {
		System.out.println("Enter the name of address book");
		file = new File(Utility1.ipstring()+".json");//here enter addressbook name which created
				
		
				TypeReference<ArrayList<Person>> type = new TypeReference<ArrayList<Person>>() {
				};
				try {
					arraylist = objectMapper.readValue(file, type);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		addressbook.operation(arraylist);//calling Operation method of address 
	}
	//To save Addressbook
	
	public void save() {
		ArrayList<Person> arrayList = addressbook.list();

		try {
			objectMapper.writeValue(file, arrayList);//writeValue from arraylist to file
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//To save as Addressbook
	public void saveAs() {
		System.out.println("Give a name to your new file");
		newfile = new File(Utility1.ipstring()+".json");
		ArrayList<Person> arrayList = addressbook.list();

		try {
			objectMapper.writeValue(newfile, arrayList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void quit() {
		System.exit(0);
	}
}
