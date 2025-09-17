# Replace duplicate characters in a string with a special character.
def remove_duplicates(s):
    seen = set()
    res = ''
    for c in s:
        if c in seen:
            res += '$'
        else:
            seen.add(c)
            res += c
    return res
# Mariyappan
