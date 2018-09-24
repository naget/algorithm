package practice;

class Example{
    public Example(Object o){
		this.o = o;
	}
	private Object o;
	public Object getExample(){
		return this.o;
	}
	public static void main(String[] args){
		Example example = new Example(new String("hello"));
		String message = (String)example.getExample();
		Integer message2 = (Integer) example.getExample();
		System.out.println(message2);
	}
}