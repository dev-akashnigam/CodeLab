def move_zeros_to_end(arr):
    n = len(arr)

    left_pointer = 0
    right_pointer = n-1

    while left_pointer < right_pointer:
        if arr[left_pointer] == 0:
            temp = arr[left_pointer]
            arr[left_pointer] = arr[right_pointer]
            arr[right_pointer] = temp
            left_pointer+=1
            right_pointer-=1
        else:
            left_pointer+=1
    return arr

input = [0, 1, 0, 3, 12]
output = move_zeros_to_end(input)
print(output)

