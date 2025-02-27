import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class Frame1 extends JFrame {

	private JFrame frame;
	protected String AP_ID,AP_NAME,AP_ADDRESS,AP_PROVINCE,AP_SEX,AP_EDUCATION;
	protected String AP_POS1,AP_POS2,AP_POS3,AP_POS4,AP_POS5;
	protected String QUAL_POS1,QUAL_POS2,QUAL_POS3,QUAL_POS4,QUAL_POS5;
	protected JRadioButton resultSex;
	protected JComboBox position_comboBox_1,position_comboBox_2,position_comboBox_3;
	protected JTextField id_textField;
	protected JTextField fnamelname_textField;
	protected JTextField addr_textField;
	protected JTextField province_textField;
	protected JTextField edu_textField;
	protected JTextField major_textField;
	
	/* Job Position */
	
	String [] comboJobPostionStrings = {
			"Select the Job Position",
			"Technical Programmer",
			"Web Developer",
			"General Manager",
			"ICT Specialist",
			"E-Business Analyst",
			"ICT Documentor",
			"Database Administrator",
			"PC Administrator",
			"Network Specialist",
			"ICT Manager"
	};
	
	/* Combo box section */
	
	String [] comboSpecialSkStrings = {
			"Select the Skills",
			"Web_ASP",
			"C++",
			"Database Administrator, DB2",
			"Database Administrator,ORACLE",
			"Graphic Design",
			"JAVA",
			"Management",
			"Network",
			"Secretarial work,45 words/min",
			"Secretarial work,60 words/min",
			"System Analyst, Level 1",
			"System Analyst, Level 2",
			"Visual Basic"
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
		input_id();
		input_Name();
		input_Address();
		input_Province();
		input_Sex();
		input_Education();
		input_Major();
		input_Qualification();
		input_Jobposition1();
		input_Jobposition2();
		input_Jobposition3();
		Submit_form();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//Frame Layout
		
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Topic Content Header
		
		JLabel lblSTOU_TEC_1 = new JLabel("STOU-TEC Company .ltd");
		lblSTOU_TEC_1.setBounds(269, 6, 164, 29);
		frame.getContentPane().add(lblSTOU_TEC_1);
		
		JLabel lblMessage_2 = new JLabel("Application Form for Candidate");
		lblMessage_2.setBounds(250, 40, 210, 15);
		frame.getContentPane().add(lblMessage_2);
		
		JLabel lbl_Message3 = new JLabel("This application form for ICT, Give the applicant input your personal below ");
		lbl_Message3.setBounds(122, 62, 492, 16);
		frame.getContentPane().add(lbl_Message3);
		
		JLabel lbl_Message4 = new JLabel("STOU-TEC Company .ltd will approve following by appropriately");
		lbl_Message4.setBounds(154, 84, 430, 16);
		frame.getContentPane().add(lbl_Message4);
		
		JLabel lbl_id = new JLabel("Applicant ID (AP_ID) :");
		lbl_id.setBounds(15, 120, 210, 25);
		frame.getContentPane().add(lbl_id);
	}
	final JTextField input_id(){
			
			JLabel lbl_id = new JLabel("Applicant ID (AP_ID) :");
			lbl_id.setBounds(15, 120, 210, 25);
			frame.getContentPane().add(lbl_id);
			
			id_textField = new JTextField();
			id_textField.setBounds(260, 120, 450, 25);
			frame.getContentPane().add(id_textField);
			id_textField.setColumns(10);
			
			return id_textField;
		}
	
	public JTextField input_Name(){
		//input data name
		
				JLabel lblFirstname = new JLabel("Firstname-Lastname (AP_NAME) :");
				lblFirstname.setBounds(15, 150, 210, 25);
				frame.getContentPane().add(lblFirstname);
				
				fnamelname_textField = new JTextField();
				fnamelname_textField.setBounds(260, 150, 450, 25);
				fnamelname_textField.setColumns(10);
				frame.getContentPane().add(fnamelname_textField);
				
				return fnamelname_textField;
		
	}
	
	public JTextField input_Address(){
		// Address Selection

			JLabel lblAddress = new JLabel("Address (AP_ADDR) :");
			lblAddress.setBounds(15, 180, 210, 25);
			frame.getContentPane().add(lblAddress);
			
			addr_textField = new JTextField();
			addr_textField.setBounds(260, 180, 450, 25);
			addr_textField.setColumns(10);
			frame.getContentPane().add(addr_textField);
			
			return addr_textField;
	}
	
	public JTextField input_Province(){
		// Province Selection
		
				JLabel lblProvince = new JLabel("Province (AP_CHW) :");
				lblProvince.setBounds(15, 210, 210, 25);
				frame.getContentPane().add(lblProvince);
				
				province_textField = new JTextField();
				province_textField.setBounds(260, 210, 225, 25);
				province_textField.setColumns(10);
				frame.getContentPane().add(province_textField);
				return province_textField;
	}
	
	public JRadioButton input_Sex(){
				// Sex Selection 
				
		
				JLabel lblSex = new JLabel("Sex (AP_SEX) :");
				lblSex.setBounds(15, 240, 210, 25);
				frame.getContentPane().add(lblSex);
				
				
				final JRadioButton rdbtnMale = new JRadioButton("Male");
				rdbtnMale.setBounds(260, 240, 70, 25);
				frame.getContentPane().add(rdbtnMale);
				
				final JRadioButton rdbtnFemale = new JRadioButton("Female");
				rdbtnFemale.setBounds(360, 240, 97, 25);
				frame.getContentPane().add(rdbtnFemale);
				
				
				if (rdbtnMale.isSelected()){
					
					resultSex = rdbtnMale;
					
					return resultSex;
				}
				else{
					resultSex = rdbtnFemale;
					return resultSex;
				}

	}
	
	public JTextField input_Education(){
		// Education 
		
				JLabel lblEducation = new JLabel("Education (AP_EDU) :");
				lblEducation.setBounds(15, 270, 210, 25);
				frame.getContentPane().add(lblEducation);
				
				edu_textField = new JTextField();
				edu_textField.setBounds(260, 270, 450, 25);
				edu_textField.setColumns(10);
				frame.getContentPane().add(edu_textField);
				
				JLabel lbleg = new JLabel("(e.g B.S., B.A., M.S., M.BA., M.A. )");
				lbleg.setBounds(15, 300, 210, 16);
				frame.getContentPane().add(lbleg);
		
			return edu_textField;
	}
	
	public JTextField input_Major(){
		// Major
		
		JLabel lblMajor = new JLabel("Major (AP_MAJ) :");
		lblMajor.setBounds(15, 330, 210, 25);
		frame.getContentPane().add(lblMajor);
		
		major_textField = new JTextField();
		major_textField.setBounds(260, 330, 450, 25);
		major_textField.setColumns(10);
		frame.getContentPane().add(major_textField);
		
		
		return major_textField;
	}
	
	public JComboBox input_Qualification(){
				
		
		JLabel lblqual = new JLabel("Other qualification or Special skills that should be consider (QUAL_DESC) **Required 5 items");
		lblqual.setBounds(30, 370, 600, 15);
		frame.getContentPane().add(lblqual);
		
		// comboBox Label and Special skills selection 1 
		
		
		JLabel lblSpecialskills_1 = new JLabel("Special skill 1 :");
		lblSpecialskills_1.setBounds(15, 405, 210, 15);
		frame.getContentPane().add(lblSpecialskills_1);
		
		JComboBox specialSk_comboBox_1 = new JComboBox(comboSpecialSkStrings);
		specialSk_comboBox_1.setSelectedIndex(0);
		specialSk_comboBox_1.setBounds(260, 400, 450, 27);
		specialSk_comboBox_1.setToolTipText("");
		frame.getContentPane().add(specialSk_comboBox_1);
		
		
		// comboBox Label and Special skills selection 2
		
		JLabel lblSpecialskills_2 = new JLabel("Special skill 2 :");
		lblSpecialskills_2.setBounds(15, 445, 210, 15);
		frame.getContentPane().add(lblSpecialskills_2);
		
		JComboBox specialSk_comboBox_2 = new JComboBox(comboSpecialSkStrings);
		specialSk_comboBox_2.setSelectedIndex(0);
		specialSk_comboBox_2.setBounds(260, 440, 450, 27);
		frame.getContentPane().add(specialSk_comboBox_2);
		
		// comboBox Label and Special skills selection 3
		
		JLabel lblSpecialskills_3 = new JLabel("Special skill 3 :");
		lblSpecialskills_3.setBounds(15, 485, 210, 15);
		frame.getContentPane().add(lblSpecialskills_3);
		
		JComboBox specialSk_comboBox_3 = new JComboBox(comboSpecialSkStrings);
		specialSk_comboBox_3.setSelectedIndex(0);
		specialSk_comboBox_3.setBounds(260, 480, 450, 27);
		frame.getContentPane().add(specialSk_comboBox_3);
		
		// comboBox Label and Special skills selection 4
		
		JLabel lblSpecialskills_4 = new JLabel("Special skill 4 :");
		lblSpecialskills_4.setBounds(15, 525, 210, 15);
		frame.getContentPane().add(lblSpecialskills_4);
		
		JComboBox specialSk_comboBox_4 = new JComboBox(comboSpecialSkStrings);
		specialSk_comboBox_4.setSelectedIndex(0);
		specialSk_comboBox_4.setBounds(260, 520, 450, 27);
		frame.getContentPane().add(specialSk_comboBox_4);
		
		// comboBox Label and Special skills selection 5
		
		JLabel lblSpecialskills_5 = new JLabel("Special skill 5 :");
		lblSpecialskills_5.setBounds(15, 565, 210, 15);
		frame.getContentPane().add(lblSpecialskills_5);
		
		JComboBox specialSk_comboBox_5 = new JComboBox(comboSpecialSkStrings);
		specialSk_comboBox_5.setSelectedIndex(0);
		specialSk_comboBox_5.setBounds(260, 560, 450, 27);
		frame.getContentPane().add(specialSk_comboBox_5);
		
		return null;
	}
	
	public JComboBox input_Jobposition1(){

		
		JLabel lblPostionApplyingFor = new JLabel("Postion applying for (POS_NAME) ** Required 3 positions : ");
		lblPostionApplyingFor.setBounds(30, 605, 600, 15);
		frame.getContentPane().add(lblPostionApplyingFor);
		
		// Job Position Label and Job Position selection 1
		
		JLabel lblPosition_1 = new JLabel("Position 1 :");
		lblPosition_1.setBounds(15, 650, 210, 15);
		frame.getContentPane().add(lblPosition_1);
				
		JComboBox position_comboBox_1 = new JComboBox(comboJobPostionStrings);
		position_comboBox_1.setSelectedIndex(0);
		position_comboBox_1.setBounds(260, 645, 450, 27);
		position_comboBox_1.setToolTipText("");
		frame.getContentPane().add(position_comboBox_1);
		
		
		return position_comboBox_1;
	}
	
	public JComboBox input_Jobposition2(){
		// Job Position Label and Job Position selection 2
		
		JLabel lblPosition_2 = new JLabel("Position 2 :");
		lblPosition_2.setBounds(15, 690, 210, 15);
		frame.getContentPane().add(lblPosition_2);
		
		JComboBox position_comboBox_2 = new JComboBox(comboJobPostionStrings);
		position_comboBox_2.setSelectedIndex(0);
		position_comboBox_2.setBounds(260, 685, 450, 27);
		frame.getContentPane().add(position_comboBox_2);
		
		return position_comboBox_2;
	}

	public JComboBox input_Jobposition3(){
		// Job Position Label and Job Position selection 3
		
		JLabel lblPosition_3 = new JLabel("Position 3 :");
		lblPosition_3.setBounds(15, 730, 210, 15);
		frame.getContentPane().add(lblPosition_3);
		
		JComboBox position_comboBox_3 = new JComboBox(comboJobPostionStrings);
		position_comboBox_3.setSelectedIndex(0);
		position_comboBox_3.setBounds(260, 725, 450, 27);
		frame.getContentPane().add(position_comboBox_3);
		
		return position_comboBox_3;
	}
		
		
	public String getID(){
		return AP_ID;
	
	}
	
	public String setID(JTextField id_textField){
		this.AP_ID = this.id_textField.getText().toString();
		System.out.println(AP_ID);
		return AP_ID;
		
	}
	
	public String getName(){
		return AP_NAME;
	}
	
	public String setName(JTextField fnamelname){
		this.AP_NAME = this.fnamelname_textField.getText().toString();
		System.out.println(AP_NAME);
		return AP_NAME;
	}
	
	public String getAdress(){
		return AP_ADDRESS;
	}
	
	public String setAddress(JTextField addr_textField){
		this.AP_ADDRESS = this.addr_textField.getText().toString();
		System.out.println(AP_ADDRESS);
		return AP_ADDRESS;
	}
	
	public String getProvince(){
		return AP_PROVINCE;
	}
	
	public String setProvince(JTextField province_textField){
		this.AP_PROVINCE = this.province_textField.getText().toString();
		System.out.println(AP_PROVINCE);
		return AP_PROVINCE;
	}
	
	public String getSex(){
		return AP_SEX;
	}
	
	public String setSex(JRadioButton resultSex){
		this.AP_SEX = this.resultSex.getText().toString();
		return AP_SEX;
	}
	
	public String getPosition1(){
		return AP_POS1;
	}
	
	public String setPosition1(JComboBox position_comboBox_1){
		this.AP_POS1 = this.position_comboBox_1.getSelectedItem().toString();
		return AP_POS1;
	}
	
	public String getPosition2(){
		return AP_POS2;
	}
	
	
	
		public String Submit_form(){
			// Submit form button
			JButton btnSubmit = new JButton("Submit");
			btnSubmit.setBounds(260, 792, 117, 29);
			btnSubmit.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					//new Form
					secondBox second = new secondBox();
					new secondBox().setVisible(true);
					
					//Hide Current Form
					//frame.setVisible(false);
					
					setID(id_textField);
					setName(fnamelname_textField);
					setAddress(addr_textField);
					setProvince(province_textField);
					setSex(resultSex);
					setPosition1(position_comboBox_1);
					
					String AP_EDUCATION = edu_textField.getText();
					String AP_MAJ = major_textField.getText();
					
					
					
						JOptionPane.showMessageDialog(frame,"You have successfully Input Application Form");
						JOptionPane.showMessageDialog(frame,
								"Applicant ID: " +AP_ID+
								"\nFirstname and Lastname: " +AP_NAME+
								"\nAddress: " + AP_ADDRESS+
								"\nProvince: " +AP_PROVINCE+
								"\nSex: " +AP_SEX+
								"\nEducation: " + AP_EDUCATION+
								"\nMajor: " + AP_MAJ+
								"\nQualification1 : " +QUAL_POS1+
								"\nQualification2 : " +QUAL_POS2+
								"\nQualification3 : " +QUAL_POS3+
								"\nQualification4 : " +QUAL_POS4+
								"\nQualification5 : " +QUAL_POS5+
								"\nPosition1 : " +AP_POS1+
								"\nPosition2 : " +AP_POS2+
								"\nPosition3 : " +AP_POS3
								);
						
						second.frame.setVisible(true);
					
				}
			});
			frame.getContentPane().add(btnSubmit);
	
			return null;
		}
	public class Frame2 extends JFrame{
			Frame2 fr2 = new Frame2();
			
	}
}

