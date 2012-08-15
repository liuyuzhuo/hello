package test1;



import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class MyView extends ViewPart {
	public static final String ID = "Test1.MyView";
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout());
		Text t = new Text(parent,SWT.NONE);
		t.setText("this is my text!");
		t.setBackground(new Color(Display.getCurrent(),new RGB(10,255,50)));
		Label text = new Label(parent, SWT.BORDER);
		text.setText("Imagine");
		Button b=new Button(parent,SWT.NONE);
		b.setVisible(true);
		b.setSize(50, 50);
		b.setText("abc");
		String[] arr = {"³¤É³","Îäºº","ÄÏ²ý"};
		Combo cb = new Combo(parent,Combo.LIMIT);
		cb.setItems(arr);
//		cb.setSelection(new Point(0,0));
//		cb.setCapture(true);
		cb.select(0);
		cb.setFocus();
	}

	@Override
	public void setFocus() {
	}
}