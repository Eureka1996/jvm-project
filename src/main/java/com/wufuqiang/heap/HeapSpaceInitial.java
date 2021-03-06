package com.wufuqiang.heap;

public class HeapSpaceInitial {
	public static void main(String[] args) {
		//返回Java虚拟机中的堆内存总量
		long initialMemory = Runtime.getRuntime().totalMemory() / 1024/1024;
		//返回Java虚拟机试图使用的最大堆内存量
		long maxMemory = Runtime.getRuntime().maxMemory()/1014/1024;

		System.out.println(String.format("-Xms:%dM",initialMemory));
		System.out.println(String.format("-Xmx:%dM",maxMemory));

		System.out.println(String.format("系统内存大小为：%fG",initialMemory*64.0/1024));
		System.out.println(String.format("系统内存大小为：%fG",maxMemory*4.0/1024));

	}
}
