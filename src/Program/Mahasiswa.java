/*
 * Copyrigth (c) 2018, All right reserved
 * Written by tauf21, email : taufik.amary@gmail.com
 * Github : tauf21
 */

package Program;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Taufik Amaryansyah
 */
public class Mahasiswa {
    
    private DefaultTableModel tabel = new DefaultTableModel();
    public Mahasiswa(){
//        getTabel().addColumn("No");
        getTabel().addColumn("NIM");
        getTabel().addColumn("Nama");
        getTabel().addColumn("Program Study");
        getTabel().addColumn("Alamat");
        
    }

    public DefaultTableModel getTabel() {
        return tabel;
    }

    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
    
    
}
