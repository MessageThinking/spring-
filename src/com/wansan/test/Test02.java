package com.wansan.test;
/*
 * 1.java�������ڳ�ʼ����ʱ�����ȱ�����main������newһ��
 * ��Ȼ�޷���ʼ����������������java��ʼ���Ĺ�����,����ʼ��
 * �����ʱ����Ҫ���ȳ�ʼ������Ĺ�������(��Ҫ).
 * 2.toString ������Object���Դ�������㲻����������д,��ô��
 * ��ӡ�Ľ������һ������,��������Ҫ��д��,���ܷ��ض�Ӧ�ı���������
 * �������String���͵�,��������Щ����ת����String���ͽ���ת��.
 * 3.���� ���Ǹı����������д��Ҳ���Ƿ�����һ�����ѣ��������������ʲô
 * һ������һ��������ֵ���ܲ�һ��,��β�һ����.
 * ��д �����������һ������һ�㶼��������̳и��������£�һ������
 * ���ø���ķ���,���ǲ���ԭ�ⲻ����ʹ�ø���ķ�����ʱ����д.
 * 4.����ת������ͨ����ת��,���ԴӴ��ת����С��,String����ת���ɻ�������
 * ����Щ�����ķ���,�������͵�ת������ת�ɸ�������ת������.
 */
 class Test02{
	 int d =(int) 1.1;
	 
	 int a=0;
	 String b="sss";
	 double c=21;
	 public Test02() {
		 System.out.println("sdsad");
	 }
	public void add(String s) {
		System.out.print("add");
	}
public String toString() {
	return b;
	
}
public static void main(String[] args) {
	Test02 test02=new Test02();
	System.out.print(test02);
}
}