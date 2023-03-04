package org.example;

public class Functions {

	public Functions() {

	}

	/**
	 * Write a function that returns the sum of two numbers.
	 * 
	 * Example:
	 * 
	 * For param1 = 1 and param2 = 2, the output should be add(param1, param2) =
	 * 3.
	 * 
	 */
	public int add(int param1, int param2) {

		int sum;
		sum = param1 + param2;
		return sum;

	}

	/**
	 * 
	 * Given a year, return the century it is in. The first century spans from
	 * the year 1 up to and including the year 100, the second - from the year
	 * 101 up to and including the year 200, etc.
	 * 
	 * Example
	 * 
	 * For year = 1905, the output should be centuryFromYear(year) = 20; For
	 * year = 1700, the output should be centuryFromYear(year) = 17.
	 * 
	 */

	public int centuryFromYear(int year) {

		int moduloo = year % 100;
		int century = 0;

		if (moduloo == 0)
			century = year / 100;
		else
			century = year / 100 + 1;

		return century;

	}

	/**
	 * 
	 * Given the string, check if it is a palindrome.
	 * 
	 * Example
	 * 
	 * For inputString = "aabaa", the output should be
	 * checkPalindrome(inputString) = true; For inputString = "abac", the output
	 * should be checkPalindrome(inputString) = false; For inputString = "a",
	 * the output should be checkPalindrome(inputString) = true.
	 * 
	 */

	public boolean checkPalindrome(String inputString) {

		int length = inputString.length();

		for (int i = 0; i < length / 2; i++)

			if (inputString.charAt(i) != inputString.charAt(length - i - 1))
				return false;

		return true;

	}

	/**
	 * Given an array of integers, find the pair of adjacent elements that has
	 * the largest product and return that product.
	 * 
	 * Example
	 * 
	 * For inputArray = [3, 6, -2, -5, 7, 3], the output should be
	 * adjacentElementsProduct(inputArray) = 21.
	 * 
	 * 7 and 3 produce the largest product.
	 * 
	 */

	public int adjacentElementsProduct(int[] inputArray) {

		int tmp = inputArray[0] * inputArray[1];
		int length = inputArray.length;
		for (int i = 1; i < length - 1; i++)
			if (inputArray[i] * inputArray[i + 1] > tmp)
				tmp = inputArray[i] * inputArray[i + 1];

		return tmp;

	}

	/**
	 * Below we will define an n-interesting polygon. Your task is to find the
	 * area of a polygon for a given n.
	 * 
	 * A 1-interesting polygon is just a square with a side of length 1. An
	 * n-interesting polygon is obtained by taking the n - 1-interesting polygon
	 * and appending 1-interesting polygons to its rim, side by side. You can
	 * see the 1-, 2-, 3- and 4-interesting polygons in the picture below.
	 * 
	 * Example
	 * 
	 * For n = 2, the output should be shapeArea(n) = 5; For n = 3, the output
	 * should be shapeArea(n) = 13.
	 * 
	 * 
	 */

	public int shapeArea(int n) {

		int score;
		score = n * n + (n - 1) * (n - 1);
		return score;
	}

	/**
	 * calculation of power
	 */
	public int Strong(int n) {

		if (n < 2)
			return 1;

		return n * Strong(n - 1);
	}

	/**
	 * calculation of power
	 */
	
	public int Strong2(int n) {
		int strong = 1;

		if (n < 2)
			return 1;
		while (n > 1) {
			strong *= n;
			n--;

		}
		return strong;

	}
	
	/**
	 * Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, 
	 * each statue having an non-negative integer size. Since he likes to make things perfect, 
	 * he wants to arrange them from smallest to largest so that each statue will be bigger 
	 * than the previous one exactly by 1. He may need some additional statues to be able to accomplish that. 
	 * Help him figure out the minimum number of additional statues needed.

	 * Example
	 * For statues = [6, 2, 3, 8], the output should be
	 * makeArrayConsecutive2(statues) = 3.

	 * Ratiorg needs statues of sizes 4, 5 and 7.
	 * 
	 */

	public int makeArrayConsecutive2(int[] statues) {

		   int length = statues.length;
		   int max = 0;
		   int min = 20;
		    
		    for(int e : statues)
		    {
		        if(e > max)
		            max = e;
		        if(e < min)
		            min = e;
		    }
		        return (max - min) - length + 1;
		    
		    
		}
	/**
	 * Given a sequence of integers as an array, determine whether it is possible 
	 * to obtain a strictly increasing sequence by removing no more than one element from the array.
	 * Example
     * For sequence = [1, 3, 2, 1], the output should be
     * almostIncreasingSequence(sequence) = false;
     * There is no one element in this array that can be removed in order to get a strictly increasing sequence.
     * For sequence = [1, 3, 2], the output should be
     * almostIncreasingSequence(sequence) = true.
     * You can remove 3 from the array to get the strictly increasing sequence [1, 2]. 
     * Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].
	 */
	
	public boolean  almostIncreasingSequence(int[] sequence) {
	    int numErr = 0;
	    for (int i = 0; i < sequence.length - 1; i++) {
	        if (sequence[i] - sequence[i+1] >= 0) {
	            numErr += 1;
	            if (i - 1 >= 0 && i + 2 <= sequence.length - 1
	               && sequence[i] - sequence[i+2] >= 0
	               && sequence[i-1] - sequence[i+1] >= 0) {
	                return false;
	            }
	        }
	    }
	    
	    return numErr <= 1;
	}
	
	/**
	 * After they became famous, the CodeBots all decided to move to a new building and live together. 
	 * The building is represented by a rectangular matrix of rooms. Each cell in the matrix contains 
	 * an integer that represents the price of the room. Some rooms are free (their cost is 0), 
	 * but that's probably because they are haunted, so all the bots are afraid of them. 
	 * That is why any room that is free or is located anywhere below a free room in the same 
	 * column is not considered suitable for the bots to live in.
	 * Help the bots calculate the total price of all the rooms that are suitable for them.
	 * Example
     * For
	 * matrix = [[0, 1, 1, 2], 
          		[0, 5, 0, 0], 
          		[2, 0, 3, 3]]

	 * the output should be
	 * matrixElementsSum(matrix) = 9.
	 */
	
	public int matrixElementsSum(int[][] matrix) {

        int  helpfully = 0;

        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i+1][j] = 0;
                }               
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) { 
                helpfully += matrix[i][j];
            }
        }
    return helpfully;
}

	public  static int solution(int N) {
		int tmp = 0;
		int tmp2 = 0;
		String result = Integer.toBinaryString(N);
		char[] charArray = result.toCharArray();
		int length = charArray.length;

		System.out.println(charArray);
		for (int i = 0; i < length - 1; i++) {
			if (charArray[i] == '1' && charArray[i + 1] == '0') {

				for (int j = i + 1; j < length - 1; j++) {

					if (charArray[j] == '0' && charArray[j + 1] == '1') {
						tmp = j - i;
						if (tmp > tmp2)
							tmp2 = tmp;

						break;
					} else if (charArray[j] == '1') {
						tmp = j - i - 1;
						if (tmp > tmp2)
							tmp2 = tmp;
					}
				}
			}
		}

		//System.out.println(tmp2);
		return tmp2;
	}
	public static int solution(int N, int K) {

		String temp = Integer.toString(N);
		char[] actualValue = temp.toCharArray();


		int first = actualValue[0] - 48;
		int second = actualValue[1] - 48;
		int third = actualValue[2] - 48;

		if (K > 0 && first <= 9) {
			while (first < 9 && K > 0) {
				first += 1;
				K--;
			}

		}
		if (K > 0 && second <= 9) {
			while (second < 9 && K > 0) {
				second += 1;
				K--;
				//first++;
			}

		}
		if (K > 0 && third <= 9) {
			while (third < 9 && K > 0) {
				third += 1;
				K--;
			}

		}

		String temp3 = Integer.toString(first) + Integer.toString(second) + Integer.toString(third);

		return Integer.parseInt(temp3);
	}

	public static int solution2(int N) {
		if(N==1)
			return 1;
		int result = 0;
		for (int i = 0; i < N / 2; i++) {
			int num = (int)Math.pow(2, i);
			if (N % num == 0) {
				result = i;
			}
		}
		return result;
	}

}
