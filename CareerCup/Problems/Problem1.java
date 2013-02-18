package Problems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import Util.Utility;

//Give an algorithm which removes the occurrence of A and I from string ? The algorithm must be in-place
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String currentPath = new java.io.File( "." ).getCanonicalPath();
			if(Utility.DBG)
				System.out.println("Current dir:"+currentPath);

			BufferedReader br = Utility.openFileToRead(currentPath+"\\src\\Input\\Problem1");

			String count = br.readLine();
			if(Utility.DBG)
				Utility.DEBUG(count);
			 PrintWriter pw = new PrintWriter(currentPath+"\\src\\Output\\Problem1"); 		//output file

			for(int i = 0;i<Integer.parseInt(count);i++){
				String line = br.readLine();
				if(Utility.DBG)
					Utility.DEBUG(line);
				line = Utility.RemoveChars(line);
				if(Utility.DBG)
					Utility.DEBUG(line);

				pw.println(line);

			}
			pw.close();



		}
		catch(Exception e){
			e.printStackTrace();
		}

	}


}