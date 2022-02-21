package com.krish.others;

import org.springframework.data.jpa.repository.Query;

public interface Test {

	@Query()
	void test();
}
