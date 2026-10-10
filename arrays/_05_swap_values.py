def print_swapped_values(a, b):
    a, b = b, a
    print(f"a = {a}, b = {b}")

a = 10
b = 20
print_swapped_values(a, b)