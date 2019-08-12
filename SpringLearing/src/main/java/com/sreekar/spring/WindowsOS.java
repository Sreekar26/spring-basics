package com.sreekar.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WindowsOS {

	@Autowired
	@Qualifier("bit32")
	Processor ramSize;

	public Processor getRamSize() {
		return ramSize;
	}

	public void setRamSize(Processor ramSize) {
		this.ramSize = ramSize;
	}

	public void specification() {

		ramSize.ramSize();
		System.out.println("Operating system is Windows");

	}

}
