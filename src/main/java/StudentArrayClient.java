public class StudentArrayClient {
    public static void main(String[] args) {

            StudentArray studentarray = new StudentArray(123,"appu");
            StudentArray studentarray1 = new StudentArray(234,"chandu");


        StudentArray[] array = new StudentArray[2];
        StudentArray[] array1 = new StudentArray[2];
        array[0]=studentarray;
        array[1]=studentarray1;
        array1[0]=studentarray;
        array1[1]=studentarray1;
       // array[0] = new StudentArray(123,"appu");
      //  array[1] = new StudentArray(234,"chandu");
      //  array[2] = new StudentArray(345,"sravs");
        // array[3] = new StudentArray(456,"bindu");
       // array[4] = new StudentArray(567,"shiva");
        for (int i = 0; i < array.length; i++) {
            System.out.println("ID: "+array[i].getId());
            System.out.println("NAME:"+array[i].getName());

        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println("ID: "+array1[i].getId());
            System.out.println("NAME:"+array1[i].getName());

        }
        studentarray.setName("roja");
        studentarray1.setName("ravi");
        for (int i = 0; i < array.length; i++) {
            System.out.println("ID: "+array[i].getId());
            System.out.println("NAME:"+array[i].getName());

        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println("ID: "+array1[i].getId());
            System.out.println("NAME:"+array1[i].getName());

        }

    }

    }
