class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new ArrayDeque<>();
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < students.length; i++){
            q.offer(students[i]);
        }
        for(int i = sandwiches.length-1; i >= 0; i--){
            s.push(sandwiches[i]);
        }int count = 0;
        while(!q.isEmpty() && !s.isEmpty()){
            if(q.peek()==s.peek()){
                q.poll();
                s.pop();
                count = 0;
            }
            else{
                q.offer(q.poll());
                count++;
                if(count == q.size()){
                break;
                }
            }
        }
        return q.size();
    }
}