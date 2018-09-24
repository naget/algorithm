package practice;

class Example2<T>{
    public Example2(T t){
		this.t = t;
	}
	private T t;
	public T getExample(){
		return this.t;
	}
	public static void main(String[] args){
		Example2<String> example = new Example2<>(new String("hello"));
		String message = example.getExample();
		System.out.println(message);
	}
}