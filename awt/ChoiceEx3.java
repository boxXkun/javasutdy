package awt;

import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx3 extends MFrame
implements ItemListener{
	
	String ms[] = {"?? ??","?? ??","?̹?ȣ","??????","??????","??????"};
	String fs[] = {"???ƶ?","?̿???","???ϴ?","??ä??","?? ??","?迬??"};
	Choice name, star ;
	
	public ChoiceEx3() {
		name = new Choice();
		name.add("???ڿ?????");
		name.add("???ڿ?????");
		star = new Choice();
		
	
		inputItem(star, ms);
		add(name);
		add(star);
		star.addItemListener(this);
		validate();
		}
	
	public void inputItem(Choice c, String item[]) {
		c.removeAll();
		for (int i = 0; i < item.length; i++) {
			c.add(item[i]);
		}
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(name.getSelectedItem().equals("???ڿ?????")) {
				inputItem(star, ms);
		} else if(name.getSelectedItem().equals("???ڿ?????")){
				inputItem(star, fs);

	}
		
}
	public static void main(String[] args) {
		new ChoiceEx3();
		}

}
