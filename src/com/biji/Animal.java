package com.biji;

public class Animal {
	private String type;//Ʒ��type
	private String age;//���� age
	private String color ;//��ɫ color 
	public void There(String type,String age){
		this.type=type;
		this.age=age;
	}
	public void mean(){
		System.out.print(this.type+this.age);
	}
	
	public void setColor(String color){
		this.color=color;
    }
    public String getColor(){
   	 return color;
    }
 
}
