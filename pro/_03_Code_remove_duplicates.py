"""
Problem statement
You are given an array of integers sorted in non-decreasing order. Your task is to remove duplicate elements in place so that each distinct element appears only once.
Return the count of unique elements in the array.
You must modify the original array rather than creating a separate array to store the unique elements.
The first k positions of the modified array must contain the unique elements in sorted order, where k is the count you return. The elements beyond index k - 1 do not matter.
2. Example 1: Basic case
Input:
nums = [1, 1, 2]

Output:
Modified array:
[1, 2, _]
"""

def get_array_with_duplicates_removed(arr):
    n = len(arr)
    left_pointer = 0
    right_pointer = 1
    #print(left_pointer, right_pointer)
    while right_pointer < n:
        while arr[right_pointer]==arr[left_pointer]:
            right_pointer += 1
            if right_pointer==n:
                return arr
            continue
        #print(left_pointer, right_pointer)
        left_pointer += 1
        arr[left_pointer] = arr[right_pointer]
        right_pointer += 1
        #print(left_pointer, right_pointer)
    return arr

input = [5, 5, 5, 5]
output = get_array_with_duplicates_removed(input)
print(output)