import javax.swing.*
import java.awt.*
import java.awt.Graphics2D
import java.awt.event.*
import butt..buttonx
import javax.swing.filechooser.FileFilter
import javax.swing.filechooser.FileNameExtensionFilter
import java.net.*
import java.io.*
import truth_part.*

class backp extends JPanel{
  override def paintComponent(g: Graphics)={
   super.paintComponent(g)
   val g2 : Graphics2D = (Graphics2D)g
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)
        g2.setPaint(new GradientPaint(getWidth(), getHeight() / 2, new Color(240, 240, 240), getWidth(), getHeight(), new Color(250, 250, 250)))
        g2.fillRect(0, 0, getWidth(), getHeight())
        g2.setFont(new Font("Impact", Font.BOLD, 29))
        g2.setColor(new Color(32, 32, 32))
        g2.drawString("Resume.io", getWidth() / 2 - 80, 60)
 }
}

object resume_io{
   def setdefault_cur(comp : JComponent)={
   comp.setCursor(new Cursor(Cursor.HAND_CURSOR))
}
  def openLink(p:JFrame, link:String)={
      try{
         val desk : Desktop = Desktop.getDesktop()
         desk.browse(new URI(link))
      }
      catch{
         case e:Exception=>{
            JOptionPane.showMessageDialog(p, e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE)
}
}
}
def writeHTML(p:JFrame, file_name:String, data:String)={
   try{
      val fw : FileWriter = new FileWriter(file_name)
       val bw :BufferedWriter = new BufferedWriter(fw)
      bw.write(data)
      bw.close()
      fw.close()
  }
catch{
  case e:IOException=>{
      JOptionPane.showMessageDialog(p, e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE)
}
}
}

def main(args:Array[String])={
   val f:JFrame = new JFrame()
    val dx : Int = Toolkit.getDefaultToolkit().getScreenSize().width
    val dy:Int = Toolkit.getDefaultToolkit().getScreenSize().height
    val p :backup = new backup()
    val close : JLabel = new JLabel("x")
        close.setFont(new Font("Calibri", Font.BOLD, 18))
        close.setForeground(new Color(32, 32, 32))
        close.setBounds(dx - 180, 0, 129, 129)
        close.addMouseListener(new MouseAdapter() {
            override def mouseEntered(e:MouseEvent)={
                super.mouseEntered(e)
                close.setFont(new Font("Calibri", Font.BOLD, 28))
                close.setForeground(new Color(255, 255, 0))
            }
           override def mouseExited(e : MouseEvent)= {
                super.mouseExited(e)
                close.setFont(new Font("Calibri", Font.BOLD, 18))
                close.setForeground(new Color(32, 32, 32))
            }
            override def mouseClicked(e: MouseEvent)= {
                super.mouseClicked(e)
                f.dispose()
            }
        })
        close.setVisible(true)
      val sp1:JPanel = new JPanel()
              sp1.setBounds(10, 120, dx - 30, dy - 280)
        sp1.setLayout(null)
        sp1.setBackground(new Color(199, 199, 199))
        sp1.setVisible(true)
   val labs = new Array[JLabel](10)
   val labs_s = Array("Summary", "Work Experience", "Latest Education", "GPA", "Projects", "Profile Pic", "Address", "Mobile No", "Languages", "Links")
   val labs_x = Array(20, 20, 20, 740, 20, 20, 20, 440, 740, 998)
   val labs_y=Array(10, 90, 170, 170, 260, 350, 400, 440, 340, 340)
   val t1:JTextArea = new JTextArea()
   val t2:JTextArea = new JTextArea()
   val t3 :JTextField = new JTextField()
  val t4: JTextField = new JTextField()
    val t5:JTextArea = new JTextArea()
   val t6: JTextField = new JTextField()
    val t7:JTextArea = new JTextArea()
  val t8: JTextField = new JTextField()
  val t9: JTextField = new JTextField()
  val t10: JTextField = new JTextField()
  val t11: JTextField = new JTextField()
  val t12: JTextField = new JTextField()
  val panel_ceo : JPanel = new JPanel()
  val s1 = new JScrollPane(t1)
          s1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS)
          s1.setVisible(true)
   val s2 = new JScrollPane(t2)
        s2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS)
        s2.setVisible(true)

 val s3=new JScrollPane(t3)
      s3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS)
      s3.setVisible(true)

       s1.setBorder(null)
        s2.setBorder(null)
        s3.setBorder(null)
        s4.setBorder(null)

        t3.setBorder(null)
        t4.setBorder(null)
        t6.setBorder(null)
        t8.setBorder(null)
        t9.setBorder(null)
        t10.setBorder(null)
        t11.setBorder(null)
        t12.setBorder(null)

        t1.setBackground(new Color(250, 250, 250))
        t2.setBackground(new Color(250, 250, 250))
        t3.setBackground(new Color(250, 250, 250))
        t4.setBackground(new Color(250, 250, 250))
        t5.setBackground(new Color(250, 250, 250))
        t5.setBackground(new Color(250, 250, 250))
        t6.setBackground(new Color(250, 250, 250))
        t7.setBackground(new Color(250, 250, 250))
        t8.setBackground(new Color(250, 250, 250))
        t9.setBackground(new Color(250, 250, 250))
        t10.setBackground(new Color(250, 250, 250))
        t11.setBackground(new Color(250, 250, 250))
        t12.setBackground(new Color(250, 250, 250))

        t1.setForeground(Color.BLACK)
        t2.setForeground(Color.BLACK)
        t3.setForeground(Color.BLACK)
        t4.setForeground(Color.BLACK)
        t5.setForeground(Color.BLACK)
        t6.setForeground(Color.BLACK)
        t7.setForeground(Color.BLACK)
        t8.setForeground(Color.BLACK)
        t9.setForeground(Color.BLACK)
        t10.setForeground(Color.BLACK)
        t11.setForeground(Color.BLACK)
        t12.setForeground(Color.BLACK)

        t1.setFont(new Font("Calibri", Font.PLAIN, 12))
        t2.setFont(new Font("Calibri", Font.PLAIN, 12))
        t3.setFont(new Font("Calibri", Font.PLAIN, 12))
        t4.setFont(new Font("Calibri", Font.PLAIN, 12))
        t5.setFont(new Font("Calibri", Font.PLAIN, 12))
        t6.setFont(new Font("Calibri", Font.PLAIN, 12))
        t7.setFont(new Font("Calibri", Font.PLAIN, 12))
        t8.setFont(new Font("Calibri", Font.PLAIN, 12))
        t9.setFont(new Font("Calibri", Font.PLAIN, 12))
        t10.setFont(new Font("Calibri", Font.PLAIN, 12))
        t11.setFont(new Font("Calibri", Font.PLAIN, 12))
        t12.setFont(new Font("Calibri", Font.PLAIN, 12))

        s1.setBounds(140, 10, 800, 40)
        s2.setBounds(140, 90, 600, 40)
        t3.setBounds(140, 170, 400, 20)
        t4.setBounds(880, 170, 30, 20)
        s3.setBounds(140, 260, 800, 40)
        t6.setBounds(140, 350, 300, 30)
        s4.setBounds(140, 400, 400, 40)
        t8.setBounds(580, 440, 130, 20)
        t9.setBounds(900, 340, 80, 20)
        t10.setBounds(900, 370, 80, 20)
        t11.setBounds(1158, 340, 130, 20)
        t12.setBounds(1158, 370, 130, 20)

        t6.setEditable(false)

        t1.setVisible(true)
        t2.setVisible(true)
        t3.setVisible(true)
        t4.setVisible(true)
        t5.setVisible(true)
        t6.setVisible(true)
        t7.setVisible(true)
        t8.setVisible(true)
        t9.setVisible(true)
        t10.setVisible(true)
        t11.setVisible(true)
        t12.setVisible(true)
        val x=0
        while(x<10)
         {
                   labs(x)= new JLabel(lab_s(x))
                   labs(x).setBounds(labs_x(x), labs_y(x), 120, 20)
                   labs(x).setBackground(new Color(0, 0, 0))
            labs(x).setForeground(new Color(32, 32, 32))
            labs(x).setFont(new Font("Calibri", Font.PLAIN, 12))
            labs(x).setVisible(true)
            sp1.add(labs(x))
            x=x+1
     }
      val n1 : JLabel = new JLabel("Name")
        n1.setBounds(1100, 20, 120, 20)
        n1.setBackground(new Color(0, 0, 0))
        n1.setForeground(new Color(32, 32, 32))
        n1.setFont(new Font("Calibri", Font.PLAIN, 12))
        n1.setVisible(true)
        val n2 : JLabel = new JLabel("Last")
        n2.setBounds(1100, 90, 120, 20)
        n2.setBackground(new Color(0, 0, 0))
        n2.setForeground(new Color(32, 32, 32))
        n2.setFont(new Font("Calibri", Font.PLAIN, 12))
        n2.setVisible(true)

        val n3 : JLabel = new JLabel("Email")
        n3.setBounds(1100, 170, 120, 20)
        n3.setBackground(new Color(0, 0, 0))
        n3.setForeground(new Color(32, 32, 32))
        n3.setFont(new Font("Calibri", Font.PLAIN, 12))
        n3.setVisible(true)

       
        val et1 : JTextField = new JTextField()
        et1.setBounds(1180, 20, 110, 20)
        et1.setBackground(new Color(250, 250, 250))
        et1.setForeground(Color.BLACK)
        et1.setFont(new Font("Calibri", Font.PLAIN, 12))
        et1.setVisible(true)
        et1.setBorder(null)

        val et2 : JTextField = new JTextField()
        et2.setBounds(1180, 90, 110, 20)
        et2.setBackground(new Color(250, 250, 250))
        et2.setForeground(Color.BLACK)
        et2.setFont(new Font("Calibri", Font.PLAIN, 12))
        et2.setVisible(true)
        et2.setBorder(null)

        val et3 : JTextField= new JTextField()
        et3.setBounds(1180, 170, 110, 20)
        et3.setBackground(new Color(250, 250, 250))
        et3.setForeground(Color.BLACK)
        et3.setFont(new Font("Calibri", Font.PLAIN, 12))
        et3.setVisible(true)
        et3.setBorder(null)

        val sv : JLabel = new JLabel("Save Type:")
        sv.setBounds(dx / 2 - 230, dy - 110, 110, 20)
        sv.setForeground(Color.BLACK)
        sv.setFont(new Font("Arial", Font.PLAIN, 12))
        sv.setVisible(true)

        val cb  : JComboBox= new JComboBox(new String[]{"HTML(Not a Language)"})
        cb.setBounds(dx / 2 - 130, dy - 110, 180, 20)
        cb.setFont(new Font("Arial", Font.PLAIN, 12))
        cb.setBackground(new Color(250, 250, 250))
        cb.setForeground(Color.BLACK)
        cb.setVisible(true)
        
        val cb1 : JComboBox = new JComboBox(new String[]{"White Mode", "Black Mode"})
        cb1.setBounds(30, dy-110, 110, 20)
        cb1.setFont(new Font("Arial", Font.PLAIN, 12))
        cb1.setBackground(new Color(250, 250, 250))
        cb1.setForeground(Color.BLACK)
        cb1.setVisible(true)         

 val lx : JLabel = new JLabel("We love CEO only.")
        lx.setBounds(10, dy-60, 611, 20)
        lx.setFont(new Font("Arial", Font.PLAIN, 9))
        lx.setBackground(new Color(250, 250, 250))
        lx.setForeground(Color.BLACK)
        resume_io.setdefault_cur(lx)
        lx.setVisible(true)
        lx.addMouseListener(new MouseAdapter()
        {
            override def
mouseEntered(e: MouseEvent) =
           {
               super.mouseEntered(e)
               lx.setForeground(new Color(255, 255, 0))
           }
          override def mouseExited(e: MouseEvent)=
           {
               super.mouseExited(e)
               lx.setForeground(Color.BLACK)
           }
      
         override def mouseClicked(e : MouseEvent)=
         {
             super.mouseClicked(e)
             panel_ceo.setVisible(true)
         }
        })
        
        
        val cp :JLabel = new JLabel("Simply @Pranav Corp")
        cp.setBounds(dx / 2 - 40, dy - 60, 140, 20)
        cp.setForeground(Color.BLACK)
        cp.setFont(new Font("Arial", Font.PLAIN, 12))
        resume_io.setdefault_cur(cp)
        cp.setVisible(true)
        cp.addMouseListener(new MouseAdapter() {
            override def mouseEntered(e: MouseEvent)={
                super.mouseEntered(e)
                cp.setFont(new Font("Arial", Font.BOLD, 12))
                cp.setForeground(new Color(255, 255, 0))
            }

             override def mouseExited(e: MouseEvent) {
                super.mouseExited(e)
                cp.setFont(new Font("Arial", Font.PLAIN, 12))
                cp.setForeground(Color.BLACK)
            }
            override def mouseClicked(e:MouseEvent) {
                super.mouseClicked(e)
                resume_io.open_Link(f, "https://github.com/Pranav00771")
            }
        })        

       val br  : buttonx= new buttonx("Browse")
        br.setBounds(460, 350, 100, 29)
        br.setVisible(true)
        br.addMouseListener(new MouseAdapter() {
            override def mouseClicked(e: MouseEvent) {
                super.mouseClicked(e)
                val fc :JFileChooser= new JFileChooser()
               val fx1 = new FileNameExtensionFilter("JPG Files", "jpg", "jpeg")
               val fx2 = new FileNameExtensionFilter("PNG Files", "png", "png")
                fc.addChoosableFileFilter(fx1)
                fc.addChoosableFileFilter(fx2
                fc.setVisible(true)
                if (fc.showOpenDialog(f) == JFileChooser.APPROVE_OPTION) {
                    t6.setText(fc.getSelectedFile().getAbsolutePath())
                }

            }
        })

        val gl : JLabel = new JLabel("GRE/GMAT/SAT Score:")
        gl.setBounds(740, 440, 190, 20)
        gl.setBackground(new Color(0, 0, 0))
        gl.setForeground(new Color(32, 32, 32))
        gl.setFont(new Font("Calibri", Font.PLAIN, 12))
        gl.setVisible(true)
        val gt  : JTextField= new JTextField()
        gt.setBounds(900, 440, 40, 20)
        gt.setBackground(new Color(250, 250, 250))
        gt.setForeground(new Color(109, 99, 99))
        gt.setFont(new Font("Calibri", Font.PLAIN, 12))
        gt.setVisible(true)
        gt.setText("e.g 338")
        gt.setBorder(null)
        gt.addMouseListener(new MouseAdapter(){
            override def mouseClicked(e:MouseEvent)
            {
                super.mouseClicked(e)
                if(gt.getText()!= "")
                {
                gt.setText("")
                gt.setForeground(Color.BLACK)
                }
            }
        })

      val save : buttonx= new buttonx("Generate")
        save.setBounds(dx / 2 + 100, dy - 110, 110, 29)
        save.setVisible(true)
        save.addMouseListener(new MouseAdapter() {
           
            override def mouseClicked(e : MouseEvent) {
                super.mouseClicked(e)
                val fn  : String= et1.getText()+".io.html"
                if (t1.getText().length() > 0 && t2.getText().length() > 0 && t3.getText().length() > 0 && t4.getText().length() > 0 && t5.getText().length() > 0 && t6.getText().length() > 0 && t7.getText().length() > 0 && t8.getText().length() > 0 && t9.getText().length() > 0 && t10.getText().length() > 0 && t11.getText().length() > 0 && t12.getText().length() > 0
                        && et1.getText().length() > 0 && et2.getText().length() > 0 && et3.getText().length() > 0 && gt.getText().length() > 0 && cb.getSelectedItem().toString().length() > 0) {
                   
                    if(cb.getSelectedItem().toString().length() > 0)
                    {
                        if(cb1.getSelectedItem().toString().equals("White Mode"))
                        {
                        val write_dat_white : String="<html><head><title>"+et1.getText()+" "+et2.getText()+"</title></head><script language='javascript'>"+"function ig_o(x){ x.style='border-radius:60pxwidth:110height:110position:absoluteleft:10%top:10%'}"+"\nig_l=function(x){x.style='border-radius:60pxwidth:100height:100position:absoluteleft:10%top:10%'}"+"\nfunction t_o(x){x.style='font-family:Calibrifont-size:31pxcolor:#000000position:absoluteleft:10%top:25%'}"+"\nt_l=function(x){"+"x.style='font-family:Calibrifont-size:29pxcolor:#000000position:absoluteleft:10%top:25%'}"+"</script>"+"<body style='background:linear-gradient(rgb(235, 235, 235), rgb(250, 250, 250))background:-webkit-linear-graddient(rgb(235, 235, 235), rgb(250, 250, 250))background:-moz-linear-graddient(rgb(235, 235, 235), rgb(250, 250, 250))width:100%height:100%'>"+"<img src='"+t6.getText()+"' style='border-radius:60pxwidth:100height:100position:absoluteleft:10%top:10%' onmouseover='ig_o(this)' onmouseout='ig_l(this)'/>"+"<h2 style='font-family:Calibrifont-size:29pxcolor:#000000position:absoluteleft:10%top:25%' onmouseover='t_o(this)' onmouseout='t_l(this)'>"+et1.getText()+" "+et2.getText()+"</h2>"+"<p style='font-family:Arialfont-size:12pxcolor:#000000position:absoluteleft:82%top:10%'>"+t7.getText()+"</p>"+"<p style='font-family:Arialfont-size:12pxcolor:#000000position:absoluteleft:82%top:15%'>"+et3.getText()+"</p>"+"<p style='font-family:Arialfont-size:11pxcolor:#000000position:absoluteleft:82%top:20%'>"+t8.getText()+"</p>"+"<h2 style='font-family:Arialfont-size:20pxcolor:#000000position:absoluteleft:40%top:35%'><u>Summary</u></h2>"+"<textarea style='font-family:Arialfont-size:13pxcolor:#000000position:absoluteleft:30%top:45%width:600pxheight:110px'>"+t1.getText()+"</textarea>"+"<h2 style='font-family:Arialfont-size:20pxcolor:#000000position:absoluteleft:40%top:65%'><u>Work Experience</u></h2>"+"<p style='font-family:Arialfont-size:13pxcolor:#000000position:absoluteleft:30%top:75%'>"+t2.getText()+"</p>"+"<h2 style='font-family:Arialfont-size:20pxcolor:#000000position:absoluteleft:40%top:95%'><u>Education</u></h2>"+"<p style='font-family:Arialfont-size:13pxcolor:#000000position:absoluteleft:30%top:105%'>"+t3.getText()+"</p><p style='font-family:Arialfont-size:11pxcolor:#000000position:absoluteleft:70%top:105%'>"+t4.getText()+" GPA</p>"+"<h2 style='font-family:Arialfont-size:20pxcolor:#000000position:absoluteleft:40%top:125%'><u>Projects</u></h2>"+"<p style='font-family:Arialfont-size:13pxcolor:#000000position:absoluteleft:30%top:135%'>"+t5.getText()+"</p>"+"<h3 style='font-family:Arialfont-size:13pxcolor:#000000position:absoluteleft:20%top:155%'><u>Languages</u></h2>"+"<p style='font-family:Arialfont-size:11pxcolor:#000000position:absoluteleft:23%top:160%'>"+t9.getText()+"</p><p style='font-family:Arialfont-size:11pxcolor:#000000position:absoluteleft:23%top:165%'>"+t10.getText()+"</p>"+"<h3 style='font-family:Arialfont-size:13pxcolor:#000000position:absoluteleft:80%top:155%'><u>Links</u></h2>"+"<p style='font-family:Arialfont-size:11pxcolor:#000000position:absoluteleft:82%top:160%'>"+t11.getText()+"</p><p style='font-family:Arialfont-size:11pxcolor:#000000position:absoluteleft:82%top:165%'>"+t12.getText()+"</p>"+"<h3 style='font-family:Arialfont-size:13pxcolor:#000000position:absoluteleft:20%top:180%'><u>GRE/GMAT/SAT Score</u></h2>"+"<p style='font-family:Arialfont-size:11pxcolor:#000000position:absoluteleft:23%top:185%'>"+gt.getText()+"</p>"+"<p style='font-family:Arialfont-size:11pxposition:absoluteleft:40%top:200%color:#000000'>Securing Self.</p></body>"+"</html>"
                        resume_io.writeHTML_(f, fn, write_dat_white)
                        }
                        else
                        {
                            if(cb1.getSelectedItem().toString().equals("Black Mode"))
                            {
                               val write_dat_black : String="<html><head><title>"+et1.getText()+" "+et2.getText()+"</title></head><script language='javascript'>"+"function ig_o(x){ x.style='border-radius:60pxwidth:110height:110position:absoluteleft:10%top:10%'}"+"\nig_l=function(x){x.style='border-radius:60pxwidth:100height:100position:absoluteleft:10%top:10%'}"+"\nfunction t_o(x){x.style='font-family:Calibrifont-size:31pxcolor:#ffffffposition:absoluteleft:10%top:25%'}"+"\nt_l=function(x){"+"x.style='font-family:Calibrifont-size:29pxcolor:#ffffffposition:absoluteleft:10%top:25%'}"+"</script>"+"<body style='background:linear-gradient(rgb(39, 39, 39), rgb(79, 79, 79))background:-webkit-linear-graddient(rgb(39, 39, 39), rgb(79, 79, 79))background:-moz-linear-graddient(rgb(39, 39, 39), rgb(79, 79, 79))width:100%height:100%'>"+"<img src='"+t6.getText()+"' style='border-radius:60pxwidth:100height:100position:absoluteleft:10%top:10%' onmouseover='ig_o(this)' onmouseout='ig_l(this)'/>"+"<h2 style='font-family:Calibrifont-size:29pxcolor:#ffffffposition:absoluteleft:10%top:25%' onmouseover='t_o(this)' onmouseout='t_l(this)'>"+et1.getText()+" "+et2.getText()+"</h2>"+"<p style='font-family:Arialfont-size:12pxcolor:#ffffffposition:absoluteleft:82%top:10%'>"+t7.getText()+"</p>"+"<p style='font-family:Arialfont-size:12pxcolor:#ffffffposition:absoluteleft:82%top:15%'>"+et3.getText()+"</p>"+"<p style='font-family:Arialfont-size:11pxcolor:#ffffffposition:absoluteleft:82%top:20%'>"+t8.getText()+"</p>"+"<h2 style='font-family:Arialfont-size:20pxcolor:#ffffffposition:absoluteleft:40%top:35%'><u>Summary</u></h2>"+"<textarea style='font-family:Arialfont-size:13pxcolor:#000000position:absoluteleft:30%top:45%width:600pxheight:110px'>"+t1.getText()+"</textarea>"+"<h2 style='font-family:Arialfont-size:20pxcolor:#ffffffposition:absoluteleft:40%top:65%'><u>Work Experience</u></h2>"+"<p style='font-family:Arialfont-size:13pxcolor:#ffffffposition:absoluteleft:30%top:75%'>"+t2.getText()+"</p>"+"<h2 style='font-family:Arialfont-size:20pxcolor:#ffffffposition:absoluteleft:40%top:95%'><u>Education</u></h2>"+"<p style='font-family:Arialfont-size:13pxcolor:#ffffffposition:absoluteleft:30%top:105%'>"+t3.getText()+"</p><p style='font-family:Arialfont-size:11pxcolor:#ffffffposition:absoluteleft:70%top:105%'>"+t4.getText()+" GPA</p>"+"<h2 style='font-family:Arialfont-size:20pxcolor:#ffffffposition:absoluteleft:40%top:125%'><u>Projects</u></h2>"+"<p style='font-family:Arialfont-size:13pxcolor:#ffffffposition:absoluteleft:30%top:135%'>"+t5.getText()+"</p>"+"<h3 style='font-family:Arialfont-size:13pxcolor:#ffffffposition:absoluteleft:20%top:155%'><u>Languages</u></h2>"+"<p style='font-family:Arialfont-size:11pxcolor:#ffffffposition:absoluteleft:23%top:160%'>"+t9.getText()+"</p><p style='font-family:Arialfont-size:11pxcolor:#ffffffposition:absoluteleft:23%top:165%'>"+t10.getText()+"</p>"+"<h3 style='font-family:Arialfont-size:13pxcolor:#ffffffposition:absoluteleft:80%top:155%'><u>Links</u></h2>"+"<p style='font-family:Arialfont-size:11pxcolor:#ffffffposition:absoluteleft:82%top:160%'>"+t11.getText()+"</p><p style='font-family:Arialfont-size:11pxcolor:#ffffffposition:absoluteleft:82%top:165%'>"+t12.getText()+"</p>"+"<h3 style='font-family:Arialfont-size:13pxcolor:#ffffffposition:absoluteleft:20%top:180%'><u>GRE/GMAT/SAT Score</u></h2>"+"<p style='font-family:Arialfont-size:11pxcolor:#ffffffposition:absoluteleft:23%top:185%'>"+gt.getText()+"</p>"+"<p style='font-family:Arialfont-size:11pxposition:absoluteleft:40%top:200%color:#ffffff'>Securing Self</p></body>"+"</html>"
                               resume_io.writeHTML_(f, fn, write_dat_black)
                            }
                        }
                       
                    }
                } else 
                    JOptionPane.showMessageDialog(f, "Fill everything before generation.", "Warning Fill", JOptionPane.WARNING_MESSAGE)
                }
                })

 t2.setForeground(new Color(109, 99, 99))
        t2.setText("e.g\nGoogle/Other Product Based - Cheif Executive Officer - Mountain View CA US\nGoogle/Other Product Based - Research Scientist - St Giles UK\nBrainnest - Python Intern - or any other Shell SWE/Machine Learning - Copenhagen Denmark (Remote)\nCenter for Internet Security Part Time from beginning\nRishabh Softwares - Intern - Vadoda Gujrat (Remote)")
        et1.setForeground(new Color(109, 99, 99))
        et1.setText("e.g Jr. Smith")
        t4.setForeground(new Color(109, 99, 99))
        t4.setText("7.1")

        t2.addMouseListener(new MouseAdapter() {
            override def mouseClicked(e:MouseEvent)={
                super.mouseClicked(e)
                if (!t2.getText().equals("")) {
                    t2.setForeground(Color.BLACK)
                    t2.setText("")
                }
            }
        })
        et1.addMouseListener(new MouseAdapter() {
            override def mouseClicked( e : MouseEvent)={
                super.mouseClicked(e)
                if (!et1.getText().equals("")) {
                    et1.setForeground(Color.BLACK)
                    et1.setText("")
                }
            }
        })
        t4.addMouseListener(new MouseAdapter() {
            override def mouseClicked(e : MouseEvent)={
                super.mouseClicked(e)
                if (!t4.getText().equals("")) {
                    t4.setForeground(Color.BLACK)
                    t4.setText("")
                }
            }
        })

panel_ceo.setLayout(null)
        val labs : JLabel = new Array[JLabel](10)
        val lceos= Array("Sundar Pichai", "Satya Nadella", "Thomas", "Nat Friedman", "Jack Dorsey", "Mark Zukerberg", "Mark Gortan")
        val imgs=Array("Sundar.jpg", "Satya.jpg", "Thomas.jpg", "Nat.jpg", "Jack.jpg", "Mark.jpeg", "Gortan.jpg")
        val ceo_links=Array("https://x.com/sundarpichai", "https://x.com/satyanadella", "https://x.com/ashtom", "https://x.com/natfriedman",
        "https://x.com/jack", "https://www.instagram.com/zuck", "https://x./markgortonnyc")
        vall l_text= new Array[JLabel](7)
        val m: Int=0
        panel_ceo.setBackground(new Color(39, 39, 39, 199))
        panel_ceo.setBounds(200, 0, 900, 200)
        val c : JLabel  = new JLabel("x")
        c.setFont(new Font("Calibri", Font.BOLD, 11))
        c.setForeground(new Color(250, 250, 250))
        c.setBounds(880, 10, 20, 20)
        c.setCursor(new Cursor(Cursor.HAND_CURSOR))
        c.addMouseListener(new MouseAdapter() {
        

             override def mouseClicked(e:MouseEvent)= {
                super.mouseClicked(e)
                panel_ceo.setVisible(false)
            }
        })
       c.setVisible(true)
        val y:int =0
         while(y<7)
        {
        l_text[y] = new JLabel(ceos[y])
           l_text[y].setBounds(10+m, 90, 110, 20)
           l_text[y].setFont(new Font("Arial", Font.PLAIN, 11))
           l_text[y].setForeground(new Color(250, 250, 250))
           l_text[y].setVisible(true)        
           panel_ceo.add(l_text[y])
           m+=130
       y=y+1
      }

  val m1: Int =0
           l_img[0] = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage(imgs[0])))
           l_img[0].setBounds(10+m1, 10, 64, 64)
           l_img[0].setCursor(new Cursor(Cursor.HAND_CURSOR))
           l_img[0].setVisible(true)
         
           l_img[0].addMouseListener(new MouseAdapter(){
               override def mouseClicked(e : MouseEvent)=
               {
                   super.mouseClicked(e)
                   resume_io.open_Link(f, ceo_links[0])
               }
           })
          panel_ceo.add(l_img[0])
          m1=m1+130
          
          l_img[1] = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage(imgs[1])))
           l_img[1].setBounds(10+m1, 10, 64, 64)
           l_img[1].setCursor(new Cursor(Cursor.HAND_CURSOR))
           l_img[1].setVisible(true)
         
           l_img[1].addMouseListener(new MouseAdapter(){
               override def mouseClicked( e : MouseEvent)=
               {
                   super.mouseClicked(e)
                   resume_io.open_Link(f, ceo_links[1])
               }
           })
          panel_ceo.add(l_img[1])
          m1=m1+130
          
          
          l_img[2] = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage(imgs[2])))
           l_img[2].setBounds(10+m1, 10, 64, 64)
           l_img[2].setCursor(new Cursor(Cursor.HAND_CURSOR))
           l_img[2].setVisible(true)
         
           l_img[2].addMouseListener(new MouseAdapter(){
               override def mouseClicked(e: MouseEvent)=
               {
                   super.mouseClicked(e)
                   resume_io.open_Link(f, ceo_links[2])
               }
           })
          panel_ceo.add(l_img[2])
          m1=m1+130
          
          
          
          l_img[3] = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage(imgs[3])))
           l_img[3].setBounds(10+m1, 10, 64, 64)
           l_img[3].setCursor(new Cursor(Cursor.HAND_CURSOR))
           l_img[3].setVisible(true)
         
           l_img[3].addMouseListener(new MouseAdapter(){
               override def mouseClicked(e:MouseEvent)=
               {
                   super.mouseClicked(e)
                   resume_io.open_Link(f, ceo_links[3])
               }
           })
          panel_ceo.add(l_img[3])
          m1=m1+130
          
          
          l_img[4] = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage(imgs[4])))
           l_img[4].setBounds(10+m1, 10, 64, 64)
           l_img[4].setCursor(new Cursor(Cursor.HAND_CURSOR))
           l_img[4].setVisible(true)
         
           l_img[4].addMouseListener(new MouseAdapter(){
               override def mouseClicked(e:MouseEvent)=
               {
                   super.mouseClicked(e)
                   resume_io.open_Link(f, ceo_links[4])
               }
           })
          panel_ceo.add(l_img[4])
          m1=m1+130
          
          
          l_img[5] = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage(imgs[5])))
           l_img[5].setBounds(10+m1, 10, 64, 64)
           l_img[5].setCursor(new Cursor(Cursor.HAND_CURSOR))
           l_img[5].setVisible(true)
         
           l_img[5].addMouseListener(new MouseAdapter(){
               override def mouseClicked(e:MouseEvent)=
               {
                   super.mouseClicked(e)
                   resume_io.open_Link(f, ceo_links[5])
               }
           })
          panel_ceo.add(l_img[5])
          m1=m1+130
          
          l_img[6] = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage(imgs[6])))
           l_img[6].setBounds(10+m1, 10, 64, 64)
           l_img[6].setCursor(new Cursor(Cursor.HAND_CURSOR))
           l_img[6].setVisible(true)
         
           l_img[6].addMouseListener(new MouseAdapter(){
               override def mouseClicked( e :MouseEvent)=
               {
                   super.mouseClicked(e)
                   resume_io.open_Link(f, ceo_links[6])
               }
           })
          panel_ceo.add(l_img[6])
          m1=m1+130
          
          
          
       panel_ceo.add(c)
       panel_ceo.setVisible(false)
         sp1.add(s1)
        sp1.add(s2)
        sp1.add(t3)
        sp1.add(t4)
        sp1.add(s3)
        sp1.add(t6)
        sp1.add(s4)
        sp1.add(t8)
        sp1.add(t9)
        sp1.add(t10)
        sp1.add(t11)
        sp1.add(t12)
        sp1.add(n1)
        sp1.add(n2)
        sp1.add(n3)
        sp1.add(et1)
        sp1.add(et2)
        sp1.add(et3)
        sp1.add(br)
        sp1.add(gl)
        sp1.add(gt)
        
        p.setLayout(null)
        p.add(close)
        p.add(sp1)
        p.add(sv)
        p.add(cp)
        p.add(cb)
        p.add(cb1)
        p.add(save)
        p.add(lx)
     
        
        p.add(panel_ceo)
      val  lab : JLabel= new JLabel("Everything Okay")
       lab.setBounds(20,10, 110, 20)
       lab.setFont(new Font("Calibri", Font.PLAIN, 12))
       lab.setVisible(true)
        p.add(lab)
        p.setVisible(true)
        f.setUndecorated(true)
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        f.setBounds(0, 0, dx, dy)
        f.setTitle("Resume.io")
        f.add(p)
        f.setVisible(true)
        }

}

       
      
