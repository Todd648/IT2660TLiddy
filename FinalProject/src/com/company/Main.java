package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Random randomNumber = new Random();

        int numberOfNodes = 100000;
        // Generate a (positive) number of connections.
        int connectionCount = Math.abs(randomNumber.nextInt(5));
        int nodeValue = Math.abs(randomNumber.nextInt(30000));
        Graph graph = new Graph(numberOfNodes);

        int vertexNum = Math.abs(randomNumber.nextInt(3));

        List<Listing2> listingList = new ArrayList<Listing2>();
        Listing2 vertice = new Listing2();
        // Create the a new node and insert it into the graph.
        for (int i = 0; i < numberOfNodes; i++)
        {
            vertice = new Listing2(Math.abs(randomNumber.nextInt(300)));
            listingList.add(vertice);

            graph.InsertVertex(i, vertice);

            // Insert the the edges.
            for (int j = 0; j < nodeValue; j++)
            {
                graph.InsertEdge(connectionCount, Math.abs(randomNumber.nextInt(vertexNum)));
            }
        }

        Listing2 startPoint = new Listing2(Math.abs(randomNumber.nextInt()));
        Listing2 endPoint = new Listing2(Math.abs(randomNumber.nextInt()));

        vertice.AddNeighbour(new Edge(Math.abs(randomNumber.nextInt()), startPoint, endPoint));


        // This is where the user can input their value.
        System.out.println("Enter the Starting Point for Depth-First:");
        Scanner dscanner = new Scanner(System.in);
        int df = dscanner.nextInt();
        graph.DepthFirstSearch(df);

        System.out.println();
        System.out.println("Enter the Starting Point for Breadth First:");
        Scanner bscanner = new Scanner(System.in);
        int bf = bscanner.nextInt();

        graph.BreadthFirstSearch(bf);
        System.out.println();

        System.out.println();
        System.out.println("Dijkastra Alhorithm:");

        // Enter in the Listing2 that you would like to compute.

        graph.ComputeShortestPaths(startPoint);
        graph.GetShortestPathTo(startPoint);
        System.out.println("Minimum distance from 1st to 2nd: "+ startPoint.GetDistance());
        System.out.println("Minimum distance from 1st to 2nd: "+ endPoint.GetDistance());
        System.out.println("Shortest Path from 1st to 2nd: "+ graph.GetShortestPathTo(endPoint));
        System.out.println("Total number of nodes examined during the search " + graph.vertexCount);
    }

}