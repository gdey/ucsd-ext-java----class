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
		pnlAnimalDetail.enableChange();
		
		// Set up the event handlers.
		pnlAnimalInfo.addActionListener(new ListListener());
		pnlAnimalDetail.addDeleteActionListener(new DeleteActionListener());
		pnlAnimalDetail.addAddActionListener(new AddActionListener());
		pnlAnimalDetail.addChangeActionListener(new ChangeActionListener());
		pnlAnimalDetail.addFeedAnimalActionListener(new FeedAnimalActionListener());
		
	}
	private void updateGUI(int index) {
		pnlAnimalInfo.update(animalMngr);
		pnlAnimalDetail.disableDelete();
		pnlAnimalDetail.enableChange();
	
		if(animalMngr.getNumOfItems() > index){
	 	   pnlAnimalInfo.setSelectedIndex(index);
		   pnlAnimalDetail.update(animalMngr.getElement(index));
		   pnlAnimalDetail.enableDelete();
		}
	}
	private void updateGUI(){
		updateGUI(0);
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
				pnlAnimalDetail.update(animalMngr.getElement(selected));
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
		public void actionPerformed(ActionEvent event)
		{
			Animal animal = animalMngr.getElement(pnlAnimalInfo.getSelectedIndex());
			Object[] options = {"Remove '"+animal.getName()+"'","Don't remove '"+animal.getName()+"'"};
			int n = JOptionPane.showOptionDialog(null,
			"Are you sure you want to remove "+animal.getName()+"?",
			"Remove "+animal.getName()+"?",
			JOptionPane.YES_NO_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			options,
			options[1]
			);
			if(n == 0){
				animalMngr.removeElement(pnlAnimalInfo.getSelectedIndex());
				updateGUI();
			}
		}
	}
	/** 
	 * Private Inner Class to handle the deleation of animals from the farm.
	 */
	private class AddActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			try{
				animalMngr.addElement(pnlAnimalDetail.representedAnimal());
				updateGUI();
			} catch (InvalidAnimalParamater e) {
					// Let the user know what they need to correct.
					JOptionPane.showMessageDialog(null,
						" Error on field '"+e.getField()+"': "+e.getMessage(),
						" Error: "+e.getField(), JOptionPane.ERROR_MESSAGE );			}	
		}
	}
	/** 
	 * Private Inner Class to handle the deleation of animals from the farm.
	 */
	private class ChangeActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int index = pnlAnimalInfo.getSelectedIndex();
			Animal animal = animalMngr.getElement(pnlAnimalInfo.getSelectedIndex());
			Object[] options = {"Change '"+animal.getName()+"'","Don't change '"+animal.getName()+"'"};
			int n = JOptionPane.showOptionDialog(null,
			    "Are you sure you want to change "+animal.getName()+" information?",
			    "Change "+animal.getName()+" information?",
			    JOptionPane.YES_NO_OPTION,
			    JOptionPane.QUESTION_MESSAGE,
			    null,
			    options,
			    options[1]
			);
			
			if(n == 0){ // Change the information.
			    try{
			    	animalMngr.replaceElement(index, pnlAnimalDetail.representedAnimal());
			    	updateGUI(index);
			    } catch (InvalidAnimalParamater e) {
			    	// Let the user know what they need to correct.
			    	JOptionPane.showMessageDialog(null,
			    		" Error on field '"+e.getField()+"': "+e.getMessage(),
			    		" Error: "+e.getField(), JOptionPane.ERROR_MESSAGE );
			    }
			}
			
		}
	}
	/** 
	 * Private Inner Class to handle the deleation of animals from the farm.
	 */
	private class FeedAnimalActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int    selected = pnlAnimalInfo.getSelectedIndex();
			Animal animal = animalMngr.getElement(selected);
			String food = pnlAnimalDetail.getFood();
			try{
				String msg = animal.eat(food);
				updateGUI(selected);
				pnlAnimalDetail.setFoodMessage("Meal for "+animal.getName()+":"+food);
			} catch (AnimalDontEatThisException e) {
					// Let the user know what they need to correct.
					JOptionPane.showMessageDialog(null,
						animal.getName()+" does not eat "+food+".",
						" Error: Feeding "+animal.getName(), JOptionPane.ERROR_MESSAGE );			
			}	
		}
	}
    // Main Function
	public static void main(String[] args) {
		GUIUserInterface fw = new GUIUserInterface();
	}
	
}
