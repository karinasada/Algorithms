using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Quick_Find
{
    class Program
    {
        int[] arr;
        static void Main(string[] args)
        {
            Program quickF = new Program();
            quickF.startArray(10);
            quickF.union(2, 5);
            quickF.union(4, 9);
            quickF.union(7, 8);
            quickF.union(9, 2);
            Console.WriteLine(quickF.connected(4, 2));//True
            Console.WriteLine(quickF.connected(7, 2));//False
            quickF.union(5, 3);
            quickF.union(2, 6);
            Console.WriteLine(quickF.connected(6, 5)); //True
            Console.WriteLine(quickF.connected(7, 5));//False
            Console.WriteLine("Press any key to continue...");
            Console.ReadKey(true);
        }
        void startArray(int N)
        {
            //Will create an array with each object pointing to itself
            arr = new int[N];
            for (int i = 0; i < N; i++)
            {
                arr[i] = i;
            }
        }
      
        void union(int a, int b)
        {
            //Will change all the entries that have a to the number in b
            //x will be the number in arr[a]
            int x = arr[a];
            int y = arr[b];
            for (int i = 0; i < arr.Length; i++)
            {
                if (arr[i] == x)
                {
                    arr[i] = y;
                }
            }
        }
        bool connected(int a, int b)
        {
            // Checks if the numbers are the same
            if (arr[a] == arr[b])
            {
                return true;
            }
            else return false;
        }
    }
}
