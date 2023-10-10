def solution(food):
    answer = ''
    
    for i in range(1,len(food)):
        for j in range(food[i]//2):
            answer += str(i)
            
    answer += '0'
    
    for i in range(len(food)-1, 0, -1):
        for j in range(food[i]//2):
            answer += str(i)
            
    return answer
