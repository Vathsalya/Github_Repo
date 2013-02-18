package Problems;

import java.io.BufferedReader;
import java.io.PrintWriter;

import Util.Utility;

public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String currentPath = new java.io.File( "." ).getCanonicalPath();
			if(Utility.DBG)
				System.out.println("Current dir:"+currentPath);

			BufferedReader br = Utility.openFileToRead(currentPath+"\\src\\Input\\Problem2");

			String count = br.readLine();
			if(Utility.DBG)
				Utility.DEBUG(count);
			PrintWriter pw = new PrintWriter(currentPath+"\\src\\Output\\Problem2"); 		//output file

			for(int i = 0;i<Integer.parseInt(count);i++){
				String line = br.readLine();
				if(Utility.DBG)
					Utility.DEBUG(line);
				line = Utility.ReverseStrings(line);
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
