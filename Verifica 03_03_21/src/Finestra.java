import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Finestra extends JFrame implements ActionListener{
	private JMenuBar barra;
	private JMenu menu;
	private JMenuItem file, inserisci;
	private JComboBox combo;
	private JTable tbl;
	private DefaultTableModel tblmod;
	private JScrollPane scrlpane;
	
	public Finestra() {
		barra =  new JMenuBar();
		menu = new JMenu();
		file = new JMenuItem("file");
		inserisci = new JMenuItem("inserisci");
		combo = new JComboBox();
		Object [][] data = {};
		String[] columnNames = {"Nome", "Cognome"};
		tblmod = new DefaultTableModel(data, columnNames);
		tbl = new JTable(tblmod);
		scrlpane = new JScrollPane(tbl);
		this.setName("Sia magnanimo.");
		
		this.add(barra);
		barra.add(menu);
		menu.add(file);
		menu.add(inserisci);
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
}

