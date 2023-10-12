def solution(nums):
    answer = 0
    bring_n = len(nums)//2 #가져갈 마리수
    n = len(set(nums))
    if n>=bring_n:
        answer = bring_n
    else:
        answer = n;
    
    return answer