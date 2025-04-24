import java .awt.*;
class Tak_Mark extends Frame
{
public static void main (String  args[])
{
Tak_Mark f = new Tak_Mark();
f.setTitle("TAKSHASHILA");
f.setSize(500,500);
f.setVisible(true);
}
Tak_Mark()
{
FlowLayout fl = new FlowLayout();
this. setLayout(fl);
this.setLayout(null);

Font f0 = new Font("Arial", Font.BOLD, 20);
Font f1 = new Font("Arial", Font.BOLD, 16);

Panel p0 = new Panel();
p0.setBackground(Color.RED); 
 
p0.setBounds(0,30,800,150); 
        
Label l0 = new Label("TAKSHASHILA UNIVERSITY");
Label l1 = new Label("(State Private University)");
Label l2 = new Label("ONGUR, TINDIVAM, VILLPURAM");
l0.setBackground(Color.RED); 
l1.setBackground(Color.RED); 
l2.setBackground(Color.RED); 

l0.setFont(f0);
l1.setFont(f1);
l2.setFont(f1);
l0.setBounds(100, 50, 400, 30);
l1.setBounds(150, 80, 300, 25);
l2.setBounds(130, 110, 350, 25);
this.add(l0);
this.add(l1);
this.add(l2);
this.add(p0);

Panel p1 = new Panel();
p1.setBackground(Color.PINK);
p1.setBounds(0,170,790,40);
Label l3 = new Label("STUDENT MARK LIST");
l3.setFont(f0);
l3.setBounds(200,10,400,30);
p1.add(l3);
this.add(p1);

Label l11=new Label("ENROLLMENT NO");
Label l12=new Label("STUDENT NAME");
Label l13=new Label("JAVA MARK");
Label l14=new Label("CN MARK");
Label l15=new Label("OS MARK");
Label l16=new Label("TOTAL MARK");
Label l17=new Label("AVERAGE MARK");

TextField t11= new TextField(20);
TextField t12= new TextField(20);
TextField t13= new TextField(20);
TextField t14= new TextField(20);
TextField t15= new TextField(20);
TextField t16= new TextField(20);
TextField t17= new TextField(20);

Button b1 = new Button ("SUBMIT");

this.add(l11);
this.add(l12);
this.add(l13);
this.add(l14);
this.add(l15);
this.add(l16);
this.add(l17);
this.add(t11);
this.add(t12);
this.add(t13);
this.add(t14);
this.add(t15);
this.add(t16);
this.add(t17);
this.add(b1);

l11.setBounds(100, 220, 150, 25);
l12.setBounds(100, 260, 150, 25);
l13.setBounds(100, 300, 150, 25);
l14.setBounds(100, 340, 150, 25);
l15.setBounds(100, 380, 150, 25);
l16.setBounds(100, 420, 150, 25);
l17.setBounds(100, 460, 150, 25);

t11.setBounds(270, 220, 200, 25);
t12.setBounds(270, 260, 200, 25);
t13.setBounds(270, 300, 200, 25);
t14.setBounds(270, 340, 200, 25);
t15.setBounds(270, 380, 200, 25);
t16.setBounds(270, 420, 200, 25);
t17.setBounds(270, 460, 200, 25);

b1.setBounds(220, 510, 100, 30);

}
}

