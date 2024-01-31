package hwPack;
import java.util.*;

class Solution {
    /*
    * 도넛 특징: 노드 = 간선
    * 막대 특징: 노드 - 1 = 간선
    * 팔자 특징: 노드 + 1 = 간선
    */
    static String tracking(HashMap<Integer, LinkedList<Integer>> map,int start){
        var visit = map.get(start);
        var visited = new HashSet<Integer>();
        while(!visit.isEmpty()){
            var node = visit.pop();
            if(!visited.contains(node)){
                System.out.println(node);
                visit.addAll(map.get(node));
            }
        }
        System.out.println();
        return "stick";
    }
    public static int[] solution(int[][] edges) {
        /*
        * 일단 생성한 정점의 번호 부터 구하자
        * 정점의 특징: 모든 간선이 밖으로 향한다. && 간선이 2 이상이다.
        
        */
        var node = new HashMap<Integer, LinkedList<Integer> >();
        var topNodeSet = new HashSet<Integer>();
        var notTopNode = new HashSet<Integer>();
        for(int[] e : edges){
            int s = e[0], f = e[1];
            notTopNode.add(f);
            if(node.containsKey(s)){
                node.get(s).add(f);
                topNodeSet.add(s);
            }else{
                var tm = new LinkedList<Integer>();
                tm.add(f);
                node.put(s,tm);
            }
        }
        
        int topNode = 0;
        topNodeSet.removeAll(notTopNode);
        for(int tm : topNodeSet) topNode = tm;
        
        int[] answer = new int[node.get(topNode).size()];
        
        for(Integer k : node.get(topNode)) {
            System.out.println(k);
            System.out.println(node.get(k).pop());
            tracking(node, k);
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
    	int[][] s = {{2, 3}, {4, 3}, {1, 1}, {2, 1}};
    	System.out.println(solution(s));
	}
}