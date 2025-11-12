
import java.awt.event.*;
import java.awt.*;
class LAB7P1{
	public static void main(String...args){
	final int a[] = {1};
	Frame f = new Frame();
	TextField ft = new TextField(20);
	// or tf.setColumn(20);
	Button b = new Button();
	b.setLabel("click");
	b.setSize(10,20);
	Label l = new Label();
	l.setPreferredSize(new Dimension(100,100));
	
	f.add(b);
	f.add(ft);
	f.add(l);
	f.setSize(400,400);
	f.setVisible(true);
	FlowLayout fl = new FlowLayout();
	f.setLayout(fl);
	b.addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				//System.out.println("Hello");
				l.setText(ft.getText()+" "+a[0]);
				a[0]++;
			}
		}
	
	);
	f.addWindowListener(
		new WindowAdapter(){
			public void windowClosing(WindowEvent we){
			f.dispose();	
			
			}
	
		}
	);	
	
	}

}
