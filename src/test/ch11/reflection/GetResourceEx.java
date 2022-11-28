package test.ch11.reflection;

public class GetResourceEx {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource(null); //이미지거ㅕㅇ로가져올수잇음.
		//clazz.getResource("이미지이름).getPath() 

	}

}
