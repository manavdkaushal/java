package com.lambdas;
import java.util.function.*;

// class FunctionImpl implements Function<String,Integer>{
//
//	@Override
//	public Integer apply(String t) {
//		return t.length();
//	}
//	
//}
public class LambdaFunction {
	public static void main(String args[]) {
		Function<String,Integer> func =   (t) -> t.length();
	
		System.out.println(func.apply("Ramesh"));
	}
}
