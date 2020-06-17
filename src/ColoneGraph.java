import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 克隆图
 * 
 * @author wangguanghui
 *
 */
public class ColoneGraph {
	public Node cloneGraph(Node node) {
		Map<Node, Node> lookup = new HashMap<Node, Node>();
		return dfs(node, lookup);
	}

	private Node dfs(Node root, Map<Node, Node> lookup) {
		if (root == null)
			return null;
		if (lookup.containsKey(root))
			return lookup.get(root);
		Node clone = new Node(root.val, new ArrayList<Node>());
		lookup.put(root, clone);
		for (Node node : root.neighbors)
			clone.neighbors.add(dfs(node, lookup));
		return clone;
	}

	class Node {
		public int val;
		public List<Node> neighbors;

		public Node() {
		}

		public Node(int _val, List<Node> _neighbors) {
			val = _val;
			neighbors = _neighbors;
		}
	};
}
