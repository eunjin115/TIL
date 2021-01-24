# 정렬

숫자/배열이 주어졌을 때 오름차순/내림차순으로 정렬하는 알고리즘 

- 선택 정렬 (Selection Sort)
- 버블 정렬 (Bubble Sort) (한국어로 거품 정렬이라고도 한댄다,,,) 
- 삽입 정렬 (Insertion Sort)
- 합병 정렬 (Merge Sort)
- Quick 정렬 (Quick Sort)





## 선택 정렬 (Selection Sort) 

- 제자리 정렬 (in-place sorting) 중 하나로 정렬해야 하는 배열 이외의 메모리를 요구하지 않음

- 알고리즘이 단순하며 메모리가 제한적인 경우 성능이 좋은 장점이 있다.

  (1) 주어진 리스트 중에 최소값을 찾는다.

  (2) 그 값을 맨 앞에 위치한 값과 교체한다. 

  (3) 처음에 찾은 최소값을 제외한 최소값을 찾아 다음 위치의 값과 교체한다.



###### 의사코드

```
procedure selection sort 
   list  : array of items
   n     : size of list

   for i = 1 to n - 1
   /* set current element as minimum*/
      min = i    
  
      /* check the element to be minimum */

      for j = i+1 to n 
         if list[j] < list[min] then
            min = j;
         end if
      end for

      /* swap the minimum element with the current element*/
      if indexMin != i  then
         swap list[min] and list[i]
      end if
   end for
	
end procedure
```





## 버블 정렬 (Bubble Sort)

- 두 인접한 원소를 검사하여 정렬하는 방법으로 인접한 두 원소의 크기를 비교한 뒤 교환함 

- 상당히 느리지만 코드가 단순하고 선택정렬과 비슷하다. 

- 첫 번째 원소와 두 번째 원소를 비교하고 교환 -> 두 번째 원소 & 세 번째 원소 교환 -> 반복 -> (n-1) 원소와 n 번째 원소 교환하여 정렬

- 1회전 뒤에는 가장 큰 자료가 맨 뒤로 이동하므로 2회전에서는 맨 끝에 있는 자료는 정렬 할 필요가 없고 회전을 반복 할 수록 정렬 할 필요가 없는 원소가 늘어난다.


  

###### 의사코드

```
procedure bubbleSort( A : list of sortable items ) defined as:
  for each i in 1 to length(A) do:
       for each j in length(A) downto i + 1 do:
         if A[ j ] < A[ j - 1 ] then
           swap( A[ j ],  A[ j - 1 ] )
         end if
       end for
  end for
end procedure
```



## 삽입 정렬 (Insertion Sort)

- 자료 배열의 모든 요소를 앞에서부터 차례대로 비교하여 자신의 위치를 찾아 삽입하는 정렬방법
- 얘도 제자리 정렬 (in-place sorting) 중 하나
- k 번째 반복 후의 결과 배열은 앞의 k+1 항복이 정렬 된 상태
- 배열이 길어질 수록 효율이 떨어지지만 구현이 간단함
- 선택 정렬과 거품 정렬에 비해 빠르다.

(예시)

###### 의사코드

```
INSERTION-SORT (A)
  for  <- 2 to length[A]
       do key <- A[j]
         Insert A[j] into the sorted sequence A[1 . . j - 1].
        i <- j - 1
        while i > 0 and A[i] > key
           do A[i + 1] <- A[i]
              i <- i - 1
        A[i + 1] <- key
```



## 합병 정렬 (Merge Sort)



## 퀵 소트 (Quick Sort)

- 사실 합병, 퀵 정리 안하고 백준 2751를 삽입정렬로 풀다가 시간초과 나서 버퍼로 바꿨는데도 시간초과 남 ㅡㅡ,,, 그래서 퀵소트 정리
- 퀵 정렬은 이름처럼 빠르다고 하는데 안빠르면 다 쳐버릴 것임 (근데 맞아서 더 기분나빠)



- 다른 원소의 비교만으로 정렬을 수행하는 비교 정렬에 속한다. 분할 정복(Divide and Conquer) 방법으로 정렬한다. 
- 피벗 포인트 (pivot point)라는 기준을 정하고 이 피벗 포인트를 기준으로 왼쪽은 더 작은 값, 오른쪽은 더 큰 값으로 리스트를 둘로 나눠 분할한다. 
- 분할 된 두 개의 리스트를 재귀적으로 반복하면서 분할한 리스트의 크기가 0이나 1이 될 때 까지 반복한다.
- 
