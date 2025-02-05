package java_practice;

import java.lang.reflect.Method;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.IConfigurationListener;
import org.testng.IDataProviderListener;
import org.testng.IDataProviderMethod;
import org.testng.IDynamicGraph;
import org.testng.IInvokedMethod;
import org.testng.TestNG;
import org.testng.TestRunner;

public class methodds {

	
	public static void main(String[] args) {
        // Specify the class whose methods you want to list
        Class<?> clazz = ExpectedConditions.class; // Replace 'ExampleClass' with your desired class

        // Get all declared methods of the class
        Method[] methods = clazz.getDeclaredMethods();

        // Print method names and parameters
        System.out.println("Methods of class: " + clazz.getName());
        for (Method method : methods) {
            System.out.print(method.getName() + "(");

            // Get and print parameter types
            java.lang.reflect.Parameter[] parameters = method.getParameters();
            for (int i = 0; i < parameters.length; i++) {
                java.lang.reflect.Parameter parameter = parameters[i];
                System.out.print(parameter.getType().getSimpleName() + " " + parameter.getName());
                if (i < parameters.length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println(")");
        }
    }
}
