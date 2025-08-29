import java.io.*;
import java.util.List;

public class Database
{
    private String filename;

    Database(String fn)
    {
        this.filename = fn;

    }

    void saveStudents(List<Student> students) throws IOException {
        FileWriter writer = new FileWriter(this.filename);

        for(Student stud : students)
        {
            writer.write(stud.getId());
            writer.write(stud.getName());

            for(String cor : stud.getCourse())
            {
                writer.write(cor);

            }

            for(String avail : stud.getAvail())
            {
                writer.write(avail);

            }

            for(String sess : stud.getSessions())
            {
                writer.write(sess);

            }
        }

        writer.close();

    }



    
}
