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
    void form_desk() {
        cols = new Column[Params.getDeskSize()];
        for (int i = 0; i < Params.getDeskSize(); i++) {
            cols[i] = new Column();
            if (i % 2 == 0) formColumn(i); else formMirrowColumn(i); 
        }
    }

    @Override
    void draw_desk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void formColumn(int i) {
        for (int j = 0; j < Params.getDeskSize(); j++) {
            cols[i].addCell( new Cell( calcCellNum(i,j), j%2==0),j);
        }
    }

    private void formMirrowColumn(int i) {
        for (int j = 0; j < Params.getDeskSize(); j++) {
            cols[i].addCell( new Cell( cols[i-1].getCell(Params.getDeskSize() - j).getValue(), j%2==1),j);
        }
    }
    
}
