package com.sreekar.spring;

import org.springframework.stereotype.Component;

@Component

public class Bit64 implements Processor {

	@Override
	public void ramSize() {
		System.out.println("64-bit processor");

	}

}
