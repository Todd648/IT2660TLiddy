package com.company;

import java.util.ArrayList;
import java.util.List;

public class Listing2 implements Comparable<Listing2>
{
	private int  number;
	boolean pushed;
	private double distance = Double.MAX_VALUE;
	private Listing2 predecessor;
	private List<Edge> neighborList = new ArrayList<Edge>();
	
	public Listing2(int n)
	{
		number = n;
	}
	
	public Listing2()
	{
		
	}
	public String toString()
	{
		return ("Number is " + number);
	}
	
	public Listing2 DeepCopy() 
	{
		return new Listing2(number);
	}
	
	public boolean GetPushed()
	{
		return pushed;
	}
	
	public void SetPushed(boolean value)
	{
		pushed = value;
	}
	
	public double GetDistance()
	{
		return distance;
	}
	
	public void SetDistance(double distance) 
	{
		this.distance = distance;
	}
	
	public Listing2 GetPredecessor()
	{
		return predecessor;
	}
	
	public void SetPredecessor(Listing2 predecessor)
	{
		this.predecessor = predecessor;
	}
	
	public List<Edge> GetneighborList()
	{
		return neighborList;
	}
 
	public void SetneighborList(List<Edge> neighborList)
	{
		this.neighborList = neighborList;
	}
	
	public void AddNeighbour(Edge edge)
	{
		this.neighborList.add(edge);
	}
	
	public void Visit()
	{
		System.out.println(this);
	}
	
	@Override
	public int compareTo(Listing2 otherVertex) 
	{
		return Double.compare(this.distance, otherVertex.GetDistance());
	}
}