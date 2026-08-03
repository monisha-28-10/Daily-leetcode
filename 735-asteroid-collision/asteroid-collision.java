class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int a:asteroids){
            if(a>0){
                s.push(a);
            }else{
                boolean al = true;
                while(!s.isEmpty()&& a<0 && s.peek()>0){
                    int x = s.peek();
                    if(x < Math.abs(a)){
                        s.pop();
                        continue;
                    }else if(x == Math.abs(a)){
                        s.pop();
                        al = false;
                        break;
                    }else{
                        al = false;
                        break;
                    }
                }
                if(al){
                    s.push(a);
                }
            }
        }
        int[] res = new int[s.size()];
        for(int i=s.size()-1;i>=0;i--){
            res[i] = s.get(i);
        }
        return res;
    }
}