package method;
import java.util.*;


public class bfs {
	

	static HashSet<Integer> myBfs(HashMap<Integer, HashSet<Integer>> map, Integer start){
		
		var visitQ = new LinkedList<Integer>();
		var visited = new HashSet<Integer>();
		
		// 초기값 셋팅
		visitQ.add(start);
		visited.add(start);
		
		while(!visitQ.isEmpty()) {
			// 현재노드
			var nowNode = visitQ.pop();
			// 여기서 방문처리해도 되지만 미리 해줌
			
			// 현재노드와 인접한 노드
			for(var nextNode : map.get(nowNode)) {
				// 인접한 노드중 방문한 노드가 아니면
				if(!visited.contains(nextNode)) {
					// 미리 방문했다고 하고 => 물론 미리 안해도 됨
					// 근데 미리 해주면 while문이 많이 안돔
					visited.add(nextNode);
					// 방문해야할 노드로 넣어줌
					visitQ.add(nextNode);
				}
			}
		}
		return visited;
	}
	
	// 우선 HashMap(Integer, HashSet<Integer>> 자료형으로 노드의 이동 정보를 map형식으로 저장
	public static void main(String[] args) {
		var map = new HashMap<Integer, HashSet<Integer>>();
		
		int[][] arr = {{0,1}, {0,2}, {0,4}, {1,2}, {2,3}, {3,4}, {2,4}, {4,2}};
		for(int[] a : arr) {
			if(map.containsKey(a[0])) {
				map.get(a[0]).add(a[1]);
			}else {
				var tm =  new HashSet<Integer>();
				tm.add(a[1]);
				map.put(a[0], tm);
			}
		}
		
		var result = myBfs(map, 1);
		for(var re : result) {
			System.out.println(re);
		}
	}
}
