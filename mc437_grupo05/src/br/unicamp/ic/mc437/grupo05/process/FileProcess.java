package br.unicamp.ic.mc437.grupo05.process;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.unicamp.ic.mc437.grupo05.modelo.TestFile;

public class FileProcess {
	
	public FileProcess(){
		
	}

	//TODO still in stub mode, generate mockup data
	public List<TestFile> getFilesSharedWith(String user){
		List<TestFile> mockupList = new ArrayList<TestFile>();
		for(int i=0; i<5; i++){
			TestFile newTestFile = new TestFile();
			newTestFile.setName("File " + i);
			newTestFile.setOwner("Owner" + i);
			newTestFile.setAddTs(new Timestamp(new Date().getTime()));
			mockupList.add(newTestFile);
		}
		return mockupList;
	}
	
	//TODO still in stub mode, generate mockup data
	public List<TestFile> getFilesOwnedBy(String user){
		List<TestFile> mockupList = new ArrayList<TestFile>();
		for(int i=0; i<3; i++){
			TestFile newTestFile = new TestFile();
			newTestFile.setName("My File " + i);
			newTestFile.setOwner(user);
			newTestFile.setAddTs(new Timestamp(new Date().getTime()));
			mockupList.add(newTestFile);
		}
		return mockupList;
	}
}
