package org.java.books;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final File testWrite = new File("./text-example.txt");
		Scanner in = null;
		 
		 
	//		  Libro l = new Libro("la casa", 45, "Ma", "Mondadori");
	//		  System.out.println(l);
			 
	  in = new Scanner(System.in);
	  System.out.print("Quanti libri vuoi inserire? ");
	  String strBookNumber = in.nextLine();
	  int intBookNumber = Integer.valueOf(strBookNumber);
	  
	  int bookIndex = 0;
	  Libro[] books = new Libro[intBookNumber];
	
	  
	  while(bookIndex < intBookNumber) {
		 
		 System.out.print("\n -" + (bookIndex +1)+"- " + "Titolo del libro: ");
		 String strTitle = in.nextLine();
		 
		 System.out.print("nome autore: ");
		 String strAutor = in.nextLine();
		 
		 System.out.print("casa editrice: ");
		 String strEditor = in.nextLine();
		 
		 System.out.print("numero di pagine: ");
		 String strPage = in.nextLine();
		 int intPage = Integer.valueOf(strPage);
		
		 Libro book = null;
			
		 	try {	  
				 book = new Libro(strTitle, intPage, strAutor, strEditor);
				 
				 books[bookIndex++] = book;
				 
			 } catch (Exception e) {
				 System.out.println("Errore: " + e.getMessage());
			 } 
	 	}	
		 in.close();
		  System.out.println("\n------STAMPA ARRAY------\n" + Arrays.asList(books));
		 	  
		  //SCRITTURA SUL FILE
		  FileWriter myWriter = null;

			  try {
				myWriter = new FileWriter(testWrite);
				
				for(int x=0; x<books.length; x++) {		
					myWriter.write(books[x] + "\n");
				}
			} catch (IOException e) {
				
				System.out.println("Error writing file: ");
			}finally {
				if(myWriter != null)
					try {
						myWriter.close();
					}catch(IOException e) {};
			}
		
			  
		  //LETTURA DAL FILE
		  Scanner reader = null;
		  
		  
			  try {
				reader = new Scanner(testWrite);
				
				System.out.println("\n------STAMPA DA FILE------\n");
				while(reader.hasNextLine()) {
					String line = reader.nextLine();
					System.out.println(line);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(reader!= null)
					reader.close();
			}
		 
		
	}
}
