package org.entity;

import java.sql.Date;


public class SuccessKilled {


	private long seckill_id;
	private long userPhone;
	private short state;
	private Date create_date;
	//多对一复合属性
	private Seckill seckill;
	@Override
	public String toString() {
		return "SuccessKilled [seckill_id=" + seckill_id + ", userPhone="
				+ userPhone + ", state=" + state + ", create_date="
				+ create_date + ", seckill=" + seckill + "]";
	}
	public long getSeckill_id() {
		return seckill_id;
	}
	public void setSeckill_id(long seckill_id) {
		this.seckill_id = seckill_id;
	}
	public long getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}
	public short getState() {
		return state;
	}
	public void setState(short state) {
		this.state = state;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Seckill getSeckill() {
		return seckill;
	}
	public void setSeckill(Seckill seckill) {
		this.seckill = seckill;
	}
	
	
	
	



}
