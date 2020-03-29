def solution(participant, completion):
    sp = sorted(participant)
    sc = sorted(completion)
    for i in range(len(sc)):
        if sp[i] != sc[i]:
            return sp[i]
    return sp[-1]


print(solution(	["mislav", "stanko", "mislav", "ana"], ["stanko", "ana", "mislav"]))