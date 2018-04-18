package com.devglan.userportal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge=3600) //localhost:4200은 앵귤러가 실행되는 주소. 그 주소로 매핑해준다.
@RestController
//@RequestMapping({"/api"})
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping //포스트방식으로 올때의 매핑. 아이디생성은 post로 해주는게 좋으니까, 아이디만드는 메서드는 post로 매핑해주는것
	public User create(@RequestBody User user) {
		return userService.create(user);
	}
	
	@GetMapping(path = {"/{id}"})
	public User findOne(@PathVariable("id") int id) { //@PathVariable = URL경로로 제공되는 값("{}")을 받기위해 사용. id에 int형 id를 넣어주겠다는 것.
		return userService.findById(id);
	}
	 
	@PutMapping //put할때 쓰는매핑....DeleteMapping , PatchMapping같은것도 있음.
	public User update(@RequestBody User user) { //RequestBody : 요청 바디에 접근할 수 있다. XML또는 JSON형태의 값을 받을때 유용. 파라미터값은 메소드에 선언된 변수 타입으로 변환.
		return userService.update(user);
	}
	@DeleteMapping
	public User delete(@PathVariable("id") int id) {
		return userService.delete(id);
	}
	
	@GetMapping
	public List<User> findAll(){
		return userService.findAll();
	}
}
