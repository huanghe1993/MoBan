package com.anyikang.utils;

import java.lang.reflect.Method;

/**
 * @Description:   		[ java反射工具类 ]
 */
public class BeanUtil {

	public static Class<?> classExists(String className){
		try {
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			if(null==classLoader)classLoader = BeanUtil.class.getClassLoader();
			return classLoader.loadClass(className);
		} catch (Exception e) {
			return null;
		}
	}
	
	public static Method methodExists(Class<?> class1,String methodName){
		try {
			Method[] methods = class1.getDeclaredMethods();
			for(Method method : methods){
				if(method.getName().equals(methodName)){
					return method;
				}
			}
			return null;
		} catch (SecurityException e) {
			return null;
		}
	}
	
	public static boolean parameterTypesExists(Method method){
		try {
			Class<?>[] cc =  method.getParameterTypes();
			if(0==cc.length){
				return true;
			}
			return false;
		} catch (SecurityException e) {
			return false;
		}
	}
	
	
}
