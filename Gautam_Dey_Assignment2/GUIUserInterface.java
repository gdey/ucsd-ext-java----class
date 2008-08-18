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

public class GUIUserInterface extends JFrame {
    
	private AnimalManager animalMngr;
	private final int WINDOW_WIDTH  = 800;
	private final int WINDOW_HEIGHT = 600;
	
	private JPanel     pnlMain;
	
	// For animal list
	private PanelAnimalInfo     pnlAnimalInfo;
	
	// For animal Detail 
	private PanelAnimalDetail   pnlAnimalDetail;
	
	public GUIUserInterface() {	
		
		animalMngr = new AnimalManager();
		// First let's add some Animals
		animalMngr.addTestValues();
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initGUI();
		updateGUI();
		setContentPane(pnlMain);
		pack();
		setVisible(true);
	}
	private void initGUI() {
		setTitle("Animal Register");
		setLayout(new FlowLayout());
		pnlMain = new JPanel();
	    pnlAnimalInfo = new PanelAnimalInfo();
	    pnlAnimalDetail = new PanelAnimalDetail();
	
		pnlMain.setLayout(new BorderLayout());
		pnlMain.add(pnlAnimalDetail, BorderLayout.NORTH);
		pnlMain.add(pnlAnimalInfo, BorderLayout.SOUTH);
		pnlAnimalDetail.enableAdd();
		
		// Set up the event handlers.
		pnlAnimalInfo.addActionListener(new ListListener());
		pnlAnimalDetail.addDeleteActionListener(new DeleteActionListener());
		pnlAnimalDetail.addAddActionListener(new AddActionListener());
		pnlAnimalDetail.addChangeActionListener(new ChangeActionListener());
		
	}
	private void updateGUIIndex(int index) {
		pnlAnimalInfo.update(animalMngr);
		pnlAnimalDetail.disableDelete();
		pnlAnimalDetail.disableChange();
		if(animalMngr.getNumOfItems() > index){
	 	   pnlAnimalInfo.setSelectedIndex(index);
		   pnlAnimalDetail.update(animalMngr.animals().get(index));
		   pnlAnimalDetail.enableDelete();
		   pnlAnimalDetail.enableChange();	
		}
	}
	private void updateGUI(){
		updateGUIIndex(0);
	}
    // Inner Classes
    /** 
     * Private Inner Class to handle the updating of detail when the user selects a 
     *   another animal in the list.
     */
    private class ListListener implements ListSelectionListener
	{
		public void valueChanged(ListSelectionEvent e)
		{
			int selected = pnlAnimalInfo.getSelectedIndex();
			if(animalMngr.getNumOfItems() > 0 && selected >= 0 && selected < animalMngr.getNumOfItems()){
				pnlAnimalDetail.update(animalMngr.animals().get(selected));
				pnlAnimalDetail.enableDelete();
			} else {
				pnlAnimalDetail.disableDelete();
				pnlAnimalDetail.disableChange();
			}
		}
	}
	
	/** 
	 * Private Inner Class to handle the deleation of animals from the farm.
	 */
	private class DeleteActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			animalMngr.removeIndex(pnlAnimalInfo.getSelectedIndex());
			updateGUI();
		}
	}
	/** 
	 * Private Inner Class to handle the deleation of animals from the farm.
	 */
	private class AddActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			animalMngr.addAnimal(pnlAnimalDetail.representedAnimal());
			updateGUI();
		}
	}
	/** 
	 * Private Inner Class to handle the deleation of animals from the farm.
	 */
	private class ChangeActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int index = pnlAnimalInfo.getSelectedIndex();
			animalMngr.replaceAnimalAtIndex(index, pnlAnimalDetail.representedAnimal());
			updateGUIIndex(index);
		}
	}
    // Main Function
	public static void main(String[] args) {
		GUIUserInterface fw = new GUIUserInterface();
	}
	
}
