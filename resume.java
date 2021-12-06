import java.util.*;
import java.awt.*;
import javax.swing.*;
class resume{
	public static void intro(){
		System.out.println("--------------------------------------INFORMATION---------------------------------");
		System.out.println("Name-Ashish Mehta");
		System.out.println("Contact - 8690585738");
		System.out.println("E-mail = Ashishmehtataj@gamil.com");
		System.out.println("__________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________");

	}
	public static void career_object(){
		System.out.println("-----------------------------------CAREER OBJECT ---------------------------------");
		System.out.println("To seek a dynamic and challenging career an organization strives for excellience \nwith my knowledge and team effort while making posible contribution to \npromote the individual opportunity and professional growth");
		System.out.println("__________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________");
	}
	public static void acadamic_qualification(){
		System.out.println("---------------------------------ACADAMIC QUALIFICATION---------------------------");
		System.out.println("Sr.no          Class        Board/University       Year           DIVISION/Percentage");
		System.out.println("1              High School    M.P. Board           2017            1st Division");
		System.out.println("2              Intermediate   M.P. Board           2020            2st Division");
		System.out.println("3              B.E.(CSE)      UIT BU               2020-2024       Running");
		System.out.println("__________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________");
	}
	public static void skills(){
		System.out.println("------------------------------------SKILLS----------------------------------------");
		System.out.println("1.Python Programming Language");
		System.out.println("2.C Programming Language");
		System.out.println("3.C++ Programming Language");
		System.out.println("4.Java Programming Language");
		System.out.println("5.Data Visualization with Python");
		System.out.println("6.HTML");
		System.out.println("7.CSS");
		System.out.println("8.Java Script");
		System.out.println("9.Basic Computer knowledge");
		System.out.println("_________________________________________________________________________________");
		System.out.println("_________________________________________________________________________________");
	}
	public static void factor(){
		System.out.println("-------------------------------Persnal Information-------------------------------");
		System.out.println("Father Name - Mahesh Mehta");
		System.out.println("Date of Birth - 07/10/2002");
		System.out.println("Marital Status - Unmarried");
		System.out.println("Genral -  Male");
		System.out.println("Religion - Hindu");
		System.out.println("Nationality - India");
		System.out.println("________________________________________________________________________________");
		System.out.println("________________________________________________________________________________");
	}
	public static void project(){
		System.out.println("---------------------------------PROJECT----------------------------------------");
		System.out.println("1.School Administration tool : Build a simple project using Python");
		System.out.println("2.Jarvis : Build a basic person assistant ");
		System.out.println("3.Cricket scorecard sheet : Build a project using c Programming");
		System.out.println("4.Bank Management system : Build a project using c Programming");
		System.out.println("5.Google Translate : Build a basic google translate using c");
		System.out.println("6.Bus reservation system :Build a basic bus reservation system using cpp");
		System.out.println("7.Database managment system : Build a basic dbms system using cpp");
		System.out.println("________________________________________________________________________________");
		System.out.println("________________________________________________________________________________");
	}
	public static void declaration(){
		System.out.println("---------------------------------DECLARATION------------------------------------");
		System.out.println("I do hereby declare that the statments made in this document are true to the best\nof my knowledge and belief");
		System.out.println("________________________________________________________________________________");
		System.out.println("________________________________________________________________________________");
	}
	public static void main(String args[]){


		System.out.println("-------------------------------------RESUME-----------------------------------\n");
		intro();
		factor();
		career_object();
		acadamic_qualification();
		skills();
		project();
		declaration();
	}
}