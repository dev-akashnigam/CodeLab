def get_longest_non_repeating_subs(s):
    n = len(s)
    my_set = set()
    longest_subs = ""
    longest_subs_length = -999999999
    for i in range(0, n, 1):
        starting_char = s[i]
        my_set.add(starting_char)
        for j in range(i+1, n, 1):
            current_char = s[j]
            if current_char in my_set:
                current_subs = s[i:j]
                current_subs_length = len(current_subs)
                if current_subs_length > longest_subs_length:
                    longest_subs_length = current_subs_length
                    longest_subs = current_subs
                break
            else:
                my_set.add(current_char)
                if j==n-1:
                    current_subs = s[i:j+1]
                    current_subs_length = len(current_subs)
                    if current_subs_length > longest_subs_length:
                        longest_subs_length = current_subs_length
                        longest_subs = current_subs
        my_set.clear()
    return longest_subs

input = "abcdeaf"
output = get_longest_non_repeating_subs(input)
print(output)
