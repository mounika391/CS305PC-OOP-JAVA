class AnnoP{

	@Deprecated
	public void depM(){
		System.out.println("Deprecated Method...");

	}
	public void ovR(){
		System.out.println("AnnoP");
	
	}
	
}

@MyAnno
class AnnoC extends AnnoP{
	@Override
	public void ovR(){
		System.out.println("AnnoP");
	}	
}


public class AnnoDemo{
	@SuppressWarnings("deprecation")
	public static void main(String...args){
	class<?> ct = AnnoC.class;
	AnnoC ac = new AnnoC();
	ac.ovR();
	ac.depM();
	
System.out.println(ct.isAnnotationpresent(MyAnno.class));
System.out.println(ct.getAnnotationType(MyAnno.class).usage());
	}

}
