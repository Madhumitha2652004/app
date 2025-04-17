import java.awt.*;
class App
{
public static void main (String args[])
{
Frame f=new Frame();
f.setTitle("NOTEPAD");
f.setSize(200,200);
f.setVisible(true);

FlowLayout f1= new FlowLayout();
f.setLayout(f1);

Label l1=new Label ("REG NO");
f.add(l1);
TextField t1=new TextField(30);
f.add(t1);
Label l2 = new Label("USER NAME");
f.add(l2);
TextField t2=new TextField(30);
f.add(t2);
Label l3 =new Label("PASSWORD");
f.add(l3);
TextField t3=new TextField(30);
f.add(t3);
l1.setBackground(Color.RED);
l2.setBackground(Color.PINK);
l3.setBackground(Color.GREEN);

Button login =new Button ("LOGIN");
f.add(login);


}
}