package mycalculator.key;

import mycalculator.config.KeyAllocator;

public class OneKey {

	public OneKey(KeyAllocator allocator) {
		allocator.label = "1";
		allocator.functionId = 1;
		allocator.status = 1;
	}

}
