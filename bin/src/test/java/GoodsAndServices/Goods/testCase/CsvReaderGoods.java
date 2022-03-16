package GoodsAndServices.Goods.testCase;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;

public class CsvReaderGoods {
	
	//create Goods Mandatory
	public List<String[]> CreateGoodsMandatory_Correct() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/CreateGoodsMandatory.csv"),',','\'');
		List<String[]> newAccount = reader.readAll();
		reader.close();
		return newAccount;
	}
	
	//create Goods All
	public List<String[]> CreateGoodsAll_Correct() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/CreateGoodsAll.csv"),',','\'');
		List<String[]> newAccount = reader.readAll();
		reader.close();
		return newAccount;
	}
	
	//Create Goods Code Wrong with CSV file
	public List<String[]> CreateGoods_CodeWrong() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/CreateGoods_CodeWrong.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//Create Goods Code Empty with CSV file
	public List<String[]> CreateGoods_CodeEmpty() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/CreateGoods_CodeEmpty.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
		
	//Create Goods Name Empty with CSV file
	public List<String[]> CreateGoods_NameEmpty() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/CreateGoods_NameEmpty.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//Create Goods Name Wrong with CSV file
	public List<String[]> CreateGoods_NameWrong() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Person/CreateGoods_NameWrong.csv"),',','\'');
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
}
