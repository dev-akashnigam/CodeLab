def get_mutable_string(s):
    s_arr = []
    for ch in s:
        s_arr.append(ch)
    return s_arr

input = "Hello"
output = get_mutable_string(input)
print(output)

os = ''.join(output)
print(os)