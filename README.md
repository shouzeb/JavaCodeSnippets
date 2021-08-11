# JavaCodeSnippets
This Repository contains solutions of some java tasks. 

## Package SummerCourseWork contains:

Summer coursework, submission deadline

27/08/21

Please solve 4 questions out of 5. If you solve all the 5 questions, the mark
will be given as the sum of 4 best marks.
### Question 1
1.1 All numbers in a list (12 marks)
Let A be a list of length n. Write a function that returns true if A contains all
the numbers 1, . . . , n and each number occurs exactly once.
For example, the function should return true for A = [2, 1, 3] but f alse for
A = [2, 2, 1].
The runtime of the function must be O(n).
Remark: Function that takes more than O(n) but correct otherwise will
be worth 5 marks.
1.2 All numbers in each row and column (13 marks)
Given an n × n matrix B write a program that checks whether each row and
each column of B contains all the numbers 1, . . . , n and only one time each. For
example, the program must print ’YES’ for the following matrix
[ [1,2,3],
[2,3,1],
[3,1,2]]
and ’NO’ for the following one
[[1,2,3],
[3,2,1],
[2,1,3]]
because of the repetition of 2 in the second column and the repetition of 3 in
the third one.

1

### Question 2
2.1 Swapping rows of a matrix (10 marks)
Write a function whose input is an n × n matrix A and two row numbers i and
j of A. The program should return the matrix obtained as a result of swapping
rows i and j in A. For example, if A is
[[1,2,0],
[0,0,1],
[4,2,7]]
with i = 0 and j = 2, the resulting matrix will be
[[4,2,7],
[0,0,1],
[1,2,0]]
2.2 Sorting rows of a matrix (15 marks)
Write a program that sorts rows of a matrix by the increasing order of the totals
of their elements. In other words, the output of this program must be a matrix
with the same rows as the matrix at the input but with rows swapped so that
for every two rows i < j, the total of elements of row i of the resulting matrix
is smaller than or equal to the total of elements of row j of this matrix. For
example if the input is matrix A fro the first part of this question then the
output will be
[[0,0,1],
[1,2,0],
[4,2,7]]
###Question 3
3.1 Testing a set of edges (12 marks)
Write a program whose input is a graph G in a form of adjacency matrix (the
vertices of this graph are 0, . . . , n − 1 ) and a list L and where each element of
L is a list of two vertices of G. The program should print ’YES’ if each element
of L is an edge of G and ’NO’ otherwise.
3.2 Number of edges between the specified vertices (13
marks)
Write a program whose input is a graph G and a list L with each element being
a vertex of G. The program should print the number of edges in the subgraph
induced by L.

2

### Question 4: Recognizing a star (25 points)
A graph G is a star if it has a vertex x adjacent to every other vertex and x is
the only neighbour of every other vertex.
Given the adjacency matrix of a graph G, design an O(n
2
) algorithms that

prints YES if G is a star and NO otherwise.
### Question 5
Assume the existence of a function Connect whose input is a graph G in the
form of adjacency matrix. The procedure return true if G is connected and
f alse otherwise.
Important: you do not need to write a code for the procedure;
you need to use it as a function!!!
5.1 Separation testing (12 marks)
Write a program whose input is a graph G in the form of its adjacency matrix
and a subset S of vertices of G in the form of a list. The program should print
’YES’ if the following two statements are true.
1. Graph G is connected.
2. The removal of S from G makes the resulting graph not connected.
Otherwise the program shoud print ’NO’.
5.2 Connectivity testing (13 marks)
Write a program whose input is a graph G in the form of adjacency matrix.
The program should print ’YES’ if the following two statements are true.
• Graph G is connected.
• Graph G can be made not connected by removal of two vertices.
