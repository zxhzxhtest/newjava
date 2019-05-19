package cn.zxh.com;
/**
 * 测试arraycopy
 * @author Administrator
 *
 */
public class TestArraycopy {
	public static void arrayprint(String[] a) {
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		for(String s:a) {
			System.out.println(s);
		}
	}
	//删除数组中第index个数据
	public static void arraydecline(String[] a,int index) {
		index--;
		
		System.arraycopy(a, index+1, a, index, a.length-index-1);
		a[a.length-1]=null;
		arrayprint(a);
	}
	//在数组的index位置上面添加一个字符串s
	public static void arrayadd(String[] a,int index,String s) {
		index--;
		String[] a1=new String[a.length+1];
		System.arraycopy(a, 0, a1, 0, index);
		a1[index]=s;
		System.arraycopy(a, index, a1, index+1, a.length-index);
		arrayprint(a1);
	}
	public static void main(String[] args) {
//		TestArraycopy st =new TestArraycopy();
//		String[] aStrings= {"aa","bb","cc","dd","ee"};
//		System.arraycopy(aStrings, 3, aStrings, 2, 2);
//		aStrings[aStrings.length-1]=null;
//		st.arrayprint(aStrings);
		String[] aStrings= {"aa","bb","cc","dd","ee"};
		//arraydecline(aStrings, 1);
		arrayadd(aStrings, 5, "ff");
		
		
	}
}
