def find_subarrays_count_with_given_sum(arr, req_sum):
    print(arr)
    n = len(arr)
    left_pointer = 0
    right_pointer = 0
    current_sum = 0
    count = 0
    while right_pointer<n:
        current_sum += arr[right_pointer]

        if current_sum == req_sum:
            count += 1
            right_pointer += 1

        elif current_sum < req_sum:
            right_pointer += 1
            continue
            
        else:
            while current_sum > req_sum:
                current_sum -= arr[left_pointer]
                left_pointer += 1
            if current_sum == req_sum:
                count += 1
            right_pointer += 1

    return count

input_arr = [1, 2, 3]
input_sum = 3
output = find_subarrays_count_with_given_sum(input_arr, input_sum)
print(output)