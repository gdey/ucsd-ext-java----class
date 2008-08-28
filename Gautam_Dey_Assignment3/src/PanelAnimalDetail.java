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
	private JComboBox  cmbSort;
	private JComboBox  cmbHousing;
	
	private JButton btnAdd;
	private JButton btnChange;
	private JButton btnDelete;
	
	private JRadioButton rbtnMeatEater;
	private JRadioButton rbtnPlantEater;
	private ButtonGroup  grbtnEaterType;
	private JCheckBox    chkAggressive;
	
	public PanelAnimalDetail() {

         JPanel pnlGrid  = new JPanel();
         pnlGrid.setLayout(new GridLayout(4,2));
         pnlGrid.setBorder(BorderFactory.createTitledBorder("Animal Border"));

     /* Now we build up the table of labels and controls. */    
         JPanel pnlRight = new JPanel();
         pnlRight.setLayout(new FlowLayout(FlowLayout.RIGHT));
         JPanel pnlLeft  = new JPanel();
         pnlLeft.setLayout(new FlowLayout(FlowLayout.LEFT));
         JPanel pnlContainer = new JPanel();  
        
      // Nick Name
         txtNickName = new JTextField(15);
         pnlLeft.add(new JLabel("Nick Name"));
         pnlRight.add(txtNickName);
         pnlGrid.add(pnlLeft);
         pnlGrid.add(pnlRight);
       
     // Sort
         cmbSort = new JComboBox(AnimalSortType.values());
         cmbSort.addActionListener(new SortActionListener());
         pnlRight = new JPanel();
         pnlRight.setLayout(new FlowLayout(FlowLayout.RIGHT));
         pnlLeft  = new JPanel();
         pnlLeft.setLayout(new FlowLayout(FlowLayout.LEFT));
         pnlContainer = new JPanel();
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
         pnlContainer = new JPanel();
		 pnlContainer.setLayout(new FlowLayout(FlowLayout.LEFT));
         pnlLeft.add(new JLabel("Housing"));
         pnlRight.add(cmbHousing);
         pnlGrid.add(pnlLeft);
         pnlGrid.add(pnlRight);

     // Number of Legs
         txtNumberOfLegs = new JTextField(4);
		 txtNumberOfLegs.setEnabled(false);
         pnlRight = new JPanel();
         pnlRight.setLayout(new FlowLayout(FlowLayout.RIGHT));
         pnlLeft  = new JPanel();
         pnlLeft.setLayout(new FlowLayout(FlowLayout.LEFT));
         pnlContainer = new JPanel();
		 pnlContainer.setLayout(new FlowLayout(FlowLayout.LEFT));
         pnlLeft.add(new JLabel("Number of Legs"));
         pnlRight.add(txtNumberOfLegs);
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

         pnlLeft = new JPanel();
		 pnlLeft.setLayout(new BorderLayout());
         pnlLeft.add(pnlRight,BorderLayout.CENTER);
         pnlLeft.add(pnlGrid,BorderLayout.EAST);

         add(pnlLeft);
    }
	public void update(Animal animal) {
		txtNickName.setText(animal.getName());
		txtNumberOfLegs.setText(""+animal.getNumberOfLegs());
		cmbHousing.setSelectedIndex(animal.getHousing().ordinal());
		cmbSort.setSelectedIndex(indexForSort(animal.getSort().toString()));
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
	}
	/**
	 * indexForSort
	 */
	public int indexForSort(String cat) {
		for (int i=0;i<AnimalSortType.values().length;i++)
		{
			if( SORTS[i].equalsIgnoreCase(cat) ) {
				return i;
			}
		}
		return -1;
	}
	
	// This function will return an animal object as described by the view.
	public Animal representedAnimal(){
		Animal animal;
		animal = AnimalSortType.values()[cmbSort.getSelectedIndex()].getAnimal(txtNickName.getText());
		animal.setHousing(HousingType.values()[cmbHousing.getSelectedIndex()]);
		animal.setIsAggressive(chkAggressive.isSelected());
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

