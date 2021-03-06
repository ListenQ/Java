package com.example.demo.algorithm.simple;

/**
 * 整数反转LeetCode 简单第7题
 * Ctest_Num_Reverse
 * @author zhangqi 
 * @date 2021年1月13日-上午10:16:52
 *
 */
public class Ctest_Num_Reverse {

	public static void main(String[] args) {
		long start = System.nanoTime();
		int reverse = reverse2(1463847419);
		System.out.println((System.nanoTime() - start)+"***"+reverse);
	}
	
	
	public static int reverse(int x) {
		long tmp = 0;
		// 一个数 取模10 就是得到个位数
		for(; x !=0 ;) {
			//有溢出int范围的可能
			tmp = tmp*10 + x%10;
			x /= 10;
		}
		if (tmp < -1<<31 || tmp > (1<<31)-1) {
			return 0;
		}
		return (int)tmp;
	}
	
	
	// -2^32   = -2147483648
	// 2^32-1  = 2147483647
	public static int reverse2(int x) {
		int tmp = 0;
		// 一个数 取模10 就是得到个位数
		for(; x !=0 ;) {
			int pop = x % 10;
			//正数范围                       下面这条件是因为int最大值得个位数是7,int最小值的个位数是-8
			if (tmp > Integer.MAX_VALUE/10 || tmp == Integer.MAX_VALUE/10 && pop > 7){
				return 0;
			}
			//负数范围
			if (tmp < Integer.MIN_VALUE /10 || tmp == Integer.MIN_VALUE /10 && pop < -8) {
				return 0;
			}
			tmp = tmp*10 + pop;
			x /= 10;
		}
		return tmp;
	}
	
	
	
	
}
