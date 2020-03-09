class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        //startsWith를 이용하여 phone_book배열의 데이터들의 시작값을 비교한다.
        for(int i=0; i<phone_book.length-1; i++) 
        {
        	for(int j=i+1; j<phone_book.length; j++)
        	{
        		if(phone_book[i].startsWith(phone_book[j])) 
        			answer=false;
        		if(phone_book[j].startsWith(phone_book[i]))
        			answer=false;
        	}
        }
        return answer;
     }
}
