# Between Two Sets

Consider two sets of positive integers, A = {a0, a1... an-1} and B = {b0, b1... bm-1}. We say that a positive integer, x, is between sets A and B if the following conditions are satisfied:

1. All elements in A are factors of x.
2. x is a factor of all elements in B.
In other words, some x is between A and B if that value of x satisfies x mod ai = 0 for every ai in A and also satisfies bi mod x = 0 for every bi in B. For example, if A={2,6} and B={12}, then our possible x values are 6 and 12.

Given A and B, find and print the number of integers (i.e., possible x's) that are between the two sets.

### Input Format
```
The first line contains two space-separated integers describing the respective values of n (the number of elements in set A) and m (the number of elements in set B). 
The second line contains n distinct space-separated integers describing a0, a1... an-1. 
The third line contains m distinct space-separated integers describing b0, b1... bm-1.
```
### Output Format
```
Print the number of integers that are considered to be between A and B.
```
### Example
```
Sample Input

2 3
2 4
16 32 96

Sample Output

3
```
