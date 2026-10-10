def get_missing_number(arr):
    n = len(arr)
    expected_sum = ((n+1)*(n+2))/2
    actual_sum = 0
    for element in arr:
        actual_sum += element
    return expected_sum-actual_sum

input = [1, 2, 3, 5, 6]
output = get_missing_number(input)
print(output)