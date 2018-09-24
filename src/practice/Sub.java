package practice;

class Sub extends Example4<String>{
	@Override
    public void getFirst(String s){
		System.out.println("sub的getFirst()");
	}

	public static void main(String[] args) {
		Sub sub = new Sub();
		Example4<String> exm = sub;
		exm.getFirst("dd");
	}
}