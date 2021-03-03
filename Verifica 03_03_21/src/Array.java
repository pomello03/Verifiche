import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

public class Array extends ArrayList <Persona>{
	public Array() {
	}
	
	public String creaCsv() {
		String csv= "";
		for(int i=0; i<this.size(); i++) { 
			csv+= this.get(i).getNome() + ";" + this.get(i).getCognome() + ";" + this.get(i).getCodfiscale() + this.get(i).getNascita() + "\n";
		}
		return csv;
	}
	
	public void creaFile (JFrame finestra) throws IOException {
		JFileChooser ciuser= new JFileChooser();
		ciuser.setFileFilter( new TxtFileFilter() );
		int n = ciuser.showSaveDialog( finestra );
		if ( n==JFileChooser.APPROVE_OPTION ) {
			File f= ciuser.getSelectedFile();
			FileWriter fw= new FileWriter(f);
			fw.write(this.creaCsv());
			fw.flush();
			fw.close();
		}
	}

}

