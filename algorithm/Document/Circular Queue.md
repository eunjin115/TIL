# 원형 큐 (Circular Queue)

- 선형 큐의 문제점 : 배열로 구현했을 때 dequeue를 하면 **모든 배열 요소를 앞으로 복사**해야 하며 마지막 요소를 가르키는 rear가 배열의 마지막 인덱스를 가르킬 때 앞쪽에서 dequeue를 하면 배열의 빈 공간을 활용할 수가 없음 (복사해야 하는 것과 똑같음 중간에 텅 비는 단점이 발생)
- 이를 보완한 것이 원형 큐 

- 큐가 비어있다면 front와 rear가 0으로 값이 같다.
- 큐가 꽉 차있다면 큐의 크기 (max) 값으로 front와 rear가 같거나 처음 지정한 0으로 같아진다. (돌고 돌아서 값이 서로 같아짐)
- 사진 기준으로 enqueue를 하게 되면 rear가 움직여서 front와 같은 인덱스를 가르키게 된다. 



###### enqueue

```java
public int enque(int x){
    queue[rear++] = x;
    if(rear == max)	//원형 큐에 값이 꽉 찼다면 -> front와 같은 값을 가르키도록 한다
        			//(rear가 처음으로 초기화 되도록)
        rear = 0;
    return x;
}
```

- rear가 증가했을 때 큐의 최대 크기인 max와 같아졌을 경우 rear를 배열의 처음으로 변경해야 한다. -> 그래야 다음에 enqueue할 때 값이 제대로 들어가게 된다. 



###### dequeue

```java
public int dequeue(){
	int x = queue[front++];	//값을 front 인덱스에서 빼온 뒤 front를 증가시킨다.
    if(front == max)	//돌면서 값을 빼다가 front가 max를 가르킴 -> 다시 처음을 가르키도록 한다. 
        				//(front가 처음으로 초기화 되도록)
        front = 0;
    return x;
}
```

- 1 증가한 front 값이 큐의 최대 크기인 max와 같아졌을 경우 front를 배열의 처음으로 변경해야 한다. -> 그래야 다음에 dequeue를 할 때 제대로 데이터를 꺼낼 수 있다. 
