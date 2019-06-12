package day51_inheritance03;

public class CountCalories {

	public static void main(String[] args) {
		Exercise ex = new Exercise();
		Running run = new Running();
		Swimming swim = new Swimming();
		Yoga yoga = new Yoga();
		Jiujitsu jit = new Jiujitsu();
		
		
		System.out.println(ex.perform(30));
		System.out.println(run.perform(15));
		System.out.println(swim.perform(25));

		System.out.println(yoga.perform(45));
		System.out.println(jit.perform(40));

		System.out.println("=====================");
		
		Snowboarding sn = new Snowboarding();
		System.out.println(sn.perform(100));
	}

}
