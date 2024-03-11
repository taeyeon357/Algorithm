# [Bronze II] 노래 악보 - 1392 

[문제 링크](https://www.acmicpc.net/problem/1392) 

### 성능 요약

메모리: 14824 KB, 시간: 180 ms

### 분류

구현

### 제출 일자

2024년 3월 11일 22:02:14

### 문제 설명

<p>FJ is going to teach his cows how to play a song. The song consists of N (1 <= N <= 100) notes, and the i-th note lasts for B_i (1 <= B_i <= 100) beats. The cows will begin playing the song at time 0; thus, they will play note 1 from time 0 to time B_1 - 1, note 2 fromtime B_1 to time B_1 + B_2 - 1, etc.</p>

<p>The cows have lost interest in the song, as they feel that it is long and boring. Thus, to make sure his cows are paying attention, FJ asks them Q (1 <= Q <= 1,000) questions of the form, "During the beat at time T_i (0 <= T_i < length of song), which note should you be playing?" The cows need your help to answer these questions.</p>

<p>By way of example, consider a song with these specifications: note 1 for length 2, note 2 for length 1, and note 3 for length 3:</p>

<pre>NOTES    1   1   2   3   3   3
       +---+---+---+---+---+---+
TIME     0   1   2   3   4   5
</pre>

### 입력 

 <p>* Line 1: Two space-separated integers: N and Q</p>

<p>* Lines 2..N+1: Line i+1 contains a single integer: B_i</p>

<p>* Lines N+2..N+Q+1: Line N+i+1 contains a single integer: T_i</p>

### 출력 

 <p>* Lines 1..Q: Line i contains the a single integer that is the note the cows should be playing at time T_i</p>

<p> </p>

