import java .awt.*;
class Application_Form extends Frame
{
public static void main (String  args[])
{
 Application_Form f = new Application_Form ();
f.setTitle("APPLICATION FORM");
f.setSize(800,700);
f.setVisible(true);
}
Application_Form()
{
FlowLayout fl = new FlowLayout();
this. setLayout(fl);
this.setLayout(null);

Font f0 = new Font("Arial", Font.BOLD, 20);
Font f1 = new Font("Arial", Font.BOLD, 16);

Panel p0 = new Panel();
p0.setBackground(Color.PINK); 
 
p0.setBounds(0,30,800,150); 
        
Label l0 = new Label("TAKSHASHILA UNIVERSITY");
Label l1 = new Label("(State Private University)");
Label l2 = new Label("ONGUR, TINDIVAM, VILLPURAM");
l0.setBackground(Color.PINK); 
l1.setBackground(Color.PINK); 
l2.setBackground(Color.PINK); 

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
p1.setBackground(Color.ORANGE);
p1.setBounds(0,170,790,40);
Label l3 = new Label("APPLICATION FROM");
l3.setFont(f0);
l3.setBounds(200,10,400,30);
p1.add(l3);
this.add(p1);

Label l11=new Label("ADMISSION NO");
Label l12=new Label("NAME OF CANDIATE");
Label l13=new Label("FATHER NAME");
Label l14= new Label ("DATE OF BRITH");
Label l15= new Label("GENDER");
Label l16=new Label("ADDRESS");
Label l17 = new Label ("NATIONAL");
Label l18= new Label ("SELECT COURSE ");


TextField t11= new TextField(20);
TextField t12= new TextField(20);
TextField t13= new TextField(20);

Choice dd=new Choice ();
for (int i=1;i<=31;i++)
{
dd.addItem("" + i);
}
Choice mm= new Choice();
for (int i=1;i<=12;i++)
{
mm.addItem("" + i);
}
Choice yyyy= new Choice();
for (int i=1990;i<=2025;i++)
{
yyyy.addItem("" + i);
}

CheckboxGroup cg = new CheckboxGroup(); // Correct spelling
Checkbox cb1 = new Checkbox("MALE", cg, true);
Checkbox cb2 = new Checkbox("FEMALE", cg, false);

TextArea ta = new TextArea (20,5);

Choice c1= new Choice ();
c1.addItem("SELECT");
c1.addItem("INDIA");
c1.addItem("KOREAN");
c1.addItem("THAILAND");
c1.addItem("CHINA");
c1.addItem("JAPAN");
c1.addItem("OTHER");

Checkbox ck1= new Checkbox("BCA");
Checkbox ck2= new Checkbox("MCA");
Checkbox ck3= new Checkbox("B.SC AML");
Checkbox ck4= new Checkbox("MBA");


this.add(l11);
this.add(l12);
this.add(l13);
this.add(l14);
this.add(l15);
this.add(l16);
this.add(l17);
this.add(l18);

this.add(t11);
this.add(t12);
this.add(t13);

this.add(dd);
this.add(mm);
this.add(yyyy);

this.add(cb1);
this.add(cb2);

this.add(ta);

this.add(c1);

this.add(ck1);
this.add(ck2);
this.add(ck3);
this.add(ck4);

l11.setBounds(100, 220, 150, 25);
l12.setBounds(100, 260, 150, 25);
l13.setBounds(100, 300, 150, 25);
l14.setBounds(100, 360, 150, 25);
l15.setBounds(100, 400, 150, 25);
l16.setBounds(100, 440, 150, 25);
l17.setBounds(100, 550, 150, 25);
l18.setBounds(100, 590, 150, 25);

t11.setBounds(270, 220, 200, 25);
t12.setBounds(270, 260, 200, 25);
t13.setBounds(270, 300, 200, 25);

dd.setBounds(270, 340, 50, 25);
mm.setBounds(330, 340, 50, 25);
yyyy.setBounds(390, 340, 70, 25);

cb1.setBounds(270, 400, 70, 25);
cb2.setBounds(350, 400, 80, 25);

ta.setBounds(270, 440, 300, 100);

c1.setBounds(270, 550, 200, 25);

ck1.setBounds(270, 590, 100, 25);
ck2.setBounds(370, 590, 100, 25);
ck3.setBounds(270, 620, 100, 25);
ck4.setBounds(370, 620, 100, 25);




Button b1 = new Button ("SUBMIT");
b1.setBounds(500, 600, 200, 30);
this.add(b1);


}
}
