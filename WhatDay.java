
//2016³â
import java.time.LocalDate;
//import java.util.*;
class Solution5 {
    public String solution(int a, int b) {
    	
    	 String answer = "";
    	/*
    	Calendar setDate = Calendar.getInstance();
    	setDate.clear();
    	setDate.set(2016,a-1,b);
    	
    	int dayOfWeek = setDate.get(Calendar.DAY_OF_WEEK);
    	*/
    	/*
    	switch(dayOfWeek){
    		case Calendar.SUNDAY : answer = "SUN"; break;
    		case Calendar.MONDAY : answer = "MON"; break;
    		case Calendar.TUESDAY : answer = "TUE"; break;
    		case Calendar.WEDNESDAY : answer = "WED"; break;
    		case Calendar.THURSDAY : answer = "THU"; break;
    		case Calendar.FRIDAY : answer = "FRI"; break;
    		case Calendar.SATURDAY : answer = "SAT"; break;
    	}
    	*/
    	
    	answer = LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3).toUpperCase();
        return answer;
        
    }
}

public class WhatDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution5 sol = new Solution5();
		System.out.println(sol.solution(5, 24));
	}

}
