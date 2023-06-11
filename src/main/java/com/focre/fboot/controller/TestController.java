package com.focre.fboot.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Description:
 * @Author ye21st ye21st@gmail.com
 * @Date 2023/6/11 9:55:23
 */
@RestController
@RequestMapping("/test")
@Tag(name = "测试接口")
public class TestController {

	@GetMapping(value = "/hello")
	@Operation(summary = "hello")
	public ResponseEntity<String> sayHello() {
		String message = "Hello World!";
		return ResponseEntity.ok(message);
	}

}
