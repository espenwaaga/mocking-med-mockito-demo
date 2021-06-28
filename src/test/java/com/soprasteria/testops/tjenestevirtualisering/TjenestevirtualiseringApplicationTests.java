package com.soprasteria.testops.tjenestevirtualisering;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.soprasteria.testops.tjenestevirtualisering.registere.PersonRegister;

@SpringBootTest
class TjenestevirtualiseringApplicationTests {


	@BeforeAll
	public static void registerPersoner() {
		FyllPersonregister.registerPersoner();
	}

	@Test
	public void sjekkerAtViHarRegistert2Personer() {
		var personregister = PersonRegister.getInstance();
		var personer = personregister.getPersoner();
		assertThat(personer).hasSize(2);
	}

}
