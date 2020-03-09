import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> check = new HashMap<String,Integer>(); //HashMap 생성
        String part, comp; //참가자, 완주자 변수 선언
        
        for(int i=0; i<participant.length; i++) 
        {
        	part = participant[i]; //part에 참가자 데이터를 넣어주고
        	if(check.containsKey(part)) //check에 이미 들어있는 값인지 확인
        	{//들어있는 값이라면
        		Integer value = check.get(part); //value에 check의 key에대한 value값을 넣는다.
        		check.put(part, ++value); //check에 part, value+1 값 추가
        	}else { //없는 값이면 
        		check.put(part, 0); //check에 part, 0으로 새로 넣어줌
        	}
        }
        
        for(int i=0; i<completion.length; i++)
        { //완주자 데이터를 넣어주고
        	comp = completion[i];
        	if(check.containsKey(comp)) //이미 있는 값이면
        	{
        		Integer value = check.get(comp); //참가자 반복문과 똑같은 방식으로 추가
        		check.put(comp, ++value);
        	}
        }
        
        Iterator<String> keys = check.keySet().iterator(); //모든 데이터를 체크하기 위해 사용
        while( keys.hasNext() ){
            String key = keys.next();
            if(check.get(key) % 2==0) //key에대한 value값 % 2 == 0이면 
            	answer = key; //완주하지 못한사람
        }

        return answer;
    }
}
