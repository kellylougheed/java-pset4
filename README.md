# Problem Set 4

For this problem set, you will turn in both a BlueJ file AND a Google doc (or similar) with your paragraph for 4-0 and stack trace for 4-1.

## Problem 4-0: Sorting Algorithm

Choose one of the sorting algorithms below. Mild algorithms should be review from CS50; spicy algorithms should be new! For your algorithm...

* Research it!
* Provide the **Java code**. There is no need to write the algorithm from scratch -- you may find code on the internet and cite it.
* Write a **paragraph** walking through each line of code and how it works to demonstrate your understanding of the algorithm.

Mild:
* Selection Sort
* Bubble Sort
* Insertion Sort

Spicy:
* Heap Sort
* Counting Sort
* Radix Sort

**Challenge (+1 EC)**: Include some info about time/space complexity or another fun fact.

(This problem will be graded on scope, correctness, and style.)

## Problem 4-1: Fibonacci

**Part 1:** Write a method called `fibonacci` that takes in an integer as an argument and recursively calculates that number in the Fibonacci sequence. For example, `fibonacci(6)` should return 8, the sixth number in the Fibonacci sequence. As it is recursive, your method should have a base case and a recursive case.

(This is a common recursive practice problem, so you are on your honor not to look up the code and instead write the method yourself in order to learn more about recursion!)

Call your method in Main.

**Part 2:** Write a stack trace of the recursive method calls for `fibonacci(5)` in the same style as the stack trace for the [Factorial Lab](https://docs.google.com/document/d/1_dy_8VEPKYWQjr-xgC0_s8trAqc43IjbKFQOTBW_Hoo/).

## Problem 4-2: Bacteria

If there are 10 bacteria in the biology lab tonight, how many will be there by the time we come to school tomorrow?

In order to answer this question, you need to know a few things:
* Each bacterium (a single bacteria) can create 2 more bacteria every hour.
* This means that after one hour, the doorknob will have 10 + 10 * 2 = 30 bacteria, since we started with 10 bacteria and each of those created 2 more.
* This means that after two hours, the doorknob will have 30 + 30 * 2 = 90, since there were 30 bacteria at the beginning of hour two, and during that hour each bacteria created 2 more bacteria.
* Continuing this pattern, the number of bacteria on the doorknob after N hours is 
numberOfBacteriaLastHour + numberOfBacteriaLastHour * 12
* However, if we wanted to know how many bacteria are alive after 12 hours, we need to know how many bacteria were alive at hour 11. To find out how many bacteria are alive at hour 11, we need to figure out how many were alive at hour 10. Do you see how we can use recursion to solve this problem?

Write a recursive method that computes the number of bacteria alive after N hours. The method  header should be: `public int numBacteriaAlive(int hour)`

Then use your method in Main to figure out how many bacteria will be there after 12 hours.

## Problem 4-3: Poetry Remix

Choose a poem you like and add it to your BlueJ project as a .txt file. Then, in the `main` method of the PoetryRemix class, write a program that reads the file and prints out a remixed version of the poem -- the same poem, but with the lines all in random order!

**Challenge (+0.5 EC)**: Refactor your work as a method that accepts a filename as an argument and returns void.

**Challenge (+2 EC)**: Revise your program so that instead of printing out the remixed poem, it writes the remixed poem to the end of the original .txt poem file.

## Problem 4-4: Redacted [Optional Challenge]

Add a Redacted.java class and a .txt file of your choice (perhaps a literary excerpt) to your BlueJ project. Then write a method that takes in a keyword to censor in the original file. Your method should read in the file and write to another file the censored version of the original, with all occurrences of the keyword X'd out (for instance, a five-letter keyword would become XXXXX).

---

Problem 4-2 is adapted from [CodeHS](https://www.codehs.com/).
