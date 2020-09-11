package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	public DemoRepository demoRepository;

	@Test
	public void testCreateDemo() {

		Demo demo=new Demo();
		demo.setName("Juma");
		demo.setCourse("MT");
		demo.setFee(750000.0);
		demoRepository.save(demo);


	}

	@Test
	public void testFindDemoById(){
		//Optional<Demo> demo =demoRepository.findById(5);
		Optional<Demo> demo=demoRepository.findById(0);
		System.out.println(demo);
	}


}
