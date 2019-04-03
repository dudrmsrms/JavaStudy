package programmers;

import java.util.Arrays;

class arrays {
	  public int[] solution(int[] arr, int divisor) {
	      int[] answer = {};
	      Arrays.sort(arr);
	      int count =0;
	      for(int i=0; i<arr.length;i++) {
	    	  if(arr[i] / divisor >1 && arr[i]%divisor ==0) {
	    		  answer[count] = arr[i];
	    		  count++;
	    	  }else if(arr[i]<divisor ) {
	    		  answer[count] = -1 ;
	    		  count++;
	    	  }
	      }
	      
	      return answer;
	  }
	}
