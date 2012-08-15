package test1;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
        layout.addView(MyView.ID, IPageLayout.LEFT,1.0f, layout.getEditorArea());
        layout.addView(MyView1.ID, IPageLayout.LEFT,1.0f, layout.getEditorArea());
        //layout.addView(OpenDialog.ID, IPageLayout.LEFT,1.0f, layout.getEditorArea());
	}
}
