package services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;

public class teszt {

	public void creteFile() throws FileNotFoundException{
		PrintWriter w = new PrintWriter("text.txt");
		w.print("INSERT INTO Users VALUES (1, \'Loborg\', \'Csokika111\', \'loborger@gmail.com\');");
		w.close();
	}
	
}
