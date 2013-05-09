package bundle1.impl;

import bundle1.api.Bundle1Interface;

public class Bundle1Implementation implements Bundle1Interface {

	@Override
	public String helo(String h) {
		return "Bundle1Implementation Hello " + h + ", pleased to meet you";
	}
}
