import java.io.*;
import java.util.*;

class Queue
{
    final int size = 1000000;
    int top1;
    int top2;
    int stack1[] = new int[size];
    int stack2[] = new int[size];

    Queue()
    {
        top1 = -1;
        top2 = -1;
    }

    void enqueue(int val)
    {
        stack1[++top1] = val;
    }

    void dequeue()
    {
        if(top2 == -1)
        {
            while(top1 != -1)
            {
                stack2[++top2] = stack1[top1--];
            }
        }

        top2--;
    }

    void front()
    {
        if(top2 == -1)
        {
            System.out.println(stack1[0]);
        }
        else
        {
            System.out.println(stack2[top2]);
        }
    }
}

public class QueueUsingStacks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();
        Queue q = new Queue();

        for(int i=0;i<queries;i++)
        {
            int queryNumber = sc.nextInt();

            switch(queryNumber)
            {
                case 1:
                        int val = sc.nextInt();
                        q.enqueue(val);
                        break;
                case 2:
                        q.dequeue();
                        break;
                case 3:
                        q.front();
                        break;
            }
        }

        sc.close();

    }
}

