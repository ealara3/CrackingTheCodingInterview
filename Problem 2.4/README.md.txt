This problem will be in the book Cracking the Coding Interview Chapter 2 Problem 1 page 94.

The problem is asking to rearange a linkes list so the numbers bigger than the one is selected as the partition will go to the right and the smaller numbers goes to the left.

I want to separate the numbers either small numbers or big numbers.

The problem can be solved with the HEAP data structures, but because we are only using linked list I'm solving it in a different way.

The way I solve it is by transversing the list twice. I create a new linked list, one to add the small numbers first and the other one to add the big numbers.

It will work with all kind of numbers.