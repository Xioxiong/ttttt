import model.Student;

import java.util.logging.Logger;

public class TestStudent {
    private static  Logger logger = Logger.getLogger(TestStudent.class.getName());
    public static void main(String[] args){

        Student student = new Student("熊伟",18,"男","20169999");
        logger.info(student.toString());
    }
}
