def solution(bridge_length, weight, truck_weights):
    gone=[]
    going=[]
    lt =len(truck_weights)
    second=0
    ss=[]
    while lt!= len(gone):
        if second >0:
            if ss[0] ==0:
                gone.append(going.pop(0))
                ss.pop(0)
        if len(truck_weights)>0:
            if (sum(going)+truck_weights[0])<= weight :
                going.append(truck_weights.pop(0))
                ss.append(bridge_length)

        for i in range(len(ss)):
            ss[i] -=1
        second +=1
    return second


print(solution(	2, 10, [7, 4, 5, 6]))