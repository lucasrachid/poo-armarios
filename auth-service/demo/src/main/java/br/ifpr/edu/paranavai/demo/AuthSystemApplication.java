package br.ifpr.edu.paranavai.demo;

import br.ifpr.edu.paranavai.demo.entity.StudentEntity;
import br.ifpr.edu.paranavai.demo.repository.StudentsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.stream.LongStream;

@SpringBootApplication
public class AuthSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthSystemApplication.class, args);
	}

//	@Bean
//	CommandLineRunner init(StudentsRepository studentsRepository) {
//		return args -> {
//			studentsRepository.deleteAll();
//			LongStream.range(1, 11)
//					.mapToObj(i -> {
//						StudentEntity c = new StudentEntity();
//						c.setName("Contact " + i);
//						c.setEmail("contact" + i + "@email.com");
//						c.setPhone("(111) 111-1111");
//						c.setCpf("01181623901");
//						return c;
//					})
//					.map(v -> studentsRepository.save(v))
//					.forEach(System.out::println);
//		};
//	}

}
