class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        Queue<Character> q = new LinkedList<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

          map.put(ch, map.getOrDefault(ch, 0) + 1);
            q.add(ch);

        }
        while(!q.isEmpty()){
        char ch = q.remove();

        if(map.get(ch) == 1){
            return s.indexOf(ch);
        }
        }
        
        return -1;
    }
}