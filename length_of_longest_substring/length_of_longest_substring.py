def lols(any_string):
    used_string = []
    start = 0
    for i, v in enumerate(any_string):
        if v in used_string:
            start = i
            used_string.clear()

        used_string.append(v)

    string = ''.join(used_string)

    return string


s = lols("abbced")
print("%s / %d" % (s, len(s)))

s1 = lols("bbbbb")
print("%s / %d" % (s1, len(s1)))

s2 = lols("abcabcd")
print("%s / %d" % (s2, len(s2)))
