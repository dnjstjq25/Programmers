import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        
        check:
        for(int i=heights.length-1; i>=0; i--)
        {
        	if(i != 0) //i가 0이 아닐떄만 비교
        	{
        		for(int j=i-1; j>=0; j--)
            	{
            		if(heights[i]<heights[j]) { //i번째가 작은 경우를 만나면 i반복문으로 돌아감
            			answer[i] = j+1; //i번째값이 더 작아지면 j+1의 값을 넣어준다.
            			continue check;
            		}
            	}
        	}
        }
        
        return answer;
    }
}

public class sq_top {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		
		int h = sc.nextInt(); //배열 길이
		int heights[] = new int[h]; 
		for(int i=0; i<h; i++)
		{
			heights[i] = sc.nextInt(); //배열에 들어갈 값 입력
		}
		
		System.out.println(Arrays.toString(s.solution(heights))); 
	}
}
