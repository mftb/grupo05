package br.unicamp.ic.mc437.s22014.grupo5.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.northconcepts.datapipeline.core.DataReader;
import com.northconcepts.datapipeline.core.Record;
import com.northconcepts.datapipeline.xml.XmlReader;
//import javax.xml.xquery.*;
 
public class XMLToSQLParser {

	 public static void main(String[] args) {
		//parsing persons.xml
        DataReader reader1 = new XmlReader(new File("resources/xml/persons.xml"))
            .addField("uri", "/Persons/Person/@uri")
            .addField("name", "/Persons/Person/@name")
            .addField("hometown", "/Persons/Person/@hometown")
            .addRecordBreak("/Persons/Person");

        reader1.open();
        
        //writing the SQL statements on a persons.sql file
        try {
            Record record;
            PrintWriter writer1 = new PrintWriter("resources/sql/persons.sql");
            while ((record = reader1.read()) != null) {
               writer1.write("INSERT INTO Persons VALUES ('");
               writer1.write(record.getField("uri").getValueAsString());
               writer1.write("','");
               writer1.write(record.getField("name").getValueAsString());
               writer1.write("','");
               writer1.write(record.getField("hometown").getValueAsString());
               writer1.write("');\n");
            }
            writer1.close();
            
          //parsing knows.xml
	        DataReader reader2 = new XmlReader(new File("resources/xml/knows.xml"))
	        .addField("person", "/AllKnows/Knows/@person")
	        .addField("colleague", "/AllKnows/Knows/@colleague")
	        .addRecordBreak("/AllKnows/Knows");
	       
	        reader2.open();
            
          //writing the SQL statements on a knows.xml file
            PrintWriter writer2 = new PrintWriter("resources/sql/knows.sql");
            while ((record = reader2.read()) != null) {
               writer2.write("INSERT INTO Knows VALUES ('");
               writer2.write(record.getField("person").getValueAsString());
               writer2.write("','");
               writer2.write(record.getField("colleague").getValueAsString());
               writer2.write("');\n");
            }
            
            //parsing knows.xml
	        DataReader reader3 = new XmlReader(new File("resources/xml/likesmusic.xml"))
	        .addField("person", "/AllLikesMusic/LikesMusic/@person")
	        .addField("rating", "/AllLikesMusic/LikesMusic/@rating")
	        .addField("colleague", "/AllLikesMusic/LikesMusic/@colleague")
	        .addRecordBreak("/AllLikesMusic/LikesMusic");
	       
	        reader3.open();
            
          //writing the SQL statements on a knows.xml file
            PrintWriter writer3 = new PrintWriter("resources/sql/likesmusic.sql");
            while ((record = reader3.read()) != null) {
               writer3.write("INSERT INTO LikesMusic VALUES ('");
               writer3.write(record.getField("person").getValueAsString());
               writer3.write("',");
               writer3.write(record.getField("rating").getValueAsString());
               writer3.write(",'");
               writer3.write(record.getField("colleague").getValueAsString());
               writer3.write("');\n");
            }
            
            //closing readers and writers
            reader1.close(); 
            reader2.close(); 
            reader3.close(); 
            writer1.close();
            writer2.close();
            writer3.close();
        } 
        catch(FileNotFoundException e){
        	e.printStackTrace();
        }
    }
 
}