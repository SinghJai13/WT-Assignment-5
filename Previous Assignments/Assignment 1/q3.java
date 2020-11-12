import java.util.*; 
 
class q3 
{ 
	class Edge 
	{ 
		int src, dest, weight; 
		Edge() 
		{ 
			src = 0;
			dest = 0;
			weight = 0; 
		} 
	}; 

	int V, E; 
	Edge edge[]; 

	q3(int v, int e) 
	{ 
		V = v; 
		E = e; 
		edge = new Edge[e]; 
		for (int i = 0; i < e; ++i) 
			edge[i] = new Edge(); 
	} 
	
	void Bl(q3 graph, int src) 
	{ 
		int V = graph.V, E = graph.E; 
		int dist[] = new int[V]; 

		for (int i = 0; i < V; ++i) 
			dist[i] = Integer.MAX_VALUE; 
		dist[src] = 0; 

		for (int i = 1; i < V; ++i) 
		{ 
			for (int j = 0; j < E; ++j) 
			{ 
				int u = graph.edge[j].src; 
				int v = graph.edge[j].dest; 
				int weight = graph.edge[j].weight; 
				if (dist[u]!= Integer.MAX_VALUE && dist[u]+weight<dist[v])
				{
					dist[v]=dist[u]+weight;
				}
			} 
		} 

		for (int j = 0; j < E; ++j) 
		{ 
			int u = graph.edge[j].src; 
			int v = graph.edge[j].dest; 
			int weight = graph.edge[j].weight; 
			if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) 
			{ 
				System.out.println("Negative cycles Exist"); 
				return; 
			} 
		} 
		printArr(dist, V); 
	} 

	void printArr(int dist[], int V) 
	{ 
		System.out.println("Vertex Distance from Source"); 
		for (int i = 0; i < V; ++i) 
			System.out.println(i + "\t\t" + dist[i]); 
	} 

	public static void main(String[] args) 
	{ 
		Scanner input=new Scanner(System.in);
		System.out.println("Enter no. of vertices:");
		int V = input.nextInt();
		System.out.println("Enter no. of edges:");
		int E = input.nextInt();  

		q3 graph = new q3(V, E); 
		//System.out.println("Enter the source vertex, destination vertex and weight of each edge:");
		for(int i=0;i<E;i++)
		{
			System.out.println("Enter source , destination and weight for the  edge "+i );
			graph.edge[i].src = input.nextInt(); 
			//System.out.println("Enter destination ");
			graph.edge[i].dest = input.nextInt(); 
			//System.out.println("Enter weight of the edge ");
			graph.edge[i].weight = input.nextInt();
		}
		input.close();
		graph.Bl(graph, 0); 
	} 
} 