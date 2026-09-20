import java.util.*;

public class DailyTemperatures 
{
    public int[] dailyTemperatures(int[] temperatures)
    {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); 
        for (int i = 0;i < n;i++) 
        {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()])
            {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return answer;
    }
}
