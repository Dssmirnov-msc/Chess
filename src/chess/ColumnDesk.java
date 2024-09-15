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
public class ColumnDesk extends AbstractDesk{
    private Column[] cols;
    
    
    public ColumnDesk() {
        super();
    }

    @Override
    void formDesk() {
        cols = new Column[size];
        for (int i = 0; i < size; i++) {
            cols[i] = new Column();
            if (i % 2 == 0) formColumn(i); else formMirrowColumn(i); 
        }
    }


    private void formColumn(int i) {
        for (int j = 0; j < size; j++) {
            cols[i].addCell( new Cell( calcCellNum(i,j), j%2==0),j);
        }
    }

    private void formMirrowColumn(int i) {
        for (int j = 0; j < size; j++) {
            cols[i].addCell( new Cell( j%2==1, cols[i-1].getCell(size - j-1).getValue()),j);
        }
    }

    @Override
    protected void drawLetterBody() {
        for (int j = 0; j < size; j++) {
            String row = "| ";
            row = row + space(j, letterFont) + " |";
            for (int i = 0; i < size; i++) {
                row = row + " " + space(cols[i].getCell(j).getLetter(),letterFont) + " " + "|";
            }
            System.out.println(row);
        }
    }

    @Override
    protected void drawNumBody() {
        for (int j = 0; j < size; j++) {
            String row = "| ";
            row = row + space(j, numFont) + " |";
            for (int i = 0; i < size; i++) {
                row = row + " " + space(cols[i].getCell(j).getValue(),numFont) + " " + "|";
            }
            System.out.println(row);
        }
    }

    @Override
    public int calcMainDiag() {
        int diag = 0;
        for (int i = 0; i < size; i++) {
            diag = diag + cols[i].getCell(i).getValue();
        }
        return diag;
    }

    @Override
    public int calcBackDiag() {
        int diag = 0;
        for (int i = 0; i < size; i++) {
            diag = diag + cols[i].getCell(size - i - 1).getValue();
        }
        return diag;
    }

    @Override
    public int calcPerimetr() {
        int perimetr = cols[0].calcLength() + cols[size-1].calcLength();
        for (int i = 1; i < (size-1); i++) {
            perimetr = perimetr + cols[i].getCell(1).getValue() 
                    + cols[i].getCell(size-1).getValue();
        }
        return perimetr;
    }
    
}
