package test1;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;

public class ViewPart1 extends ViewPart {
	boolean pressed = false;
	public static final String ID="Test1.ViewPart";

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new RowLayout(SWT.VERTICAL));
		Button setStatusLine = new Button(parent, SWT.PUSH);
		setStatusLine.setText("Set Statusline ");
		setStatusLine.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				String message = "I would like to say hello to you.";
				if (pressed) {
					message = "Thank you for using me";
				}
				setStatusLine(message);
				pressed = !pressed;
			}
		});
		Composite co = new Composite(parent, 0);
		co.setLayout(new GridLayout(2, true));
		Label l1 = new Label(co, SWT.CENTER|SWT.BORDER);
		l1.setText("ÓÃ»§Ãû:");
		Text t1 = new Text(co,SWT.LEFT);
		
		Label l2 = new Label(co, SWT.CENTER|SWT.BORDER);
		l2.setText("ÃÜ  Âë:");
		Text t2 = new Text(co,SWT.LEFT);
		Button b1 = new Button(co,SWT.CHECK);
		b1.setText("×ãÇò");
		b1.setSelection(true);
		
		Button b2 = new Button(co,SWT.CHECK);
		b2.setText("À¶Çò");
		
		Button b3 = new Button(co,SWT.CHECK);
		b3.setText("Ë®Çò");
		
	}

	private void setStatusLine(String message) {
		// Get the status line and set the text
		IActionBars bars = getViewSite().getActionBars();
		bars.getStatusLineManager().setMessage(message);
	}

	@Override
	public void setFocus() {
	}
}
