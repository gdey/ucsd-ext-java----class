/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 17 Aug 2008
 * Assignment: 2
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PanelAnimalDetail extends JPanel{
    
	private final String[] SORTS = { "Dog", "Lion", "Gifraffe","Deer","Horse", "Wolf"};
	
	private JTextField txtNickName;
	private JTextField txtNumberOfLegs;
	private JTextField txtSpeed;
	private JLabel     lblSpeed;
	private JComboBox  cmbSort;
	private JComboBox  cmbHousing;
	
	private JButton btnAdd;
	private JButton btnChange;
	private JButton btnDelete;
	
	private JRadioButton rbtnMeatEater;
	private JRadioButton rbtnPlantEater;
	private ButtonGroup  grbtnEaterType;
	private JCheckBox    chkAggressive;
	
	private JTextField txtFeedAnimal;
	private JComboBox  cmbFeed;
	private JButton    bntFeed;
	
	
	public PanelAnimalDetail() {

         JPanel pnlGrid  = new JPanel();
         pnlGrid.setLayout(new GridLayout(5,2));
         pnlGrid.setBorder(BorderFactory.createTitledBorder("Animal Border"));

     /* Now we build up the table of labels and controls. */    
         JPanel pnlRight = new JPanel();
         pnlRight.setLayout(new FlowLayout(FlowLayout.RIGHT));
         JPanel pnlLeft  = new JPanel();
         pnlLeft.setLayout(new FlowLayout(FlowLayout.LEFT));
  
        
      // Nick Name
         txtNickName = new JTextField(15);
         pnlLeft.add(new JLabel("Nick Name"));
         pnlRight.add(txtNickName);
         pnlGrid.add(pnlLeft);
         pnlGrid.add(pnlRight);
       
     // Sort
         cmbSort = new JComboBox(AnimalSort.values());
         cmbSort.addActionListener(new SortActionListener());
         pnlRight = new JPanel();
         pnlRight.setLayout(new FlowLayout(FlowLayout.RIGHT));
         pnlLeft  = new JPanel();
         pnlLeft.setLayout(new FlowLayout(FlowLayout.LEFT));
         pnlLeft.add(new JLabel("Sort"));
         pnlRight.add(cmbSort);
         pnlGrid.add(pnlLeft);
         pnlGrid.add(pnlRight);
      
     // Housing
         cmbHousing = new JComboBox(HousingType.values());
         pnlRight = new JPanel();
         pnlRight.setLayout(new FlowLayout(FlowLayout.RIGHT));
         pnlLeft  = new JPanel();
         pnlLeft.setLayout(new FlowLayout(FlowLayout.LEFT));
         pnlLeft.add(new JLabel("Housing"));
         pnlRight.add(cmbHousing);
         pnlGrid.add(pnlLeft);
         pnlGrid.add(pnlRight);

     // Number of Legs
         txtNumberOfLegs = new JTextField(4);
		 txtNumberOfLegs.setEnabled(true);
         pnlRight = new JPanel();
         pnlRight.setLayout(new FlowLayout(FlowLayout.RIGHT));
         pnlLeft  = new JPanel();
         pnlLeft.setLayout(new FlowLayout(FlowLayout.LEFT));
         pnlLeft.add(new JLabel("Number of Legs"));
         pnlRight.add(txtNumberOfLegs);
         pnlGrid.add(pnlLeft);
         pnlGrid.add(pnlRight);
       
     // Speed
     
		 txtSpeed = new JTextField(4);
		 txtSpeed.setEnabled(true);
		 lblSpeed = new JLabel("Speed");
		 pnlRight = new JPanel();
		 pnlRight.setLayout(new FlowLayout(FlowLayout.RIGHT));
		 pnlRight.add(txtSpeed);
		
		 pnlLeft = new JPanel();
		 pnlLeft.setLayout(new FlowLayout(FlowLayout.LEFT));
		 pnlLeft.add(lblSpeed);
		 pnlGrid.add(pnlLeft);
		 pnlGrid.add(pnlRight);
		
        // Reusing pnlLeft for the Command buttons.
		 pnlLeft   = new JPanel();
		 btnAdd    = new JButton("Add");
		 btnAdd.setEnabled(false);
		 pnlLeft.add(btnAdd);
		 btnChange = new JButton("Change");
		 btnChange.setEnabled(false);
		 pnlLeft.add(btnChange);
		 btnDelete = new JButton("Delete");
		 btnDelete.setEnabled(false);
		 pnlLeft.add(btnDelete);
		
		 
	    // Reusing pnlRight for the Overall Grid.
	     pnlRight = new JPanel();
	     pnlRight.setLayout(new BorderLayout()); 
	     pnlRight.add(pnlGrid,BorderLayout.NORTH);
	     pnlRight.add(pnlLeft,BorderLayout.CENTER);
		
		
		// Setup the Category Panel
		 pnlGrid  = new JPanel();
         pnlGrid.setLayout(new GridLayout(4,1));
         pnlGrid.setBorder(BorderFactory.createTitledBorder("Category"));
         
         // Setup buttons.
         rbtnMeatEater  = new JRadioButton("Meat Eater"); 
         rbtnMeatEater.setEnabled(false); 
         rbtnPlantEater = new JRadioButton("Plant Eater");
         rbtnPlantEater.setEnabled(false);
         grbtnEaterType = new ButtonGroup();
         grbtnEaterType.add(rbtnMeatEater);
         grbtnEaterType.add(rbtnPlantEater);
         chkAggressive  = new JCheckBox   ("May get aggressive"); 
         pnlGrid.add(rbtnMeatEater );
         pnlGrid.add(rbtnPlantEater);
         pnlGrid.add(chkAggressive );


      // Setup Feed selected Animal
		 JPanel pnlGrid2 = new JPanel();
		 pnlGrid2.setLayout(new GridLayout(2,1));
		// Add the Category Panel to the Overall Grid.
		 pnlGrid2.add(pnlGrid);

         txtFeedAnimal = new JTextField(20);
         txtFeedAnimal.setEnabled(false);
         cmbFeed = new JComboBox(FoodItem.values());
         cmbFeed.setEditable(true);
         bntFeed = new JButton("Feed Animal");
		 JPanel pnlContainer = new JPanel();
		 pnlContainer.setLayout(new FlowLayout(FlowLayout.CENTER));
		 
		 pnlContainer.add(cmbFeed);
		 pnlContainer.add(bntFeed);
		
		 pnlGrid = new JPanel();
		 pnlGrid.setLayout(new GridLayout(2,1));
		 pnlGrid.setBorder(BorderFactory.createTitledBorder("Feed The Selected Animal"));
		 pnlGrid.add(txtFeedAnimal);
		 pnlGrid.add(pnlContainer);
		 // Added the Feed Animal Panels.
		 pnlGrid2.add(pnlGrid);
		
         pnlLeft = new JPanel();
		 pnlLeft.setLayout(new BorderLayout());
         pnlLeft.add(pnlRight,BorderLayout.CENTER);
         pnlLeft.add(pnlGrid2,BorderLayout.EAST);

         add(pnlLeft);
    }
	public void update(Animal animal) {
		txtNickName.setText(animal.getName());
		txtNumberOfLegs.setText(""+animal.getNumberOfLegs());
		cmbHousing.setSelectedIndex(animal.getHousing().ordinal());
		cmbSort.setSelectedIndex(animal.getSort().ordinal());
		if( animal instanceof PlantEater ){
			rbtnPlantEater.setSelected(true);
			rbtnMeatEater.setSelected(false);
		} else {
			rbtnMeatEater.setSelected(true);
			rbtnPlantEater.setSelected(false);
		}
		if( animal.isAggressive() ) {
			chkAggressive.doClick();
		}
		if( animal instanceof IRunningAnimal ){
			IRunningAnimal o = (IRunningAnimal) animal;
			txtSpeed.setText(o.getSpeed()+"");
			txtSpeed.setVisible(true);
			lblSpeed.setVisible(true);
		} else {
			txtSpeed.setVisible(false);
			lblSpeed.setVisible(false);
		}
	}

	
	// This function will return an animal object as described by the view.
	public Animal representedAnimal(){
		Animal animal;
		animal = AnimalSort.values()[cmbSort.getSelectedIndex()].getAnimal(txtNickName.getText());
		animal.setHousing(HousingType.values()[cmbHousing.getSelectedIndex()]);
		animal.setIsAggressive(chkAggressive.isSelected());
		animal.setNumberOfLegs(Integer.parseInt(txtNumberOfLegs.getText()));
		if( animal instanceof IRunningAnimal ){
			IRunningAnimal o = (IRunningAnimal) animal;
			String speed = txtSpeed.getText();
			if(!speed.equals("")) {
				o.setSpeed(Integer.parseInt(speed));
			}
			animal = (Animal)o;
		}
		return animal;
	}
	public void enableAdd(){
		btnAdd.setEnabled(true);
	}
	public void enableChange(){
		btnChange.setEnabled(true);
	}
	public void enableDelete(){
		btnDelete.setEnabled(true);
	}
	public void disableAdd(){
		btnAdd.setEnabled(false);
	}
	public void disableChange(){
		btnChange.setEnabled(false);
	}
	public void disableDelete(){
		btnDelete.setEnabled(false);
	}
	public void addDeleteActionListener( ActionListener al )
	{
		btnDelete.addActionListener(al);
	}
	public void addAddActionListener( ActionListener al )
	{
		btnAdd.addActionListener(al);
	}
	public void addChangeActionListener( ActionListener al )
	{
		btnChange.addActionListener(al);
	}
	/** 
	 * Private Inner Class to handle the Changes in Sort type
	 */
	private class SortActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			update(representedAnimal());
		}
	}
}

