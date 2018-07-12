/*JAVA下载地址ORACLE官网
 *高级配置——环境配置
 *JAVA_HOME 值为：jdk的安装目录
 *CLASS_PATH 值为：.;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar（适用于win7)
 *找到变量名为 Path的环境变量 ,增加值  %JAVA_HOME%\bin 和  %JAVA_HOME%\jre(适用于win7)
 *win10不识别%，值为jdk安装目录
 *在cmd中检查是否配置成功，java -version
 *在cmd中运行java,先编译（javac 文件名），然后（java 文件名）回车运行*/
/*Eclipse开启步骤
 * window-Show View开启窗口
 *package explorer;java working set;java project;file;pachage;class;run as运行
 *package包文件命名：倒叙
 *class命名的第一个字母大写 */
package com.biji;
import java.util.*;//*为java通配符
//导入Book类,导包Alt+/
import javax.sound.midi.Synthesizer;
//public 访问权限修饰符；class类
public class BJ {
//java中方法是平级的关系，方法不能套方法，但可以调用 
/*main（）方法名的一种，只要是方法都有小括号（）
 * static静态的，void没有返回值（返回值类型）
 * String[] args参数列表，大括号｛｝中写执行的代码
 * 快捷方式main+Alt+/*/
	public static void main(String[] args) {
		/*变量命名规范：可包含数字（不可作为首字符），字母，下划线，$符
		 * 不可用保留字（java所保留的关键字）命名，如public,class...*/

/*数据类型：多种数据类型是为了合理利用内存空间
 第一类：基本数据类型
 * 二进制：-2的源码10000010，反码01111101，补码为反码加一01111110，第一位为正负值 
 * byte存储整数，一个字节，八位，取值范围-128到127，最大为0 111 1111，最小为1 000 0000
 * short存储整数，两个字节，十六位
 * int存储整数，四个字节，三十二位
 * long存储整数，八个字节，定义的数字后面加上L
 * float存储小数，四个字节，定义的数字后面加上f
 * double（布尔型）存储小数
 * boolean只有true/false
 * char存储字符，字符必须在单引号中，且单引号中只能有一个值
 * ascii表，作加减时，字符与十进制的转换（A-65;a-97;0-48),扩展为unicode编码表，utf中文处理编码表
 * 注意——如果把一个数从大范围的数据转换为小范围的数据，需要强制类型转换
 * 如果把小范围的数据转换为大范围的数据，可以直接转换
 第二类：引用数据类型
   String字符串，可以为单独字符串，也可为拼接字符串，拼接用+*/
		/*byte a=1;
		short b=3;
		int c=7;
		a=(byte)c;//强制转换
		c=b;
		System.out.println(c);
		int d=13;
		double e=4.3;
		d=(int)e;//强制转换，小数转换为整数直接去掉小数点后的数字
		System.out.println(d);*/

/*运算符优先级(),[];++,--,!;*,/,%;+,-;>>,<<;>,<=;==,!=;&;^;|;&&;||;=,+=,*=;&=,|=,<<=s
 * 算术运算符 + - * / %取余   ++自增一   --自减一 
 *条件运算符> >= < <= == !=
   *三木运算符格式(条件表达式 ？值1：值2)
 *逻辑运算符( &&与  ||或    !非),短路语满足条件就不再向下运行
   *全路语:& | ! 从头到位全部执行
 *移位:>>右移;<<左移(二进制数字上的移位)
 *异或语句：相同为0，不同为1*/
   /* int o=0,p=0,q=0;
    for((o+p)*q!=0&&o>=0||q==p)*/
//属于java long中的不用导包，比如Math(pow次方)，String
 
/*流程控制语句
  * 条件语句  if语句
            两种情况：if(条件表达式——满足条件就运行下面内容){};else{}
            三种及以上：if(){};else if(){};...都为并列关系
            当if语句中只有一个条件时，可以不存在大括号{}
  * 循环语句  必有：初始条件；循环条件；更新计数器
  * 在指定条件下，做相同的条件
  * for语句 知道循环次数用for比较方便 */
		/*for(int a=1;a>=7;a++){}也可以写为
		int a=1;for(;7<=a;a++){}*/
  /*while语句;do while语句,do{}while()从上到下运行*/
		/*int a=1;while(a<=13){a++;}*/
  /*switch语句，可用于byte,short,int,char,String
            不能用于long,float,double*/
		/*int key=19;
		switch(key){
		case （与key比较的）值:表达式;break;
		defaul:表达式;break;
		}*/
  /*continue继续，满足当前条件时不运行
   * break跳出当前循环
   * return结束当前main方法的运行，返回*/
		for(int a=1;a<=23;a++){
			
		}	

/*在java里一切皆对象，做任何操作都会涉及到对象
 * 在java中只要建一个类，就是在继承——顶级父类object
 *想要对象，就先要类，下面调用一个类*/
//从类中具体到某一个，子名=new 类名();
//在调用方法时，需要传入方法的指定数据类型的值（实际参数）
	//构造方法
	/*Book shu=new Book() ;
	shu.setBno(27);
	System.out.println(shu.getBno());
	shu.setBhave(false);*/
//extends继承
	
/*数组：用来存放一组相同类型的数据；引用数据类型
 * 数组中的数据：有默认的值，根据数据类型的不同而不同*/
//定义数组的方式：类型[]  变量名=
	//第一种：类型[] 变量名={}
	int[] a={2,3,5,7};
	//第二种：类型[] 变量名=new 类型[填写数组长度]
	//这种方式创建数组，一定要指定数组的长度
	double[] b=new double[23];
	//第三种：类型[] 变量名=new 类型[]{}
	double[] c=new double[]{13,19,23};
	//数组中存在下标，从0开始
	//当要知道数组下标或者要使用下标时，用for循环
	for(double i=0.0;i<b.length;i++){
		
	}
	/*如果只是查看数据组中的内容。用增强for
	for(类型  随意变量名:需要查看的数据组){}*/
//冒泡排序
/*int[] h={43,17,3,23,9};
	//控制排列次数
	for(int j=0;j<h.length-1;j++){
		//每次排列的比较次数
		for(int m=0;m<h.length-1-j;m++){
			//两两比较
			if(h[m]>h[m+1]){
				//定义一个中间量，暂时存储数据
				int one=h[m+1];
				h[m+1]=h[m];
				h[m]=one;
			}
		}
	}for(int q:h){System.out.println(q);}//增强for
*/	
	
	
	
	}	
}
