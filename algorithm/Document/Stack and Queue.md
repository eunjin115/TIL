# 스택과 큐

또 돌아온 정리 마당 자료구조에서 무조건 배우는 스택과 큐 알지만 정리하고 가기

데이터를 저장하는 방법으로 데이터들을 효과적으로 다루기 위해 고안 된 방법임 

스택은 후입선출, 큐는 선입선출 이다. 

* 스택

* 큐

  (구현을 위해서는 포인터와 연결 리스트 지식도 필요하다.) 



# 스택 (Stack)

- 갑자기 stack it up 생각나서 틀고옴 리암 페인노래 

- 제일 먼저 넣은 데이터가 제일 마지막에 나오는 후입선출 (LIFO - Last in First Out) 구조

- 한 쪽 끝에서만 자료를 넣거나 뺄 수 있는 선형 구조로 되어있다.

- 데이터를 넣는 것 -> 푸쉬 (Push) / 데이터 빼는 것 -> 팝 (Pop)

- 스택에서 가장 밑 바닥을 가르키는 것은 바텀(bottom), 제일 위를 가르키는 것은 탑 (top)

  ![img](https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Data_stack.svg/1024px-Data_stack.svg.png)

###### 의사구현 코드

* push

  ```
  begin procedure push: stack, data
  
     if stack is full	//스택이 꽉 찼으면 끝내기
        return null
     endif
     
     top ← top + 1	//top을 증가시키기 (더 윗부분 가르키게)
     stack[top] ← data	//데이터 넣음
  
  end procedure
  ```

  

* pop

  ```
  begin procedure pop: stack
  
     if stack is empty	//스택이 비었으면 끝내기 
        return null
     endif
     
     data ← stack[top]	//데이터를 가장 위인 top에서 꺼내온다
     top ← top - 1	//top 감소 (한칸 내려옴)
     return data	//데이터 리턴
  
  end procedure
  ```

기본적으로 pop과 push를 구현하기 위해 isempty와 isfull 함수가 구현된다. 꽉 차있는지 비어있는지 확인하는 함수임



# 큐 (Queue)

- 큐는 스택과 반대로 선입 선출이다. 먼저 넣은 데이터가 먼저 나오는 FIFO(First in First out) 구조

- 스택과는 다르게 주로 막대 모형으로 그린다. 

- 큐는 put(insert,enqueue)와 get(delete,dequeue) 를 이용해서 구현한다. put은 데이터를 넣는 것, get은 데이터를 빼는 것을 의미한다. (거의 enqueue, dequeue라고 함)

- 큐가 꽉 차서 데이터를 더 넣을 수 없는 경우는 오버플로우(Overflow), 비어있어서 꺼낼 데이터가 없는 경우 언더플로우(Underflow) 라고 한다. 이름부터가 철철 넘치는 것 같음 ;;

- 스택과 큐 모두 배열로 구현 가능하나 동적 할당으로 연결 리스트를 이용하는 경우가 더 많다. 또 큐를 환형으로 원처럼 만드는 것도 가능하다. (이름 까먹다가 기억남 원형 큐)

- 스택이 top과 bottom이 있다면 큐에는 프론트(front,first, head)와 꼬리 (tail,rear, back)가 존재한다. 프론트는 제일 앞, 먼저 넣은 데이터들을 가르키고 있고 꼬리는 제일 나중에 넣은 데이터를 가르키고 있다.

  ![자료구조 - Queue(큐)](https://media.vlpt.us/post-images/pa324/392c0570-9fa4-11e9-b079-63bbcd31f7a4/image.png)

- put할때는 꼬리 움직일 것 같고 get 할 때는 프론트 갖고 올 것 같져?? 그게 맞음



###### 의사구현 코드

* 아래의 의사 구현 코드들은 그림과 다르게 front가 back 자리에 있고 back이 front 자리에 있다. 그림이 반대로 그려진다고 생각하면 된다. front는 배열이라면 0번째를 가르키고 있고 back은 제일 뒤를 가르키고 있다. 

* put (enqueue)

  ```
  procedure enqueue(data)      
     
     if queue is full	//큐가 꽉 찼는지 확인
        return overflow	//넘쳐 흘러욧 오버플로우
     endif
     
     rear ← rear + 1	//꼬리 위치 증가시킴
     queue[rear] ← data	//증가시킨 꼬리 위치에 데이터 넣음 
     return true
     
  end procedure
  ```

  // 생각한 put은 데이터를 넣고 원래 가르키던 꼬리를 현재 넣은 꼬리로 변경하는 것이다. (연결리스트)

* get (dequeue)

  ```
  procedure dequeue
     
     if queue is empty	//비었는지 확인
        return underflow	//언더플로우
     end if
  
     data = queue[front]	//front 자리에 있던 데이터를 빼온다
     front ← front + 1	//front 자리를 다음 노드로 설정 
     return true	//리턴 
  
  end procedure
  ```

* 큐를 구현하는데도 isempty, isfull 함수가 사용된다. 