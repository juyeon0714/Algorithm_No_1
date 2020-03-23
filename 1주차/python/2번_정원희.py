def solution(s):
    answer = ''
    sl = len(s)
    if sl %2 ==1:
        answer = s[sl // 2]
    else:
        answer = s[(sl // 2)-1 : (sl // 2)+1]
    
    return answer