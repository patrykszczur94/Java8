public interface FunctionalInterface {
	int val(int x);
	
	//declaration of function interface 
	default int defFun(int y) {
		return y*2;
	}
}
