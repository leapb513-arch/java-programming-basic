//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//void main() {
void main() {
    Scanner sc = new Scanner(System.in);

    IO.print("please input id: ");
    int studentId = sc.nextInt();

    IO.print("please input name: ");
    String studentName = sc.next();
    IO.print("please input gender: ");
    String studentGender = sc.next();
    IO.print("please input date of birth: ");
    String dateOfBirth = sc.next();
    IO.print("please input placeofbirth: ");
    String placeOfBirth = sc.next();

    IO.println("Student ID=" + studentId);
    IO.println("Student name=" + studentName);
    IO.println("Student gender=" + studentGender);
    IO.println("Student birth=" + dateOfBirth);
    IO.println("Student Place=" + placeOfBirth);
    IO.println("All Student Information");
}

