class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>(){{put('I',1);
        put('V',5);
        put('X',10);
        put('L',50);
        put('C',100);
        put('D',500);
        put('M',1000);
        }};
 
        int len=s.length();
        int answer=0;
        for(int i=0;i<len;i++){
            char temp=s.charAt(i);
            if(i+1<len){
                if(temp=='I' && s.charAt(i+1)=='V'){
                    answer=answer+4;
                    i++;
                }
                else if(temp=='I' && s.charAt(i+1)=='X'){
                    answer=answer+9;
                    i++;
                }
                else if(temp=='X' && s.charAt(i+1)=='L'){
                    answer=answer+40;
                    i++;
                }
                else if(temp=='X' && s.charAt(i+1)=='C'){
                    answer=answer+90;
                    i++;
                }
                else if(temp=='C' && s.charAt(i+1)=='D'){
                    answer=answer+400;
                    i++;
                }
                else if(temp=='C' && s.charAt(i+1)=='M'){
                    answer=answer+900;
                    i++;
                }
                else{
                    answer=answer+(map.get(temp));
                }

                
            }
            else{
                answer=answer+(map.get(temp));
            }
            
        }

        return answer;
    }
}
