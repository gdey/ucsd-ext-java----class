/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 17 Aug 2008
 * Assignment: 3
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import javax.swing.text.*;


public class PositiveIntegerOnlyTextField extends JTextField {
 
     public PositiveIntegerOnlyTextField(int cols) {
         super(cols);
     }
 
     protected Document createDefaultModel() {
 	      return new PositiveIntegerOnlyDocument();
     }
 
     static class PositiveIntegerOnlyDocument extends PlainDocument {
 
         public void insertString(int offs, String str, AttributeSet a) 
 	          throws BadLocationException {
 			  
 	          if (str == null)
 		         return;
 	          // First let's transform it into an integer.
			  int i;
			  try{
				i = Integer.parseInt(str);
			  } catch (NumberFormatException e) {
				// if it not an integer we don't care about it.
			     return;	
			  }
 	          if( i < 0)
                 return;
 	          super.insertString(offs, new String(str), a);
 	      }
     }
 }

