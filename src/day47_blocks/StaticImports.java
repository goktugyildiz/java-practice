package day47_blocks;

import static java.lang.Math.*;//important 
import static java.lang.Character.*;
import static java.util.Arrays.sort;
import java.util.Arrays;
import static java.time.LocalDateTime.now; 

public class StaticImports {
	public static void main(String[] args) {
		System.out.println(PI); //pie
		System.out.println(max(10,5));
		System.out.println(min(10,100));
		System.out.println(floor(3.45));
		System.out.println(round(15.499999));
		System.out.println(abs(-10));
		System.out.println(pow(10.4 , 3));
		System.out.println(sqrt(25));
		System.out.println(random() *10);
		//#############################3
		System.out.println(isDigit('4'));
		System.out.println(isAlphabetic('J'));
		
		int[] nums = {34,32,44,1,444,1222};
		sort(nums);
		System.out.println(Arrays.toString(nums));
		
		System.out.println(now());
		
	}

}
