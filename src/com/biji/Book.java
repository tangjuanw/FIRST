package com.biji;
//�������������࣬����������Ϊȫ·������ȫ�޶�����
public class Book {//����
	/*���Ǿ���һЩ��ͬ��������Ϊ��һ������ļ���
	 * public�������ģ����γ�Ա����,private��˽�еģ��������Ա���
	 * ����һ�����ʱ��private�������ԣ�public���η���*/
	//d����Ϊ����ʱ����һ��Ĭ�ϵĳ�ʼֵ
	//byte,short,int,long�ĳ�ʼֵΪ0
	//float,double�ĳ�ʼֵΪ0.0
	//boolean�ĳ�ʼֵΪfalse;String�ĳ�ʼֵΪnull(��)
	//char�ĳ�ʼֵΪASCII��ĵ�һ����Ϊ�ո�
	     private String bname;// private����ֻ�ڵ�ǰ������Ч
	     private int bno;//���
	     private double bdate;//��������
	     private boolean bhave;//�ݲ�����
	     private char bhome;//������
	     //set����ֵ�ķ�������������С����
	     //��bno����ֵ,BnoWord(�շ������������ʵ�����ĸ��д)
	     public void setBno(int bno1/*��ʽ����*/){
	    		bno=bno1;/*�����Ը�ֵ����������get��ֵ�����Բ���ֵ*/
	    	}
	     //get��ȡֵ�ķ���
	     public int getBno(){
	    	 return bno;/*���巵��ֵ*/
	     }
	     
	     public void setBname(String bname){
	    	//�ͽ�ԭ��
		     //�ֲ�����,ͬ��ʱ��this����
	    	 this.bname=bname;
	     }
	     public String getBname(){
	    	 return bname;
	     }
	     
	     public void setBhave(boolean bhave1){
	    	 bhave=bhave1;
	    	 if(bhave1==true){System.out.println("��");
	    	 }else if(bhave1==false){System.out.println("��");
	    		 
	    	 }
	     }
	     
	     //���췽�����������������Ը�ֵ
	     //��һ������Ĭ����һ���޲ι��췽��
	     //��������������Ĺ��췽����Ĭ�ϵ�ʧЧ
	     public Book(){}//Ĭ�ϵ�
	     public Book(boolean bhave){
	    	 this.bhave=bhave;
	    	 }
	     //�������أ���������ͬ�������б�ͬ
	     /*�������صļ�����ʽ����ͬһ�����з���
	      * ����������ͬ
	      * �������Ͳ�ͬ
	      * ����˳��ͬ*/
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
}
