def solution(s):
    answer = ''
    odd = 0
    for i in range(len(s)):
        if odd == 0:
            answer += s[i].upper()
            odd =1
        else:
            answer += s[i].lower()
            odd = 0
        if s[i] == " ":
            odd =0
    return answer