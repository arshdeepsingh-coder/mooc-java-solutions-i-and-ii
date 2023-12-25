
import java.util.Scanner;

/*
 * Copyright (C) 2020 Dantes
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
/**
 *
 * @author Dantes
 */
public class TextInterface {

    private Scanner scanner;
    private GradeBook gradeBook;

    public TextInterface(Scanner scanner, GradeBook gradeBook) {

        this.gradeBook = gradeBook;
        this.scanner = scanner;

    }

    public void start() {

        boolean shouldLoop = true;

        System.out.println("Enter points total, -1 stops:");
        while (shouldLoop) {

            int gradePoint = Integer.valueOf(scanner.nextLine());

            if (gradePoint == -1) {
                
                gradeBook.printGrades();
                shouldLoop = false;

            } else{
                gradeBook.addGrade(gradePoint);
            }

        }

    }

}
