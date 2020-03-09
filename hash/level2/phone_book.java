class Solution {
    public boolean solution(String[] phone_book) { //매개변수로 phone_book배열의 데이터를 받음
        boolean answer = true;
        int check;
        
        for(int i=0; i<phone_book.length-1; i++) 
        {
          check = phone_book[i].length(); //check에 phone_book[i]에 길이를 받아서 넣어준다.
          for(int j=i+1; j<phone_book.length; j++)
          {
            String sub = phone_book[j].substring(0, check); //sub에 phone_book[j]를 check만큼 잘라서 넣어준다.

            if(sub.equals(phone_book[i])) //sub와 phone_book[i]를 비교하여 같으면
            {
              answer = false; //answer = false
              break;
            }
         }
      }
    return answer;
   }
}
