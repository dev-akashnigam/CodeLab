"""
Problem statement
You are given an array of integers nums and an integer target.
Your task is to find the indices of two different elements whose sum is equal to the target and return those indices as an array.

Example 1
Input:
nums = [2, 7, 11, 15]
target = 9

Output:
[0, 1]
"""


def get_indices_having_sum(arr, sum):
    my_dict = dict()
    for element in arr:
        if element in my_dict:
            my_dict[element] += 1
        else:
            my_dict[element] = 1

    for element in arr:
        req_ele = sum - element
        if req_ele == element:
            if my_dict[element] > 1:
                first_index = arr.index(element)
                arr[first_index] = -999999999
                second_index = arr.index(element)
                return [first_index, second_index]
        else:
            if req_ele in my_dict:
                first_index = arr.index(element)
                second_index = arr.index(req_ele)
                return [first_index, second_index]
        return [-1, -1]

input_1 = [4, 6, 2, 8]
input_2 = 10
output = get_indices_having_sum(input_1, input_2)
print(output)