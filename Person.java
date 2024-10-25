import java.util.ArrayList;
import java.util.List;

public class Person {
   
      private String name;
      private int birthYear;
      private Person mother;
      private Person father;      
      private List<Person> children;

      public Person(String name, int birthYear) {
      this.name = name;
      this.birthYear = birthYear;
      this.children = new ArrayList<>();
      }     
     

      public void setName(String name) {
         this.name = name;
      }

      public void setBirthYear(int birthYear) {
         this.birthYear = birthYear;
      }

      public void setMother(Person mother) {
         this.mother = mother;
      }

      public void setFather(Person father) {
         this.father = father;
      }

      public void addChild(Person child) {
         this.children.add(child);
         }
         

      public void setChildren(List<Person> children) {
         this.children = children;
      }
      public String getName() {
         return name;
      }

      public int getBirthYear() {
         return birthYear;
      }

      public Person getMother() {
         return mother;
      }

      public Person getFather() {
         return father;
      }

      public List<Person> getChildren() {
         return children;
      }
}

