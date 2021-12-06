/**
 * 
 */
package enlacement;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextArea;
import javax.swing.table.TableCellRenderer;

import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

/**
 * @author Pragya Sharma
 *
 */
public class MultipleLine extends JTextArea implements TableCellRenderer{
	private List<List<Integer>> rowColHeight=new ArrayList<>();
	public MultipleLine() {
		setLineWrap(true);
		setWrapStyleWord(true);
		setOpaque(true);
	}
	
	public Component getTableCellRendererComponent(JTable table ,Object value,boolean isSelected , boolean hasFocus,int row, int column) {
		setText((value==null)?"":value.toString());
		setEditable(false);
//		adjustRowHeight(table,row,column);
		table.setRowHeight(100);
		return this;
	}
}
