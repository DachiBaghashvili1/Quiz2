##  Description

This Java program reads a predefined list of integers and a separate list of strings. It performs a mapping of integers to strings by scaling each integer in relation to the highest value in the list and using the result to index into the list of strings.
##  How It Works

1. The program defines:
    - `list1`: A list of integers.
    - `list2`: A list of strings.

2. It finds the maximum value in `list1`.

3. With the maximum value in `list1`. it divides `list2Size` by that amount.

4. The result is cast to an index to extract elements from `list2`.

5. The extracted elements are added to `list3`.

6. The result (`list3`) is printed to the console.