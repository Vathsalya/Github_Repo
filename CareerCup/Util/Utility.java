package Util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Utility {

	public static boolean DBG = !false;

	public static void DEBUG(Object s){
		System.out.println("DEBUG var: "+s);
	}

	public static BufferedReader openFileToRead(String filePath) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		try{
			FileInputStream fis = new FileInputStream(filePath);
			DataInputStream dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));
			DEBUG("Read File");
		}catch(Exception e){
			e.printStackTrace();
		}
		return br;
	}

	public static String RemoveChars(String line) {
		// TODO Auto-generated method stub
		char[] charArr = line.toCharArray();
		int index = 0;
		int i = 0;
		String s="";
		for( i = 0;i<line.length();i++){
			if(charArr[i]=='a'||charArr[i]=='i'){
				index++;
			}else{
				charArr[i-index] = charArr[i];
				//DEBUG(charArr[i-index]);
				s = s+charArr[i-index];
			}

		}
	//	String s = new String(charArr,0,charArr.length);
		DEBUG(s);
		return s;//new String(charArr,0,charArr.length);

	}

	public static BufferedWriter openFileToWrite(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String ReverseStrings(String line) {
		// TODO Auto-generated method stub
		char[] charArr = line.toCharArray();
		String[] strArr=new String[1000];
		String word="";
		int count=0;
		String result = "";
		for(char c: charArr){
			if(c == ' '){
				System.out.println(word);
				strArr[count] = word;
				word="";
				count++;
			}else{
				word = word + c;
			}
		}
		System.out.println(strArr.length);
		for(int i=strArr.length-1;i>0;i--)
			System.out.println(strArr[i]);
		return result;
	}

	public static int[] getTriplets(int number) {
		// TODO Auto-generated method stub
		int[] triplets = new int[3];
		for(int c = number;c>0;c--){
			for(int b = c-1;b>0;b--){
				for(int a = b-1;a>0;a--)
				{
					if(((a+b+c)==number) && (a*a)+(b*b)-(c*c)==0){
						triplets[0]=a;
						triplets[1]=b;
						triplets[2]=c;
					}
				}
			}
		}
		return triplets;
	}
	
}