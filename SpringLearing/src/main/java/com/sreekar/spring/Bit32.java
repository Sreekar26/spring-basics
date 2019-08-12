package com.sreekar.spring;

import org.springframework.stereotype.Component;

@Component
public class Bit32 implements Processor {

	@Override
	public void ramSize() {
		System.out.println("32-bit processor");

	}

}
