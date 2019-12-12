package com.company;

public class Edge
{
	private double weight;
	private Listing2 startPoint;
	private Listing2 endPoint;
	
	public Edge(double weight, Listing2 startPoint, Listing2 endPoint)
	{
		this.weight = weight;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
 
	public double GetWeight() 
	{
		return weight;
	}
 
	public void SetWeight(double weight) 
	{
		this.weight = weight;
	}
 
	public Listing2 GetstartPoint()
	{
		return startPoint;
	}
 
	public void SetstartPoint(Listing2 startPoint)
	{
		this.startPoint = startPoint;
	}
 
	public Listing2 GetendPoint()
	{
		return endPoint;
	}
 
	public void SetendPoint(Listing2 endPoint)
	{
		this.endPoint = endPoint;
	}
}