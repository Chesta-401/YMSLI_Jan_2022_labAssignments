/*
 *  AnnotatedClass @Author:Johny
	 @Version:1.0
	AnnotatedMethod1 @Author:Author1
	 @Version:2.0
	AnnotatedMethod2 @Author:Author2
	 @Version:4.0

 */
package annnotation_and_Reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class Solution {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class<?> classObject = Class.forName("annnotation_and_Reflection.AnnotatedClass");

			readAnnotation(classObject,"AnnotatedClass");

			Method[] m = classObject.getDeclaredMethods();
			readAnnotation(m[0], "AnnotatedMethod1");
			readAnnotation(m[1], "AnnotatedMethod2");

		} 
		catch (SecurityException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}
	//Utility method
	public static void readAnnotation(AnnotatedElement ele, String s) {
		Annotation[] annotations = ele.getAnnotations();

		for(Annotation annotation : annotations) {

			if(annotation instanceof Author) {
				Author a = (Author)annotation;
				System.out.println(s+" @Author:" + a.name());

			}
			if(annotation instanceof Version) {
				Version v = (Version)annotation;
				System.out.println(" @Version:" + v.number());

			}
		}


	}

}
