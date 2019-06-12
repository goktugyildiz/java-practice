package day44_constructor;
import java.util.*;
public class Dice {

	public static void main(String[] args) {
		Job job1 = new Job();
		
		Job job2 = new Job("Java Devoloper");
		
		Job job3 = new Job("SDET", "Amazon", 130_000.0);
		
		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());
		
		//LETS CREATE A LIST OF JOBS
		//AND ADD 5  DIFFRENT JOBS WITH COMPANY ,TITLE ,SALARY
		
		List<Job> jobsList = new ArrayList<>();
		jobsList.add(job3);
		jobsList.add(new Job("Scrum Master", "Google", 123000));
		jobsList.add(new Job("SDET", "FreddieMac", 110000));
		jobsList.add(new Job("BA", "Leidos", 115000));
		jobsList.add(new Job("QA Tester", "Delta", 150_000));
		
		System.out.println(jobsList.toString());
		
		//FIND THE HIGHEST PAYING JOB AND PRINT toString for that
		
		double maxSalary = 0;
		int highestIndex  = -1;
		for(int i =0;  i<jobsList.size(); i++) {
			if(jobsList.get(i).getSalary()> maxSalary) {
				maxSalary = jobsList.get(i).getSalary();
				highestIndex = i;
			}
		}
		Job bestJob = jobsList.get(highestIndex);
		System.out.println("Highest Salary: "+bestJob.toString() );
		
		
		
	}

}
