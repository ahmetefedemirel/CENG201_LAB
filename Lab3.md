1-) Why can't we rely on CPU execution time to measure algorithm effiency?
Answer: We can't rely on CPU execution because it depends on somethings such as the machine, operating system, programming language and compiler.

2-) How many operations does this code execute?
Code:   int sum = 0;
        sum = sum + 5;
Answer: 3 fundamental operations there.

3-) Give the final time complexity of the code.
  a-)  int sum = 0; 
       for(int i = 0; i < n; i++){
          sum += i;
        }
  Answer: O(n) times works.

   b-) int sum = 0;  //1
   for (int i = 0; i < n; i++){  //n
       for(int j = 0; j < n; j++){ //n
         sum += i + j; //1
        }
    }
   Answer: O(n^2)

  c-)  int n = 1024;  //1
  int count = 0;  //1
    while (n > 1) {  // logn -> loop runs log(n) times.
      n = n / 2;
      count++;
      System.out.println("n = " + n);
      }
   System.out.println("Total divisions: " + count);   //1
   Answer: O(logn)
