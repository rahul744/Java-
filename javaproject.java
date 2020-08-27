package demo;
import java.io.File;
public class javaproject{

	  public static void main(String args[]) {
		  String[] path;
		  int count=0;
	        File f = new File("C:\\Users\\chnna\\Desktop\\New folder");
	        path = f.list();
	        for (String p : path) {
	                      count++;
	        	      System.out.println(p);
	            }
	            System.out.println("---Count of files is :"+ count);
	     }
	}