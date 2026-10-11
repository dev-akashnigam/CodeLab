def get_first_non_repeating_character(s):
    n = len(s)
    for i in range(0, n, 1):
        current_char = s[i]
        forward_substring = s[i+1: n]
        backward_substring = s[0: i]
        if current_char in forward_substring or current_char in backward_substring:
            continue
        else:
            return current_char
    return None

input = "aabbcc"
output = get_first_non_repeating_character(input)
print(output)
