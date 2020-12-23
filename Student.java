package cn.bdqn.springbootandmybatis.pojo;


public class Student {

  private long id;
  private String name;
  private long age;
  private String addr;
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  @Override
  public String toString() {
    return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", addr='" + addr + '\'' +
            '}';
  }

  public Student() {
  }

  public Student(String name, long age, String addr) {
    this.name = name;
    this.age = age;
    this.addr = addr;
  }

  public Student(long id, String name, long age, String addr) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.addr = addr;
  }
}
