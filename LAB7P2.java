import java.awt.event.*;
import java.awt.*;
class LAB7P2 implements ActionListener{
	Frame f = new Frame();
	TextField ft = new TextField(20);
	Button b = new Button();
	Label l = new Label();
	int a = 1;

	LAB7P2(){
	final int a[] = {1};
		//Frame f = new Frame();
		//TextField ft = new TextField(20);
		// or tf.setColumn(20);
		//Button b = new Button();
		b.setLabel("click");
		b.setSize(10,20);
		//Label l = new Label();
		l.setPreferredSize(new Dimension(100,100));
		
		f.add(b);
		f.add(ft);
		f.add(l);
		f.setSize(400,400);
		f.setVisible(true);
		FlowLayout fl = new FlowLayout();
		f.setLayout(fl);
		b.addActionListener(this);
		f.addWindowListener(
			
		new WindowAdapter(){
		public void windowClosing(WindowEvent we){
					f.dispose();	
			
				}
				
		}
		);
	}

				public void actionPerformed(ActionEvent ae){
					System.out.println("Hello");
					l.setText(ft.getText()+" "+a);
					a++;
					}
	public static void main(String...args){
		LAB7P2 l1 = new LAB7P2();
	}
			
}
				
			
	
		

