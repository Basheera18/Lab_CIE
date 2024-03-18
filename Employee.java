class Employee{
 String Empname="Basheera";
 int EmpId=203;
  
  public void DisplayDetails(){
    System.out.println("Emp Name: "+Empname);
    System.out.println("Emp Id: "+EmpId);
  }
  public static void main(String args[]){
    Employee e=new Employee();
    e.DisplayDetails();
  }

}