def get_longest_non_repeating_subs(s):
    n = len(s)
    longest_subs = ""
    longest_subs_length = -999999999
    my_set = set()
    left_pointer = 0
    my_set.add(s[left_pointer])
    right_pointer = 1
    while right_pointer < n:
        if s[right_pointer] in my_set:
            my_set.remove(s[left_pointer])
            left_pointer += 1
        else:
            my_set.add(s[right_pointer])
            current_length = right_pointer - left_pointer + 1
            if current_length > longest_subs_length:
                longest_subs_length = current_length
                longest_subs = s[left_pointer: right_pointer+1]

            right_pointer += 1
    return longest_subs

input = "abcdeaf"
output = get_longest_non_repeating_subs(input)
print(output)

