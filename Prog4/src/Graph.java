import java.util.ArrayList;


public interface Graph {
   // Return a list of all vertices in the graph
   public ArrayList< Vertex > vertices( );
   // Add a vertex to the graph
   public Vertex addVertex( Vertex v );
   // Remove a vertex from the graph
   public boolean removeVertex( Vertex v );

   // Return a list of edges in the graph
   public ArrayList<Edge> edges( );   
   // Add an edge to a graph
   public Edge addEdge( Vertex v1, Vertex v2 );
   public Edge addEdge( Edge e );
   // Remove an edge from the graph
   public boolean removeEdge( Vertex v1, Vertex v2 );
   public boolean removeEdge( Edge e );
   // Find an edge in the graph by its vertices
   public Edge findEdge( Vertex v1, Vertex v2 );
   // Return true if two vertices are connected by an edge
   public boolean areConnected( Vertex v1, Vertex v2 );

   // Return a list of all vertices that are adjacent to the given vertex
   public ArrayList<Vertex> adjacentVertices( Vertex v1 );
   // Find all edges that connect to the given vertex
   public ArrayList<Edge> incidentEdges( Vertex v1 );
   
   // Color the graph
   // Return the number of colors used
   // or -1 if the graph can't be colored using the specified colors.
   public int colorGraph( ArrayList< GraphColor > colors ); 
}