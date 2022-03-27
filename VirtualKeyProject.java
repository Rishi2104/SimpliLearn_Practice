import java.util.*;
import java.io.*;
public class VirtualKeyProject {
	public static void main(String[] args) throws IOException, InterruptedException {
	int n,n1;
	char c='Y';
	String[] wl={"W "," E"," L"," C"," O"," M"," E"};
	String path="C:\\Users\\itish\\eclipse-workspace\\SimpliLearn_Practice_Papers";
	Scanner sc=new Scanner(System.in);
//	System.out.print("\t\t\t");
//	for(String s1:wl) {
//	System.out.print(" "+s1);	
//	Thread.sleep(500);
//	}
//	Thread.sleep(2000);
//	System.out.println("\n\nApplication name : LockedMe.com ");
//	Thread.sleep(2000);
//	System.out.println("\nDeveloper details:");
//	System.out.println("\tName:RISHI RAJ \n\tEmail: rishi8155@gmail.com\nPhone No.:8544195442");
//	Thread.sleep(3000);
//	System.out.println("");
	while(c=='y'|| c=='Y') {
		System.out.println("Select the Option for which you want to execute:\n1. Retrive the file names in an ascending order\n2. Business-level operations:(Add, Delete, Search and Navigate)");
		Thread.sleep(500);
//		System.out.println("  • Option to add a user specified file to the application"); 
//		Thread.sleep(500);
//		System.out.println("  • Option to delete a user specified file from the application");
//		Thread.sleep(500);
//		System.out.println("  • Option to search a user specified file from the application");
//		Thread.sleep(500);
//		System.out.println("  • Navigation option to close the current execution context and return to the main context");
		Thread.sleep(500);
		System.out.println("3. Close the Program");	
		Thread.sleep(500);
		System.out.println("Enter the option:(For Eg.:1,2 or 3) \n");
		n=sc.nextInt();
		if(n==1) {
			System.out.println("File Names: \n------------");
			File f=new File(path);
			File filen[]=f.listFiles();
			for(File ff:filen) {
				System.out.println("|->  "+(ff.getName())) ;
			}
			System.out.println("-------------");
		}
		
		else if(n==2) {
			System.out.println("Select the number for which you want to execute:\nBusiness-level operations:");
			System.out.println("  1 Option to add a user specified file to the application"); 
			System.out.println("  2 Option to delete a user specified file from the application");
			System.out.println("  3 Option to search a user specified file from the application");
			System.out.println("  4 Navigation option to close the current execution context and return to the main context");
		n1=sc.nextInt();
		switch(n1){    
			case 1: 
				System.out.println("\nEnter the file name:(For Eg.: file1)");
				String fn=sc.next()+".txt";
				int flag=0;
				File f1=new File(path);
				File filen1[]=f1.listFiles();
				for(File e1:filen1) {
					String fn1=e1.getName();
					if(fn1.equals(fn))
					{
						System.out.println("File is already present");
						flag++;
						break;
					}
				}
				if(flag==0) {
					System.out.println("Creating a file named "+fn+"...");
					FileWriter fw=new FileWriter(fn);
					fw.write("Welcome to my file...");
					fw.close();
				}
				System.out.println("-------------");
				break;  
			case 2:    
				System.out.println("Enter the file to delete:");
				String s=sc.next()+".txt";
				String p=path+"\\"+s;
				File f=new File(p);
				System.out.println(s+" is been delted.\nFile Path = "+p);
				if(f.delete())
					System.out.println(s+" has been delted.\nFile Path = "+p);
				break; 
			case 3:    
				File f11=new File(path);
				System.out.println("Enter the file name");
				String filesearch=sc.next();
				File filen[]=f11.listFiles();
				int flag1=0;
				for(File ff:filen) {
					if(ff.getName().equals(filesearch)) {
						flag1=1;
						break;
					}
					else {
						flag1=0;
					}
				}
				if(flag1==1) {
					System.out.println("\n {"+filesearch+"} is found");
				}
				else {
					System.out.println("\n {"+filesearch+"} is not found");
				}
				break;
			case 4:    
				System.out.println("Value = "+n);
				break; 
			default:  
				System.out.println("Wrong Selection");
				break;
	}   }
		else {
			System.out.println("\n\n Program Terminated...");
			System.exit(0);
		}
		System.out.println("Do you want to continue(y/n): ");
		c=sc.next().charAt(0);
		if(c=='n')
			System.out.println("\nThank You...");
	}
}
}
