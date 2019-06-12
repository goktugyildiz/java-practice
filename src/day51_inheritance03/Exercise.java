package day51_inheritance03;

public class Exercise {

	/*
	 * running-->10 , swimming-->11, yoga-->5 , Juijitsu-->12
	 * 
	 * int perform(int minutes) "Doing general Exercise"
	 * 4 calories per minutes
	 * 
	 */
	public int perform(int minutes) {
		System.out.println("Performing general exercise");
		return minutes*4;
	}
	/*
	 * Multiple classes can be stored in same file but only
	 * of them needs to be public and file name must match the
	 * public class
	 * class Running extends Exercise{
	 * 
	 * }
	 */
}
