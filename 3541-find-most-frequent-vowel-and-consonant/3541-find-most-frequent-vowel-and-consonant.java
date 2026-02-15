class Solution {
    public int maxFreqSum(String s) {
        int vowel=0;
        int con=0;
        HashMap<Character,Integer> v=new HashMap<>();
        HashMap<Character,Integer> c=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'||ch=='u'){
                v.put(ch, v.getOrDefault(ch, 0) + 1);
            }
            else{
                c.put(ch,c.getOrDefault(ch,0)+1);
            }
        }
        int result1=0;
        for(char key:v.keySet()){
            result1=Math.max(result1,v.get(key));
        }
        int result2=0;
        for(char key:c.keySet()){
            result2=Math.max(result2,c.get(key));
        }
        return result1+result2;
    }
}