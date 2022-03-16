package Establishment.Login.testCase;

import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import com.opencsv.CSVReader;

public class CsvReader {
	//Read URL 
	public String ReadURL() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Login/URL.csv"));
		String[] nextLine;
		nextLine = reader.readNext();
		String URL = nextLine[0];
		reader.close();
		return URL;
	}
	
	//read the username and password correct with CSV file - number
	public List<String[]> LoginFileCorrectWhitNumber() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Login/LoginFileCorrect_WithNumber.csv"));
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//read the username and password wrong with CSV file - number
	public List<String[]> LoginFileWrongWhitNumber() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Login/LoginFileWrong_WithNumber.csv"));
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//read the username correct and password wrong with CSV file - number
	public List<String[]> LoginFileUsernameCorrect_PasswordWrongWhitNumber() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Login/LoginFileUsernameCorrect_PasswordWrong_WithNumber.csv"));
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	//read the username wrong and password correct with CSV file - number
	public List<String[]> LoginFileUsernameWrong_PasswordCorrectWhitNumber() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Login/LoginFileUsernameWrong_PasswordCorrect_WithNumber.csv"));
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//read the username and password correct with CSV file - Email
	public List<String[]> LoginFileCorrectWhitEmail() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Login/LoginFileCorrect_WithEmail.csv"));
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//read the username and password Wrong with CSV file - Email
	public List<String[]> LoginFileWrongWhitEmail() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Login/LoginFileWrong_WithEmail.csv"));
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
		
	//read the username correct and password wrong with CSV file - Email
	public List<String[]> LoginFileUsernameCorrect_PasswordWrongWhitEmail() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Login/LoginFileUsernameCorrect_PasswordWrong_WithEmail.csv"));
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}	

	//read the username wrong and password correct with CSV file - Email
	public List<String[]> LoginFileUsernameWrong_PasswordCorrectWhitEmail() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Login/LoginFileUsernameWrong_PasswordCorrect_WithEmail.csv"));
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
			reader.close();
			return loginData;
	}
	
	//CreateBasicInformationAlphabet
	public List<String[]> CreateAccount() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Account/CreateAccount.csv"),',','\'');
		List<String[]> newAccount = reader.readAll();
		reader.close();
		return newAccount;
	}
	
	
	
	//create Account All
	public List<String[]> FactorList() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Login/111.csv"),',','\'');
		List<String[]> newAccount = reader.readAll();
		reader.close();
		return newAccount;
	}
	
}
