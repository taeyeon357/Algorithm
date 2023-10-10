def solution(n):
    arr = []
    for i in range(1,n+1):
        if n%i == 0:
            arr.append(i)
            arr.append(n//i)
    arr = set(arr)
    
    answer = 0
    for a in arr:
        answer += a
    
    return answer