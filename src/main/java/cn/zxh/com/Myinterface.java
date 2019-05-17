package cn.zxh.com;
//可以多继承，只有常量定义
public interface Myinterface {
	/*public static final*/ int max =1;
	
	/*public abstract*/ void seetest();
	void eattest();
	public static void main(String[] args) {
		aman mAman=new aman();
		mAman.honey();
		mAman.smile();
		interftest aInterftest=new interftest();
		aInterftest.eattest();
		aInterftest.seetest();
		aInterftest.prin();
		honey h =new aman();
		h.honey();
		
	}
	
}
class interftest implements Myinterface{
	

	@Override
	public void seetest() {
		// TODO Auto-generated method stub
		System.out.println("intersee");
	}

	@Override
	public void eattest() {
		// TODO Auto-generated method stub
		System.out.println("intereat");
	}
	public void prin() {
		System.out.println(max);
	}
}
interface honey{
	void honey();
}
interface smile{
	void smile();
}
class aman implements honey,smile{

	@Override
	public void smile() {
		// TODO Auto-generated method stub
		System.out.println("aman smile");
	}

	@Override
	public void honey() {
		// TODO Auto-generated method stub
		System.out.println("aman honey");
	}
	
}