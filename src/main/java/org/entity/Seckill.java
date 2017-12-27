package org.entity;

import com.sun.jmx.snmp.Timestamp;


public class Seckill {
	private int seckill_id;
	private String name;
	private int number;
	private Timestamp start_time;
	private Timestamp end_time;
	private Timestamp create_time;
	
	@Override
	public String toString() {
		return "Seckill [seckill_id=" + seckill_id + ", name=" + name
				+ ", number=" + number + ", start_time=" + start_time
				+ ", end_time=" + end_time + ", create_time=" + create_time
				+ "]";
	}
	public int getSeckill_id() {
		return seckill_id;
	}
	public void setSeckill_id(int seckill_id) {
		this.seckill_id = seckill_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Timestamp getStart_time() {
		return start_time;
	}
	public void setStart_time(Timestamp start_time) {
		this.start_time = start_time;
	}
	public Timestamp getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Timestamp end_time) {
		this.end_time = end_time;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	
	
	
	
}
