import javax .swing.*;
class swing_menu extends JFrame
{
public static void main (String args[])
{
swing_menu f=new swing_menu();
f.setTitle("NOTEPAD");
f.setSize(600,600);
f.setVisible(true);

}
swing_menu()

{
JMenuBar mb=new JMenuBar();
JMenu file = new JMenu("FILE");
JMenu edit=new JMenu("EDIT");
JMenuItem m1= new JMenuItem("NEW");
JMenuItem m2= new JMenuItem("OPEN");
JMenuItem m3= new JMenuItem("CUT");
JMenuItem m4= new JMenuItem("COPY");
file.add(m1);
file.add(m2);
edit.add(m3);
edit.add(m4);
mb.add(file);
mb.add(edit);
setJMenuBar(mb);

this.add  (mb);
JTextArea ta = new JTextArea(20,50);
this.add(ta);
}
}