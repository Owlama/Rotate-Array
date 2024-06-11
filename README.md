Input:
    a: An array of integers
    d: The number of left rotations to perform
Output:
    rotated: The array after performing d left rotations

1. Initialize variables:
   - n as the length of array a
   - Create an array rotated of size n to store the rotated elements

2. Calculate the effective number of rotations:
   - Set effectiveRotations as d modulo n

3. Rotate the array:
   - Iterate over the elements of array a with index i from 0 to n-1:
     a. Calculate the new index for the current element using the formula:
        newIndex = (i + n - effectiveRotations) modulo n
     b. Assign the value of a[i] to rotated[newIndex]

4. Return the rotated array.
