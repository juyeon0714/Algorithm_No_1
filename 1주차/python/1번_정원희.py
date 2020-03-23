def solution(s):
    answer = True
    al =len(s)
    il = ['0','1','2','3','4','5','6','7','8','9']
    if al ==4 or al == 6:
        for i in s:
            if i not in il:
                answer = False
                break
    else:
        answer= False


    return answer