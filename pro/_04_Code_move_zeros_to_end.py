def get_array_with_zeros_moved(arr):
    n = len(arr)
    left_pointer = 0
    for i in range(0, n, 1):
        if(arr[i]==0):
            continue
        else:
            arr[left_pointer] = arr[i]
            arr[i] = 0
            left_pointer += 1
    return arr

input = [0, 1, 0, 3, 12]
output = get_array_with_zeros_moved(input)
print(output)
