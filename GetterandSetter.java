class Student {
    String name;
    int rollno;
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
    public int getrollno(){
        return rollno;
    }
    public void setrollno(int r){
        rollno = r;
    }
}
public class GetterandSetter {
    public static void main(String[] args){
        Student st = new Student();
        st.setname("keerthu");
        st.setrollno(1);
        System.out.println(st.getname());
        System.out.println(st.getrollno());
    }
}
