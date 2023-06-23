package seleniumbasic;



import java.util.Scanner;

public class Rangecount {

	 static void printCloudNix(int l, int h){
	     for(int i =1; i <=h ; i++){   
	    	 if( i % (3*7) == 0){
	    		 System.out.println("CLOUDNIX");
	    	 }else if(i % 3 == 0) {
	    		 System.out.println("CLOUD");
	    	 }else if(i % 7 == 0) {
	    		 System.out.println("NIX");
	    	 }else{
	    		 System.out.println(i);
	    	 }
	    	 }
	     }
	
	
	
	
	public static void main(String[] args) {

  Scanner s = new Scanner(System.in);
  int l = s.nextInt();
  int h = s.nextInt();
  printCloudNix(l,h);

  
	}

}
