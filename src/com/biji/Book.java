package com.biji;
//构建面向对象的类，包名加类名为全路径（完全限定名）
public class Book {//父类
	/*类是具有一些相同特征和行为的一类事物的集合
	 * public（公开的）修饰成员变量,private（私有的）修饰属性变量
	 * 定义一个类的时候，private修饰属性，public修饰方法*/
	//d定义为属性时，有一个默认的初始值
	//byte,short,int,long的初始值为0
	//float,double的初始值为0.0
	//boolean的初始值为false;String的初始值为null(空)
	//char的初始值为ASCII表的第一个，为空格
	     private String bname;// private修饰只在当前类中有效
	     private int bno;//编号
	     private double bdate;//出版日期
	     private boolean bhave;//馆藏有无
	     private char bhome;//出版社
	     //set设置值的方法，方法必有小括号
	     //给bno设置值,BnoWord(驼峰命名法，单词的首字母大写)
	     public void setBno(int bno1/*形式参数*/){
	    		bno=bno1;/*给属性赋值，如果不输出get的值，可以不赋值*/
	    	}
	     //get获取值的方法
	     public int getBno(){
	    	 return bno;/*定义返回值*/
	     }
	     
	     public void setBname(String bname){
	    	//就近原则
		     //局部变量,同名时用this区分
	    	 this.bname=bname;
	     }
	     public String getBname(){
	    	 return bname;
	     }
	     
	     public void setBhave(boolean bhave1){
	    	 bhave=bhave1;
	    	 if(bhave1==true){System.out.println("有");
	    	 }else if(bhave1==false){System.out.println("无");
	    		 
	    	 }
	     }
	     
	     //构造方法，作用用来给属性赋值
	     //在一个类中默认有一个无参构造方法
	     //如果定义了其他的构造方法，默认的失效
	     public Book(){}//默认的
	     public Book(boolean bhave){
	    	 this.bhave=bhave;
	    	 }
	     //方法重载，方法名相同，参数列表不同
	     /*方法重载的几种形式，在同一个类中发生
	      * 参数个数不同
	      * 参数类型不同
	      * 参数顺序不同*/
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
}
