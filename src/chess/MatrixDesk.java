/*
 * Copyright 2024 Dmitry.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package chess;

/**
 *
 * @author Dmitry
 */
public class MatrixDesk extends AbstractDesk{
    private Cell[][] matrix;
    
    
    public MatrixDesk() {
        super();
    }

    @Override
    public void formDesk() {
        matrix = new Cell[size][size];
        int cellValue;
        boolean isEven; 
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cellValue = calcCellNum(i, j);
                isEven = (i + j) % 2 == 0;
                matrix[i][j] = new Cell(cellValue, isEven);
            }
        }
    }

    @Override
    protected void drawLetterBody() {
        for (int j = 0; j < size; j++) {
            String row = "| ";
            row = row + space(j, letterFont) + " |";
            for (int i = 0; i < size; i++) {
                row = row + " " + space(matrix[i][j].getLetter(),letterFont) + " " + "|";
            }
            System.out.println(row);
        }
        
    }

    @Override
    // Мне не нравится реализация
    protected void drawNumBody() {
        for (int j = 0; j < size; j++) {
            String row = "| ";
            row = row + space(j, numFont) + " |";
            for (int i = 0; i < size; i++) {
                row = row + " " + space(matrix[i][j].getValue(),numFont) + " " + "|";
            }
            System.out.println(row);
        }
    }

    @Override
    public int calcMainDiag() {
        int diag = 0;
        for (int i = 0; i < size; i++) {
            diag = diag + matrix[i][i].getValue();
        }
        return diag;
    }

    @Override
    public int calcBackDiag() {
        int diag = 0;
        for (int i = 0; i < size; i++) {
            diag = diag + matrix[i][size - i -1].getValue();
        }
        return diag;
    }

    @Override
    public int calcPerimetr() {
        int sum = 0;

        // Суммируем верхнюю строку
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[0][j].getValue();
        }

        // Суммируем нижнюю строку
        for (int j = 0; j < matrix[matrix.length - 1].length; j++) {
            sum += matrix[matrix.length - 1][j].getValue();
        }

        // Суммируем первый и последний столбцы, исключая углы
        for (int i = 1; i < matrix.length - 1; i++) {
            sum += matrix[i][0].getValue(); // Первый столбец
            sum += matrix[i][matrix[i].length - 1].getValue(); // Последний столбец
        }
        return sum;
    }
    
}
