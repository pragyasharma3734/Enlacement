/**
 * 
 */
package enlacement;

import javax.swing.table.AbstractTableModel;

/**
 * @author Pragya Sharma
 *
 */
public class MyTableModel extends AbstractTableModel{
	private final String[][] data;
	private final Object[] columnNames;
	public MyTableModel(String[][] d,Object[] cn) {
		data=d;
		columnNames=cn;
	}
	
	public boolean isCellEditable(int row,int col) {
		return false;
	}
	
	public int getRowCount() {
		return data.length;
		}
	
	public int getColumnCount() {
		return columnNames.length;
	}
	
	public Object getValueAt(int rowIndex,int columnIndex) {
		return data[rowIndex][columnIndex];
	}
	
	public String getColumnName(int col) {
		return (String)columnNames[col];
	}
}
