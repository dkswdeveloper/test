package com.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Parking
{
	@SequenceGenerator(name="parkingidseq", allocationSize = 0,initialValue = 1001)
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parkingidseq")
	private int parkingId;
	
	@Column(nullable = false)
	private int floorId;
	@Column(nullable = false)
	private int slot;
	
//	int empid; //foreign key
	@OneToOne // will add employee_empid as a foreign key, to change name : @JoinColumn
	private Employee employee;
	
	public Employee getEmployee()
	{
		return employee;
	}
	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}
	public Parking(int parkingId, int floorId, int slot)
	{
		super();
		this.parkingId = parkingId;
		this.floorId = floorId;
		this.slot = slot;
	}
	public Parking()
	{
		super();
	}
	@Override
	public String toString()
	{
		return "Parking [parkingId=" + parkingId + ", floorId=" + floorId + ", slot="
				+ slot + "]";
	}
	public int getParkingId()
	{
		return parkingId;
	}
	public void setParkingId(int parkingId)
	{
		this.parkingId = parkingId;
	}
	public int getFloorId()
	{
		return floorId;
	}
	public void setFloorId(int floorId)
	{
		this.floorId = floorId;
	}
	public int getSlot()
	{
		return slot;
	}
	public void setSlot(int slot)
	{
		this.slot = slot;
	}
	

}
