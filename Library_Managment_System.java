package Serialization;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
//Q create desktop  application for library mgt system
//
//define class book having fields like bname ,aname ,price and get method and display;
//
//define other methods like
//    writeToFile()
//  readfromFile()
//  searchfromFile()
//
//In main design menu driven application
// 1) store data to file
// 2) read data fom file
// 3) search data from file
// 4) exit
public class Library_Managment_System implements Serializable  {
	Scanner s= new Scanner(System.in);

	String bname;
	String aname;
	int price;
	Library_Managment_System(String bname, String aname, int price){
		this.bname= bname;
		this.aname= aname;
		this.price= price;
	}
	
	
	void getmethod(String bname, String aname, int price) {
		this.bname= bname;
		this.aname= aname;
		this.price= price;
		
	
}
	void display() {
		System.out.println("book Name: "+bname);
		System.out.println("book Author name: "+aname);
		System.out.println("book Price: "+price);
		
	}
	
	
	
	void readfromfile() {
		try {
			
		Library_Managment_System e= new Library_Managment_System(bname,aname,price);
		FileInputStream i= new FileInputStream("emp1.dat");
		
		ObjectInputStream oi= new ObjectInputStream( i );
	
		 do
			 {
			 e=(Library_Managment_System)oi.readObject() ; //readObject return Object
			 
			 e.display();
			 }while(e!=null);
		
		}catch(Exception p)
		{
			System.out.println("Reading File Exception");
		}
	}
	void searchfromfile() {
		try {
		System.out.println("Enter element for search");
		String match=s.next();
		Library_Managment_System e= new Library_Managment_System(bname,aname,price);
		FileInputStream i= new FileInputStream("emp.dat");
		
		ObjectInputStream oi= new ObjectInputStream( i );
		
		if(i.equals(match)) {
			System.out.println("Data found");
		}else {
			System.out.println("Not Found");
		}
		
	}
		catch(Exception n) {
			System.out.println("Searching Data Exception");
		}
	
	}
	
	public static void main(String[] args) throws Exception  {
		Scanner s = new Scanner(System.in);
		
		//Library_Managment_System e = new Library_Managment_System("java","anumama",1000);
		System.out.println("enter bname, aname & price");
    	String bname= s.next();
    	String aname= s.next();
      	int price= s.nextInt();
    	Library_Managment_System e = new Library_Managment_System(bname,aname,price);
		e.getmethod(bname,aname,price);
		e.display();
		
		while(true) {
		System.out.println("****************Menu*******************");
		System.out.println("1.Write to the file");
		System.out.println("2.Read From File");    
		System.out.println("3.Search From File");
		System.out.println("4.Exit");
		System.out.println("*************************");

		System.out.println("\nEnter your choice here : ");
		int ch = s.nextInt();
		
		
		
		if() {
			 
					
					try
					{	
						System.out.println("enter bname, aname & price");
						String bname= s.next();
				    	String aname= s.next();
				      	int price= s.nextInt();
				    	Library_Managment_System e = new Library_Managment_System(bname,aname,price);
						
						File r = new File("emp.dat");
			         	int length=(int) r.length();
			         
			  		  
			         	if(length >0)
			         	{ 
			         		FileOutputStream f= new FileOutputStream("emp.dat",true);
			         		Appendable a= new Appendable(f);
			         		a.writeObject(e); //this will not write header info to file 
			         		a.close();
			         	}
			         	else {
			         	 
			         	FileOutputStream f= new FileOutputStream("emp1.dat",true);
			 
			         	ObjectOutputStream o= new ObjectOutputStream(f);
			         	o.writeObject(e); //calls writeStreamHeader ()
			         	o.close();
			         	}
			         	 System.out.println("Object has been serialized");
					  
					}catch(Exception z)
					{
						
					}
			  
		}else if(ch=2){
			
		}
		else if(ch=3){
		
		}
		else {
			
		}
		}
		}
}