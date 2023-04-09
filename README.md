# Task-1
ads
1)	findMin is a recursive function that finds the smallest element in an array. If the array size is 1, then it will be returned as the smallest element. If array size > 1, the method will call itself recursively with the size of the array reduced by 1.
The method then finds the minimum value of the previously returned minimum and the last element of the array, and returns it.

2)	findAverage is a recursive function that find average of array. If array size == 0, then returns 0. If the array size > 0, then it calls itself recursively, decreasing the array size by 1.
The method then computes the sum of the previously returned average multiplied by the previous size of the array and the last element of the array. The method returns the sum divided by the current size of the array to get the average.

3)	findisPrime is a recursive function that finds a prime or composite number. If the first integer <= 1, the method returns "Composite". If the first integer is 2, the method returns "Prime”. Next comes the logical conditions that will find whether the number is prime or not.

4)	findFactorial is a recursive method that finds the factorial of a number. If the number is 1, then 1 is returned. If the number is greater than one, it is solved using the factorial formula.


5)	findFibonacci is a recursive method that finds returns the sum of two previously returned Fibonacci numbers. The first two numbers are 1, so 1 is returned. Otherwise, the sum of the two previously returned Fibonacci numbers will be returned.

6)	findPower is a recursive function that takes 2 integer (a digit, n degree). First comes the math formulas. Then If n>1, the method calls itself recursively with the first integer and the second integer reduced by 1. The method then returns the product of the first integer and the previously returned result.

7)	findReverse find reverse version of array. If the integer is 1, the method returns the first element of the array. If the integer > 1, the method prints the last element of the array and recursively calls itself with the integer minus 1 and with the same array.

8)	findisDigit find if text consist only digit or not. If the string matches the regular expression pattern "[0-9]+", which means it contains only digits, then returns "Yes". If the string does not match the pattern, then returns "No".

9)	findBinomial  find the binomial coefficient. According to the formula, if k=0 or k=n, then 1 is returned. Otherwise, it is solved through the formula itself.

10)	findGCD  calculates the greatest common divisor (gcd) of x and y using the recursive Euclid algorithm. The algorithm works by repeatedly dividing x by y and taking the remainder until y becomes zero. 
