package demo;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class javaproject2{
	
	  public static void main(String args[]) {
	     int count = 0;
	        try {
	              DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get("C:\\Users\\chnna\\Desktop\\New folder"));
	              
	              for (Path path : directoryStream)
	                 {
	            	   count++;
	                   
	                 }
	            }
	        catch (IOException ex) {
	                               }
	             System.out.println("Count is:"+count);
	     }
	}
