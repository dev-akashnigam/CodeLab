def is_string_palindrome(s):
    n = len(s)
    left_pointer = 0
    right_pointer = n-1

    while left_pointer<right_pointer:
        if s[left_pointer] == s[right_pointer]:
            left_pointer += 1
            right_pointer -= 1
            continue
        else:
            return False
    return True

input = "hello"
output = is_string_palindrome(input)
print(output)
