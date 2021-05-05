package University;

import java.sql.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		kb.useDelimiter(System.lineSeparator());//kb.next() ще чете няколко думи/string-а -> когато се налага да се въвеждат адреси
		
		
////		//Data for table dataTeachers VVV
//		System.out.print("ID of Teacher: ");
//		int idTeacher = kb.nextInt();
//		
//		System.out.print("First Name of Teacher: ");
//		String firstNameTeacher = kb.next();
//		
//		System.out.print("Second Name of Teacher: ");
//		String secondNameTeacher = kb.next();
//		
//		System.out.print("Personal ID of Teacher : ");
//		int personalIDt = kb.nextInt();
//				
//		System.out.print("Address of Teacher: ");
//		String address = kb.next();
//		
//		System.out.print("Email of Teacher: ");
//		String email = kb.next();
//		
//		System.out.print("Katedra of Teacher: ");
//		String katedra = kb.next();
//		
//		System.out.print("Exam Commission: ");
//		String examCommission = kb.next();
//		
//		System.out.print("Salary of Teacher: ");
//		int salary;
//		do {
//			salary = kb.nextInt();
//		}while(salary < 0);
//		insertTeacherInfo(idTeacher, firstNameTeacher, secondNameTeacher, personalIDt, address, email, katedra, examCommission, salary);
//		System.out.print("\n");
////		Data for table dataTeachers ^^^
//		
//		//Data for table students VVV
//		System.out.print("Fakulteten Nomer of Student: ");
//		int fakulteten_nomer  = kb.nextInt();
//		
//		System.out.print("First Name of Student: ");
//		String firstNameStudent = kb.next();
//		
//		System.out.print("Second Name of Student: ");
//		String secondNameStudent = kb.next();
//		
//		System.out.print("ID of Student: ");
//		int personalIDStudent = kb.nextInt();
//		
//		System.out.print("Speciality: ");
//		String speciality = kb.next();
//		
//		insertStudentInfo(fakulteten_nomer, firstNameStudent, secondNameStudent, personalIDStudent, speciality, idTeacher);
//		System.out.print("\n");
////		Data for table students ^^^
//		
//		//Data for table examCommittee VVV
//		System.out.print("ID of Exam Commission: ");
//		int CommID = kb.nextInt();
//		
//		System.out.print("ID of order: ");
//		int orderID = kb.nextInt();
//		
//		System.out.print("Name of Exam: ");
//		String exam = kb.next();
//		
//		System.out.print("Session: ");
//		int session = kb.nextInt();
//		
//		insertExamCommittee(idTeacher, firstNameTeacher, secondNameTeacher, idTeacher, email, katedra, examCommission, CommID, orderID, exam, session);
//		System.out.print("\n");
////		Data for table examCommittee^^^
//		
//		//Data for table exams VVV
//		System.out.print("Exam ID: ");
//		int examID = kb.nextInt();
//		
//		System.out.print("Discipline: ");
//		String discipline = kb.next();
//		
//		System.out.print("Enter day: ");
//		int day = kb.nextInt();
//		System.out.print("Enter month: ");
//		int month = kb.nextInt();
//		System.out.print("Enter year: ");
//		int year = kb.nextInt();
//		
//		System.out.print("Type (theory or practice): ");
//		String type = kb.next();
//		
//		System.out.print("Mark (between 2 and 6): ");
//		double mark = 0;
//		do {
//			mark = kb.nextDouble();//da e mejdu 2 i 6 i da e double
//		}while(mark < 2 || mark > 6);
//	
//		insertExamsInfo(firstNameStudent, secondNameStudent,examID, discipline, type, mark, fakulteten_nomer, day, month, year,idTeacher, CommID);
//		System.out.print("\n");
//		//Data for table exams ^^^
		
	
		
		System.out.println("Which table would you like to see?: ");
		System.out.println("1. DATA TEACHERS\n2. EXAM COMMITTEE\n3. EXAMS\n4. STUDENTS\n5. PROBLEMS FROM TEXT FILE");
		int a = kb.nextInt();
		switch(a) {
		case 1:{//dataTeachers
			System.out.println("What do you want to do?");
			System.out.println("1. See all \n2. Update \n3. Delete ");
			int n = kb.nextInt();
			switch(n) {
			case 1:{//See all teacher
				getTeachersData();
				break;
			}
			case 2:{//update a teacher
				System.out.println("Please, choose what you wish to change:");
				System.out.println("1. idTeacher\n2. firstName\n3. secondName\n4. personalID\n5. address\n6. email\n7. katedra\n8. examCommission\n9. salary");
				int b = kb.nextInt();
				switch (b) {
				case 1: {
					System.out.print("Enter ID of Teacher: ");
					int oldID = kb.nextInt();
					System.out.print("Enter Updated ID:");
					int newID = kb.nextInt();
					updateDataTeachersIDTeacher(oldID, newID);
					updateDataStudentIDTeacher(oldID, newID);
					updateDataECTeacherID(oldID, newID);
					updateExamsTeacherID(oldID, newID);
					
					break;
				}
				case 2: {
					System.out.print("Enter ID of Teacher: ");
					int id = kb.nextInt();
					System.out.print("Enter Updated Name:");
					String newName = kb.next();
					updateDataTeachersFirstName(id, newName);
					updateDataECTeacherFName(id, newName);
					break;
				}
				case 3: {
					System.out.print("Enter ID of Teacher: ");
					int id = kb.nextInt();
					System.out.print("Enter Updated Name:");
					String newName = kb.next();
					updateDataTeachersSecondName(id, newName);
					updateDataECTeacherSName(id, newName);
					break;
				}
				case 4: {
					System.out.print("Enter ID of Teacher: ");
					int id = kb.nextInt();
					System.out.print("Enter Updated PersonalID:");
					int newPersID = kb.nextInt();
					updateDataTeachersPersonalID(id, newPersID);
					break;
				}
				case 5: {
					System.out.print("Enter ID of Teacher: ");
					int id = kb.nextInt();
					System.out.print("Enter New Address:");
					String newAddress = kb.next();
					updateDataTeachersAddress(id, newAddress);
					break;
				}
				case 6: {
					System.out.print("Enter ID of Teacher: ");
					int id = kb.nextInt();
					System.out.print("Enter Updated Email:");
					String newEmail = kb.next();
					updateDataTeachersEmail(id, newEmail);
					updateDataECTeacherEmail(id, newEmail);
					break;
				}
				case 7: {
					System.out.print("Enter ID of Teacher: ");
					int id = kb.nextInt();
					System.out.print("Enter Updated katedra:");
					String newKatedra = kb.next();
					updateDataTeachersKatedra(id, newKatedra);
					updateDataECTeacherKatedra(id, newKatedra);
					break;
				}
				
				case 8: {
					System.out.print("Enter ID of Teacher: ");
					int id = kb.nextInt();
					System.out.print("Enter Updated Exam Commission:");
					String newEC = kb.next();
					updateDataTeachersExamCommission(id, newEC);
					break;
				}
				case 9: {
					System.out.print("Enter ID of Teacher: ");
					int id = kb.nextInt();
					System.out.print("Enter Updated Salary:");
					int newSalary = kb.nextInt();
					updateDataTeachersSalary(id, newSalary);
					break;
				}
				
				default: {
					System.out.println("WRONG OPTION!");
					break;
					}
				
				}
				break;
			}
			case 3:{//delete a teacher
				System.out.println("Enter ID of Teacher to delete: ");
				int tID = kb.nextInt();
				deleteTeacher(tID);
				deleteECTeacher(tID);
				break;
			}
			default: {
				System.out.println("WRONG OPTION!");
				break;
				}
			
			}
			break;
		}
		case 2:{//examCommittee
			System.out.println("What do you want to do?");
			System.out.println("1. See all \n2. Delete ");
			int b = kb.nextInt();
			switch(b) {
			case 1:{//SEE ALL EXAM COMMITTEES
				getExamCommitteeInfo();
				break;
			}

			case 2:{//DELETE FROM EXAM COMMITTEE
				System.out.println("Do you want to delete an Exam Committee or a member?");
				System.out.println("1.EC \n2. Member");
				b = kb.nextInt();
				switch(b) {
				case 1:{
					System.out.println("Enter committee ID");
					int commID = kb.nextInt();
					deleteExComm(commID);
					break;
				}
				case 2:{
					System.out.println("Enter Teacher ID to remove");
					int id = kb.nextInt();
					deleteECMember(id);
					break;
				}
				}
				break;
			}
			default: {
				System.out.println("WRONG OPTION!");
				break;
				}
			}
		}
		case 3:{//exams
			System.out.println("What do you want to do?");
			System.out.println("1. See all \n2. Update \n3. Delete ");
			int b = kb.nextInt();
			switch(b) {
			case 1:{//see all
				getExamsData();
			}
			case 2:{//update
				System.out.println("Please, choose what you wish to change:");
				System.out.println("1.examID\n2.discipline\n3.type\n4.mark\n5.fakulteten nomer\n6.day\n7.month\n8.year");
				b = kb.nextInt();
				switch (b) {
				case 1: {
					System.out.print("Enter Old Exam ID: ");
					int oldID = kb.nextInt();
					System.out.print("Enter Updated ID:");
					int newID = kb.nextInt();
					updateDataExamsID(oldID, newID);
					break;
					}
				case 2: {
					System.out.print("Enter Exam ID: ");
					int exmID = kb.nextInt();
					System.out.print("Enter Updated Discipline:");
					String newDisc = kb.next();
					updateDataExamsDiscipline(exmID, newDisc);
					break;
					}
				case 3: {
					System.out.print("Enter Exam ID: ");
					int exmID = kb.nextInt();
					System.out.print("Enter New Type:");
					String newType = kb.next();
					updateDataExamsType(exmID, newType);
					break;
					}
				case 4: {
					System.out.print("Enter Exam ID: ");
					int exmID = kb.nextInt();
					System.out.print("Enter Updated Mark:");
					double newMark;
					do {
						newMark = kb.nextDouble();
					}while(newMark < 2 || newMark > 6);
					updateDataExamsMark(exmID, newMark);
					break;
					}
				case 5: {
					System.out.print("Fakulteten Nomer can only be updated from the students tab");
					break;
					}
				case 6: {
					System.out.print("Enter Exam ID: ");
					int exmID = kb.nextInt();
					System.out.print("Enter Updated Day:");
					int newDay = kb.nextInt();
					updateDataExamsDay(exmID, newDay);
					break;
						}
				case 7: {
					System.out.print("Enter Exam ID: ");
					int exmID = kb.nextInt();
					System.out.print("Enter Updated Month:");
					int newMonth = kb.nextInt();
					updateDataExamsMonth(exmID, newMonth);
					break;
						}
				case 8: {
					System.out.print("Enter Exam ID: ");
					int exmID = kb.nextInt();
					System.out.print("Enter Updated Year:");
					int newYear = kb.nextInt();
					updateDataExamsYear(exmID, newYear);
					break;
						}

					}	
				
				break;
			}
			
			case 3:{//remove exam
				System.out.println("Please enter the exam ID: ");
				int exID = kb.nextInt();
				deleteExam(exID);
				break;
			}
			}	
			break;
		}
		case 4:{//students
			System.out.println("What do you want to do?");
			System.out.println("1. See all \n2. Update \n3. Delete ");
			int b = kb.nextInt();
			switch(b) {
			case 1:{//see all
				getStudentsData();
				break;
			}
			case 2:{//update
				System.out.println("Please, choose what you wish to change:");
				System.out.println("1.fakulteten nomer\n2.firstName\n3.secondName\n4.personalID\n5.speciality\n6.idTeacher");
				b = kb.nextInt();
				switch (b) {
				case 1: {
					System.out.print("Enter Fakulteten Nomer: ");
					int oldFK = kb.nextInt();
					System.out.print("Enter Updated FK:");
					int newFK = kb.nextInt();
					updateDataStudentsFakultNomer(oldFK, newFK);
					updateDataExamsFakultNomer(oldFK, newFK);
					break;
				}
				case 2: {
					System.out.print("Enter Fakulteten Nomer: ");
					int fakNum = kb.nextInt();
					System.out.print("Enter Updated Name:");
					String newName = kb.next();
					updateDataStudentFirstName(fakNum, newName);
					updateDataExamFirstNameS(fakNum, newName);
					
					break;
				}
				case 3: {
					System.out.print("Enter Fakulteten Nomer: ");
					int fakNum = kb.nextInt();
					System.out.print("Enter Updated Name:");
					String newName = kb.next();
					updateDataStudentSecondName(fakNum, newName);
					updateDataExamSecondNameS(fakNum, newName);
					break;
				}
				case 4: {
					System.out.print("Enter Fakulteten Nomer: ");
					int fakNum = kb.nextInt();
					System.out.print("Enter Updated PersonalID:");
					int newPersID = kb.nextInt();
					updateDataStudentPersID(fakNum, newPersID);
					break;
				}
				case 5: {
					System.out.print("Enter Fakulteten Nomer: ");
					int fakNum = kb.nextInt();
					System.out.print("Enter Updated Speciality:");
					String newSpec = kb.next();
					updateDataStudentSpeciality(fakNum, newSpec);
					break;
				}
				case 6: {
					System.out.print("Enter ID of Teacher: ");
					int oldID= kb.nextInt();
					System.out.print("Enter Updated ID of Teacher:");
					int newID = kb.nextInt();
					updateDataTeachersIDTeacher(oldID, newID);
					updateDataStudentIDTeacher(oldID, newID);
					break;
						}
					}
				break;
				}
			case 3:{//remove student
				System.out.println("Please enter the fakulten nomer of student: ");
				int fakNomer = kb.nextInt();
				deleteStudent(fakNomer);
				break;
			}
			}
			}
		case 5:{//specifichni zadachi ot textoviq fail
			System.out.println("Choose which one you want to test:");
			System.out.println("1. Students, sorted by second name\n2.Teachers with given salary\n3.Students of given teacher\n4.Members of given Exam Commission");
			int v = kb.nextInt();
			switch(v) {
			case 1:{
				getStudentsData();
				break;
			}
			case 2:{
				System.out.println("Enter Salary 1:");
				int s1 = kb.nextInt();
				System.out.println("Enter Salary 2:");
				int s2 = kb.nextInt();
				getSalary(s1, s2);
				break;
			}
			case 3:{
				System.out.println("Please, enter Teacher ID: ");
				int id = kb.nextInt();
				getStudentsOfTeacher(id);
				break;
			}
			case 4:{
				System.out.println("Enter Commission ID:");
				int commid = kb.nextInt();
				getCommitteeInfo(commid);
				break;
			}
			}
			break;
		}
		}
}
		
		
	public static void getCommitteeInfo(int commID) {//POKAZVA PO EXAM COMISIQ
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM examCommittee WHERE commID = ? ORDER BY teacherFName";
			ps = con.prepareStatement(sql);
			ps.setInt(1, commID);
			
			rs = ps.executeQuery();
//			String ecName = rs.getString("examCommission");
			System.out.println("ALL MEMBERS:\n\n");
			while(rs.next()) {
				String fName = rs.getString("teacherFName");	
				String sName = rs.getString("teacherSName");
				int teachID = rs.getInt("teacherID");
				String emailTeach = rs.getString("emailTeacher");
				
				System.out.println("Name: " + fName + " " + sName);
				System.out.println("Teacher ID: " + teachID);
				System.out.println("Email of Teacher: " + emailTeach);
				System.out.println("\n");
			}
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}
	
	public static void getSalary(int salary1, int salary2) {//POKAZVA ZAPLATA MEJDU S1 I S2
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM dataTeachers WHERE salary BETWEEN ? and ? ORDER BY firstName";
			ps = con.prepareStatement(sql);
			ps.setInt(1, salary1);
			ps.setInt(2, salary2);
			rs = ps.executeQuery();
			System.out.println("TEACHERS WITH SALARY BETWEEN " + salary1 + " and " + salary2 + ":\n\n");
			while(rs.next()) {
				String fName = rs.getString("firstName");	
				String sName = rs.getString("secondName");
				int salary = rs.getInt("salary");
				String emailTeach = rs.getString("email");
				
				System.out.println("Name: " + fName + " " + sName);
				System.out.println("Salary: " + salary);
				System.out.println("Email of Teacher: " + emailTeach);
				System.out.println("\n");
			}
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	public static void getStudentsOfTeacher(int idTeacher) {//SHOWS ALL STUDENTS OF A TEACHER 
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM students WHERE idTeacher = ? ORDER BY idTeacher";
			ps = con.prepareStatement(sql);
			ps.setInt(1, idTeacher);
			rs = ps.executeQuery();
			System.out.println("STUDENTS WITH TEACHER ID #" + idTeacher + ":\n\n");
			while(rs.next()) {
				String fName = rs.getString("firstName");	
				String sName = rs.getString("secondName");
				String speciality = rs.getString("speciality");
				int TeachID = rs.getInt("idTeacher");
				int fakulteten_nomer = rs.getInt("fakulteten_nomer");
				
				System.out.println("Name: " + fName + " " + sName);
				System.out.println("Speciality: " + speciality);
				System.out.println("Facult #" + fakulteten_nomer);
				System.out.println("Teacher ID: " + TeachID);
				System.out.println("\n");
			}
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}
	
	public static void updateDataECTeacherFName(int idTeach, String update) {//UPDATE TEACHER FIRST NAME IN EXAMCOMMITTEE
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE examCommittee set teacherFName = ? WHERE teacherID = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setString(1, update);			
			ps.setInt(2, idTeach);
			ps.execute();
			
			System.out.println("UPDATED FIRST NAME OF TEACHER!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}	
		
	private static void deleteECMember(int idTeach) {//DELETE MEMBER OF EXAM COMMITTEE
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		try {
			String sql = "delete from examCommittee WHERE teacherID = ? ";
			ps = con.prepareStatement(sql);
			ps.setInt(1,  idTeach);
			ps.execute();
			System.out.println("EXAM COMMITTEE MEMBER DELETED!");
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	private static void deleteECTeacher(int idTeach) {//DELETE MEMBER OF EXAM COMMITTEE
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		try {
			String sql = "delete from examCommittee WHERE teacherID = ? ";
			ps = con.prepareStatement(sql);
			ps.setInt(1,  idTeach);
			ps.execute();
			System.out.println("TEACHER DELETED FROM EXAM COMMITTEE!");
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
		
	private static void deleteExComm(int commID) {//DELETE EXAM COMMITTEE
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		try {
			String sql = "delete from examCommittee WHERE commID = ? ";
			ps = con.prepareStatement(sql);
			ps.setInt(1,  commID);
			ps.execute();
			System.out.println("EXAM COMMITTEE DELETED!");
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}	
		
	public static void updateDataECTeacherSName(int idTeach, String update) {//UPDATE SECOND NAME OF TEACHER IN EXAM COMMITTEE
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE examCommittee set teacherSName = ? WHERE teacherID = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setString(1, update);			
			ps.setInt(2, idTeach);
			ps.execute();
			
			System.out.println("UPDATED SECOND NAME IN EXAM COMMITTEE!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}	
		
	public static void updateDataECTeacherID(int idTeach, int update) {//UPDATE TEACHER ID IN EXAM COMMITTEE
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE examCommittee set teacherID = ? WHERE teacherID = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setInt(1, update);			
			ps.setInt(2, idTeach);
			ps.execute();
			
			System.out.println("UPDATED EC TEACHER ID!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}	
	
	public static void updateDataECTeacherEmail(int id, String update) {//UPDATE TEACHER EMAIL IN EXAM COMMITTEE
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE examCommittee set emailTeacher = ? WHERE teacherID = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setString(1, update);			
			ps.setInt(2, id);
			ps.execute();
			
			System.out.println("UPDATED EC TEACHER EMAIL!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}	

	public static void updateDataECTeacherKatedra(int id, String update) {//UPDATE TEACHER KATEDRA IN EXAM COMMITTEE
	
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE examCommittee set katedra = ? WHERE teacherID = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setString(1, update);			
			ps.setInt(2, id);
			ps.execute();
			
			System.out.println("UPDATED TEACHER KATEDRA IN EC!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}	
	
	
	
	public static void insertTeacherInfo(int idTeacher, String firstName,//INSERT DATA FOR TEACHERS IN dataTeachers
			String secondName, int personalID,
			String address, String email,
			String katedra, String examCommission,
			int salary) {
		
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		try {
			String sql = "INSERT INTO dataTeachers(idTeacher, firstName, secondName,personalID, address, email, katedra, examCommission, salary) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, idTeacher);
			ps.setString(2, firstName);
			ps.setString(3, secondName);
			ps.setInt(4, personalID);
			ps.setString(5, address);
			ps.setString(6, email);
			ps.setString(7, katedra);
			ps.setString(8, examCommission);
			ps.setInt(9, salary);
			ps.execute();
			System.out.println("Data has been added to table >dataTeachers<!\n");
			
		}catch(SQLException e) {
			System.out.println(e.toString());
		}
		
	}
	
	public static void insertExamsInfo(String fName, String sName,int examID, String discipline, //INSERT DATA FOR EXAMS IN exams
			String type, double mark, int fakulteten_nomer, 
			int day, int month, int year,
			int teacherID, int examcommID) {
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		try {
			String sql = "INSERT INTO exams(firstNameS, secondNameS, examID, discipline, type, mark, fakulteten_nomer, day, month, year, teacherID, examcommID) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, fName);
			ps.setString(2, sName);
			ps.setInt(3, examID);
			ps.setString(4, discipline);
			ps.setString(5, type);
			ps.setDouble(6, mark);
			ps.setInt(7, fakulteten_nomer);
			ps.setInt(8, day);
			ps.setInt(9, month);
			ps.setInt(10, year);
			ps.setInt(11, teacherID);
			ps.setInt(12, examcommID);
			ps.execute();
			System.out.println("Data has been added to table >exams<!\n");
			
		}catch(SQLException e) {
			System.out.println(e.toString());
		}
	}
	
	public static void insertStudentInfo(int fakulteten_nomer, String firstName, //INSERT DATA FOR STUDENTS IN students
			String secondName, int personalID, 
			String speciality, int idTeacher) {
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		try {
			String sql = "INSERT INTO students(fakulteten_nomer, firstName, secondName, personalID, speciality, idTeacher) VALUES(?, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, fakulteten_nomer);
			ps.setString(2, firstName);
			ps.setString(3, secondName);
			ps.setInt(4, personalID);
			ps.setString(5, speciality);
			ps.setInt(6, idTeacher);
			ps.execute();
			System.out.println("Data has been added to table >students<!\n");
			
		}catch(SQLException e) {
			System.out.println(e.toString());
		}
	}

	public static void insertExamCommittee(int idTeacher, String firstName,//INSERT DATA FOR EXAM COMMITTEE IN examCommittee
			String secondName, int personalID,
			String email, String katedra, String examCommission,
			int Commid, int orderID, String exam, int session) {
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		try {
			String sql = "INSERT INTO examCommittee(teacherFName, teacherSName, teacherID, emailTeacher, katedra, examCommission, commID, exam, session, orderID) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, firstName);
			ps.setString(2, secondName);
			ps.setInt(3, idTeacher);
			ps.setString(4, email);
			ps.setString(5,  katedra);
			ps.setString(6, examCommission);
			ps.setInt(7, Commid);
			ps.setString(8, exam);			
			ps.setInt(9, session);
			ps.setInt(10, orderID);
			ps.execute();
			
			System.out.println("Data has been added to table >examCommittee<!\n");
			
		}catch(SQLException e) {
			System.out.println(e.toString());
		}
		
	}
	
	public static void getStudentsData() {//SHOWS ALL STUDENTS AND ORDERED BY FIRST NAME
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT fakulteten_nomer, personalID, speciality, firstName, secondName FROM students ORDER BY secondName";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			System.out.println("ALL STUDENTS:\n\n");
			while(rs.next()) {
				int fakulNum = rs.getInt("fakulteten_nomer");
				int personalID = rs.getInt("personalID");
				String spec = rs.getString("speciality");
				String fName = rs.getString("firstName");
				String sName = rs.getString("secondName");
				
				System.out.println("Name: " + fName + " " + sName);
				System.out.println("ID of student: " + personalID);
				System.out.println("Speciality: " + spec);
				System.out.println("Facultate #" + fakulNum);
				System.out.println("\n");
			}
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}
	
	public static void getExamCommitteeInfo() {//SHOWS ALL EXAM COMMITTEE MEMBERS ORDERED BY COMMISSION
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT teacherFName, teacherSName, teacherID, emailTeacher, katedra, examCommission FROM examCommittee ORDER BY examCommission";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			System.out.println("ALL EXAM-COMMITTEE MEMBERS:\n\n");
			while(rs.next()) {
				String fName = rs.getString("teacherFName");	
				String sName = rs.getString("teacherSName");
				int teachID = rs.getInt("teacherID");
				String emailTeach = rs.getString("emailTeacher");
				String catedra = rs.getString("katedra");
				String examComm = rs.getString("examCommission");
				
				System.out.println("Name: " + fName + " " + sName);
				System.out.println("Teacher ID: " + teachID);
				System.out.println("Email of Teacher: " + emailTeach);
				System.out.println("Catedra of Teacher: " + catedra);
				System.out.println("Member of >" + examComm + "< exam committee");
				System.out.println("\n");
			}
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	
	
	//UPDATE FOR DATATEACHERS
	public static void updateDataTeachersFirstName(int id, String update) {//UPDATE TEACHER FIRST NAME IN DATATEACHERS
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE dataTeachers set firstName = ? WHERE idTeacher = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setString(1, update);			
			ps.setInt(2, id);
			ps.execute();
			
			System.out.println("UPDATED FIRST NAME OF TEACHER!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}
	
	public static void updateDataTeachersSecondName(int id, String update) {//UPDATE TEACHER SECOND NAME IN DATATEACHERS
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE dataTeachers set secondName = ? WHERE idTeacher = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setString(1, update);			
			ps.setInt(2, id);
			ps.execute();
			
			System.out.println("UPDATED SECOND NAME OF TEACHER!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	public static void updateDataTeachersIDTeacher(int value, int update) {//UPDATE TEACHER ID IN DATATEACHERS
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE dataTeachers set idTeacher = ? WHERE idTeacher = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setInt(1, update);			
			ps.setInt(2, value);
			ps.execute();
			
			System.out.println("UPDATED TEACHER ID!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	public static void updateDataTeachersPersonalID(int value, int update) {//UPDATE TEACHER PERSONAL ID NAME IN DATATEACHERS
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE dataTeachers set personalID = ? WHERE idTeacher = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setInt(1, update);			
			ps.setInt(2, value);
			ps.execute();
			
			System.out.println("UPDATED PERSONAL ID OF TEACHER!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	public static void updateDataTeachersAddress(int id, String update) {//UPDATE TEACHER ADDRESS IN DATATEACHERS
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE dataTeachers set address = ? WHERE idTeacher = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setString(1, update);			
			ps.setInt(2, id);
			ps.execute();
			
			System.out.println("UPDATED ADDRESS OF TEACHER!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	public static void updateDataTeachersEmail(int id, String update) {//UPDATE TEACHER EMAIL IN DATATEACHERS
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE dataTeachers set email = ? WHERE idTeacher = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setString(1, update);			
			ps.setInt(2, id);
			ps.execute();
			
			System.out.println("UPDATED EMAIL OF TEACHER!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	public static void updateDataTeachersKatedra(int id, String update) {//UPDATE TEACHER KATEDRA IN DATATEACHERS
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE dataTeachers set katedra = ? WHERE idTeacher = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setString(1, update);			
			ps.setInt(2, id);
			ps.execute();
			
			System.out.println("UPDATED KATEDRA OF TEACHER!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	public static void updateDataTeachersExamCommission(int id, String update) {//UPDATE TEACHER EXAM COMMISSION IN DATATEACHERS
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE dataTeachers set examCommission = ? WHERE idTeacher = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setString(1, update);			
			ps.setInt(2, id);
			ps.execute();
			
			System.out.println("TEACHER EXAM COMMISSION UPDATED!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	public static void updateDataTeachersSalary(int id, int update) {//UPDATE TEACHER SALARY IN DATATEACHERS
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE dataTeachers set salary = ? WHERE idTeacher = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setInt(1, update);			
			ps.setInt(2, id);
			ps.execute();
			
			System.out.println("SALARY OF TEACHER UPDATED!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}
	//UPDATE FOR DATATEACHERS
	
	
	
	public static void getTeachersData() {//SHOWS ALL TEACHERS
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT idTeacher, firstName, secondName, personalID, address, email, katedra, examCommission, salary FROM dataTeachers ORDER BY firstName";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			System.out.println("ALL TEACHERS:\n\n");
			while(rs.next()) {
				int IDTeach = rs.getInt("idTeacher");
				String fName = rs.getString("firstName");
				String sName = rs.getString("secondName");
				int persID = rs.getInt("personalID");
				String add = rs.getString("address");
				String em = rs.getString("email");
				String kat = rs.getString("katedra");
				String EC = rs.getString("examCommission");
				int sal = rs.getInt("salary");
				
				System.out.println("Name: " + fName + " " + sName);
				System.out.println("Teacher ID: " + IDTeach);
				System.out.println("ID of Teacher: " + persID);
				System.out.println("Address: " + add);
				System.out.println("email: " + em);
				System.out.println("Katedra: " + kat);
				System.out.println("Member of : " + EC);
				System.out.println("Salary: " + sal);
				System.out.println("\n");
			}
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	private static void deleteTeacher(int idTeach) {//DELETS TEACHER
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		try {
			String sql = "delete from dataTeachers WHERE idTeacher = ? ";
			ps = con.prepareStatement(sql);
			ps.setInt(1,  idTeach);
			ps.execute();
			System.out.println("TEACHER DELETED");
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}


	public static void updateDataStudentFirstName(int value, String update) {//UPDATE STUDENT FIRST NAME IN STUDENTS
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE students set firstName = ? WHERE fakulteten_nomer = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, update);			
			ps.setInt(2, value);
			ps.execute();
			
			System.out.println("UPDATED STUDENT FIRST NAME!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	public static void updateDataStudentSecondName(int value, String update) {//UPDATE STUDENT SECOND NAME IN STUDENTS
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE students set secondName = ? WHERE fakulteten_nomer = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setString(1, update);			
			ps.setInt(2, value);
			ps.execute();
			
			System.out.println("UPDATED STUDENT SECOND NAME!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	public static void updateDataStudentsFakultNomer(int value, int update) {//UPDATE STUDENT FAKULTETEN NOMER IN STUDENTS
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE students set fakulteten_nomer = ? WHERE fakulteten_nomer = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setInt(1, update);			
			ps.setInt(2, value);
			ps.execute();
			
			System.out.println("UPDATED STUDENT FAKULTETEN NOMER!");					
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	public static void updateDataStudentPersID(int value, int update) {//UPDATE STUDENT PERSONAL ID IN STUDENTS
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE students set personalID = ? WHERE fakulteten_nomer = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setInt(1, update);			
			ps.setInt(2, value);
			ps.execute();
			
			System.out.println("UPDATED STUDENT PERSONAL ID!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	public static void updateDataStudentSpeciality(int value, String update) {//UPDATE STUDENT SPECIALITY IN STUDENTS
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE students set speciality = ? WHERE fakulteten_nomer = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setString(1, update);			
			ps.setInt(2, value);
			ps.execute();
			
			System.out.println("UPDATED SPECIALITY IN STUDENTS!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	public static void updateDataStudentIDTeacher(int value, int update) {//UPDATE STUDENT ID OF TEACHER IN STUDENTS
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE students set idTeacher = ? WHERE idTeacher = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setInt(1, update);			
			ps.setInt(2, value);
			ps.execute();
			
			System.out.println("UPDATED ID TEACHER IN STUDENTS!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	private static void deleteStudent(int fakNomer) {//DELETE STUDENT
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		try {
			String sql = "delete from students WHERE fakulteten_nomer = ? ";
			ps = con.prepareStatement(sql);
			ps.setInt(1,  fakNomer);
			ps.execute();
			System.out.println("STUDENT DELETED");
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

		
	public static void updateDataExamsFakultNomer(int value, int update) {//UPDATE EXAMS FAKULTETEN NOMER IN EXAMS	
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE exams set fakulteten_nomer = ? WHERE fakulteten_nomer = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setInt(1, update);			
			ps.setInt(2, value);
			ps.execute();
			
			System.out.println("UPDATED EXAM FAKULTETEN NOMER!");					
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	public static void updateDataExamsID(int value, int update) {//UPDATE EXAMS EXAM ID IN EXAMS	
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE exams set examID = ? WHERE examID = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setInt(1, update);			
			ps.setInt(2, value);
			ps.execute();
			
			System.out.println("UPDATED EXAM ID!");					
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	public static void updateDataExamsDiscipline(int exID, String update) {//UPDATE EXAMS DISCIPLINE IN EXAMS	
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE exams set discipline = ? WHERE examID = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setString(1, update);			
			ps.setInt(2, exID);
			ps.execute();
			
			System.out.println("UPDATED EXAM DISCIPLINE!");					
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	public static void updateDataExamsMark(int exID, double update) {//UPDATE EXAMS MARK IN EXAMS	
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE exams set mark = ? WHERE examID = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setDouble(1, update);			
			ps.setInt(2, exID);
			ps.execute();
			
			System.out.println("UPDATED EXAM MARK!");					
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	public static void updateDataExamsDay(int exID, int update) {//UPDATE EXAMS DAY IN EXAMS	
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE exams set day = ? WHERE examID = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setInt(1, update);			
			ps.setInt(2, exID);
			ps.execute();
			
			System.out.println("UPDATED EXAM DAY!");					
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}
	
	public static void updateDataExamsMonth(int exID, int update) {//UPDATE EXAMS MONTH IN EXAMS	
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE exams set month = ? WHERE examID = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setInt(1, update);			
			ps.setInt(2, exID);
			ps.execute();
			
			System.out.println("UPDATED EXAM MONTH!");					
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	public static void updateDataExamsYear(int exID, int update) {//UPDATE EXAMS YEAR IN EXAMS	
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE exams set year = ? WHERE examID = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setInt(1, update);			
			ps.setInt(2, exID);
			ps.execute();
			
			System.out.println("UPDATED EXAM YEAR!");					
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	public static void updateDataExamsType(int exID, String update) {//UPDATE EXAMS TYPE IN EXAMS	
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE exams set type = ? WHERE examID = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setString(1, update);			
			ps.setInt(2, exID);
			ps.execute();
			
			System.out.println("UPDATED EXAM TYPE!");					
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}

	private static void deleteExam(int exID) {//DELETE EXAM
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		try {
			String sql = "delete from exams WHERE examID = ? ";
			ps = con.prepareStatement(sql);
			ps.setInt(1,  exID);
			ps.execute();
			System.out.println("EXAM DELETED!");
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void getExamsData() {//SHOWS ALL EXAMS
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT firstNameS, secondNameS, examID, discipline, type, mark, fakulteten_nomer, day, month, year, teacherID, examcommID FROM exams ORDER BY fakulteten_nomer";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			System.out.println("ALL STUDENTS:\n\n");
			while(rs.next()) {
				int fakulNum = rs.getInt("fakulteten_nomer");
				int mark = rs.getInt("mark");
				String spec = rs.getString("discipline");
				String fName = rs.getString("firstNameS");
				String sName = rs.getString("secondNameS");
				int day = rs.getInt("day");
				int month = rs.getInt("month");
				int year = rs.getInt("year");
				int teachID = rs.getInt("teacherID");
				int commID = rs.getInt("examcommID");
			
				System.out.println("Name: " + fName + " " + sName);
				System.out.println("Mark: " + mark);
				System.out.println("Discipline: " + spec);
				System.out.println("Facultate #" + fakulNum);
				System.out.println("Teacher ID: " + teachID);
				System.out.println("Exam Commission ID: " +commID);
				System.out.println("Date: " + day + "." + month +  "." +year);
				System.out.println("\n");
			}
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}
	
	public static void updateExamsTeacherID(int idT, int update) {//UPDATE TEACHER FIRST NAME IN DATATEACHERS
		
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		
		
		try {
			String sql = "UPDATE exams set teacherID = ? WHERE teacherID = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setInt(1, update);			
			ps.setInt(2, idT);
			ps.execute();
			
			System.out.println("UPDATED ID OF TEACHER IN EXAMS!");
						
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}
	
	public static void updateDataExamFirstNameS(int exID, String update) {//UPDATE EXAMS TYPE IN EXAMS	
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		try {
			String sql = "UPDATE exams set firstNameS = ? WHERE fakulteten_nomer = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setString(1, update);			
			ps.setInt(2, exID);
			ps.execute();
			
			System.out.println("UPDATED EXAM FIRST NAME!");					
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}
	
	public static void updateDataExamSecondNameS(int exID, String update) {//UPDATE EXAMS TYPE IN EXAMS	
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;	
		try {
			String sql = "UPDATE exams set secondNameS = ? WHERE fakulteten_nomer = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setString(1, update);			
			ps.setInt(2, exID);
			ps.execute();
			
			System.out.println("UPDATED EXAM SECOND NAME!");					
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}
	
	public static void updateDataFakultNum(int exID, int update) {//UPDATE EXAMS TYPE IN EXAMS			
		Connection con = DBConnection.connect();
		PreparedStatement ps = null;
		try {
			String sql = "UPDATE exams set fakulteten_nomer = ? WHERE fakulteten_nomer = ?";//firstName(field)? = update? where firstName? = value?
			ps = con.prepareStatement(sql);
			ps.setInt(1, update);			
			ps.setInt(2, exID);
			ps.execute();
			
			System.out.println("UPDATED EXAM FAKULTETEN NOMER!");					
		}catch(SQLException e) {
			System.out.println(e.toString());
		}finally {
			try {
				
				ps.close();
				con.close();
			}catch(SQLException e) {
				System.out.println(e.toString());
			}
		}
	}
}