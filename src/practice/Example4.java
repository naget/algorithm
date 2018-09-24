package practice;

class Example4<T>{
    T first;
	public <U extends Comparable> U getmin(U[] u){
		if(u.length<=0)return null;
		U min = u[0];
		for(int i = 0;i<u.length;i++){
			if(u[i].compareTo(min)<0)min = u[i];
		}
		return min;
	}
	public void getFirst(T ob){
		System.out.println("Example4的getFirst()");
	}

}
