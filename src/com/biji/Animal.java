package com.biji;

public class Animal {
	private String type;//品种type
	private String age;//年龄 age
	private String color ;//颜色 color 
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
