package com.fundamentosJA.fundamentosja;


import com.fundamentosJA.fundamentosja.bean.MyBean;
import com.fundamentosJA.fundamentosja.bean.MyBeanWithDependency;
import com.fundamentosJA.fundamentosja.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosjaApplication implements CommandLineRunner {
	/** Realizando la inyección de dependencias**/
	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;

	public FundamentosjaApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean,MyBeanWithDependency myBeanWithDependency){
		this.componentDependency = componentDependency;
		this.myBean=myBean;
		this.myBeanWithDependency=myBeanWithDependency;

	}
	/** Fin de la primera inyección **/

	public static void main(String[] args) {
		SpringApplication.run(FundamentosjaApplication.class, args);
	}

	@Override
	//Ejecuta en la apliacion lo que se desee
	public void run(String... args)  {
 		componentDependency.saludar();
 		myBean.print();
 		myBeanWithDependency.printWithDependency();
	}
}
