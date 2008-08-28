/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 17 Aug 2008
 * Assignment: 2
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class PanelAnimalInfo extends JPanel {
   
	JList list;
	JLabel lblCount;
	DefaultListModel model;
	
    public PanelAnimalInfo() {
		setLayout(new BorderLayout());
		model = new DefaultListModel();
		list = new JList(model);
		JScrollPane pane = new JScrollPane(list);
		setBorder(BorderFactory.createTitledBorder("Animals in this Farm."));
		add(pane, BorderLayout.NORTH);
		
		// Create Label.
		JLabel lblAnimalCount = new JLabel("Total number of animals");
		JPanel pnlAnimalCount = new JPanel();
		pnlAnimalCount.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pnlAnimalCount.add(lblAnimalCount);
		lblCount = new JLabel(""+model.size());
		add(pnlAnimalCount, BorderLayout.CENTER);
		add(lblCount,BorderLayout.EAST);
    }


	public void update(AnimalManager animalManager) {
		model.clear();
		for (Animal animal : animalManager.animals() )
		{
			model.addElement(animal);
		}
		lblCount.setText(""+model.size());
	}
	
	public boolean isSelected(){
		return !list.isSelectionEmpty();
	}
	public void setSelectedIndex( int index ) {
		list.setSelectedIndex(index);
	}
	public int getSelectedIndex() {
		return list.getSelectedIndex();
	}

	public void addActionListener(ListSelectionListener lsl)
	{
		list.addListSelectionListener(lsl);
	}
}

