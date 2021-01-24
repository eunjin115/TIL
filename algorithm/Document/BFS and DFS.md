# BFS 와 DFS

1도 기억 안나는 Search 방법 두 개 (알고리즘 강의 뒤적거림)

- 주로 트리/그래프 구조에서 보기 쉽다. 

## BFS : Breath First Search - 너비 우선 탐색 

(Branch and Bound 하면서 배움)	

​	(1) 뿌리 마디 검색

​	(2) 수준 1  (Level 1)에 있는 모든 마디 검색 (왼쪽에서 오른쪽으로)

​	(3) 수준 2 (Level 2) 에 있는 모든 마디 검색 (왼쪽에서 오른쪽으로)

​		(Leaf 노드까지 반복)

![image-20200427204148307](C:\Users\kathe\AppData\Roaming\Typora\typora-user-images\image-20200427204148307.png)

- Recursive로 짜면 복잡해서 큐 사용

  ```
  void breadth_first_search(tree T) {
      queue_of_node Q;
      node u, v;
      initialize(Q); 		// Initialize Q to be empty
      v = root of T; 
      visit v; 
      enqueue(Q,v);
      while(!empty(Q)) {
      	dequeue(Q,v);
      	for(each child u of v) {
      		visit u; 
      		enqueue(Q,u);
          }
      }
  }
  ```


- 장점 : 출발 노드(Root)에서 목표 노드까지의 최단 길이 경로를 보장함

- 단점 : 

  - 경로가 길 경우에는 탐색 가지가 많아 지므로 많은 공간을 차지함

  - 답이 나올 때까지 탐색 

  - 무한 그래프 (Infinite Grapgh) 인 경우 답을 찾을 수 없고 끝낼 수 없음

    

## DFS : Depth First Search - 깊이 우선 탐색

 (Backtracking 하면서 배움)

​	(1) 뿌리 노드 먼저 방문한 뒤, 그 노드의 모든 후손 노드를 방문

​	(2) 한 뿌리를 다 갔으면 왼쪽에서 오른쪽으로 움직여서 다음 노드의 뿌리 방문

​	(3) 같은 레벨에 있는 노드들을 형제라고 하면 이해하기 쉽다. 레벨 1에서 한 노드 방문하고 다음 형제의 노드 방문 -> 다음 형제들 방문 ->... 

 ![image-20200427205708974](C:\Users\kathe\AppData\Roaming\Typora\typora-user-images\image-20200427205708974.png)



- recursive로 방문

  ```
  void depth_first_tree_search (node v) {
      node u;
      visit v;
      for (each child u of v)
      	depth_first_tree_search(u)
  }
  ```


- 왜 백트래킹이랑 배우냐면 : 

  - 탐색 과정이 시작 노드 (root)에서 계속 깊게 탐색하는 것을 막기 위해 깊이를 제한 한다.

  - 깊이 제한에 도달할 때까지 목표가 발견되지 않으면 부모로 다시 돌아오는데, 처음 탐색하기 시작한 레벨의 같은 레벨의 노드를 탐색한다.

    (예 - 위의 그림에서 1번 -> 2번-> 3번-> (만족 못함) -> 다시 2번...)

  - 부모로 돌아오는 과정을 백트래킹 (Backtracking) 이라 한다.

    

- 장점 : 

  - 한 경로의 노드들만 기억하면 되므로 메모리 사용 공간을 줄일 수 있다.
  - 목표노드가 깊은 단계에 있을 경우 빠르게 구할 수 있다.

- 단점 :

  - 목표 노드가 발견 되지 않을 경우 매우 깊게 탐색할 수도 있다. (계속 아래로 탐색) -> 깊이 제한을 줘서 그 깊이까지 발견 못하는 경우 다음 경로로 이동하도록 할 수 있다.

  - 최단 경로의 보장이 없다. -> 목표 노드가 발견 되면 탐색이 끝나므로 최단 경로가 아닐 수 있다는 이야기.

    