def get_reversed_string(s):
    n = len(s)
    rev_s = ""
    for i in range(n-1, -1, -1):
        ch = s[i]
        rev_s += ch
    return rev_s

input = "Mphasis"
output = get_reversed_string(input)
print(output)
    