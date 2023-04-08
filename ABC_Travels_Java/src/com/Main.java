package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		try {

			File f = new File(Constants.filePath);
			FileInputStream fis = new FileInputStream(f); 
			int temp;
			while((temp = fis.read())!=-1) {
				System.out.print((char)temp);
			}

			printMsg("\n\n");


			int k=0;
			do {
				printMsg("Choose the option as per your need");
				printMsg("1.Resgistration\n2.Login\n");
				int option = s.nextInt();
				switch(option) {
				case(1):
					UserInfo.userRegistration();
				k = continueChoosing(s);
				break;
				case(2):
					UserInfo.userLogin();
				k = continueChoosing(s);
				break;



				}}while(k==1);
		} catch (FileNotFoundException e) {
			printMsg("File is not present in specified path");
		}catch(IOException e) {
			e.printStackTrace();	
		}
		catch(Exception e) {
			printMsg("you haven't written catch for this exception");
		}


	}

	private static int continueChoosing(Scanner s) {
		int k;
		k=0;
		System.out.println("enter 1 to continue");
		k = s.nextInt();
		return k;
	}

	private static void printMsg(String msg) {
		System.out.println(msg);
	}





}
