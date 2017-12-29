import java.util.Scanner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class main {
	public static void main(String[] args) {
		letterGrade letterGrade = new letterGrade();
//        JUnitCore junit = new JUnitCore();
//        Result result = junit.run(letterGradePartitionTest.class);
//        System.out.println(result.wasSuccessful());
        
        Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("輸入成績:"); 
			String input=  scanner.nextLine(); 
			if(input.equals("exit")){
				System.exit(0);				
				scanner.close();
			}
			int grade = Integer.parseInt(input);
			System.out.println("得分 : "+letterGrade.letterGrade(grade)); 
		}
    }
}
