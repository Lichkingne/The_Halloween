package practika6_2;

import java.util.Scanner;
public class ыщке {
    public static void main(String[] args) {
        Scanner spisok = new Scanner(System.in);
        SortingStudentsByGPA obj = new SortingStudentsByGPA();

        int marks[] = new int[5];
        String names[] = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Напишите имя и оценку студента №%d: ", i + 1);
            names[i] =spisok.next();
            marks[i] =spisok.nextInt();
        }

        obj.sort(marks, names);
    }
}






