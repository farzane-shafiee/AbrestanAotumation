package PersonSide.PersonGroup.testCase;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;

public class CsvReaderPersonGroup {
	//read the code and name Person group with CSV file
	public List<String[]> CreatePersonGroup_WithIcon() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/PersonGroup/CreatePersonGroup_WithIcon.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//read the code and name Person group with CSV file
	public List<String[]> CreatePersonGroup_WithButton() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/PersonGroup/CreatePersonGroup_WithButton.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//read the code and name Person group with CSV file
	public List<String[]> CreatePersonGroup_CodeWrong() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/PersonGroup/CreatePersonGroup_CodeWrong.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//read the code and name Person group with CSV file
	public List<String[]> SearchPersonGroup() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/PersonGroup/SearchPersonGroup.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//Edit Person group
	public List<String[]> EditPersonGroup_Correct() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/PersonGroup/EditPersonGroup_Correct.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//Edit Person group
	public List<String[]> EditPersonGroup_Wrong() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/PersonGroup/EditPersonGroup_Wrong.csv"),',','\'');
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
}
