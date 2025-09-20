# Fibonacci Implementations in Java

This repository contains four distinct methods to calculate the nth Fibonacci number, each demonstrating a different algorithmic approach.

## Implementations

1.  **Fibonacci.java**: **Naive Recursion**
    - **Approach:** Simple recursive calls.
    - **Complexity:** O(2^n) time, O(n) space (call stack).
    - **Use Case:** Educational example of recursion's inefficiency for this problem.

2.  **Fibonacci2.java**: **Dynamic Programming (Bottom-Up)**
    - **Approach:** Iterative solution using an array to store computed values.
    - **Complexity:** O(n) time, O(n) space.
    - **Use Case:** Efficient solution for small to medium `n`.

3.  **Fibonacci3.java**: **Slight Variation of Fibonacci2**
    - **Approach:** Similar to Fibonacci2 but with a redundant base case check.
    - **Complexity:** O(n) time, O(n) space.

4.  **Fibonacci4.java**: **Binet's Formula (Closed-form)**
    - **Approach:** Direct computation using the golden ratio.
    - **Complexity:** O(1) time (theoretical, though `Math.pow` is O(log n)), O(1) space.
    - **Note:** May have precision errors for very large `n` due to floating-point arithmetic.

## How to Run

1.  Compile any file:
    ```bash
    javac Fibonacci.java
    ```
2.  Run the compiled class:
    ```bash
    java Fibonacci
    ```
    (Replace `Fibonacci` with the name of the other classes to run them).

## Purpose

This project is ideal for understanding algorithmic trade-offs between time complexity, space complexity, and code simplicity.
