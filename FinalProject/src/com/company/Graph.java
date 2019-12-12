package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Graph 
{
	Listing2 vertex[];
	int edge[][];
	int max, vertexCount;
	private Queue<Integer> queue = new LinkedList<Integer>();
	private LinkedList<Integer> nbrList[];
	private Stack<Integer> stack = new Stack<Integer>();
	
	public Graph(int n) 
	{
		vertex = new Listing2[n];
		edge = new int[n][n];
		max = n; 
		vertexCount = 0;
		nbrList = new LinkedList[n];
		
		for (int i = 0; i < n; i++)
		{
			nbrList[i] = new LinkedList<Integer>();
		}
	}
	
	public void DepthFirstSearch(int firstVertex)
	{		
		int v;
		
		for (int i = 0; i < vertexCount; i++)
		{
			if (vertex[i] != null)
			{
				// Mark all of the vertices as unvisited
				vertex[i].SetPushed(false);	
			}
		}
		
		// Visit the first vertex
		stack.push(firstVertex);
		vertex[firstVertex].SetPushed(true);
		
		// Visit all of the descendants
		while (!stack.empty())
		{
			v = stack.pop();
			vertex[v].Visit();
			
			for (int column = 0; column < vertexCount; column++)
			{
				if (edge[v][column] == 1 && !vertex[column].GetPushed())
				{
					stack.push(column);
					vertex[column].SetPushed(true);
				}
			}
		}
	}
	
	private void breadthFirstTransversal(int v, boolean[] visited)
	{
		queue.add(v);
		visited[v]  =  true;
		
		int k;
		
		while(!queue.isEmpty())
		{   
			k = queue.remove();
		    System.out.print( k +" ");
			// we are iterating through adjacency list of vertex k which has to be explored now.
			// it will give the adjacent nodes of each vertex.
			Iterator<Integer> i = nbrList[k].listIterator();
			int j;
			
			while(i.hasNext())
			{		        
        		j = i.next();
				if(visited[j] != true)
				{
					// if any child found with out visiting then those child will be added to queue.
					queue.add(j);
					visited[j] = true;
				}
			}
		}
	}
	
	public void BreadthFirstSearch(int v)
	{
		boolean visited[] = new boolean[max];
		
		breadthFirstTransversal(v, visited);
		for (int i = 0; i < max; i++)
		{   
	        // after calling BFtraveral it is checking whether any vertex left out with out exploring
			if(visited[i] != true)
			{
				// if found it will call again  BFtraversal
				breadthFirstTransversal(i, visited);
			}
		}
	}
	
	public boolean InsertVertex(int vertexNumber, Listing2 newListing)
	{
		// Check to see if the graph is full
		if (vertexNumber >= max)
			return false;
		
		vertex[vertexNumber] = newListing.DeepCopy();
		vertexCount++;
		
		return true;
	}
	
	public boolean InsertEdge(int fromVertex, int toVertex)
	{
		// Check to see if there are nonexistent vertices.
		if (vertex[fromVertex] == null || vertex[toVertex] == null)
			return false;
		
		edge[fromVertex][toVertex] = 1;
		
		return true;
	}
	
	public void ShowVertex(int vertexNumber) 
	{
		System.out.print(vertex[vertexNumber]);
	}
	
	public void ShowEdge(int vertexNumber)
	{
		for (int column = 0; column < vertexCount; column++)
		{
			if (edge[vertexNumber][column] == 1)
				System.out.print(vertexNumber + "," + column);
		}
	}
	
	public void ComputeShortestPaths(Listing2 sourceVertex)
	{
		sourceVertex.SetDistance(0);
		PriorityQueue<Listing2> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(sourceVertex);
		sourceVertex.SetPushed(true);
 
		while(!priorityQueue.isEmpty())
		{
            // Getting the minimum distance vertex from priority queue
			Listing2 actualVertex = priorityQueue.poll();
 
			for(Edge edge : actualVertex.GetneighborList())
			{
				Listing2 v = edge.GetendPoint();
				if(!v.GetPushed())
				{
					double newDistance = actualVertex.GetDistance() + edge.GetWeight();
 
					if(newDistance < v.GetDistance())
					{
						priorityQueue.remove(v);
						v.SetDistance(newDistance);
						v.SetPredecessor(actualVertex);
						priorityQueue.add(v);
					}
				}
			}
			actualVertex.SetPushed(true);
		}
	}
	
	public List<Listing2> GetShortestPathTo(Listing2 targetVertex)
	{
		List<Listing2> path = new ArrayList<>();
 
		for(Listing2 vertex = targetVertex; vertex != null; vertex = vertex.GetPredecessor())
		{
			path.add(vertex);
		}
 
		Collections.reverse(path);
		return path;
	}
}