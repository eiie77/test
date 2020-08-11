package com.kkm.kkmProject;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Spring Reactive Web 추가 시 사용 가능

@RestController //리턴값 랜더링을 위해 RestController annotation 사용
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class HelloController { //클래스 이름과 파일명 맞추기

	@RequestMapping("/")
//spring처럼 @RequestMapping(value="/", method=RequestMethod.GET) 이렇게 쓸 수도 있음
	public String Hello() {
		return "Hello world! 헬로우! 안녕!<br/>ㅎㅇㅎㅇ 너무 어려워!!!";
	}
	
}
