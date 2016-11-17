package Calculate_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class news
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandFather, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);


        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat parentMother;
        private Cat parentFather;


        Cat(String name) {
            this.name = name;
        }


        Cat(String name, Cat parentFather, Cat parentMother) {
            this.name = name;
            this.parentFather = parentFather;
            this.parentMother = parentMother;
        }


        @Override
        public String toString() {
            if (parentMother == null && parentFather == null)
                return "Cat name is " + this.name + ", no mother" + ", no father";
            else if (parentFather == null)
                return "Cat name is " + this.name + ", mother is " + this.parentMother + ", no father";
            else if (parentMother == null)
                return "Cat name is " + this.name + ", no mother" + ", " + "father is " + this.parentFather;
            else return "Cat name is " + this.name + ", mother is " + this.parentMother + ", father is " + this.parentFather;

        }
    }
}
