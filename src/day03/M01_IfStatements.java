package day03;

import java.util.Scanner;

public class M01_IfStatements {
    public static void main(String[] args) {

       	/*
		 *  Kullanicidan IT alanini isteyerek
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		yazdiriniz
		 */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen IT alanındaki ünvanınızın kısaltmasını  \n\"qa\" - \"dev\" - \"ba\" - \"pm\" \nşeklinde giriniz\nJobTitle: ");
        String jobTitle= scan.nextLine();
        //jobTitle=jobTitle.toLowerCase();
        //System.out.println("Kullanıcının girdiği veri: "+jobTitle);
        System.out.println(" ");
        String qa = "Quality Analyst";
        String dev = "Developer";
        String ba = "Business Analyst";
        String pm = "Project Manager";

        if (jobTitle.equalsIgnoreCase("qa")){
            System.out.println("Mesleğiniz: "+qa);
        } else if (jobTitle.equalsIgnoreCase("dev")) {
            System.out.println("Mesleğiniz :"+dev);
        } else if(jobTitle.toLowerCase().equals("ba")){
            System.out.println("Mesleğiniz :"+ba);
        } else if (jobTitle.equalsIgnoreCase("pm")) {
            System.out.println("Mesleğiniz :"+pm);
        }else{
            System.out.println("Hatalı Giriş Yaptınız");
        }

    }
}
