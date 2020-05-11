import java.util.Arrays;
import java.util.Scanner;

class kSolution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++) //행
		{
			for(int j=0; j<commands.length; j++) {//열
				int arr2[] = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]); // copyOfRange를 이용하여 array배열의 원하는 부분만 잘라온다.
				Arrays.sort(arr2); //정렬
				answer[i] = arr2[commands[i][2]-1]; //3번째 열에 들어있는 값을 대입해준다.
			}
		}
        
        return answer;
    }
}

public class srt_knum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		kSolution s = new kSolution();
		
		int array[] = {1,5,2,6,3,7,4};
		int commands[][] = new int[3][3];
		
		for(int i=0; i<commands.length; i++) {
			for(int j=0; j<commands.length; j++) {
				commands[i][j] = sc.nextInt(); //ex) 2 5 3 4 4 1 1 7 3
			}
		}
		
		System.out.println(Arrays.toString(s.solution(array, commands)));

	}
}
