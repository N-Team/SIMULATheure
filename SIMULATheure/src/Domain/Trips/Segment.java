/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Trips;

import Domain.Node.*;
import Domain.Generation.TriangularDistribution;
/**
 *
 * @author Raphael
 */
public class Segment implements java.io.Serializable
{
    private Node originNode;
    private Node destinationNode;
    private TriangularDistribution durationDistribution;
    private double durationTime; //in minutes
    private String name;
    
    public Segment(Node _originNode, Node _destinationNode)
    {
        this.originNode = _originNode;
        this.destinationNode = _destinationNode;
        this.durationDistribution = new TriangularDistribution(3.0,10.0,5.0);
        this.durationTime = this.durationDistribution.calculate();
    }
    
    public Node getOriginNode()
    {
        return this.originNode;
    }
    
    public void setOriginNode(Node _originNode)
    {
        this.originNode = _originNode;
    }
    
    public void setOriginNode(Stop _originNode)
    {
        this.originNode = _originNode;
    }
    
    public Node getDestinationNode()
    {
        return this.destinationNode;
    }
    
    public void setDestinationNode(Node _destinationNode)
    {
        this.destinationNode = _destinationNode;
    }
    
    public double getDurationTime()
    {
        return this.durationTime;
    }
    
    public void setDurationTime(double _durationTime)
    {
        this.durationTime = _durationTime;
    }
    
    public TriangularDistribution getDurationDistribution()
    {
        return this.durationDistribution;
    }
    
    public void setDurationDistribution(double _min, double _max, double _mode)
    {
        this.durationDistribution.setMinimum(_min);
        this.durationDistribution.setMaximum(_max);
        this.durationDistribution.setMode(_mode);
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String _name)
    {
        this.name =_name;
    }
 
  
}
