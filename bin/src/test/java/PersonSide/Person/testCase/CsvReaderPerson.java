package PersonSide.Person.testCase;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;

public class CsvReaderPerson {
	
	//create Account Mandatory
	public List<String[]> CreatePersonMandatory_Correct() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/CreatePersonMandatory.csv"),',','\'');
		List<String[]> newAccount = reader.readAll();
		reader.close();
		return newAccount;
	}
	
	//create Account All
	public List<String[]> CreatePersonAll_Correct() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/CreatePersonAll.csv"),',','\'');
		List<String[]> newAccount = reader.readAll();
		reader.close();
		return newAccount;
	}
	
	//Create Person Code Wrong with CSV file
	public List<String[]> CreatePerson_CodeWrong() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/CreatePerson_CodeWrong.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//Create Person Code Empty with CSV file
	public List<String[]> CreatePerson_CodeEmpty() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/CreatePerson_CodeEmpty.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
		
	//Create Person Username Wrong with CSV file
	public List<String[]> CreatePerson_UsernameWrong() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/CreatePerson_UsernameWrong.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}		
	
	//Create Person Name Empty with CSV file
	public List<String[]> CreatePerson_NameEmpty() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/CreatePerson_NameEmpty.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//Create Person LastName Empty with CSV file
	public List<String[]> CreatePerson_LastnameEmpty() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/CreatePerson_LastnameEmpty.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}

	//Create Person Display Name Empty with CSV file
	public List<String[]> CreatePerson_DisplayNameEmpty() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/CreatePerson_DisplayNameEmpty.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}	
	
	//read the code and name account group with CSV file
	public List<String[]> SearchPerson() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/SearchPerson.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//Edit Person Correct
	public List<String[]> EditPerson_Correct() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/EditPerson_Correct.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//Edit Person Wrong
	public List<String[]> EditPerson_Wrong() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/EditPerson_Wrong.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//Edit Person Name Empty 
	public List<String[]> EditPerson_NameEmpty() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/EditPerson_NameEmpty.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//Edit Person Last Name Empty 
	public List<String[]> EditPerson_LastNameEmpty() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/EditPerson_LastNameEmpty.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//Edit Person Display Name Empty 
	public List<String[]> EditPerson_DisplayNameEmpty() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/EditPerson_DisplayNameEmpty.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//Edit Person Display Name Wrong 
	public List<String[]> EditPerson_DisplayNameWrong() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/EditPerson_DisplayNameWrong.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}	
	
	
	
	
	

}
