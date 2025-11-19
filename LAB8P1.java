import java.awt.*;
import java.awt.event.*;
   class LAB8P1 extends Frame {
   Label l ; 
	LAB8P1(){
		super("Demonstration of MenuBar");
		MenuBar mb = new MenuBar();
		FlowLayout fl = new FlowLayout();
		setLayout(fl);
	 	 l = new Label();
	 	l.setFont(new Font("Arial",Font.BOLD,20));
	 	l.setPreferredSize(new Dimension(200,200));
	 	add(l);
	 	
	 	
		String[] menu = {"FILE" ,"EDIT","HELP"};
		String[][] mi = {
			{"OPEN","SAVE","CLOSE"},
			{"SIZE","TEXT","FONT"},
			{"ABOUT","UPDATE","LICENSE"},
		};
		int x = 0 ,y = 0;
		for(String s : menu){
			y = 0 ;
			Menu m = new Menu(s);
		for(int i= 0; i<3; i++){
		MenuItem mmi = new MenuItem(mi[x][y]);
			mmi.addActionListener(this);
			m.add(mmi);
			y++;
		} 
		x++;
		mb.add(m);
		}
 		setSize(400,400);
 		setVisible(true);
 		setMenuBar(mb);
 
		addWindowListener(
			new WindowAdapter(){
				public void windowClosing(WindowEvent we){
					dispose();
			
		}
		}
	);
}
public void actionPerformed(ActionEvent ae){
	 String mstr = ae.getActionCommand();
	 if(mstr.equals("close")){
	 System.exit(0);
	 }else  {
	 l.setText(mstr);
	
	 }
	                                                                                                                                                                                             
	}

public static void main(String...args){
	new LAB8P1();
}
}
