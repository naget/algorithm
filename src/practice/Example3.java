package practice;

class Example3{
    private int  N=0;
	public Example3(Object[] os){
		this.os = os;
	}
	private Object[] os;
	public void addExample(Object o){
		os[N++] = o;
	}
	public Object getTopExample(){
		return os[N-1];
	}
	public static void main(String[] args){
		String[] stringarray = new String[10];
		Example3 example = new Example3(stringarray);//A
		example.addExample(new String("hello"));
		String message = (String)example.getTopExample();
		System.out.println(message);
		example.addExample(1);
		String message2 = (String)example.getTopExample();
		System.out.println(message2);
	}
}