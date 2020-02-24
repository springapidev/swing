package com.coderbd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rajail Islam
 */
public class Utils {

    /*

    public static void main(String[] args) throws Exception {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Reza", "email", 37, "Male", "Coding", "19", "okkkkkkkkk"));
        list.add(new Student("Rohul", "email", 27, "Male", "Coding", "33", "okkkkkkkkk"));

        writeTofile("student_infox", list);
    }
     */
    public static void writeTofile(String filename, Student s) {
        File destFile = new File(filename + ".txt");
        try {
            if (destFile.exists() == false) {
                System.out.println("We had to make a new file.");
                destFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));

            out.append(s.getSerial() + ", " + s.getName() + ", " + s.getEmail() + ", " + s.getGender() + ", " + s.getHobby() + ", " + s.getRound() + "\n");

            out.close();
        } catch (IOException e) {
            System.out.println("COULD NOT LOG!!");
        }
    }

    public static void displayStudentsdataFromFile(String filename,
            DefaultTableModel model) {
        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename + ".txt"));

            while ((line = reader.readLine()) != null) {
                model.addRow(line.split(", ")); //this has a comma and a space bc that  is how the file is written to
            }
            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Buffered Reader issue.");
        }

    }
}
