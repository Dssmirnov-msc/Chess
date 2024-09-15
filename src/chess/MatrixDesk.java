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
    
}
